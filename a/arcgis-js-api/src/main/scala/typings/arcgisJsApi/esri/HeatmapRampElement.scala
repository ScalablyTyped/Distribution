package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HeatmapRampElement
  extends StObject
     with Object
     with LegendElement {
  
  /**
    * The individual color stops rendered in the legend that correspond to the heatmap colorStops in the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampElement)
    */
  var infos: js.Array[HeatmapRampStop]
  
  /**
    * The title of the heatmap ramp as displayed in the legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampElement)
    */
  var title: js.UndefOr[String | RampTitle] = js.undefined
  
  /**
    * The type of this element is always `heatmap-ramp`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#HeatmapRampElement)
    */
  var `type`: String
}
object HeatmapRampElement {
  
  inline def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    infos: js.Array[HeatmapRampStop],
    propertyIsEnumerable: PropertyKey => Boolean,
    `type`: String
  ): HeatmapRampElement = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), infos = infos.asInstanceOf[js.Any], propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[HeatmapRampElement]
  }
  
  extension [Self <: HeatmapRampElement](x: Self) {
    
    inline def setInfos(value: js.Array[HeatmapRampStop]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    inline def setInfosVarargs(value: HeatmapRampStop*): Self = StObject.set(x, "infos", js.Array(value :_*))
    
    inline def setTitle(value: String | RampTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
