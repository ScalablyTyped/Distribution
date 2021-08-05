package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.Copy
import typings.appBuilderLib.appBuilderLibStrings.DEFAULT
import typings.appBuilderLib.appBuilderLibStrings.Deflate
import typings.appBuilderLib.appBuilderLibStrings.LZMA
import typings.appBuilderLib.coreMod.CompressionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveMod {
  
  @JSImport("app-builder-lib/out/targets/archive", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def compute7zCompressArgs(format: String): js.Array[String] = ^.asInstanceOf[js.Dynamic].applyDynamic("compute7zCompressArgs")(format.asInstanceOf[js.Any]).asInstanceOf[js.Array[String]]
  inline def compute7zCompressArgs(format: String, options: ArchiveOptions): js.Array[String] = (^.asInstanceOf[js.Dynamic].applyDynamic("compute7zCompressArgs")(format.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Array[String]]
  
  trait ArchiveOptions extends StObject {
    
    var compression: js.UndefOr[CompressionLevel | Null] = js.undefined
    
    var dictSize: js.UndefOr[Double] = js.undefined
    
    var excluded: js.UndefOr[js.Array[String] | Null] = js.undefined
    
    /**
      * @default true
      */
    var isArchiveHeaderCompressed: js.UndefOr[Boolean] = js.undefined
    
    var isRegularFile: js.UndefOr[Boolean] = js.undefined
    
    var method: js.UndefOr[Copy | LZMA | Deflate | DEFAULT] = js.undefined
    
    /**
      * @default true
      */
    var solid: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @default false
      */
    var withoutDir: js.UndefOr[Boolean] = js.undefined
  }
  object ArchiveOptions {
    
    inline def apply(): ArchiveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiveOptions]
    }
    
    extension [Self <: ArchiveOptions](x: Self) {
      
      inline def setCompression(value: CompressionLevel): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionNull: Self = StObject.set(x, "compression", null)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setDictSize(value: Double): Self = StObject.set(x, "dictSize", value.asInstanceOf[js.Any])
      
      inline def setDictSizeUndefined: Self = StObject.set(x, "dictSize", js.undefined)
      
      inline def setExcluded(value: js.Array[String]): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
      
      inline def setExcludedNull: Self = StObject.set(x, "excluded", null)
      
      inline def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
      
      inline def setExcludedVarargs(value: String*): Self = StObject.set(x, "excluded", js.Array(value :_*))
      
      inline def setIsArchiveHeaderCompressed(value: Boolean): Self = StObject.set(x, "isArchiveHeaderCompressed", value.asInstanceOf[js.Any])
      
      inline def setIsArchiveHeaderCompressedUndefined: Self = StObject.set(x, "isArchiveHeaderCompressed", js.undefined)
      
      inline def setIsRegularFile(value: Boolean): Self = StObject.set(x, "isRegularFile", value.asInstanceOf[js.Any])
      
      inline def setIsRegularFileUndefined: Self = StObject.set(x, "isRegularFile", js.undefined)
      
      inline def setMethod(value: Copy | LZMA | Deflate | DEFAULT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setSolid(value: Boolean): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
      
      inline def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
      
      inline def setWithoutDir(value: Boolean): Self = StObject.set(x, "withoutDir", value.asInstanceOf[js.Any])
      
      inline def setWithoutDirUndefined: Self = StObject.set(x, "withoutDir", js.undefined)
    }
  }
}
