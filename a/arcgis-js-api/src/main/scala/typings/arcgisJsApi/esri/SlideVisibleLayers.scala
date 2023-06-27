package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlideVisibleLayers
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * The ID of a [layer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-Layer.html#id) in the [WebScene](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebScene.html#layers) or [Ground](https://developers.arcgis.com/javascript/latest/api-reference/esri-Ground.html#layers) that is made `visible` in the [SceneView](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html) when the slide is applied to the view.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
  		 */
  var id: String
  
  /**
  		 * The service ids of the visible sublayers on the layer specified by the layer id.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-webscene-Slide.html#visibleLayers)
  		 */
  var sublayerIds: js.Array[Double]
}
object SlideVisibleLayers {
  
  inline def apply(id: String, sublayerIds: js.Array[Double]): SlideVisibleLayers = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], sublayerIds = sublayerIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlideVisibleLayers]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlideVisibleLayers] (val x: Self) extends AnyVal {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setSublayerIds(value: js.Array[Double]): Self = StObject.set(x, "sublayerIds", value.asInstanceOf[js.Any])
    
    inline def setSublayerIdsVarargs(value: Double*): Self = StObject.set(x, "sublayerIds", js.Array(value*))
  }
}
