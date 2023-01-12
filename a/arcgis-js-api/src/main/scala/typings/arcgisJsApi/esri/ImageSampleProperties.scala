package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSampleProperties extends StObject {
  
  /**
    * Name-value pairs of fields and field values associated with the [sample location](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#location).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#attributes)
    */
  var attributes: js.UndefOr[Any] = js.undefined
  
  /**
    * The sample location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.undefined
  
  /**
    * The location id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#locationId)
    */
  var locationId: js.UndefOr[Double] = js.undefined
  
  /**
    * The pixel value associated with the sampled location.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#pixelValue)
    */
  var pixelValue: js.UndefOr[js.Array[Double]] = js.undefined
  
  /**
    * The raster id.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#rasterId)
    */
  var rasterId: js.UndefOr[Double] = js.undefined
  
  /**
    * The resolution representing the average of source raster's resolutions in x and y axes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html#resolution)
    */
  var resolution: js.UndefOr[Double] = js.undefined
}
object ImageSampleProperties {
  
  inline def apply(): ImageSampleProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSampleProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageSampleProperties] (val x: Self) extends AnyVal {
    
    inline def setAttributes(value: Any): Self = StObject.set(x, "attributes", value.asInstanceOf[js.Any])
    
    inline def setAttributesUndefined: Self = StObject.set(x, "attributes", js.undefined)
    
    inline def setLocation(value: PointProperties): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
    
    inline def setLocationId(value: Double): Self = StObject.set(x, "locationId", value.asInstanceOf[js.Any])
    
    inline def setLocationIdUndefined: Self = StObject.set(x, "locationId", js.undefined)
    
    inline def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
    
    inline def setPixelValue(value: js.Array[Double]): Self = StObject.set(x, "pixelValue", value.asInstanceOf[js.Any])
    
    inline def setPixelValueUndefined: Self = StObject.set(x, "pixelValue", js.undefined)
    
    inline def setPixelValueVarargs(value: Double*): Self = StObject.set(x, "pixelValue", js.Array(value*))
    
    inline def setRasterId(value: Double): Self = StObject.set(x, "rasterId", value.asInstanceOf[js.Any])
    
    inline def setRasterIdUndefined: Self = StObject.set(x, "rasterId", js.undefined)
    
    inline def setResolution(value: Double): Self = StObject.set(x, "resolution", value.asInstanceOf[js.Any])
    
    inline def setResolutionUndefined: Self = StObject.set(x, "resolution", js.undefined)
  }
}
