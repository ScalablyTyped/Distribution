package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`fill-and-outline`
import typings.arcgisJsApi.arcgisJsApiStrings.fill
import typings.arcgisJsApi.arcgisJsApiStrings.outline
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cimSymbolUtilsApplyCIMSymbolColorOptions extends StObject {
  
  /**
    * The symbol layers to apply the color to.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#applyCIMSymbolColor)
    */
  var layersToColor: js.UndefOr[fill | outline | `fill-and-outline`] = js.undefined
}
object cimSymbolUtilsApplyCIMSymbolColorOptions {
  
  inline def apply(): cimSymbolUtilsApplyCIMSymbolColorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[cimSymbolUtilsApplyCIMSymbolColorOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: cimSymbolUtilsApplyCIMSymbolColorOptions] (val x: Self) extends AnyVal {
    
    inline def setLayersToColor(value: fill | outline | `fill-and-outline`): Self = StObject.set(x, "layersToColor", value.asInstanceOf[js.Any])
    
    inline def setLayersToColorUndefined: Self = StObject.set(x, "layersToColor", js.undefined)
  }
}
