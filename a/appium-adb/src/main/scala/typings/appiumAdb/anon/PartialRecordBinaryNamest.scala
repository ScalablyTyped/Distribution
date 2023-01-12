package typings.appiumAdb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<appium-adb.appium-adb/lib/tools.BinaryName, string>> */
trait PartialRecordBinaryNamest extends StObject {
  
  var aapt: js.UndefOr[String] = js.undefined
  
  var aapt2: js.UndefOr[String] = js.undefined
  
  var adb: js.UndefOr[String] = js.undefined
  
  var apkanalyzer: js.UndefOr[String] = js.undefined
  
  @JSName("apksigner.jar")
  var apksignerDotjar: js.UndefOr[String] = js.undefined
  
  var bundletool: js.UndefOr[String] = js.undefined
  
  var zipalign: js.UndefOr[String] = js.undefined
}
object PartialRecordBinaryNamest {
  
  inline def apply(): PartialRecordBinaryNamest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialRecordBinaryNamest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PartialRecordBinaryNamest] (val x: Self) extends AnyVal {
    
    inline def setAapt(value: String): Self = StObject.set(x, "aapt", value.asInstanceOf[js.Any])
    
    inline def setAapt2(value: String): Self = StObject.set(x, "aapt2", value.asInstanceOf[js.Any])
    
    inline def setAapt2Undefined: Self = StObject.set(x, "aapt2", js.undefined)
    
    inline def setAaptUndefined: Self = StObject.set(x, "aapt", js.undefined)
    
    inline def setAdb(value: String): Self = StObject.set(x, "adb", value.asInstanceOf[js.Any])
    
    inline def setAdbUndefined: Self = StObject.set(x, "adb", js.undefined)
    
    inline def setApkanalyzer(value: String): Self = StObject.set(x, "apkanalyzer", value.asInstanceOf[js.Any])
    
    inline def setApkanalyzerUndefined: Self = StObject.set(x, "apkanalyzer", js.undefined)
    
    inline def setApksignerDotjar(value: String): Self = StObject.set(x, "apksigner.jar", value.asInstanceOf[js.Any])
    
    inline def setApksignerDotjarUndefined: Self = StObject.set(x, "apksigner.jar", js.undefined)
    
    inline def setBundletool(value: String): Self = StObject.set(x, "bundletool", value.asInstanceOf[js.Any])
    
    inline def setBundletoolUndefined: Self = StObject.set(x, "bundletool", js.undefined)
    
    inline def setZipalign(value: String): Self = StObject.set(x, "zipalign", value.asInstanceOf[js.Any])
    
    inline def setZipalignUndefined: Self = StObject.set(x, "zipalign", js.undefined)
  }
}
