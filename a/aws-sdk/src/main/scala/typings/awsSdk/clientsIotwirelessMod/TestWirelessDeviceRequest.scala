package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestWirelessDeviceRequest extends StObject {
  
  /**
    * The ID of the wireless device to test.
    */
  var Id: WirelessDeviceId
}
object TestWirelessDeviceRequest {
  
  inline def apply(Id: WirelessDeviceId): TestWirelessDeviceRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TestWirelessDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestWirelessDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: WirelessDeviceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
  }
}
