package typings.appiumAdb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<appium-adb.appium-adb/lib/adb.AdbExecutable> */
trait PartialAdbExecutable extends StObject {
  
  var defaultArgs: js.UndefOr[js.Array[String]] = js.undefined
  
  var path: js.UndefOr[String] = js.undefined
}
object PartialAdbExecutable {
  
  inline def apply(): PartialAdbExecutable = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialAdbExecutable]
  }
  
  extension [Self <: PartialAdbExecutable](x: Self) {
    
    inline def setDefaultArgs(value: js.Array[String]): Self = StObject.set(x, "defaultArgs", value.asInstanceOf[js.Any])
    
    inline def setDefaultArgsUndefined: Self = StObject.set(x, "defaultArgs", js.undefined)
    
    inline def setDefaultArgsVarargs(value: String*): Self = StObject.set(x, "defaultArgs", js.Array(value*))
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setPathUndefined: Self = StObject.set(x, "path", js.undefined)
  }
}
