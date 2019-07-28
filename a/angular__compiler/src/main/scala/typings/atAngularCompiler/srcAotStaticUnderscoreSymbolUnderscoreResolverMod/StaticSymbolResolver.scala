package typings.atAngularCompiler.srcAotStaticUnderscoreSymbolUnderscoreResolverMod

import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbol
import typings.atAngularCompiler.srcAotStaticUnderscoreSymbolMod.StaticSymbolCache
import typings.atAngularCompiler.srcSummaryUnderscoreResolverMod.SummaryResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/static_symbol_resolver", "StaticSymbolResolver")
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

