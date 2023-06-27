package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ControlPoint extends StObject {
  
  /**
  		 * The coordinate of the the control point in the map coordinate space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#ControlPoint)
  		 */
  var mapPoint: js.UndefOr[Point] = js.undefined
  
  /**
  		 * The coordinate of the control point in the image coordinate space.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ControlPointsGeoreference.html#ControlPoint)
  		 */
  var sourcePoint: js.UndefOr[SourcePoint] = js.undefined
}
object ControlPoint {
  
  inline def apply(): ControlPoint = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ControlPoint]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ControlPoint] (val x: Self) extends AnyVal {
    
    inline def setMapPoint(value: Point): Self = StObject.set(x, "mapPoint", value.asInstanceOf[js.Any])
    
    inline def setMapPointUndefined: Self = StObject.set(x, "mapPoint", js.undefined)
    
    inline def setSourcePoint(value: SourcePoint): Self = StObject.set(x, "sourcePoint", value.asInstanceOf[js.Any])
    
    inline def setSourcePointUndefined: Self = StObject.set(x, "sourcePoint", js.undefined)
  }
}
