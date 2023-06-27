package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageAreaResultProperties
  extends StObject
     with BaseImageMeasureResultProperties {
  
  /**
  		 * An object containing results of the area measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaResult.html#area)
  		 */
  var area: js.UndefOr[MeasurementValue] = js.undefined
  
  /**
  		 * An object containing results of the perimeter measurement.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAreaResult.html#perimeter)
  		 */
  var perimeter: js.UndefOr[MeasurementValue] = js.undefined
}
object ImageAreaResultProperties {
  
  inline def apply(): ImageAreaResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageAreaResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageAreaResultProperties] (val x: Self) extends AnyVal {
    
    inline def setArea(value: MeasurementValue): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    inline def setPerimeter(value: MeasurementValue): Self = StObject.set(x, "perimeter", value.asInstanceOf[js.Any])
    
    inline def setPerimeterUndefined: Self = StObject.set(x, "perimeter", js.undefined)
  }
}
