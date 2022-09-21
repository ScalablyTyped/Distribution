package typings.angularCompilerCli

import typings.angularCompiler.mod.ConstantPool
import typings.angularCompilerCli.entryPointBundleMod.EntryPointBundle
import typings.angularCompilerCli.loggerMod.Logger
import typings.angularCompilerCli.ngccHostMod.NgccReflectionHost
import typings.angularCompilerCli.ngtscTranslatorMod.ImportManager
import typings.angularCompilerCli.performCompileMod.ParsedConfiguration
import typings.angularCompilerCli.privateDeclarationsAnalyzerMod.PrivateDeclarationsAnalyses
import typings.angularCompilerCli.renderingFormatterMod.RenderingFormatter
import typings.angularCompilerCli.renderingUtilsMod.FileToWrite
import typings.angularCompilerCli.srcTypesMod.ReadonlyFileSystem
import typings.angularCompilerCli.typesMod.CompiledFile
import typings.angularCompilerCli.typesMod.DecorationAnalyses
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rendererMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/renderer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/renderer", "Renderer")
  @js.native
  open class Renderer protected () extends StObject {
    def this(
      host: NgccReflectionHost,
      srcFormatter: RenderingFormatter,
      fs: ReadonlyFileSystem,
      logger: Logger,
      bundle: EntryPointBundle
    ) = this()
    def this(
      host: NgccReflectionHost,
      srcFormatter: RenderingFormatter,
      fs: ReadonlyFileSystem,
      logger: Logger,
      bundle: EntryPointBundle,
      tsConfig: ParsedConfiguration
    ) = this()
    
    /* private */ var bundle: Any = js.native
    
    /**
      * From the given list of classes, computes a map of decorators that should be removed.
      * The decorators to remove are keyed by their container node, such that we can tell if
      * we should remove the entire decorator property.
      * @param classes The list of classes that may have decorators to remove.
      * @returns A map of decorators to remove, keyed by their container node.
      */
    /* private */ var computeDecoratorsToRemove: Any = js.native
    
    /* private */ var fs: Any = js.native
    
    /* private */ var host: Any = js.native
    
    /* private */ var logger: Any = js.native
    
    /**
      * Render the adjacent statements as source code for the given class.
      * @param sourceFile The file containing the class to process.
      * @param clazz The class whose statements are to be rendered.
      * @param compilation The results of analyzing the class - this is used to generate the rendered
      * definitions.
      * @param imports An object that tracks the imports that are needed by the rendered definitions.
      */
    /* private */ var renderAdjacentStatements: Any = js.native
    
    /**
      * Render the definitions as source code for the given class.
      * @param sourceFile The file containing the class to process.
      * @param clazz The class whose definitions are to be rendered.
      * @param compilation The results of analyzing the class - this is used to generate the rendered
      * definitions.
      * @param imports An object that tracks the imports that are needed by the rendered definitions.
      */
    /* private */ var renderDefinitions: Any = js.native
    
    def renderFile(
      sourceFile: SourceFile,
      compiledFile: Unit,
      privateDeclarationsAnalyses: PrivateDeclarationsAnalyses
    ): js.Array[FileToWrite] = js.native
    /**
      * Render the source code and source-map for an Analyzed file.
      * @param compiledFile The analyzed file to render.
      * @param targetPath The absolute path where the rendered file will be written.
      */
    def renderFile(
      sourceFile: SourceFile,
      compiledFile: CompiledFile,
      privateDeclarationsAnalyses: PrivateDeclarationsAnalyses
    ): js.Array[FileToWrite] = js.native
    
    def renderProgram(decorationAnalyses: DecorationAnalyses, privateDeclarationsAnalyses: PrivateDeclarationsAnalyses): js.Array[FileToWrite] = js.native
    
    /* private */ var renderStatements: Any = js.native
    
    /* private */ var srcFormatter: Any = js.native
    
    /* private */ var tsConfig: Any = js.native
  }
  
  inline def renderConstantPool(
    formatter: RenderingFormatter,
    sourceFile: SourceFile,
    constantPool: ConstantPool,
    imports: ImportManager
  ): String = (^.asInstanceOf[js.Dynamic].applyDynamic("renderConstantPool")(formatter.asInstanceOf[js.Any], sourceFile.asInstanceOf[js.Any], constantPool.asInstanceOf[js.Any], imports.asInstanceOf[js.Any])).asInstanceOf[String]
}
