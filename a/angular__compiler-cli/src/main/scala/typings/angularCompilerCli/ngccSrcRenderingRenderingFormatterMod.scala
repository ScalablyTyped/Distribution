package typings.angularCompilerCli

import typings.angularCompiler.mod.Statement
import typings.angularCompilerCli.ngccSrcAnalysisModuleWithProvidersAnalyzerMod.ModuleWithProvidersInfo
import typings.angularCompilerCli.ngccSrcAnalysisPrivateDeclarationsAnalyzerMod.ExportInfo
import typings.angularCompilerCli.ngccSrcAnalysisTypesMod.CompiledClass
import typings.angularCompilerCli.srcNgtscImportsSrcReexportMod.Reexport
import typings.angularCompilerCli.srcNgtscTranslatorMod.ImportManager
import typings.angularCompilerCli.srcNgtscTranslatorSrcImportManagerMod.Import
import typings.magicString.mod.default
import typings.std.Map
import typings.std.MapConstructor
import typings.typescript.mod.Node
import typings.typescript.mod.SourceFile
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ngccSrcRenderingRenderingFormatterMod {
  
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/rendering_formatter", "RedundantDecoratorMap")
  @js.native
  val RedundantDecoratorMap: MapConstructor = js.native
  type RedundantDecoratorMap = Map[Node, js.Array[Node]]
  
  /* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
  @JSImport("@angular/compiler-cli/ngcc/src/rendering/rendering_formatter", "RedundantDecoratorMap")
  @js.native
  /* standard es2015.collection */
  open class RedundantDecoratorMapCls[K, V] ()
    extends StObject
       with Map[K, V] {
    def this(entries: js.Array[js.Tuple2[K, V]]) = this()
    def this(iterable: js.Iterable[js.Tuple2[K, V]]) = this()
  }
  
  trait RenderingFormatter extends StObject {
    
    def addAdjacentStatements(output: default, compiledClass: CompiledClass, statements: String): Unit
    
    def addConstants(output: default, constants: String, file: SourceFile): Unit
    
    def addDefinitions(output: default, compiledClass: CompiledClass, definitions: String): Unit
    
    def addDirectExports(output: default, exports: js.Array[Reexport], importManager: ImportManager, file: SourceFile): Unit
    
    def addExports(
      output: default,
      entryPointBasePath: String,
      exports: js.Array[ExportInfo],
      importManager: ImportManager,
      file: SourceFile
    ): Unit
    
    def addImports(output: default, imports: js.Array[Import], sf: SourceFile): Unit
    
    def addModuleWithProvidersParams(
      outputText: default,
      moduleWithProviders: js.Array[ModuleWithProvidersInfo],
      importManager: ImportManager
    ): Unit
    
    def printStatement(stmt: Statement, sourceFile: SourceFile, importManager: ImportManager): String
    
    def removeDecorators(
      output: default,
      decoratorsToRemove: typings.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RedundantDecoratorMap
    ): Unit
  }
  object RenderingFormatter {
    
    inline def apply(
      addAdjacentStatements: (default, CompiledClass, String) => Unit,
      addConstants: (default, String, SourceFile) => Unit,
      addDefinitions: (default, CompiledClass, String) => Unit,
      addDirectExports: (default, js.Array[Reexport], ImportManager, SourceFile) => Unit,
      addExports: (default, String, js.Array[ExportInfo], ImportManager, SourceFile) => Unit,
      addImports: (default, js.Array[Import], SourceFile) => Unit,
      addModuleWithProvidersParams: (default, js.Array[ModuleWithProvidersInfo], ImportManager) => Unit,
      printStatement: (Statement, SourceFile, ImportManager) => String,
      removeDecorators: (default, typings.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RedundantDecoratorMap) => Unit
    ): RenderingFormatter = {
      val __obj = js.Dynamic.literal(addAdjacentStatements = js.Any.fromFunction3(addAdjacentStatements), addConstants = js.Any.fromFunction3(addConstants), addDefinitions = js.Any.fromFunction3(addDefinitions), addDirectExports = js.Any.fromFunction4(addDirectExports), addExports = js.Any.fromFunction5(addExports), addImports = js.Any.fromFunction3(addImports), addModuleWithProvidersParams = js.Any.fromFunction3(addModuleWithProvidersParams), printStatement = js.Any.fromFunction3(printStatement), removeDecorators = js.Any.fromFunction2(removeDecorators))
      __obj.asInstanceOf[RenderingFormatter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RenderingFormatter] (val x: Self) extends AnyVal {
      
      inline def setAddAdjacentStatements(value: (default, CompiledClass, String) => Unit): Self = StObject.set(x, "addAdjacentStatements", js.Any.fromFunction3(value))
      
      inline def setAddConstants(value: (default, String, SourceFile) => Unit): Self = StObject.set(x, "addConstants", js.Any.fromFunction3(value))
      
      inline def setAddDefinitions(value: (default, CompiledClass, String) => Unit): Self = StObject.set(x, "addDefinitions", js.Any.fromFunction3(value))
      
      inline def setAddDirectExports(value: (default, js.Array[Reexport], ImportManager, SourceFile) => Unit): Self = StObject.set(x, "addDirectExports", js.Any.fromFunction4(value))
      
      inline def setAddExports(value: (default, String, js.Array[ExportInfo], ImportManager, SourceFile) => Unit): Self = StObject.set(x, "addExports", js.Any.fromFunction5(value))
      
      inline def setAddImports(value: (default, js.Array[Import], SourceFile) => Unit): Self = StObject.set(x, "addImports", js.Any.fromFunction3(value))
      
      inline def setAddModuleWithProvidersParams(value: (default, js.Array[ModuleWithProvidersInfo], ImportManager) => Unit): Self = StObject.set(x, "addModuleWithProvidersParams", js.Any.fromFunction3(value))
      
      inline def setPrintStatement(value: (Statement, SourceFile, ImportManager) => String): Self = StObject.set(x, "printStatement", js.Any.fromFunction3(value))
      
      inline def setRemoveDecorators(
        value: (default, typings.angularCompilerCli.ngccSrcRenderingRenderingFormatterMod.RedundantDecoratorMap) => Unit
      ): Self = StObject.set(x, "removeDecorators", js.Any.fromFunction2(value))
    }
  }
}
