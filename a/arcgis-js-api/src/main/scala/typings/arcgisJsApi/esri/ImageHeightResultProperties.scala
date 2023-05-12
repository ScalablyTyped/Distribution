package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageHeightResultProperties
  extends StObject
     with BaseImageMeasureResultProperties {
  
  /**
    * An object containing results of the height measurement.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightResult.html#height)
    */
  var height: js.UndefOr[MeasurementValue] = js.undefined
}
object ImageHeightResultProperties {
  
  inline def apply(): ImageHeightResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageHeightResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageHeightResultProperties] (val x: Self) extends AnyVal {
    
    inline def setHeight(value: MeasurementValue): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
    
    inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
  }
}
