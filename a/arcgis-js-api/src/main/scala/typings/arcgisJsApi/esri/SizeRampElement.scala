package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SizeRampElement
  extends StObject
     with LegendElement {
  
  /**
  		 * The individual size stops rendered in the legend that correspond to the size visual variable in the renderer.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
  		 */
  var infos: js.Array[SizeRampStop]
  
  /**
  		 * The title of the size ramp as displayed in the legend.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
  		 */
  var title: js.UndefOr[String | RampTitle] = js.undefined
  
  /**
  		 * The type of this element is always `size-ramp`.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Legend-support-ActiveLayerInfo.html#SizeRampElement)
  		 */
  var `type`: String
}
object SizeRampElement {
  
  inline def apply(infos: js.Array[SizeRampStop], `type`: String): SizeRampElement = {
    val __obj = js.Dynamic.literal(infos = infos.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeRampElement]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SizeRampElement] (val x: Self) extends AnyVal {
    
    inline def setInfos(value: js.Array[SizeRampStop]): Self = StObject.set(x, "infos", value.asInstanceOf[js.Any])
    
    inline def setInfosVarargs(value: SizeRampStop*): Self = StObject.set(x, "infos", js.Array(value*))
    
    inline def setTitle(value: String | RampTitle): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
