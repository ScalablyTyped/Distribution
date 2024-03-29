package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSettingsForUpdate extends StObject {
  
  /**
    * The configuration for attaching a SageMaker user profile name to the execution role as a sts:SourceIdentity key. This configuration can only be modified if there are no apps in the InService or Pending state.
    */
  var ExecutionRoleIdentityConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExecutionRoleIdentityConfig] = js.undefined
  
  /**
    * A collection of RStudioServerPro Domain-level app settings to update. A single RStudioServerPro application is created for a domain.
    */
  var RStudioServerProDomainSettingsForUpdate: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RStudioServerProDomainSettingsForUpdate] = js.undefined
  
  /**
    * The security groups for the Amazon Virtual Private Cloud that the Domain uses for communication between Domain-level apps and user apps.
    */
  var SecurityGroupIds: js.UndefOr[DomainSecurityGroupIds] = js.undefined
}
object DomainSettingsForUpdate {
  
  inline def apply(): DomainSettingsForUpdate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainSettingsForUpdate]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DomainSettingsForUpdate] (val x: Self) extends AnyVal {
    
    inline def setExecutionRoleIdentityConfig(value: ExecutionRoleIdentityConfig): Self = StObject.set(x, "ExecutionRoleIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleIdentityConfigUndefined: Self = StObject.set(x, "ExecutionRoleIdentityConfig", js.undefined)
    
    inline def setRStudioServerProDomainSettingsForUpdate(value: RStudioServerProDomainSettingsForUpdate): Self = StObject.set(x, "RStudioServerProDomainSettingsForUpdate", value.asInstanceOf[js.Any])
    
    inline def setRStudioServerProDomainSettingsForUpdateUndefined: Self = StObject.set(x, "RStudioServerProDomainSettingsForUpdate", js.undefined)
    
    inline def setSecurityGroupIds(value: DomainSecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
  }
}
