package typings.awsSdk.clientsAccessanalyzerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IamRoleConfiguration extends StObject {
  
  /**
    * The proposed trust policy for the IAM role.
    */
  var trustPolicy: js.UndefOr[IamTrustPolicy] = js.undefined
}
object IamRoleConfiguration {
  
  inline def apply(): IamRoleConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IamRoleConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IamRoleConfiguration] (val x: Self) extends AnyVal {
    
    inline def setTrustPolicy(value: IamTrustPolicy): Self = StObject.set(x, "trustPolicy", value.asInstanceOf[js.Any])
    
    inline def setTrustPolicyUndefined: Self = StObject.set(x, "trustPolicy", js.undefined)
  }
}
