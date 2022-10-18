package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetConnectInstanceConfigRequest extends StObject {
  
  var connectInstanceId: InstanceId
}
object GetConnectInstanceConfigRequest {
  
  inline def apply(connectInstanceId: InstanceId): GetConnectInstanceConfigRequest = {
    val __obj = js.Dynamic.literal(connectInstanceId = connectInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetConnectInstanceConfigRequest]
  }
  
  extension [Self <: GetConnectInstanceConfigRequest](x: Self) {
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
  }
}
