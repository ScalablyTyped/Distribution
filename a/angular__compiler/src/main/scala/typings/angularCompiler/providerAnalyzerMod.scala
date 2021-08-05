package typings.angularCompiler

import typings.angularCompiler.compileMetadataMod.CompileDirectiveMetadata
import typings.angularCompiler.compileMetadataMod.CompileNgModuleMetadata
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileQueryMetadata
import typings.angularCompiler.compileReflectorMod.CompileReflector
import typings.angularCompiler.srcParseUtilMod.ParseError
import typings.angularCompiler.srcParseUtilMod.ParseSourceSpan
import typings.angularCompiler.templateAstMod.AttrAst
import typings.angularCompiler.templateAstMod.DirectiveAst
import typings.angularCompiler.templateAstMod.ProviderAst
import typings.angularCompiler.templateAstMod.QueryMatch
import typings.angularCompiler.templateAstMod.ReferenceAst
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object providerAnalyzerMod {
  
  @JSImport("@angular/compiler/src/provider_analyzer", "NgModuleProviderAnalyzer")
  @js.native
  class NgModuleProviderAnalyzer protected () extends StObject {
    def this(
      reflector: CompileReflector,
      ngModule: CompileNgModuleMetadata,
      extraProviders: js.Array[CompileProviderMetadata],
      sourceSpan: ParseSourceSpan
    ) = this()
    
    /* private */ var _allProviders: js.Any = js.native
    
    /* private */ var _errors: js.Any = js.native
    
    /* private */ var _getDependency: js.Any = js.native
    
    /* private */ var _getOrCreateLocalProvider: js.Any = js.native
    
    /* private */ var _seenProviders: js.Any = js.native
    
    /* private */ var _transformedProviders: js.Any = js.native
    
    def parse(): js.Array[ProviderAst] = js.native
    
    /* private */ var reflector: js.Any = js.native
  }
  
  @JSImport("@angular/compiler/src/provider_analyzer", "ProviderElementContext")
  @js.native
  class ProviderElementContext protected () extends StObject {
    def this(
      viewContext: ProviderViewContext,
      _parent: ProviderElementContext,
      _isViewRoot: Boolean,
      _directiveAsts: js.Array[DirectiveAst],
      attrs: js.Array[AttrAst],
      refs: js.Array[ReferenceAst],
      isTemplate: Boolean,
      contentQueryStartId: Double,
      _sourceSpan: ParseSourceSpan
    ) = this()
    
    /* private */ var _addQueryReadsTo: js.Any = js.native
    
    /* private */ var _allProviders: js.Any = js.native
    
    /* private */ var _attrs: js.Any = js.native
    
    /* private */ var _contentQueries: js.Any = js.native
    
    /* private */ var _directiveAsts: js.Any = js.native
    
    /* private */ var _getDependency: js.Any = js.native
    
    /* private */ var _getLocalDependency: js.Any = js.native
    
    /* private */ var _getOrCreateLocalProvider: js.Any = js.native
    
    /* private */ var _getQueriesFor: js.Any = js.native
    
    /* private */ var _isViewRoot: js.Any = js.native
    
    /* private */ var _parent: js.Any = js.native
    
    /* private */ var _queriedTokens: js.Any = js.native
    
    /* private */ var _seenProviders: js.Any = js.native
    
    /* private */ var _sourceSpan: js.Any = js.native
    
    /* private */ var _transformedProviders: js.Any = js.native
    
    def afterElement(): Unit = js.native
    
    def queryMatches: js.Array[QueryMatch] = js.native
    
    def transformProviders: js.Array[ProviderAst] = js.native
    
    def transformedDirectiveAsts: js.Array[DirectiveAst] = js.native
    
    val transformedHasViewContainer: Boolean = js.native
    
    var viewContext: ProviderViewContext = js.native
  }
  
  @JSImport("@angular/compiler/src/provider_analyzer", "ProviderError")
  @js.native
  class ProviderError protected () extends ParseError {
    def this(message: String, span: ParseSourceSpan) = this()
  }
  
  @JSImport("@angular/compiler/src/provider_analyzer", "ProviderViewContext")
  @js.native
  class ProviderViewContext protected () extends StObject {
    def this(reflector: CompileReflector, component: CompileDirectiveMetadata) = this()
    
    var component: CompileDirectiveMetadata = js.native
    
    var errors: js.Array[ProviderError] = js.native
    
    var reflector: CompileReflector = js.native
  }
  
  trait QueryWithId extends StObject {
    
    var meta: CompileQueryMetadata
    
    var queryId: Double
  }
  object QueryWithId {
    
    inline def apply(meta: CompileQueryMetadata, queryId: Double): QueryWithId = {
      val __obj = js.Dynamic.literal(meta = meta.asInstanceOf[js.Any], queryId = queryId.asInstanceOf[js.Any])
      __obj.asInstanceOf[QueryWithId]
    }
    
    extension [Self <: QueryWithId](x: Self) {
      
      inline def setMeta(value: CompileQueryMetadata): Self = StObject.set(x, "meta", value.asInstanceOf[js.Any])
      
      inline def setQueryId(value: Double): Self = StObject.set(x, "queryId", value.asInstanceOf[js.Any])
    }
  }
}
