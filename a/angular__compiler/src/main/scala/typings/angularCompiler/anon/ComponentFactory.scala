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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentFactory extends StObject {
  
  var changeDetection: ChangeDetectionStrategy | Null
  
  var componentFactory: StaticSymbol | js.Object | Null
  
  var componentViewType: StaticSymbol | ProxyClass | Null
  
  var entryComponents: js.Array[CompileEntryComponentMetadata]
  
  var exportAs: String | Null
  
  var guards: StringDictionary[js.Any]
  
  var hostAttributes: StringDictionary[String]
  
  var hostListeners: StringDictionary[String]
  
  var hostProperties: StringDictionary[String]
  
  var inputs: StringDictionary[String]
  
  var isComponent: Boolean
  
  var isHost: Boolean
  
  var outputs: StringDictionary[String]
  
  var providers: js.Array[CompileProviderMetadata]
  
  var queries: js.Array[CompileQueryMetadata]
  
  var rendererType: StaticSymbol | js.Object | Null
  
  var selector: String | Null
  
  var template: CompileTemplateMetadata | Null
  
  var `type`: CompileTypeMetadata
  
  var viewProviders: js.Array[CompileProviderMetadata]
  
  var viewQueries: js.Array[CompileQueryMetadata]
}
object ComponentFactory {
  
  inline def apply(
    entryComponents: js.Array[CompileEntryComponentMetadata],
    guards: StringDictionary[js.Any],
    hostAttributes: StringDictionary[String],
    hostListeners: StringDictionary[String],
    hostProperties: StringDictionary[String],
    inputs: StringDictionary[String],
    isComponent: Boolean,
    isHost: Boolean,
    outputs: StringDictionary[String],
    providers: js.Array[CompileProviderMetadata],
    queries: js.Array[CompileQueryMetadata],
    `type`: CompileTypeMetadata,
    viewProviders: js.Array[CompileProviderMetadata],
    viewQueries: js.Array[CompileQueryMetadata]
  ): ComponentFactory = {
    val __obj = js.Dynamic.literal(entryComponents = entryComponents.asInstanceOf[js.Any], guards = guards.asInstanceOf[js.Any], hostAttributes = hostAttributes.asInstanceOf[js.Any], hostListeners = hostListeners.asInstanceOf[js.Any], hostProperties = hostProperties.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], isComponent = isComponent.asInstanceOf[js.Any], isHost = isHost.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], providers = providers.asInstanceOf[js.Any], queries = queries.asInstanceOf[js.Any], viewProviders = viewProviders.asInstanceOf[js.Any], viewQueries = viewQueries.asInstanceOf[js.Any], changeDetection = null, componentFactory = null, componentViewType = null, exportAs = null, rendererType = null, selector = null, template = null)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentFactory]
  }
  
  extension [Self <: ComponentFactory](x: Self) {
    
    inline def setChangeDetection(value: ChangeDetectionStrategy): Self = StObject.set(x, "changeDetection", value.asInstanceOf[js.Any])
    
    inline def setChangeDetectionNull: Self = StObject.set(x, "changeDetection", null)
    
    inline def setComponentFactory(value: StaticSymbol | js.Object): Self = StObject.set(x, "componentFactory", value.asInstanceOf[js.Any])
    
    inline def setComponentFactoryNull: Self = StObject.set(x, "componentFactory", null)
    
    inline def setComponentViewType(value: StaticSymbol | ProxyClass): Self = StObject.set(x, "componentViewType", value.asInstanceOf[js.Any])
    
    inline def setComponentViewTypeNull: Self = StObject.set(x, "componentViewType", null)
    
    inline def setEntryComponents(value: js.Array[CompileEntryComponentMetadata]): Self = StObject.set(x, "entryComponents", value.asInstanceOf[js.Any])
    
    inline def setEntryComponentsVarargs(value: CompileEntryComponentMetadata*): Self = StObject.set(x, "entryComponents", js.Array(value :_*))
    
    inline def setExportAs(value: String): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    inline def setGuards(value: StringDictionary[js.Any]): Self = StObject.set(x, "guards", value.asInstanceOf[js.Any])
    
    inline def setHostAttributes(value: StringDictionary[String]): Self = StObject.set(x, "hostAttributes", value.asInstanceOf[js.Any])
    
    inline def setHostListeners(value: StringDictionary[String]): Self = StObject.set(x, "hostListeners", value.asInstanceOf[js.Any])
    
    inline def setHostProperties(value: StringDictionary[String]): Self = StObject.set(x, "hostProperties", value.asInstanceOf[js.Any])
    
    inline def setInputs(value: StringDictionary[String]): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setIsComponent(value: Boolean): Self = StObject.set(x, "isComponent", value.asInstanceOf[js.Any])
    
    inline def setIsHost(value: Boolean): Self = StObject.set(x, "isHost", value.asInstanceOf[js.Any])
    
    inline def setOutputs(value: StringDictionary[String]): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setProviders(value: js.Array[CompileProviderMetadata]): Self = StObject.set(x, "providers", value.asInstanceOf[js.Any])
    
    inline def setProvidersVarargs(value: CompileProviderMetadata*): Self = StObject.set(x, "providers", js.Array(value :_*))
    
    inline def setQueries(value: js.Array[CompileQueryMetadata]): Self = StObject.set(x, "queries", value.asInstanceOf[js.Any])
    
    inline def setQueriesVarargs(value: CompileQueryMetadata*): Self = StObject.set(x, "queries", js.Array(value :_*))
    
    inline def setRendererType(value: StaticSymbol | js.Object): Self = StObject.set(x, "rendererType", value.asInstanceOf[js.Any])
    
    inline def setRendererTypeNull: Self = StObject.set(x, "rendererType", null)
    
    inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
    
    inline def setSelectorNull: Self = StObject.set(x, "selector", null)
    
    inline def setTemplate(value: CompileTemplateMetadata): Self = StObject.set(x, "template", value.asInstanceOf[js.Any])
    
    inline def setTemplateNull: Self = StObject.set(x, "template", null)
    
    inline def setType(value: CompileTypeMetadata): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewProviders(value: js.Array[CompileProviderMetadata]): Self = StObject.set(x, "viewProviders", value.asInstanceOf[js.Any])
    
    inline def setViewProvidersVarargs(value: CompileProviderMetadata*): Self = StObject.set(x, "viewProviders", js.Array(value :_*))
    
    inline def setViewQueries(value: js.Array[CompileQueryMetadata]): Self = StObject.set(x, "viewQueries", value.asInstanceOf[js.Any])
    
    inline def setViewQueriesVarargs(value: CompileQueryMetadata*): Self = StObject.set(x, "viewQueries", js.Array(value :_*))
  }
}
