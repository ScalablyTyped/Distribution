package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`fill-and-outline`
import typings.arcgisJsApi.arcgisJsApiStrings.fill
import typings.arcgisJsApi.arcgisJsApiStrings.outline
import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cimSymbolUtilsApplyCIMSymbolColorOptions
  extends StObject
     with Object {
  
  /**
    * The symbol layers to apply the color to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#applyCIMSymbolColor)
    */
  var layersToColor: js.UndefOr[fill | outline | `fill-and-outline`] = js.undefined
}
object cimSymbolUtilsApplyCIMSymbolColorOptions {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean
  ): cimSymbolUtilsApplyCIMSymbolColorOptions = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[cimSymbolUtilsApplyCIMSymbolColorOptions]
  }
  
  extension [Self <: cimSymbolUtilsApplyCIMSymbolColorOptions](x: Self) {
    
    inline def setLayersToColor(value: fill | outline | `fill-and-outline`): Self = StObject.set(x, "layersToColor", value.asInstanceOf[js.Any])
    
    inline def setLayersToColorUndefined: Self = StObject.set(x, "layersToColor", js.undefined)
  }
}
