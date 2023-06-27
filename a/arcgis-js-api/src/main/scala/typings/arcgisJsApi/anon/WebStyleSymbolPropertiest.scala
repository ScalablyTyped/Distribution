package typings.arcgisJsApi.anon

import typings.arcgisJsApi.arcgisJsApiStrings.`web-style`
import typings.arcgisJsApi.esri.Color_
import typings.arcgisJsApi.esri.PortalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined arcgis-js-api.__esri.WebStyleSymbolProperties & {  type :'web-style'} */
trait WebStyleSymbolPropertiest extends StObject {
  
  /**
  		 * The color of the symbol.
  		 *
  		 * @default black
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-Symbol.html#color)
  		 */
  var color: js.UndefOr[Color_ | js.Array[Double] | String] = js.undefined
  
  /**
  		 * The name of the symbol within the web style.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#name)
  		 */
  var name: js.UndefOr[String] = js.undefined
  
  /**
  		 * The portal that contains the web style this symbol refers to.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#portal)
  		 */
  var portal: js.UndefOr[PortalProperties] = js.undefined
  
  /**
  		 * A registered web style name.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleName)
  		 */
  var styleName: js.UndefOr[String] = js.undefined
  
  /**
  		 * URL that points to the web style definition.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-WebStyleSymbol.html#styleUrl)
  		 */
  var styleUrl: js.UndefOr[String] = js.undefined
  
  var `type`: `web-style`
}
object WebStyleSymbolPropertiest {
  
  inline def apply(): WebStyleSymbolPropertiest = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("web-style")
    __obj.asInstanceOf[WebStyleSymbolPropertiest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WebStyleSymbolPropertiest] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_ | js.Array[Double] | String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setColorVarargs(value: Double*): Self = StObject.set(x, "color", js.Array(value*))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    inline def setPortal(value: PortalProperties): Self = StObject.set(x, "portal", value.asInstanceOf[js.Any])
    
    inline def setPortalUndefined: Self = StObject.set(x, "portal", js.undefined)
    
    inline def setStyleName(value: String): Self = StObject.set(x, "styleName", value.asInstanceOf[js.Any])
    
    inline def setStyleNameUndefined: Self = StObject.set(x, "styleName", js.undefined)
    
    inline def setStyleUrl(value: String): Self = StObject.set(x, "styleUrl", value.asInstanceOf[js.Any])
    
    inline def setStyleUrlUndefined: Self = StObject.set(x, "styleUrl", js.undefined)
    
    inline def setType(value: `web-style`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
