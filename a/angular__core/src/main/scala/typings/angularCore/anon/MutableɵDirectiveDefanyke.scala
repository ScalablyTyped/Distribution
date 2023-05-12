package typings.angularCore.anon

import typings.angularCore.mod.ContentQueriesFunction
import typings.angularCore.mod.CssSelector
import typings.angularCore.mod.DirectiveDefFeature
import typings.angularCore.mod.FactoryFn
import typings.angularCore.mod.HostBindingsFunction
import typings.angularCore.mod.HostDirectiveDef
import typings.angularCore.mod.HostDirectiveDefs
import typings.angularCore.mod.ProcessProvidersFunction
import typings.angularCore.mod.TAttributes
import typings.angularCore.mod.Type
import typings.angularCore.mod.ViewQueriesFunction
import typings.angularCore.mod.ɵAttributeMarker
import typings.angularCore.mod.ɵCssSelectorList
import typings.angularCore.mod.ɵDirectiveDef
import typings.angularCore.mod.ɵRenderFlags
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined @angular/core.@angular/core.Mutable<@angular/core.@angular/core.ɵDirectiveDef<any>, keyof @angular/core.@angular/core.ɵDirectiveDef<any>> */
trait MutableɵDirectiveDefanyke extends StObject {
  
  var contentQueries: js.UndefOr[ContentQueriesFunction[Any] | Null] = js.undefined
  
  var declaredInputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
  
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
  
  var hostAttrs: js.UndefOr[TAttributes | Null] = js.undefined
  
  var hostBindings: js.UndefOr[HostBindingsFunction[Any] | Null] = js.undefined
  
  var hostDirectives: js.UndefOr[js.Array[HostDirectiveDef[Any]] | Null] = js.undefined
  
  var hostVars: Double
  
  var inputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
  
  var outputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
  
  var providersResolver: js.UndefOr[
    (js.Function2[
      /* def */ ɵDirectiveDef[Any], 
      /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction], 
      Unit
    ]) | Null
  ] = js.undefined
  
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
  
  var `type`: Type[Any]
  
  var viewQuery: js.UndefOr[ViewQueriesFunction[Any] | Null] = js.undefined
}
object MutableɵDirectiveDefanyke {
  
  inline def apply(
    declaredInputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any,
    hostVars: Double,
    inputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any,
    outputs: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any,
    selectors: ɵCssSelectorList,
    standalone: Boolean,
    `type`: Type[Any]
  ): MutableɵDirectiveDefanyke = {
    val __obj = js.Dynamic.literal(declaredInputs = declaredInputs.asInstanceOf[js.Any], hostVars = hostVars.asInstanceOf[js.Any], inputs = inputs.asInstanceOf[js.Any], outputs = outputs.asInstanceOf[js.Any], selectors = selectors.asInstanceOf[js.Any], standalone = standalone.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MutableɵDirectiveDefanyke]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MutableɵDirectiveDefanyke] (val x: Self) extends AnyVal {
    
    inline def setContentQueries(value: (/* rf */ ɵRenderFlags, Any, /* directiveIndex */ Double) => Unit): Self = StObject.set(x, "contentQueries", js.Any.fromFunction3(value))
    
    inline def setContentQueriesNull: Self = StObject.set(x, "contentQueries", null)
    
    inline def setContentQueriesUndefined: Self = StObject.set(x, "contentQueries", js.undefined)
    
    inline def setDeclaredInputs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
    ): Self = StObject.set(x, "declaredInputs", value.asInstanceOf[js.Any])
    
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
    
    inline def setInputs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
    ): Self = StObject.set(x, "inputs", value.asInstanceOf[js.Any])
    
    inline def setOutputs(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in keyof any ]: string} */ js.Any
    ): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setProvidersResolver(
      value: (/* def */ ɵDirectiveDef[Any], /* processProvidersFn */ js.UndefOr[ProcessProvidersFunction]) => Unit
    ): Self = StObject.set(x, "providersResolver", js.Any.fromFunction2(value))
    
    inline def setProvidersResolverNull: Self = StObject.set(x, "providersResolver", null)
    
    inline def setProvidersResolverUndefined: Self = StObject.set(x, "providersResolver", js.undefined)
    
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
    
    inline def setType(value: Type[Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setViewQuery(value: (/* rf */ ɵRenderFlags, Any) => Unit): Self = StObject.set(x, "viewQuery", js.Any.fromFunction2(value))
    
    inline def setViewQueryNull: Self = StObject.set(x, "viewQuery", null)
    
    inline def setViewQueryUndefined: Self = StObject.set(x, "viewQuery", js.undefined)
  }
}
