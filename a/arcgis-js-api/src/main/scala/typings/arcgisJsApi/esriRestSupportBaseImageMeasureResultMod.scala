package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BaseImageMeasureResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object esriRestSupportBaseImageMeasureResultMod {
  
  @JSImport("esri/rest/support/BaseImageMeasureResult", JSImport.Namespace)
  @js.native
  open class ^ ()
    extends StObject
       with BaseImageMeasureResult {
    
    /**
    		 * Name of the raster dataset used in the area and height measurement.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureResult.html#name)
    		 */
    /* CompleteClass */
    var name: String = js.native
    
    /**
    		 * Sensor name of the raster dataset used in the area and height measurement.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BaseImageMeasureResult.html#sensorName)
    		 */
    /* CompleteClass */
    var sensorName: String = js.native
  }
}
