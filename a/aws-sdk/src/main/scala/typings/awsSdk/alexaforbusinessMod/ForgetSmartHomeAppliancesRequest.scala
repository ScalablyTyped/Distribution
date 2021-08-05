package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ForgetSmartHomeAppliancesRequest extends StObject {
  
  /**
    * The room that the appliances are associated with.
    */
  var RoomArn: Arn
}
object ForgetSmartHomeAppliancesRequest {
  
  inline def apply(RoomArn: Arn): ForgetSmartHomeAppliancesRequest = {
    val __obj = js.Dynamic.literal(RoomArn = RoomArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ForgetSmartHomeAppliancesRequest]
  }
  
  extension [Self <: ForgetSmartHomeAppliancesRequest](x: Self) {
    
    inline def setRoomArn(value: Arn): Self = StObject.set(x, "RoomArn", value.asInstanceOf[js.Any])
  }
}
