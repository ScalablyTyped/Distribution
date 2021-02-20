package typings.appBuilderLib

import typings.appBuilderLib.appBuilderLibStrings.Copy
import typings.appBuilderLib.appBuilderLibStrings.DEFAULT
import typings.appBuilderLib.appBuilderLibStrings.Deflate
import typings.appBuilderLib.appBuilderLibStrings.LZMA
import typings.appBuilderLib.coreMod.CompressionLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object archiveMod {
  
  @JSImport("app-builder-lib/out/targets/archive", "compute7zCompressArgs")
  @js.native
  def compute7zCompressArgs(format: String): js.Array[String] = js.native
  @JSImport("app-builder-lib/out/targets/archive", "compute7zCompressArgs")
  @js.native
  def compute7zCompressArgs(format: String, options: ArchiveOptions): js.Array[String] = js.native
  
  @js.native
  trait ArchiveOptions extends StObject {
    
    var compression: js.UndefOr[CompressionLevel | Null] = js.native
    
    var dictSize: js.UndefOr[Double] = js.native
    
    var excluded: js.UndefOr[js.Array[String] | Null] = js.native
    
    /**
      * @default true
      */
    var isArchiveHeaderCompressed: js.UndefOr[Boolean] = js.native
    
    var isRegularFile: js.UndefOr[Boolean] = js.native
    
    var method: js.UndefOr[Copy | LZMA | Deflate | DEFAULT] = js.native
    
    /**
      * @default true
      */
    var solid: js.UndefOr[Boolean] = js.native
    
    /**
      * @default false
      */
    var withoutDir: js.UndefOr[Boolean] = js.native
  }
  object ArchiveOptions {
    
    @scala.inline
    def apply(): ArchiveOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ArchiveOptions]
    }
    
    @scala.inline
    implicit class ArchiveOptionsMutableBuilder[Self <: ArchiveOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCompression(value: CompressionLevel): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompressionNull: Self = StObject.set(x, "compression", null)
      
      @scala.inline
      def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      @scala.inline
      def setDictSize(value: Double): Self = StObject.set(x, "dictSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDictSizeUndefined: Self = StObject.set(x, "dictSize", js.undefined)
      
      @scala.inline
      def setExcluded(value: js.Array[String]): Self = StObject.set(x, "excluded", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExcludedNull: Self = StObject.set(x, "excluded", null)
      
      @scala.inline
      def setExcludedUndefined: Self = StObject.set(x, "excluded", js.undefined)
      
      @scala.inline
      def setExcludedVarargs(value: String*): Self = StObject.set(x, "excluded", js.Array(value :_*))
      
      @scala.inline
      def setIsArchiveHeaderCompressed(value: Boolean): Self = StObject.set(x, "isArchiveHeaderCompressed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsArchiveHeaderCompressedUndefined: Self = StObject.set(x, "isArchiveHeaderCompressed", js.undefined)
      
      @scala.inline
      def setIsRegularFile(value: Boolean): Self = StObject.set(x, "isRegularFile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsRegularFileUndefined: Self = StObject.set(x, "isRegularFile", js.undefined)
      
      @scala.inline
      def setMethod(value: Copy | LZMA | Deflate | DEFAULT): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      @scala.inline
      def setSolid(value: Boolean): Self = StObject.set(x, "solid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSolidUndefined: Self = StObject.set(x, "solid", js.undefined)
      
      @scala.inline
      def setWithoutDir(value: Boolean): Self = StObject.set(x, "withoutDir", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithoutDirUndefined: Self = StObject.set(x, "withoutDir", js.undefined)
    }
  }
}
