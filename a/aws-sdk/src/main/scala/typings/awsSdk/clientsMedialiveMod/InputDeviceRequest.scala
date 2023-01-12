package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDeviceRequest extends StObject {
  
  /**
    * The unique ID for the device.
    */
  var Id: js.UndefOr[string] = js.undefined
}
object InputDeviceRequest {
  
  inline def apply(): InputDeviceRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputDeviceRequest] (val x: Self) extends AnyVal {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
