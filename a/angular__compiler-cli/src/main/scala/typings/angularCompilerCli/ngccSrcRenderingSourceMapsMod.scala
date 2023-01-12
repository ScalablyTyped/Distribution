package typings.angularCompilerCli

import typings.angularCompilerCli.ngccSrcRenderingUtilsMod.FileToWrite
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.srcNgtscLoggingSrcLoggerMod.Logger
import typings.convertSourceMap.mod.SourceMapConverter
import typings.magicString.mod.default
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcRenderingSourceMapsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/source_maps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def renderSourceAndMap(logger: Logger, fs: ReadonlyFileSystem, sourceFile: SourceFile, generatedMagicString: default): js.Array[FileToWrite] = (^.asInstanceOf[js.Dynamic].applyDynamic("renderSourceAndMap")(logger.asInstanceOf[js.Any], fs.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], generatedMagicString.asInstanceOf[js.Any])).asInstanceOf[js.Array[FileToWrite]]
  
  trait SourceMapInfo extends StObject {
    
    var isInline: Boolean
    
    var map: SourceMapConverter | Null
    
    var source: String
  }
  object SourceMapInfo {
    
    inline def apply(isInline: Boolean, source: String): SourceMapInfo = {
      val __obj = js.Dynamic.literal(isInline = isInline.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], map = null)
      __obj.asInstanceOf[SourceMapInfo]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SourceMapInfo] (val x: Self) extends AnyVal {
      
      inline def setIsInline(value: Boolean): Self = StObject.set(x, "isInline", value.asInstanceOf[js.Any])
      
      inline def setMap(value: SourceMapConverter): Self = StObject.set(x, "map", value.asInstanceOf[js.Any])
      
      inline def setMapNull: Self = StObject.set(x, "map", null)
      
      inline def setSource(value: String): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    }
  }
}
