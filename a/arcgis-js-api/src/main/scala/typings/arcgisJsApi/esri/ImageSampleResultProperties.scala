package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ImageSampleResultProperties extends StObject {
  
  /**
    * An array of image sample results returned in response to [ImageryLayer.getSamples()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html#samples)
    */
  var samples: js.UndefOr[js.Array[ImageSampleProperties]] = js.undefined
}
object ImageSampleResultProperties {
  
  inline def apply(): ImageSampleResultProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ImageSampleResultProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ImageSampleResultProperties] (val x: Self) extends AnyVal {
    
    inline def setSamples(value: js.Array[ImageSampleProperties]): Self = StObject.set(x, "samples", value.asInstanceOf[js.Any])
    
    inline def setSamplesUndefined: Self = StObject.set(x, "samples", js.undefined)
    
    inline def setSamplesVarargs(value: ImageSampleProperties*): Self = StObject.set(x, "samples", js.Array(value*))
  }
}
