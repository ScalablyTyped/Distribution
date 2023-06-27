package typings.arcgisJsApi.esri

import typings.std.AbortSignal
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait meshUtilsCreateFromElevationOptions extends StObject {
  
  /**
  		 * Controls the horizontal resolution (cell size) in meters from which elevation data is sampled (defaults to `auto`).
  		 *
  		 * @default auto
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
  		 */
  var demResolution: js.UndefOr[Double | String] = js.undefined
  
  /**
  		 * Signal object that can be used to abort the asynchronous task.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-meshUtils.html#createFromElevation)
  		 */
  var signal: js.UndefOr[AbortSignal] = js.undefined
}
object meshUtilsCreateFromElevationOptions {
  
  inline def apply(): meshUtilsCreateFromElevationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[meshUtilsCreateFromElevationOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: meshUtilsCreateFromElevationOptions] (val x: Self) extends AnyVal {
    
    inline def setDemResolution(value: Double | String): Self = StObject.set(x, "demResolution", value.asInstanceOf[js.Any])
    
    inline def setDemResolutionUndefined: Self = StObject.set(x, "demResolution", js.undefined)
    
    inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
    
    inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
  }
}
