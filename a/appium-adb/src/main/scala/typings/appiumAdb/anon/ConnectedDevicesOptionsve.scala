package typings.appiumAdb.anon

import typings.appiumAdb.appiumAdbBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined appium-adb.appium-adb/lib/tools/system-calls.ConnectedDevicesOptions & {  verbose :true} */
trait ConnectedDevicesOptionsve extends StObject {
  
  /**
    * Whether to get long output, which includes extra properties in each device.
    * Akin to running `adb devices -l`.
    */
  var verbose: js.UndefOr[Boolean] & `true`
}
object ConnectedDevicesOptionsve {
  
  inline def apply(verbose: js.UndefOr[Boolean] & `true`): ConnectedDevicesOptionsve = {
    val __obj = js.Dynamic.literal(verbose = verbose.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectedDevicesOptionsve]
  }
  
  extension [Self <: ConnectedDevicesOptionsve](x: Self) {
    
    inline def setVerbose(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "verbose", value.asInstanceOf[js.Any])
  }
}
