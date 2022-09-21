package typings.angularCompilerCli

import typings.angularCompiler.mod.Statement
import typings.angularCompilerCli.importManagerMod.Import
import typings.angularCompilerCli.moduleWithProvidersAnalyzerMod.ModuleWithProvidersInfo
import typings.angularCompilerCli.ngccHostMod.NgccReflectionHost
import typings.angularCompilerCli.ngtscTranslatorMod.ImportManager
import typings.angularCompilerCli.privateDeclarationsAnalyzerMod.ExportInfo
import typings.angularCompilerCli.reexportMod.Reexport
import typings.angularCompilerCli.renderingFormatterMod.RedundantDecoratorMap
import typings.angularCompilerCli.renderingFormatterMod.RenderingFormatter
import typings.angularCompilerCli.srcTypesMod.AbsoluteFsPath
import typings.angularCompilerCli.srcTypesMod.PathManipulation
import typings.angularCompilerCli.typesMod.CompiledClass
import typings.magicString.mod.default
import typings.typescript.mod.Printer
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esmRenderingFormatterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/esm_rendering_formatter", "EsmRenderingFormatter")
  @js.native
  open class EsmRenderingFormatter protected ()
    extends StObject
       with RenderingFormatter {
    def this(fs: PathManipulation, host: NgccReflectionHost, isCore: Boolean) = this()
    
    /* CompleteClass */
    override def addAdjacentStatements(output: default, compiledClass: CompiledClass, statements: String): Unit = js.native
    
    /* CompleteClass */
    override def addConstants(output: default, constants: String, file: SourceFile): Unit = js.native
    
    /* CompleteClass */
    override def addDefinitions(output: default, compiledClass: CompiledClass, definitions: String): Unit = js.native
    
    /* CompleteClass */
    override def addDirectExports(output: default, exports: js.Array[Reexport], importManager: ImportManager, file: SourceFile): Unit = js.native
    
    /* CompleteClass */
    override def addExports(
      output: default,
      entryPointBasePath: String,
      exports: js.Array[ExportInfo],
      importManager: ImportManager,
      file: SourceFile
    ): Unit = js.native
    /**
      * Add the exports to the end of the file.
      */
    def addExports(
      output: default,
      entryPointBasePath: AbsoluteFsPath,
      exports: js.Array[ExportInfo],
      importManager: ImportManager,
      file: SourceFile
    ): Unit = js.native
    
    /* CompleteClass */
    override def addImports(output: default, imports: js.Array[Import], sf: SourceFile): Unit = js.native
    
    /* CompleteClass */
    override def addModuleWithProvidersParams(
      outputText: default,
      moduleWithProviders: js.Array[ModuleWithProvidersInfo],
      importManager: ImportManager
    ): Unit = js.native
    
    /* protected */ def findEndOfImports(sf: SourceFile): Double = js.native
    
    /* protected */ var fs: PathManipulation = js.native
    
    /* protected */ var host: NgccReflectionHost = js.native
    
    /* protected */ var isCore: Boolean = js.native
    
    /**
      * Check whether the given type is the core Angular `ModuleWithProviders` interface.
      * @param typeName The type to check.
      * @returns true if the type is the core Angular `ModuleWithProviders` interface.
      */
    /* private */ var isCoreModuleWithProvidersType: Any = js.native
    
    /* CompleteClass */
    override def printStatement(stmt: Statement, sourceFile: SourceFile, importManager: ImportManager): String = js.native
    
    /* protected */ var printer: Printer = js.native
    
    /* CompleteClass */
    override def removeDecorators(output: default, decoratorsToRemove: RedundantDecoratorMap): Unit = js.native
  }
}
