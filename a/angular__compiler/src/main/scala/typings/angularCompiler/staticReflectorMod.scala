package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Ctor
import typings.angularCompiler.anon.FilePath
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/aot/static_reflector", JSImport.Namespace)
@js.native
object staticReflectorMod extends js.Object {
  @js.native
  class StaticReflector protected () extends CompileReflector {
    def this(summaryResolver: SummaryResolver[StaticSymbol], symbolResolver: StaticSymbolResolver) = this()
    def this(
      summaryResolver: SummaryResolver[StaticSymbol],
      symbolResolver: StaticSymbolResolver,
      knownMetadataClasses: js.Array[Ctor]
    ) = this()
    def this(
      summaryResolver: SummaryResolver[StaticSymbol],
      symbolResolver: StaticSymbolResolver,
      knownMetadataClasses: js.Array[Ctor],
      knownMetadataFunctions: js.Array[FilePath]
    ) = this()
    def this(
      summaryResolver: SummaryResolver[StaticSymbol],
      symbolResolver: StaticSymbolResolver,
      knownMetadataClasses: js.Array[Ctor],
      knownMetadataFunctions: js.Array[FilePath],
      errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
    ) = this()
    var ANALYZE_FOR_ENTRY_COMPONENTS: js.Any = js.native
    var ROUTES: StaticSymbol = js.native
    var _annotations: js.Any = js.native
    var _methodNames: js.Any = js.native
    var _registerDecoratorOrConstructor: js.Any = js.native
    var _registerFunction: js.Any = js.native
    var _staticMembers: js.Any = js.native
    var annotationCache: js.Any = js.native
    var annotationForParentClassWithSummaryKind: js.Any = js.native
    var conversionMap: js.Any = js.native
    var error: js.Any = js.native
    var errorRecorder: js.UndefOr[js.Any] = js.native
    var findParentType: js.Any = js.native
    var getTypeMetadata: js.Any = js.native
    var initializeConversionMap: js.Any = js.native
    var injectionToken: js.Any = js.native
    var methodCache: js.Any = js.native
    var opaqueToken: js.Any = js.native
    var parameterCache: js.Any = js.native
    var propertyCache: js.Any = js.native
    var reportError: js.Any = js.native
    var resolvedExternalReferences: js.Any = js.native
    var shallowAnnotationCache: js.Any = js.native
    var staticCache: js.Any = js.native
    var summaryResolver: js.Any = js.native
    var symbolResolver: js.Any = js.native
    /**
      * Simplify but discard any errors
      */
    var trySimplify: js.Any = js.native
    def annotations(`type`: StaticSymbol): js.Array[_] = js.native
    def componentModuleUrl(typeOrFunc: StaticSymbol): String = js.native
    def findDeclaration(moduleUrl: String, name: String): StaticSymbol = js.native
    def findDeclaration(moduleUrl: String, name: String, containingFile: String): StaticSymbol = js.native
    def findSymbolDeclaration(symbol: StaticSymbol): StaticSymbol = js.native
    /**
      * getStaticSymbol produces a Type whose metadata is known but whose implementation is not loaded.
      * All types passed to the StaticResolver should be pseudo-types returned by this method.
      *
      * @param declarationFile the absolute path of the file where the symbol is declared
      * @param name the name of the type.
      */
    def getStaticSymbol(declarationFile: String, name: String): StaticSymbol = js.native
    def getStaticSymbol(declarationFile: String, name: String, members: js.Array[String]): StaticSymbol = js.native
    /**
      * Invalidate the specified `symbols` on program change.
      * @param symbols
      */
    def invalidateSymbols(symbols: js.Array[StaticSymbol]): Unit = js.native
    def parameters(`type`: StaticSymbol): js.Array[_] = js.native
    def propMetadata(`type`: StaticSymbol): StringDictionary[js.Array[_]] = js.native
    def resolveExternalReference(ref: ExternalReference, containingFile: String): StaticSymbol = js.native
    def shallowAnnotations(`type`: StaticSymbol): js.Array[_] = js.native
    def tryAnnotations(`type`: StaticSymbol): js.Array[_] = js.native
    def tryFindDeclaration(moduleUrl: String, name: String): StaticSymbol = js.native
    def tryFindDeclaration(moduleUrl: String, name: String, containingFile: String): StaticSymbol = js.native
  }
  
}

