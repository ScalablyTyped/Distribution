package typings.awsSdk.clientsImagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LaunchTemplateConfiguration extends StObject {
  
  /**
    * The account ID that this configuration applies to.
    */
  var accountId: js.UndefOr[AccountId] = js.undefined
  
  /**
    * Identifies the Amazon EC2 launch template to use.
    */
  var launchTemplateId: LaunchTemplateId
  
  /**
    * Set the specified Amazon EC2 launch template as the default launch template for the specified account.
    */
  var setDefaultVersion: js.UndefOr[Boolean] = js.undefined
}
object LaunchTemplateConfiguration {
  
  inline def apply(launchTemplateId: LaunchTemplateId): LaunchTemplateConfiguration = {
    val __obj = js.Dynamic.literal(launchTemplateId = launchTemplateId.asInstanceOf[js.Any])
    __obj.asInstanceOf[LaunchTemplateConfiguration]
  }
  
  extension [Self <: LaunchTemplateConfiguration](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "accountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "accountId", js.undefined)
    
    inline def setLaunchTemplateId(value: LaunchTemplateId): Self = StObject.set(x, "launchTemplateId", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultVersion(value: Boolean): Self = StObject.set(x, "setDefaultVersion", value.asInstanceOf[js.Any])
    
    inline def setSetDefaultVersionUndefined: Self = StObject.set(x, "setDefaultVersion", js.undefined)
  }
}
