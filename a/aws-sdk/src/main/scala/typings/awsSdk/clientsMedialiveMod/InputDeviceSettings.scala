package typings.awsSdk.clientsMedialiveMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputDeviceSettings extends StObject {
  
  /**
    * The unique ID for the device.
    */
  var Id: js.UndefOr[string] = js.undefined
}
object InputDeviceSettings {
  
  inline def apply(): InputDeviceSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InputDeviceSettings]
  }
  
  extension [Self <: InputDeviceSettings](x: Self) {
    
    inline def setId(value: string): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
  }
}
