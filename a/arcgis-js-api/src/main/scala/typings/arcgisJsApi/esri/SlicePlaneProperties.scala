package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SlicePlaneProperties extends StObject {
  
  /**
  		 * The heading angle (in degrees) of the slice plane.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#heading)
  		 */
  var heading: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The height of the slice plane.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#height)
  		 */
  var height: js.UndefOr[Double] = js.undefined
  
  /**
  		 * A point specifying the position of the center of the plane.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#position)
  		 */
  var position: js.UndefOr[PointProperties] = js.undefined
  
  /**
  		 * The tilt angle (in degrees) of the slice plane.
  		 *
  		 * @default 0
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#tilt)
  		 */
  var tilt: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The width of the slice plane.
  		 *
  		 * @default 10
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-analysis-SlicePlane.html#width)
  		 */
  var width: js.UndefOr[Double] = js.undefined
}
object SlicePlaneProperties {
  
  inline def apply(): SlicePlaneProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicePlaneProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SlicePlaneProperties] (val x: Self) extends AnyVal {
    
    inline def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    inline def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    inline def setPosition(value: PointProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    inline def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    inline def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
