package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.off
import typings.appBuilderLib.appBuilderLibStrings.zlib
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outTargetsNsisCommandsMod {
  
  trait Commands extends StObject {
    
    var Icon: js.UndefOr[String] = js.undefined
    
    var OutFile: String
    
    var SetCompress: js.UndefOr[off] = js.undefined
    
    var SetCompressor: js.UndefOr[zlib] = js.undefined
    
    var Unicode: Boolean
    
    var VIAddVersionKey: js.Array[String]
    
    var VIProductVersion: js.UndefOr[String] = js.undefined
  }
  object Commands {
    
    inline def apply(OutFile: String, Unicode: Boolean, VIAddVersionKey: js.Array[String]): Commands = {
      val __obj = js.Dynamic.literal(OutFile = OutFile.asInstanceOf[js.Any], Unicode = Unicode.asInstanceOf[js.Any], VIAddVersionKey = VIAddVersionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[Commands]
    }
    
    extension [Self <: Commands](x: Self) {
      
      inline def setIcon(value: String): Self = StObject.set(x, "Icon", value.asInstanceOf[js.Any])
      
      inline def setIconUndefined: Self = StObject.set(x, "Icon", js.undefined)
      
      inline def setOutFile(value: String): Self = StObject.set(x, "OutFile", value.asInstanceOf[js.Any])
      
      inline def setSetCompress(value: off): Self = StObject.set(x, "SetCompress", value.asInstanceOf[js.Any])
      
      inline def setSetCompressUndefined: Self = StObject.set(x, "SetCompress", js.undefined)
      
      inline def setSetCompressor(value: zlib): Self = StObject.set(x, "SetCompressor", value.asInstanceOf[js.Any])
      
      inline def setSetCompressorUndefined: Self = StObject.set(x, "SetCompressor", js.undefined)
      
      inline def setUnicode(value: Boolean): Self = StObject.set(x, "Unicode", value.asInstanceOf[js.Any])
      
      inline def setVIAddVersionKey(value: js.Array[String]): Self = StObject.set(x, "VIAddVersionKey", value.asInstanceOf[js.Any])
      
      inline def setVIAddVersionKeyVarargs(value: String*): Self = StObject.set(x, "VIAddVersionKey", js.Array(value*))
      
      inline def setVIProductVersion(value: String): Self = StObject.set(x, "VIProductVersion", value.asInstanceOf[js.Any])
      
      inline def setVIProductVersionUndefined: Self = StObject.set(x, "VIProductVersion", js.undefined)
    }
  }
}
