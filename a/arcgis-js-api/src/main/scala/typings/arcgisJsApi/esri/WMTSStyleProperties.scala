package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WMTSStyleProperties extends StObject {
  
  /**
  		 * Description for the WMTS style.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#description)
  		 */
  var description: js.UndefOr[String] = js.undefined
  
  /**
  		 * The unique ID assigned to the style.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#id)
  		 */
  var id: js.UndefOr[String] = js.undefined
  
  /**
  		 * The URL to the legend which gets used in [Legend](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html) widget.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#legendUrl)
  		 */
  var legendUrl: js.UndefOr[String] = js.undefined
  
  /**
  		 * The title of the WMTS style.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-WMTSStyle.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object WMTSStyleProperties {
  
  inline def apply(): WMTSStyleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WMTSStyleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: WMTSStyleProperties] (val x: Self) extends AnyVal {
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setLegendUrl(value: String): Self = StObject.set(x, "legendUrl", value.asInstanceOf[js.Any])
    
    inline def setLegendUrlUndefined: Self = StObject.set(x, "legendUrl", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
