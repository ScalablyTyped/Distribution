package typings.atAngularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.ResolvedStaticSymbol
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod.StaticSymbolResolverHost
import typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/static_symbol_resolver", JSImport.Namespace)
@js.native
object srcAotStaticUnderscoreSymbolUnderscoreResolverMod extends js.Object {
  @js.native
  class ResolvedStaticSymbol protected () extends js.Object {
    def this(symbol: StaticSymbol, metadata: js.Any) = this()
    var metadata: js.Any = js.native
    var symbol: StaticSymbol = js.native
  }
  
  @js.native
  class StaticSymbolResolver protected () extends js.Object {
    def this(
      host: StaticSymbolResolverHost,
      staticSymbolCache: StaticSymbolCache,
      summaryResolver: SummaryResolver[StaticSymbol]
    ) = this()
    def this(
      host: StaticSymbolResolverHost,
      staticSymbolCache: StaticSymbolCache,
      summaryResolver: SummaryResolver[StaticSymbol],
      errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
    ) = this()
    var _createSymbolsOf: js.Any = js.native
    var _resolveSymbolFromSummary: js.Any = js.native
    var _resolveSymbolMembers: js.Any = js.native
    var createExport: js.Any = js.native
    var createResolvedSymbol: js.Any = js.native
    var errorRecorder: js.UndefOr[js.Any] = js.native
    /**
      * @param module an absolute path to a module file.
      */
    var getModuleMetadata: js.Any = js.native
    var host: js.Any = js.native
    var importAs: js.Any = js.native
    var knownFileNameToModuleNames: js.Any = js.native
    var metadataCache: js.Any = js.native
    var reportError: js.Any = js.native
    var resolveModule: js.Any = js.native
    var resolvedFilePaths: js.Any = js.native
    var resolvedSymbols: js.Any = js.native
    var staticSymbolCache: js.Any = js.native
    var summaryResolver: js.Any = js.native
    var symbolFromFile: js.Any = js.native
    var symbolResourcePaths: js.Any = js.native
    /**
      * getImportAs produces a symbol that can be used to import the given symbol.
      * The import might be different than the symbol if the symbol is exported from
      * a library with a summary; in which case we want to import the symbol from the
      * ngfactory re-export instead of directly to avoid introducing a direct dependency
      * on an otherwise indirect dependency.
      *
      * @param staticSymbol the symbol for which to generate a import symbol
      */
    def getImportAs(staticSymbol: StaticSymbol): StaticSymbol | Null = js.native
    def getImportAs(staticSymbol: StaticSymbol, useSummaries: Boolean): StaticSymbol | Null = js.native
    def getKnownModuleName(filePath: String): String | Null = js.native
    /**
      * getResourcePath produces the path to the original location of the symbol and should
      * be used to determine the relative location of resource references recorded in
      * symbol metadata.
      */
    def getResourcePath(staticSymbol: StaticSymbol): String = js.native
    /**
      * getStaticSymbol produces a Type whose metadata is known but whose implementation is not loaded.
      * All types passed to the StaticResolver should be pseudo-types returned by this method.
      *
      * @param declarationFile the absolute path of the file where the symbol is declared
      * @param name the name of the type.
      * @param members a symbol for a static member of the named type
      */
    def getStaticSymbol(declarationFile: String, name: String): StaticSymbol = js.native
    def getStaticSymbol(declarationFile: String, name: String, members: js.Array[String]): StaticSymbol = js.native
    def getSymbolByModule(module: String, symbolName: String): StaticSymbol = js.native
    def getSymbolByModule(module: String, symbolName: String, containingFile: String): StaticSymbol = js.native
    def getSymbolsOf(filePath: String): js.Array[StaticSymbol] = js.native
    /**
      * getTypeArity returns the number of generic type parameters the given symbol
      * has. If the symbol is not a type the result is null.
      */
    def getTypeArity(staticSymbol: StaticSymbol): Double | Null = js.native
    /**
      * hasDecorators checks a file's metadata for the presence of decorators without evaluating the
      * metadata.
      *
      * @param filePath the absolute path to examine for decorators.
      * @returns true if any class in the file has a decorator.
      */
    def hasDecorators(filePath: String): Boolean = js.native
    /**
      * Invalidate all information derived from the given file.
      *
      * @param fileName the file to invalidate
      */
    def invalidateFile(fileName: String): Unit = js.native
    def recordImportAs(sourceSymbol: StaticSymbol, targetSymbol: StaticSymbol): Unit = js.native
    def recordModuleNameForFileName(fileName: String, moduleName: String): Unit = js.native
    def resolveSymbol(staticSymbol: StaticSymbol): ResolvedStaticSymbol = js.native
  }
  
  @js.native
  trait StaticSymbolResolverHost extends js.Object {
    /**
      * Return a ModuleMetadata for the given module.
      * Angular CLI will produce this metadata for a module whenever a .d.ts files is
      * produced and the module has exported variables or classes with decorators. Module metadata can
      * also be produced directly from TypeScript sources by using MetadataCollector in tools/metadata.
      *
      * @param modulePath is a string identifier for a module as an absolute path.
      * @returns the metadata for the given module.
      */
    def getMetadataFor(modulePath: String): js.UndefOr[js.Array[StringDictionary[_]]] = js.native
    /**
      * Get a file suitable for display to the user that should be relative to the project directory
      * or the current directory.
      */
    def getOutputName(filePath: String): String = js.native
    /**
      * Converts a module name that is used in an `import` to a file path.
      * I.e.
      * `path/to/containingFile.ts` containing `import {...} from 'module-name'`.
      */
    def moduleNameToFileName(moduleName: String): String | Null = js.native
    def moduleNameToFileName(moduleName: String, containingFile: String): String | Null = js.native
  }
  
  def unescapeIdentifier(identifier: String): String = js.native
  def unwrapResolvedMetadata(metadata: js.Any): js.Any = js.native
}

