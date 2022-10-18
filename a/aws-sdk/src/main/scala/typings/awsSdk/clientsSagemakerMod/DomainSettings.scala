package typings.awsSdk.clientsSagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DomainSettings extends StObject {
  
  /**
    * The configuration for attaching a SageMaker user profile name to the execution role as a sts:SourceIdentity key.
    */
  var ExecutionRoleIdentityConfig: js.UndefOr[typings.awsSdk.clientsSagemakerMod.ExecutionRoleIdentityConfig] = js.undefined
  
  /**
    * A collection of settings that configure the RStudioServerPro Domain-level app.
    */
  var RStudioServerProDomainSettings: js.UndefOr[typings.awsSdk.clientsSagemakerMod.RStudioServerProDomainSettings] = js.undefined
  
  /**
    * The security groups for the Amazon Virtual Private Cloud that the Domain uses for communication between Domain-level apps and user apps.
    */
  var SecurityGroupIds: js.UndefOr[DomainSecurityGroupIds] = js.undefined
}
object DomainSettings {
  
  inline def apply(): DomainSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainSettings]
  }
  
  extension [Self <: DomainSettings](x: Self) {
    
    inline def setExecutionRoleIdentityConfig(value: ExecutionRoleIdentityConfig): Self = StObject.set(x, "ExecutionRoleIdentityConfig", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleIdentityConfigUndefined: Self = StObject.set(x, "ExecutionRoleIdentityConfig", js.undefined)
    
    inline def setRStudioServerProDomainSettings(value: RStudioServerProDomainSettings): Self = StObject.set(x, "RStudioServerProDomainSettings", value.asInstanceOf[js.Any])
    
    inline def setRStudioServerProDomainSettingsUndefined: Self = StObject.set(x, "RStudioServerProDomainSettings", js.undefined)
    
    inline def setSecurityGroupIds(value: DomainSecurityGroupIds): Self = StObject.set(x, "SecurityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "SecurityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: SecurityGroupId*): Self = StObject.set(x, "SecurityGroupIds", js.Array(value*))
  }
}
