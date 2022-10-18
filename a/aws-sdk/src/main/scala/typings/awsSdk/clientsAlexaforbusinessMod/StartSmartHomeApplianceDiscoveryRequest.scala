package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StartSmartHomeApplianceDiscoveryRequest extends StObject {
  
  /**
    * The room where smart home appliance discovery was initiated.
    */
  var RoomArn: Arn
}
object StartSmartHomeApplianceDiscoveryRequest {
  
  inline def apply(RoomArn: Arn): StartSmartHomeApplianceDiscoveryRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartSmartHomeApplianceDiscoveryRequest]
  }
  
  extension [Self <: StartSmartHomeApplianceDiscoveryRequest](x: Self) {
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
  }
}
