package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendLayerProperties extends StObject {
  
  /**
  		 * The id of the operational layer to include in the printout's legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LegendLayer.html#layerId)
  		 */
  var layerId: js.UndefOr[String] = js.undefined
  
  /**
  		 * The ids of the sublayers to include in the printout's legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LegendLayer.html#subLayerIds)
  		 */
  var subLayerIds: js.UndefOr[js.Array[String]] = js.undefined
  
  /**
  		 * The title of the feature layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LegendLayer.html#title)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object LegendLayerProperties {
  
  inline def apply(): LegendLayerProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendLayerProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendLayerProperties] (val x: Self) extends AnyVal {
    
    inline def setLayerId(value: String): Self = StObject.set(x, "layerId", value.asInstanceOf[js.Any])
    
    inline def setLayerIdUndefined: Self = StObject.set(x, "layerId", js.undefined)
    
    inline def setSubLayerIds(value: js.Array[String]): Self = StObject.set(x, "subLayerIds", value.asInstanceOf[js.Any])
    
    inline def setSubLayerIdsUndefined: Self = StObject.set(x, "subLayerIds", js.undefined)
    
    inline def setSubLayerIdsVarargs(value: String*): Self = StObject.set(x, "subLayerIds", js.Array(value*))
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
