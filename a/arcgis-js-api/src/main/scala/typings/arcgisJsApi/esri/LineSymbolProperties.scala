package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSymbolProperties
  extends StObject
     with SymbolProperties {
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-line`] = js.undefined
  
  /**
    * The width of the symbol in points.
    *
    * @default 0.75
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#width)
    */
  var width: js.UndefOr[Double | String] = js.undefined
}
object LineSymbolProperties {
  
  inline def apply(): LineSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSymbolProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LineSymbolProperties] (val x: Self) extends AnyVal {
    
    inline def setType(value: `simple-line`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
