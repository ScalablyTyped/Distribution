package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LegendLayerInfos extends Object {
  
  /**
    * List of sublayer ids that will not be displayed in the legend even if they are visible in the map.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var hideLayers: js.Array[Double] = js.native
  
  /**
    * A layer to display in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var layer: Layer = js.native
  
  /**
    * Specifies a title for the layer to display above its symbols and descriptions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend.html#layerInfos)
    */
  var title: js.UndefOr[String] = js.native
}
object LegendLayerInfos {
  
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    hideLayers: js.Array[Double],
    layer: Layer,
    propertyIsEnumerable: PropertyKey => Boolean
  ): LegendLayerInfos = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), hideLayers = hideLayers.asInstanceOf[js.Any], layer = layer.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[LegendLayerInfos]
  }
  
  @scala.inline
  implicit class LegendLayerInfosMutableBuilder[Self <: LegendLayerInfos] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHideLayers(value: js.Array[Double]): Self = StObject.set(x, "hideLayers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHideLayersVarargs(value: Double*): Self = StObject.set(x, "hideLayers", js.Array(value :_*))
    
    @scala.inline
    def setLayer(value: Layer): Self = StObject.set(x, "layer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
