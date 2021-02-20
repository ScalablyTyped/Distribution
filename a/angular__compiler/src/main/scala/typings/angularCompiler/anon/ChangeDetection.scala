package typings.angularCompiler.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCompiler.compileMetadataMod.CompileEntryComponentMetadata
import typings.angularCompiler.compileMetadataMod.CompileProviderMetadata
import typings.angularCompiler.compileMetadataMod.CompileQueryMetadata
import typings.angularCompiler.compileMetadataMod.CompileTemplateMetadata
import typings.angularCompiler.compileMetadataMod.CompileTypeMetadata
import typings.angularCompiler.compileMetadataMod.ProxyClass
import typings.angularCompiler.coreMod.ChangeDetectionStrategy
import typings.angularCompiler.staticSymbolMod.StaticSymbol
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChangeDetection extends StObject {
  
  var changeDetection: ChangeDetectionStrategy | Null = js.native
  
  var componentFactory: StaticSymbol | js.Object | Null = js.native
  
  var componentViewType: StaticSymbol | ProxyClass | Null = js.native
  
  var entryComponents: js.Array[CompileEntryComponentMetadata] = js.native
  
  var exportAs: String | Null = js.native
  
  var guards: StringDictionary[js.Any] = js.native
  
  var host: StringDictionary[String] = js.native
  
  var inputs: js.Array[String] = js.native
  
  var isComponent: Boolean = js.native
  
  var isHost: Boolean = js.native
  
  var outputs: js.Array[String] = js.native
  
  var providers: js.Array[CompileProviderMetadata] = js.native
  
  var queries: js.Array[CompileQueryMetadata] = js.native
  
  var rendererType: StaticSymbol | js.Object | Null = js.native
  
  var selector: String | Null = js.native
  
  var template: CompileTemplateMetadata = js.native
  
  var `type`: CompileTypeMetadata = js.native
  
  var viewProviders: js.Array[CompileProviderMetadata] = js.native
  
  var viewQueries: js.Array[CompileQueryMetadata] = js.native
}
object ChangeDetection {
  
  @scala.inline
  def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    guards: StringDictionary[js.Any],
    host: StringDictionary[String],
    inputs: js.Array[String],
    isComponent: Boolean,
    isHost: Boolean,
    outputs: js.Array[String],
    providers: js.Array[CompileProviderMetadata],
    queries: js.Array[CompileQueryMetadata],
    template: CompileTemplateMetadata,
    `type`: CompileTypeMetadata,
    viewProviders: js.Array[CompileProviderMetadata],
    viewQueries: js.Array[CompileQueryMetadata]
  ): ChangeDetection = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], host = host.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isHost = isHost.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], template = template.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChangeDetection]
  }
  
  @scala.inline
  implicit class ChangeDetectionMutableBuilder[Self <: ChangeDetection] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChangeDetectionNull: Self = StObject.set(x, "changeDetection", null)
    
    @scala.inline
    def setComponentFactory(value: StaticSymbol | js.Object): Self = StObject.set(x, "componentFactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentFactoryNull: Self = StObject.set(x, "componentFactory", null)
    
    @scala.inline
    def setComponentViewType(value: StaticSymbol | ProxyClass): Self = StObject.set(x, "componentViewType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComponentViewTypeNull: Self = StObject.set(x, "componentViewType", null)
    
    @scala.inline
    def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    @scala.inline
    def setExportAs(value: String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    @scala.inline
    def setGuards(value: StringDictionary[js.Any]): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHost(value: StringDictionary[String]): Self = StObject.set(x, "host", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputs(value: js.Array[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInputsVarargs(value: String*): Self = StObject.set(x, "inputs", js.Array(value :_*))
    
    @scala.inline
    def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsHost(value: Boolean): Self = StObject.set(x, "isHost", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputs(value: js.Array[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputsVarargs(value: String*): Self = StObject.set(x, "outputs", js.Array(value :_*))
    
    @scala.inline
    def setProviders(value: js.Array[CompileProviderMetadata]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProvidersVarargs(value: CompileProviderMetadata*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    @scala.inline
    def setQueries(value: js.Array[CompileQueryMetadata]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setQueriesVarargs(value: CompileQueryMetadata*): Self = StObject.set(x, "queries", js.Array(value :_*))
    
    @scala.inline
    def setRendererType(value: StaticSymbol | js.Object): Self = StObject.set(x, "rendererType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRendererTypeNull: Self = StObject.set(x, "rendererType", null)
    
    @scala.inline
    def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    @scala.inline
    def setTemplate(value: CompileTemplateMetadata): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProviders(value: js.Array[CompileProviderMetadata]): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewProvidersVarargs(value: CompileProviderMetadata*): Self = StObject.set(x, "viewProviders", js.Array(value :_*))
    
    @scala.inline
    def setViewQueries(value: js.Array[CompileQueryMetadata]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setViewQueriesVarargs(value: CompileQueryMetadata*): Self = StObject.set(x, "viewQueries", js.Array(value :_*))
  }
}
