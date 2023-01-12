package typings.appiumAdb.anon

import typings.appiumAdb.libAdbMod.AdbExecutable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Adb extends StObject {
  
  var adb: AdbExecutable
  
  var clearDeviceLogsOnStart: js.UndefOr[Boolean] = js.undefined
  
  var debug: js.UndefOr[Boolean] = js.undefined
  
  var debugTrace: js.UndefOr[Boolean] = js.undefined
  
  var maxBufferSize: js.UndefOr[Double] = js.undefined
}
object Adb {
  
  inline def apply(adb: AdbExecutable): Adb = {
    val __obj = js.Dynamic.literal(adb = adb.asInstanceOf[js.Any])
    __obj.asInstanceOf[Adb]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Adb] (val x: Self) extends AnyVal {
    
    inline def setAdb(value: AdbExecutable): Self = StObject.set(x, "adb", value.asInstanceOf[js.Any])
    
    inline def setClearDeviceLogsOnStart(value: Boolean): Self = StObject.set(x, "clearDeviceLogsOnStart", value.asInstanceOf[js.Any])
    
    inline def setClearDeviceLogsOnStartUndefined: Self = StObject.set(x, "clearDeviceLogsOnStart", js.undefined)
    
    inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
    
    inline def setDebugTrace(value: Boolean): Self = StObject.set(x, "debugTrace", value.asInstanceOf[js.Any])
    
    inline def setDebugTraceUndefined: Self = StObject.set(x, "debugTrace", js.undefined)
    
    inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
    
    inline def setMaxBufferSize(value: Double): Self = StObject.set(x, "maxBufferSize", value.asInstanceOf[js.Any])
    
    inline def setMaxBufferSizeUndefined: Self = StObject.set(x, "maxBufferSize", js.undefined)
  }
}
