package typings.angularCompiler

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.anon.Ctor
import typings.angularCompiler.anon.FilePath
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.outputAstMod.ExternalReference
import typings.angularCompiler.srcSummaryResolverMod.SummaryResolver
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import typings.angularCompiler.staticSymbolResolverMod.StaticSymbolResolver
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object staticReflectorMod {
  
  @JSImport("@angular/compiler/src/aot/static_reflector", "StaticReflector")
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
      knownMetadataClasses: Unit,
      knownMetadataFunctions: js.Array[FilePath]
    ) = this()
    def this(
      summaryResolver: SummaryResolver[StaticSymbol],
      symbolResolver: StaticSymbolResolver,
      knownMetadataClasses: js.Array[Ctor],
      knownMetadataFunctions: js.Array[FilePath],
      errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
    ) = this()
    def this(
      summaryResolver: SummaryResolver[StaticSymbol],
      symbolResolver: StaticSymbolResolver,
      knownMetadataClasses: js.Array[Ctor],
      knownMetadataFunctions: Unit,
      errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
    ) = this()
    def this(
      summaryResolver: SummaryResolver[StaticSymbol],
      symbolResolver: StaticSymbolResolver,
      knownMetadataClasses: Unit,
      knownMetadataFunctions: js.Array[FilePath],
      errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
    ) = this()
    def this(
      summaryResolver: SummaryResolver[StaticSymbol],
      symbolResolver: StaticSymbolResolver,
      knownMetadataClasses: Unit,
      knownMetadataFunctions: Unit,
      errorRecorder: js.Function2[/* error */ js.Any, /* fileName */ js.UndefOr[String], Unit]
    ) = this()
    
    /* private */ var ANALYZE_FOR_ENTRY_COMPONENTS: js.Any = js.native
    
    var ROUTES: StaticSymbol = js.native
    
    /* private */ var _annotations: js.Any = js.native
    
    /* private */ var _methodNames: js.Any = js.native
    
    /* private */ var _registerDecoratorOrConstructor: js.Any = js.native
    
    /* private */ var _registerFunction: js.Any = js.native
    
    /* private */ var _staticMembers: js.Any = js.native
    
    /* private */ var annotationCache: js.Any = js.native
    
    /* private */ var annotationForParentClassWithSummaryKind: js.Any = js.native
    
    def annotations(`type`: StaticSymbol): js.Array[js.Any] = js.native
    
    def componentModuleUrl(typeOrFunc: StaticSymbol): String = js.native
    
    /* private */ var conversionMap: js.Any = js.native
    
    /* private */ var error: js.Any = js.native
    
    /* private */ var errorRecorder: js.Any = js.native
    
    def findDeclaration(moduleUrl: String, name: String): StaticSymbol = js.native
    def findDeclaration(moduleUrl: String, name: String, containingFile: String): StaticSymbol = js.native
    
    /* private */ var findParentType: js.Any = js.native
    
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
    
    /* private */ var getTypeMetadata: js.Any = js.native
    
    /* private */ var initializeConversionMap: js.Any = js.native
    
    /* private */ var injectionToken: js.Any = js.native
    
    /**
      * Invalidate the specified `symbols` on program change.
      * @param symbols
      */
    def invalidateSymbols(symbols: js.Array[StaticSymbol]): Unit = js.native
    
    /* private */ var methodCache: js.Any = js.native
    
    /* private */ var opaqueToken: js.Any = js.native
    
    /* private */ var parameterCache: js.Any = js.native
    
    def parameters(`type`: StaticSymbol): js.Array[js.Any] = js.native
    
    def propMetadata(`type`: StaticSymbol): StringDictionary[js.Array[js.Any]] = js.native
    
    /* private */ var propertyCache: js.Any = js.native
    
    /* private */ var reportError: js.Any = js.native
    
    def resolveExternalReference(ref: ExternalReference, containingFile: String): StaticSymbol = js.native
    
    /* private */ var resolvedExternalReferences: js.Any = js.native
    
    /* private */ var shallowAnnotationCache: js.Any = js.native
    
    def shallowAnnotations(`type`: StaticSymbol): js.Array[js.Any] = js.native
    
    /* private */ var staticCache: js.Any = js.native
    
    /* private */ var summaryResolver: js.Any = js.native
    
    /* private */ var symbolResolver: js.Any = js.native
    
    def tryAnnotations(`type`: StaticSymbol): js.Array[js.Any] = js.native
    
    def tryFindDeclaration(moduleUrl: String, name: String): StaticSymbol = js.native
    def tryFindDeclaration(moduleUrl: String, name: String, containingFile: String): StaticSymbol = js.native
    
    /**
      * Simplify but discard any errors
      */
    /* private */ var trySimplify: js.Any = js.native
  }
}
