package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateServiceSettingRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the service setting to reset. For example, arn:aws:ssm:us-east-1:111122223333:servicesetting/ssm/parameter-store/high-throughput-enabled. The setting ID can be one of the following.    /ssm/automation/customer-script-log-destination     /ssm/automation/customer-script-log-group-name     /ssm/documents/console/public-sharing-permission     /ssm/managed-instance/activation-tier     /ssm/opsinsights/opscenter     /ssm/parameter-store/default-parameter-tier     /ssm/parameter-store/high-throughput-enabled   
    */
  var SettingId: ServiceSettingId
  
  /**
    * The new value to specify for the service setting. The following list specifies the available values for each setting.    /ssm/automation/customer-script-log-destination: CloudWatch     /ssm/automation/customer-script-log-group-name: the name of an Amazon CloudWatch Logs log group    /ssm/documents/console/public-sharing-permission: Enable or Disable     /ssm/managed-instance/activation-tier: standard or advanced     /ssm/opsinsights/opscenter: Enabled or Disabled     /ssm/parameter-store/default-parameter-tier: Standard, Advanced, Intelligent-Tiering     /ssm/parameter-store/high-throughput-enabled: true or false   
    */
  var SettingValue: ServiceSettingValue
}
object UpdateServiceSettingRequest {
  
  inline def apply(SettingId: ServiceSettingId, SettingValue: ServiceSettingValue): UpdateServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any], SettingValue = SettingValue.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateServiceSettingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateServiceSettingRequest] (val x: Self) extends AnyVal {
    
    inline def setSettingId(value: ServiceSettingId): Self = StObject.set(x, "SettingId", value.asInstanceOf[js.Any])
    
    inline def setSettingValue(value: ServiceSettingValue): Self = StObject.set(x, "SettingValue", value.asInstanceOf[js.Any])
  }
}
