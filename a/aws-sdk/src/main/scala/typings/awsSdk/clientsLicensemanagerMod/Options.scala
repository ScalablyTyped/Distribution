package typings.awsSdk.clientsLicensemanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Options extends StObject {
  
  /**
    * An activation option for your grant that determines the behavior of activating a grant. Activation options can only be used with granted licenses sourced from the Amazon Web Services Marketplace. Additionally, the operation must specify the value of ACTIVE for the Status parameter.   As a license administrator, you can optionally specify an ActivationOverrideBehavior when activating a grant.   As a grantor, you can optionally specify an ActivationOverrideBehavior when you activate a grant for a grantee account in your organization.   As a grantee, if the grantor creating the distributed grant doesn’t specify an ActivationOverrideBehavior, you can optionally specify one when you are activating the grant.    DISTRIBUTED_GRANTS_ONLY  Use this value to activate a grant without replacing any member account’s active grants for the same product.  ALL_GRANTS_PERMITTED_BY_ISSUER  Use this value to activate a grant and disable other active grants in any member accounts for the same product. This action will also replace their previously activated grants with this activated grant.  
    */
  var ActivationOverrideBehavior: js.UndefOr[typings.awsSdk.clientsLicensemanagerMod.ActivationOverrideBehavior] = js.undefined
}
object Options {
  
  inline def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
    
    inline def setActivationOverrideBehavior(value: ActivationOverrideBehavior): Self = StObject.set(x, "ActivationOverrideBehavior", value.asInstanceOf[js.Any])
    
    inline def setActivationOverrideBehaviorUndefined: Self = StObject.set(x, "ActivationOverrideBehavior", js.undefined)
  }
}
