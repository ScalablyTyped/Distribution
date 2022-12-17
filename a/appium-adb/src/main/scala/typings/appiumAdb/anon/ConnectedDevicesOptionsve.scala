package typings.appiumAdb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined appium-adb.appium-adb/lib/tools/system-calls.ConnectedDevicesOptions & {  verbose :true} */
trait ConnectedDevicesOptionsve extends StObject {
  
  /**
    * Whether to get long output, which includes extra properties in each device.
    * Akin to running `adb devices -l`.
    */
  var verbose: js.UndefOr[Boolean] = js.undefined
}
object ConnectedDevicesOptionsve {
  
  inline def apply(): ConnectedDevicesOptionsve = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ConnectedDevicesOptionsve]
  }
  
  extension [Self <: ConnectedDevicesOptionsve](x: Self) {
    
    inline def setVerbose(value: Boolean): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
    
    inline def setVerboseUndefined: Self = StObject.set(x, "verbose", js.undefined)
  }
}
