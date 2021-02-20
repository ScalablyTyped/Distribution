package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SlicePlaneProperties extends StObject {
  
  /**
    * The heading angle (in degrees) of the slice plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#heading)
    */
  var heading: js.UndefOr[Double] = js.native
  
  /**
    * The height of the slice plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#height)
    */
  var height: js.UndefOr[Double] = js.native
  
  /**
    * A point specifying the position of the center of the plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#position)
    */
  var position: js.UndefOr[PointProperties] = js.native
  
  /**
    * The tilt angle (in degrees) of the slice plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#tilt)
    */
  var tilt: js.UndefOr[Double] = js.native
  
  /**
    * The width of the slice plane.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Slice-SlicePlane.html#width)
    */
  var width: js.UndefOr[Double] = js.native
}
object SlicePlaneProperties {
  
  @scala.inline
  def apply(): SlicePlaneProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SlicePlaneProperties]
  }
  
  @scala.inline
  implicit class SlicePlanePropertiesMutableBuilder[Self <: SlicePlaneProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHeading(value: Double): Self = StObject.set(x, "heading", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeadingUndefined: Self = StObject.set(x, "heading", js.undefined)
    
    @scala.inline
    def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
    
    @scala.inline
    def setPosition(value: PointProperties): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
    
    @scala.inline
    def setTilt(value: Double): Self = StObject.set(x, "tilt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTiltUndefined: Self = StObject.set(x, "tilt", js.undefined)
    
    @scala.inline
    def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
  }
}
