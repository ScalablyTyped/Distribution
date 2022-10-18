package typings.angularCompilerCli

import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcNgtscFileSystemSrcTypesMod.ReadonlyFileSystem
import typings.typescript.mod.CompilerHost
import typings.typescript.mod.CompilerOptions
import typings.typescript.mod.Program
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcPackagesBundleProgramMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/packages/bundle_program", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def findR3SymbolsPath(fs: ReadonlyFileSystem, directory: AbsoluteFsPath, filename: String): AbsoluteFsPath | Null = (^.asInstanceOf[js.Dynamic].applyDynamic("findR3SymbolsPath")(fs.asInstanceOf[js.Any], directory.asInstanceOf[js.Any], filename.asInstanceOf[js.Any])).asInstanceOf[AbsoluteFsPath | Null]
  
  inline def makeBundleProgram(
    fs: ReadonlyFileSystem,
    isCore: Boolean,
    pkg: AbsoluteFsPath,
    path: AbsoluteFsPath,
    r3FileName: String,
    options: CompilerOptions,
    host: CompilerHost
  ): BundleProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBundleProgram")(fs.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], path.asInstanceOf[js.Any], r3FileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any])).asInstanceOf[BundleProgram]
  inline def makeBundleProgram(
    fs: ReadonlyFileSystem,
    isCore: Boolean,
    pkg: AbsoluteFsPath,
    path: AbsoluteFsPath,
    r3FileName: String,
    options: CompilerOptions,
    host: CompilerHost,
    additionalFiles: js.Array[AbsoluteFsPath]
  ): BundleProgram = (^.asInstanceOf[js.Dynamic].applyDynamic("makeBundleProgram")(fs.asInstanceOf[js.Any], isCore.asInstanceOf[js.Any], pkg.asInstanceOf[js.Any], path.asInstanceOf[js.Any], r3FileName.asInstanceOf[js.Any], options.asInstanceOf[js.Any], host.asInstanceOf[js.Any], additionalFiles.asInstanceOf[js.Any])).asInstanceOf[BundleProgram]
  
  trait BundleProgram extends StObject {
    
    @JSName("package")
    var _package: AbsoluteFsPath
    
    var file: SourceFile
    
    var host: CompilerHost
    
    var options: CompilerOptions
    
    var path: AbsoluteFsPath
    
    var program: Program
    
    var r3SymbolsFile: SourceFile | Null
    
    var r3SymbolsPath: AbsoluteFsPath | Null
  }
  object BundleProgram {
    
    inline def apply(
      _package: AbsoluteFsPath,
      file: SourceFile,
      host: CompilerHost,
      options: CompilerOptions,
      path: AbsoluteFsPath,
      program: Program
    ): BundleProgram = {
      val __obj = js.Dynamic.literal(file = file.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], program = program.asInstanceOf[js.Any], r3SymbolsFile = null, r3SymbolsPath = null)
      __obj.updateDynamic("package")(_package.asInstanceOf[js.Any])
      __obj.asInstanceOf[BundleProgram]
    }
    
    extension [Self <: BundleProgram](x: Self) {
      
      inline def setFile(value: SourceFile): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
      
      inline def setHost(value: CompilerHost): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: CompilerOptions): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setPath(value: AbsoluteFsPath): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
      
      inline def setProgram(value: Program): Self = StObject.set(x, "program", value.asInstanceOf[js.Any])
      
      inline def setR3SymbolsFile(value: SourceFile): Self = StObject.set(x, "r3SymbolsFile", value.asInstanceOf[js.Any])
      
      inline def setR3SymbolsFileNull: Self = StObject.set(x, "r3SymbolsFile", null)
      
      inline def setR3SymbolsPath(value: AbsoluteFsPath): Self = StObject.set(x, "r3SymbolsPath", value.asInstanceOf[js.Any])
      
      inline def setR3SymbolsPathNull: Self = StObject.set(x, "r3SymbolsPath", null)
      
      inline def set_package(value: AbsoluteFsPath): Self = StObject.set(x, "package", value.asInstanceOf[js.Any])
    }
  }
}
