package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListInputDevicesResponse extends StObject {
  
  /**
    * The list of input devices.
    */
  var InputDevices: js.UndefOr[listOfInputDeviceSummary] = js.undefined
  
  /**
    * A token to get additional list results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListInputDevicesResponse {
  
  inline def apply(): ListInputDevicesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListInputDevicesResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListInputDevicesResponse] (val x: Self) extends AnyVal {
    
    inline def setInputDevices(value: listOfInputDeviceSummary): Self = StObject.set(x, "InputDevices", value.asInstanceOf[js.Any])
    
    inline def setInputDevicesUndefined: Self = StObject.set(x, "InputDevices", js.undefined)
    
    inline def setInputDevicesVarargs(value: InputDeviceSummary*): Self = StObject.set(x, "InputDevices", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
