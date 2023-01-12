package typings.awsSdk.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetServiceSettingRequest extends StObject {
  
  /**
    * The ID of the service setting to get. The setting ID can be one of the following.    /ssm/automation/customer-script-log-destination     /ssm/automation/customer-script-log-group-name     /ssm/documents/console/public-sharing-permission     /ssm/managed-instance/activation-tier     /ssm/opsinsights/opscenter     /ssm/parameter-store/default-parameter-tier     /ssm/parameter-store/high-throughput-enabled   
    */
  var SettingId: ServiceSettingId
}
object GetServiceSettingRequest {
  
  inline def apply(SettingId: ServiceSettingId): GetServiceSettingRequest = {
    val __obj = js.Dynamic.literal(SettingId = SettingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetServiceSettingRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetServiceSettingRequest] (val x: Self) extends AnyVal {
    
    inline def setSettingId(value: ServiceSettingId): Self = StObject.set(x, "SettingId", value.asInstanceOf[js.Any])
  }
}
