package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait meshUtilsCreateElevationSamplerOptions extends StObject {
  
  /**
    * The value to use when there is no data available.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createElevationSampler)
    */
  var noDataValue: js.UndefOr[Double] = js.undefined
}
object meshUtilsCreateElevationSamplerOptions {
  
  inline def apply(): meshUtilsCreateElevationSamplerOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[meshUtilsCreateElevationSamplerOptions]
  }
  
  extension [Self <: meshUtilsCreateElevationSamplerOptions](x: Self) {
    
    inline def setNoDataValue(value: Double): Self = StObject.set(x, "noDataValue", value.asInstanceOf[js.Any])
    
    inline def setNoDataValueUndefined: Self = StObject.set(x, "noDataValue", js.undefined)
  }
}
