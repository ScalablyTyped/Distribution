package typings.awsSdk.clientsIotwirelessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestWirelessDeviceResponse extends StObject {
  
  /**
    * The result returned by the test.
    */
  var Result: js.UndefOr[typings.awsSdk.clientsIotwirelessMod.Result] = js.undefined
}
object TestWirelessDeviceResponse {
  
  inline def apply(): TestWirelessDeviceResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestWirelessDeviceResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TestWirelessDeviceResponse] (val x: Self) extends AnyVal {
    
    inline def setResult(value: Result): Self = StObject.set(x, "Result", value.asInstanceOf[js.Any])
    
    inline def setResultUndefined: Self = StObject.set(x, "Result", js.undefined)
  }
}
