package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscImportsSrcCoreMod.ImportRewriter
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcRenderingUtilsMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/utils", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getImportRewriter(r3SymbolsFile: Null, isCore: Boolean, isFlat: Boolean): ImportRewriter = (^.asInstanceOf[js.Dynamic].applyDynamic("getImportRewriter")(r3SymbolsFile.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], isFlat.asInstanceOf[js.Any])).asInstanceOf[ImportRewriter]
  inline def getImportRewriter(r3SymbolsFile: SourceFile, isCore: Boolean, isFlat: Boolean): ImportRewriter = (^.asInstanceOf[js.Dynamic].applyDynamic("getImportRewriter")(r3SymbolsFile.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], isFlat.asInstanceOf[js.Any])).asInstanceOf[ImportRewriter]
  
  inline def stripExtension[T /* <: String */](filePath: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("stripExtension")(filePath.asInstanceOf[js.Any]).asInstanceOf[T]
  
  trait FileToWrite extends StObject {
    
    /** The contents of the file to be be written. */
    var contents: String
    
    /** Path to where the file should be written. */
    var path: AbsoluteFsPath
  }
  object FileToWrite {
    
    inline def apply(contents: String, path: AbsoluteFsPath): FileToWrite = {
      val __obj = js.Dynamic.literal(contents = contents.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[FileToWrite]
    }
    
    extension [Self <: FileToWrite](x: Self) {
      
      inline def setContents(value: String): Self = StObject.set(x, "contents", value.asInstanceOf[js.Any])
      
      inline def setPath(value: AbsoluteFsPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
}
