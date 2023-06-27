package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAngleResultProperties extends StObject {
  
  /**
  		 * The computed north angle after rotating the map so the top of the image is oriented toward north.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html#north)
  		 */
  var north: js.UndefOr[Double] = js.undefined
  
  /**
  		 * The spatial reference used to compute the angles.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html#spatialReference)
  		 */
  var spatialReference: js.UndefOr[SpatialReferenceProperties] = js.undefined
  
  /**
  		 * The computed up angle after rotating the map so the top of the image is always oriented to the direction of the sensor when it acquired the image.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html#up)
  		 */
  var up: js.UndefOr[Double] = js.undefined
}
object ImageAngleResultProperties {
  
  inline def apply(): ImageAngleResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAngleResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageAngleResultProperties] (val x: Self) extends AnyVal {
    
    inline def setNorth(value: Double): Self = StObject.set(x, "north", value.asInstanceOf[js.Any])
    
    inline def setNorthUndefined: Self = StObject.set(x, "north", js.undefined)
    
    inline def setSpatialReference(value: SpatialReferenceProperties): Self = StObject.set(x, "spatialReference", value.asInstanceOf[js.Any])
    
    inline def setSpatialReferenceUndefined: Self = StObject.set(x, "spatialReference", js.undefined)
    
    inline def setUp(value: Double): Self = StObject.set(x, "up", value.asInstanceOf[js.Any])
    
    inline def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
  }
}
