package typings.awsSdk.clientsConnectcampaignsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteConnectInstanceConfigRequest extends StObject {
  
  var connectInstanceId: InstanceId
}
object DeleteConnectInstanceConfigRequest {
  
  inline def apply(connectInstanceId: InstanceId): DeleteConnectInstanceConfigRequest = {
    val __obj = js.Dynamic.literal(connectInstanceId = connectInstanceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteConnectInstanceConfigRequest]
  }
  
  extension [Self <: DeleteConnectInstanceConfigRequest](x: Self) {
    
    inline def setConnectInstanceId(value: InstanceId): Self = StObject.set(x, "connectInstanceId", value.asInstanceOf[js.Any])
  }
}
