package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RelationshipRampElement
  extends StObject
     with LegendElement {
  
  /**
  		 * A 2-dimensional array of colors as displayed in the legend grid.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
  		 */
  var colors: js.Array[js.Array[Color_]]
  
  /**
  		 * Determines the orientation of the Legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
  		 */
  var focus: String
  
  /**
  		 * Info objects associated with the relationship renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
  		 */
  var infos: js.UndefOr[js.Array[Any]] = js.undefined
  
  /**
  		 * The labels for each corner of the legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
  		 */
  var labels: RelationshipLabels
  
  /**
  		 * The number of classes for each field comprising the renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
  		 */
  var numClasses: Double
  
  /**
  		 * The rotation of the legend in degrees (0-360).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
  		 */
  var rotation: Double
  
  /**
  		 * The title of the renderer as displayed in the legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
  		 */
  var title: js.UndefOr[String] = js.undefined
  
  /**
  		 * The type of this element is always `relationship-ramp`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#RelationshipRampElement)
  		 */
  var `type`: String
}
object RelationshipRampElement {
  
  inline def apply(
    colors: js.Array[js.Array[Color_]],
    focus: String,
    labels: RelationshipLabels,
    numClasses: Double,
    rotation: Double,
    `type`: String
  ): RelationshipRampElement = {
    val __obj = js.Dynamic.literal(colors = colors.asInstanceOf[js.Any], focus = focus.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], numClasses = numClasses.asInstanceOf[js.Any], rotation = rotation.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RelationshipRampElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RelationshipRampElement] (val x: Self) extends AnyVal {
    
    inline def setColors(value: js.Array[js.Array[Color_]]): Self = StObject.set(x, "colors", value.asInstanceOf[js.Any])
    
    inline def setColorsVarargs(value: js.Array[Color_]*): Self = StObject.set(x, "colors", js.Array(value*))
    
    inline def setFocus(value: String): Self = StObject.set(x, "focus", value.asInstanceOf[js.Any])
    
    inline def setInfos(value: js.Array[Any]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    inline def setInfosUndefined: Self = StObject.set(x, "infos", js.undefined)
    
    inline def setInfosVarargs(value: Any*): Self = StObject.set(x, "infos", js.Array(value*))
    
    inline def setLabels(value: RelationshipLabels): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
    
    inline def setNumClasses(value: Double): Self = StObject.set(x, "numClasses", value.asInstanceOf[js.Any])
    
    inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
