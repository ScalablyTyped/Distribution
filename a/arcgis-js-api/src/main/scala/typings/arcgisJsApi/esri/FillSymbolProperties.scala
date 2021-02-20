package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`picture-fill`
import typings.arcgisJsApi.arcgisJsApiStrings.`simple-fill`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FillSymbolProperties extends SymbolProperties {
  
  /**
    * The outline of the polygon.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#outline)
    */
  var outline: js.UndefOr[SimpleLineSymbolProperties] = js.native
  
  /**
    * The symbol type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-FillSymbol.html#type)
    */
  var `type`: js.UndefOr[`simple-fill` | `picture-fill`] = js.native
}
object FillSymbolProperties {
  
  @scala.inline
  def apply(): FillSymbolProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FillSymbolProperties]
  }
  
  @scala.inline
  implicit class FillSymbolPropertiesMutableBuilder[Self <: FillSymbolProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOutline(value: SimpleLineSymbolProperties): Self = StObject.set(x, "outline", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutlineUndefined: Self = StObject.set(x, "outline", js.undefined)
    
    @scala.inline
    def setType(value: `simple-fill` | `picture-fill`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
