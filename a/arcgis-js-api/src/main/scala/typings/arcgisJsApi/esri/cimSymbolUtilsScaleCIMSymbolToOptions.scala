package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait cimSymbolUtilsScaleCIMSymbolToOptions extends StObject {
  
  /**
    * When `true`, this property will preserve the outline width of the symbol.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-support-cimSymbolUtils.html#scaleCIMSymbolTo)
    */
  var preserveOutlineWidth: js.UndefOr[Boolean] = js.undefined
}
object cimSymbolUtilsScaleCIMSymbolToOptions {
  
  inline def apply(): cimSymbolUtilsScaleCIMSymbolToOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[cimSymbolUtilsScaleCIMSymbolToOptions]
  }
  
  extension [Self <: cimSymbolUtilsScaleCIMSymbolToOptions](x: Self) {
    
    inline def setPreserveOutlineWidth(value: Boolean): Self = StObject.set(x, "preserveOutlineWidth", value.asInstanceOf[js.Any])
    
    inline def setPreserveOutlineWidthUndefined: Self = StObject.set(x, "preserveOutlineWidth", js.undefined)
  }
}
