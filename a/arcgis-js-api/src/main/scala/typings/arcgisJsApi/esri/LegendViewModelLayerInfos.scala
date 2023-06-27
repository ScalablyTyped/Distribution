package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegendViewModelLayerInfos extends StObject {
  
  /**
  		 * A layer to add to the legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#layerInfos)
  		 */
  var layer: js.UndefOr[Layer] = js.undefined
  
  /**
  		 * Specify a title for the layer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-LegendViewModel.html#layerInfos)
  		 */
  var title: js.UndefOr[String] = js.undefined
}
object LegendViewModelLayerInfos {
  
  inline def apply(): LegendViewModelLayerInfos = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegendViewModelLayerInfos]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: LegendViewModelLayerInfos] (val x: Self) extends AnyVal {
    
    inline def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    inline def setLayerUndefined: Self = StObject.set(x, "layer", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
