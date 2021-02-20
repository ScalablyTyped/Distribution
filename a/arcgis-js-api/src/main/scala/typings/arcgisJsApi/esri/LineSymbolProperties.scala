package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`simple-line`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LineSymbolProperties extends SymbolProperties {
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-line`] = js.native
  
  /**
    * The width of the symbol in points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-LineSymbol.html#width)
    */
  var width: js.UndefOr[Double | String] = js.native
}
object LineSymbolProperties {
  
  @scala.inline
  def apply(): LineSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LineSymbolProperties]
  }
  
  @scala.inline
  implicit class LineSymbolPropertiesMutableBuilder[Self <: LineSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: `simple-line`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    @scala.inline
    def setWidth(value: Double | String): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
