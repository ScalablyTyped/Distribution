package typings.angularCore.anon

import org.scalablytyped.runtime.StringDictionary
import typings.angularCore.mod.ComponentTemplate
import typings.angularCore.mod.ContentQueriesFunction
import typings.angularCore.mod.CssSelector
import typings.angularCore.mod.DependencyTypeList
import typings.angularCore.mod.DirectiveDefFeature
import typings.angularCore.mod.DirectiveDefList
import typings.angularCore.mod.DirectiveDefListOrFactory
import typings.angularCore.mod.FactoryFn
import typings.angularCore.mod.HostBindingsFunction
import typings.angularCore.mod.HostDirectiveDef
import typings.angularCore.mod.HostDirectiveDefs
import typings.angularCore.mod.PipeDefList
import typings.angularCore.mod.PipeDefListOrFactory
import typings.angularCore.mod.PipeType
import typings.angularCore.mod.ProcessProvidersFunction
import typings.angularCore.mod.SchemaMetadata
import typings.angularCore.mod.TAttributes
import typings.angularCore.mod.TConstants
import typings.angularCore.mod.TConstantsOrFactory
import typings.angularCore.mod.TView
import typings.angularCore.mod.Type
import typings.angularCore.mod.TypeOrFactory
import typings.angularCore.mod.ViewEncapsulation
import typings.angularCore.mod.ViewQueriesFunction
import typings.angularCore.mod.ɵAttributeMarker
import typings.angularCore.mod.ɵComponentDef
import typings.angularCore.mod.ɵComponentType
import typings.angularCore.mod.ɵCssSelectorList
import typings.angularCore.mod.ɵDirectiveDef
import typings.angularCore.mod.ɵDirectiveType
import typings.angularCore.mod.ɵPipeDef
import typings.angularCore.mod.ɵRenderFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/core.@angular/core.Mutable<@angular/core.@angular/core.ɵComponentDef<any>, keyof @angular/core.@angular/core.ɵComponentDef<any>> */
trait MutableɵComponentDefanyke extends StObject {
  
  @JSName("_")
  var _underscore: js.UndefOr[Any] = js.undefined
  
  var consts: js.UndefOr[TConstantsOrFactory | Null] = js.undefined
  
  var contentQueries: js.UndefOr[ContentQueriesFunction[Any] | Null] = js.undefined
  
  var data: StringDictionary[Any]
  
  var declaredInputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
  
  var decls: Double
  
  var dependencies: js.UndefOr[TypeOrFactory[DependencyTypeList] | Null] = js.undefined
  
  var directiveDefs: js.UndefOr[DirectiveDefListOrFactory | Null] = js.undefined
  
  var encapsulation: ViewEncapsulation
  
  var exportAs: js.UndefOr[js.Array[String] | Null] = js.undefined
  
  var factory: js.UndefOr[FactoryFn[Any] | Null] = js.undefined
  
  var features: js.UndefOr[js.Array[DirectiveDefFeature] | Null] = js.undefined
  
  var findHostDirectiveDefs: js.UndefOr[
    (js.Function3[
      /* currentDef */ ɵDirectiveDef[Any], 
      /* matchedDefs */ js.Array[ɵDirectiveDef[Any]], 
      /* hostDirectiveDefs */ HostDirectiveDefs, 
      Unit
    ]) | Null
  ] = js.undefined
  
  var getStandaloneInjector: js.UndefOr[
    (js.Function1[
      /* parentInjector */ typings.angularCore.mod.EnvironmentInjector, 
      typings.angularCore.mod.EnvironmentInjector | Null
    ]) | Null
  ] = js.undefined
  
  var hostAttrs: js.UndefOr[TAttributes | Null] = js.undefined
  
  var hostBindings: js.UndefOr[HostBindingsFunction[Any] | Null] = js.undefined
  
  var hostDirectives: js.UndefOr[js.Array[HostDirectiveDef[Any]] | Null] = js.undefined
  
  var hostVars: Double
  
  var id: String
  
  var inputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
  
  var ngContentSelectors: js.UndefOr[js.Array[String]] = js.undefined
  
  var onPush: Boolean
  
  var outputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
  
  var pipeDefs: js.UndefOr[PipeDefListOrFactory | Null] = js.undefined
  
  var providersResolver: js.UndefOr[
    (js.Function2[
      /* def */ ɵDirectiveDef[Any], 
      /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction], 
      Unit
    ]) | Null
  ] = js.undefined
  
  var schemas: js.UndefOr[js.Array[SchemaMetadata] | Null] = js.undefined
  
  var selectors: ɵCssSelectorList
  
  var setInput: js.UndefOr[
    (js.ThisFunction4[
      /* this */ ɵDirectiveDef[Any], 
      /* instance */ Any, 
      /* value */ Any, 
      /* publicName */ String, 
      /* privateName */ String, 
      Unit
    ]) | Null
  ] = js.undefined
  
  var standalone: Boolean
  
  var styles: js.Array[String]
  
  var tView: js.UndefOr[TView | Null] = js.undefined
  
  def template[U /* <: Any */](rf: ɵRenderFlags, ctx: Any | U): Unit
  @JSName("template")
  var template_Original: ComponentTemplate[Any]
  
  var `type`: Type[Any]
  
  var vars: Double
  
  var viewQuery: js.UndefOr[ViewQueriesFunction[Any] | Null] = js.undefined
}
object MutableɵComponentDefanyke {
  
  inline def apply(
    data: StringDictionary[Any],
    declaredInputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any,
    decls: Double,
    encapsulation: ViewEncapsulation,
    hostVars: Double,
    id: String,
    inputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any,
    onPush: Boolean,
    outputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any,
    selectors: ɵCssSelectorList,
    standalone: Boolean,
    styles: js.Array[String],
    template: (/* rf */ ɵRenderFlags, Any) => Unit,
    `type`: Type[Any],
    vars: Double
  ): MutableɵComponentDefanyke = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], declaredInputs = declaredInputs.asInstanceOf[js.Any], decls = decls.asInstanceOf[js.Any], encapsulation = encapsulation.asInstanceOf[js.Any], hostVars = hostVars.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], onPush = onPush.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any], template = js.Any.fromFunction2(template), vars = vars.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableɵComponentDefanyke]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutableɵComponentDefanyke] (val x: Self) extends AnyVal {
    
    inline def setConsts(value: TConstantsOrFactory): Self = StObject.set(x, "consts", value.asInstanceOf[js.Any])
    
    inline def setConstsFunction0(value: () => TConstants): Self = StObject.set(x, "consts", js.Any.fromFunction0(value))
    
    inline def setConstsNull: Self = StObject.set(x, "consts", null)
    
    inline def setConstsUndefined: Self = StObject.set(x, "consts", js.undefined)
    
    inline def setConstsVarargs(value: (TAttributes | String)*): Self = StObject.set(x, "consts", js.Array(value*))
    
    inline def setContentQueries(value: (/* rf */ ɵRenderFlags, Any, /* directiveIndex */ Double) => Unit): Self = StObject.set(x, "contentQueries", js.Any.fromFunction3(value))
    
    inline def setContentQueriesNull: Self = StObject.set(x, "contentQueries", null)
    
    inline def setContentQueriesUndefined: Self = StObject.set(x, "contentQueries", js.undefined)
    
    inline def setData(value: StringDictionary[Any]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeclaredInputs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
    ): Self = StObject.set(x, "declaredInputs", value.asInstanceOf[js.Any])
    
    inline def setDecls(value: Double): Self = StObject.set(x, "decls", value.asInstanceOf[js.Any])
    
    inline def setDependencies(value: TypeOrFactory[DependencyTypeList]): Self = StObject.set(x, "dependencies", value.asInstanceOf[js.Any])
    
    inline def setDependenciesFunction0(value: () => DependencyTypeList): Self = StObject.set(x, "dependencies", js.Any.fromFunction0(value))
    
    inline def setDependenciesNull: Self = StObject.set(x, "dependencies", null)
    
    inline def setDependenciesUndefined: Self = StObject.set(x, "dependencies", js.undefined)
    
    inline def setDependenciesVarargs(value: (ɵDirectiveType[Any] | ɵComponentType[Any] | PipeType[Any] | Type[Any])*): Self = StObject.set(x, "dependencies", js.Array(value*))
    
    inline def setDirectiveDefs(value: DirectiveDefListOrFactory): Self = StObject.set(x, "directiveDefs", value.asInstanceOf[js.Any])
    
    inline def setDirectiveDefsFunction0(value: () => DirectiveDefList): Self = StObject.set(x, "directiveDefs", js.Any.fromFunction0(value))
    
    inline def setDirectiveDefsNull: Self = StObject.set(x, "directiveDefs", null)
    
    inline def setDirectiveDefsUndefined: Self = StObject.set(x, "directiveDefs", js.undefined)
    
    inline def setDirectiveDefsVarargs(value: (ɵDirectiveDef[Any] | ɵComponentDef[Any])*): Self = StObject.set(x, "directiveDefs", js.Array(value*))
    
    inline def setEncapsulation(value: ViewEncapsulation): Self = StObject.set(x, "encapsulation", value.asInstanceOf[js.Any])
    
    inline def setExportAs(value: js.Array[String]): Self = StObject.set(x, "exportAs", value.asInstanceOf[js.Any])
    
    inline def setExportAsNull: Self = StObject.set(x, "exportAs", null)
    
    inline def setExportAsUndefined: Self = StObject.set(x, "exportAs", js.undefined)
    
    inline def setExportAsVarargs(value: String*): Self = StObject.set(x, "exportAs", js.Array(value*))
    
    inline def setFactory(value: FactoryFn[Any]): Self = StObject.set(x, "factory", value.asInstanceOf[js.Any])
    
    inline def setFactoryNull: Self = StObject.set(x, "factory", null)
    
    inline def setFactoryUndefined: Self = StObject.set(x, "factory", js.undefined)
    
    inline def setFeatures(value: js.Array[DirectiveDefFeature]): Self = StObject.set(x, "features", value.asInstanceOf[js.Any])
    
    inline def setFeaturesNull: Self = StObject.set(x, "features", null)
    
    inline def setFeaturesUndefined: Self = StObject.set(x, "features", js.undefined)
    
    inline def setFeaturesVarargs(value: DirectiveDefFeature*): Self = StObject.set(x, "features", js.Array(value*))
    
    inline def setFindHostDirectiveDefs(
      value: (/* currentDef */ ɵDirectiveDef[Any], /* matchedDefs */ js.Array[ɵDirectiveDef[Any]], /* hostDirectiveDefs */ HostDirectiveDefs) => Unit
    ): Self = StObject.set(x, "findHostDirectiveDefs", js.Any.fromFunction3(value))
    
    inline def setFindHostDirectiveDefsNull: Self = StObject.set(x, "findHostDirectiveDefs", null)
    
    inline def setFindHostDirectiveDefsUndefined: Self = StObject.set(x, "findHostDirectiveDefs", js.undefined)
    
    inline def setGetStandaloneInjector(
      value: /* parentInjector */ typings.angularCore.mod.EnvironmentInjector => typings.angularCore.mod.EnvironmentInjector | Null
    ): Self = StObject.set(x, "getStandaloneInjector", js.Any.fromFunction1(value))
    
    inline def setGetStandaloneInjectorNull: Self = StObject.set(x, "getStandaloneInjector", null)
    
    inline def setGetStandaloneInjectorUndefined: Self = StObject.set(x, "getStandaloneInjector", js.undefined)
    
    inline def setHostAttrs(value: TAttributes): Self = StObject.set(x, "hostAttrs", value.asInstanceOf[js.Any])
    
    inline def setHostAttrsNull: Self = StObject.set(x, "hostAttrs", null)
    
    inline def setHostAttrsUndefined: Self = StObject.set(x, "hostAttrs", js.undefined)
    
    inline def setHostAttrsVarargs(value: (String | ɵAttributeMarker | CssSelector)*): Self = StObject.set(x, "hostAttrs", js.Array(value*))
    
    inline def setHostBindings(value: (/* rf */ ɵRenderFlags, Any) => Unit): Self = StObject.set(x, "hostBindings", js.Any.fromFunction2(value))
    
    inline def setHostBindingsNull: Self = StObject.set(x, "hostBindings", null)
    
    inline def setHostBindingsUndefined: Self = StObject.set(x, "hostBindings", js.undefined)
    
    inline def setHostDirectives(value: js.Array[HostDirectiveDef[Any]]): Self = StObject.set(x, "hostDirectives", value.asInstanceOf[js.Any])
    
    inline def setHostDirectivesNull: Self = StObject.set(x, "hostDirectives", null)
    
    inline def setHostDirectivesUndefined: Self = StObject.set(x, "hostDirectives", js.undefined)
    
    inline def setHostDirectivesVarargs(value: HostDirectiveDef[Any]*): Self = StObject.set(x, "hostDirectives", js.Array(value*))
    
    inline def setHostVars(value: Double): Self = StObject.set(x, "hostVars", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInputs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
    ): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setNgContentSelectors(value: js.Array[String]): Self = StObject.set(x, "ngContentSelectors", value.asInstanceOf[js.Any])
    
    inline def setNgContentSelectorsUndefined: Self = StObject.set(x, "ngContentSelectors", js.undefined)
    
    inline def setNgContentSelectorsVarargs(value: String*): Self = StObject.set(x, "ngContentSelectors", js.Array(value*))
    
    inline def setOnPush(value: Boolean): Self = StObject.set(x, "onPush", value.asInstanceOf[js.Any])
    
    inline def setOutputs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
    ): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setPipeDefs(value: PipeDefListOrFactory): Self = StObject.set(x, "pipeDefs", value.asInstanceOf[js.Any])
    
    inline def setPipeDefsFunction0(value: () => PipeDefList): Self = StObject.set(x, "pipeDefs", js.Any.fromFunction0(value))
    
    inline def setPipeDefsNull: Self = StObject.set(x, "pipeDefs", null)
    
    inline def setPipeDefsUndefined: Self = StObject.set(x, "pipeDefs", js.undefined)
    
    inline def setPipeDefsVarargs(value: ɵPipeDef[Any]*): Self = StObject.set(x, "pipeDefs", js.Array(value*))
    
    inline def setProvidersResolver(
      value: (/* def */ ɵDirectiveDef[Any], /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction]) => Unit
    ): Self = StObject.set(x, "providersResolver", js.Any.fromFunction2(value))
    
    inline def setProvidersResolverNull: Self = StObject.set(x, "providersResolver", null)
    
    inline def setProvidersResolverUndefined: Self = StObject.set(x, "providersResolver", js.undefined)
    
    inline def setSchemas(value: js.Array[SchemaMetadata]): Self = StObject.set(x, "schemas", value.asInstanceOf[js.Any])
    
    inline def setSchemasNull: Self = StObject.set(x, "schemas", null)
    
    inline def setSchemasUndefined: Self = StObject.set(x, "schemas", js.undefined)
    
    inline def setSchemasVarargs(value: SchemaMetadata*): Self = StObject.set(x, "schemas", js.Array(value*))
    
    inline def setSelectors(value: ɵCssSelectorList): Self = StObject.set(x, "selectors", value.asInstanceOf[js.Any])
    
    inline def setSelectorsVarargs(value: CssSelector*): Self = StObject.set(x, "selectors", js.Array(value*))
    
    inline def setSetInput(
      value: js.ThisFunction4[
          /* this */ ɵDirectiveDef[Any], 
          /* instance */ Any, 
          /* value */ Any, 
          /* publicName */ String, 
          /* privateName */ String, 
          Unit
        ]
    ): Self = StObject.set(x, "setInput", value.asInstanceOf[js.Any])
    
    inline def setSetInputNull: Self = StObject.set(x, "setInput", null)
    
    inline def setSetInputUndefined: Self = StObject.set(x, "setInput", js.undefined)
    
    inline def setStandalone(value: Boolean): Self = StObject.set(x, "standalone", value.asInstanceOf[js.Any])
    
    inline def setStyles(value: js.Array[String]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
    
    inline def setStylesVarargs(value: String*): Self = StObject.set(x, "styles", js.Array(value*))
    
    inline def setTView(value: TView): Self = StObject.set(x, "tView", value.asInstanceOf[js.Any])
    
    inline def setTViewNull: Self = StObject.set(x, "tView", null)
    
    inline def setTViewUndefined: Self = StObject.set(x, "tView", js.undefined)
    
    inline def setTemplate(value: (/* rf */ ɵRenderFlags, Any) => Unit): Self = StObject.set(x, "template", js.Any.fromFunction2(value))
    
    inline def setType(value: Type[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setVars(value: Double): Self = StObject.set(x, "vars", value.asInstanceOf[js.Any])
    
    inline def setViewQuery(value: (/* rf */ ɵRenderFlags, Any) => Unit): Self = StObject.set(x, "viewQuery", js.Any.fromFunction2(value))
    
    inline def setViewQueryNull: Self = StObject.set(x, "viewQuery", null)
    
    inline def setViewQueryUndefined: Self = StObject.set(x, "viewQuery", js.undefined)
    
    inline def set_underscore(value: Any): Self = StObject.set(x, "_", value.asInstanceOf[js.Any])
    
    inline def set_underscoreUndefined: Self = StObject.set(x, "_", js.undefined)
  }
}
