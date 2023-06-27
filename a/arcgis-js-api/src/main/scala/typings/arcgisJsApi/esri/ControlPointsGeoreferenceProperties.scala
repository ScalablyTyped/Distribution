package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`control-points`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlPointsGeoreferenceProperties extends StObject {
  
  /**
  		 * An array of two, three, or four [controlPoints](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#controlPoints) positions the media element.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#controlPoints)
  		 */
  var controlPoints: js.UndefOr[js.Array[ControlPoint]] = js.undefined
  
  /**
  		 * Defines the size of the element displayed, typically the element's height in pixels.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#height)
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  var `type`: js.UndefOr[`control-points`] = js.undefined
  
  /**
  		 * Defines the size of the element displayed, typically the element's width in pixels.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#width)
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object ControlPointsGeoreferenceProperties {
  
  inline def apply(): ControlPointsGeoreferenceProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlPointsGeoreferenceProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlPointsGeoreferenceProperties] (val x: Self) extends AnyVal {
    
    inline def setControlPoints(value: js.Array[ControlPoint]): Self = StObject.set(x, "controlPoints", value.asInstanceOf[js.Any])
    
    inline def setControlPointsUndefined: Self = StObject.set(x, "controlPoints", js.undefined)
    
    inline def setControlPointsVarargs(value: ControlPoint*): Self = StObject.set(x, "controlPoints", js.Array(value*))
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setType(value: `control-points`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
