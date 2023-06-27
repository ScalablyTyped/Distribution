package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ShadowCastViewModelDiscreteOptions
  extends StObject
     with AnonymousAccessor {
  
  /**
  		 * Color of the shadow visualization.
  		 *
  		 * @default [50, 50, 50, 0.7]
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#discreteOptions)
  		 */
  var color: js.UndefOr[Color_] = js.undefined
  
  /**
  		 * Individual shadows are displayed at this time interval, starting with the [startTimeOfDay](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#startTimeOfDay).
  		 *
  		 * @default 15 * 60 * 1000
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#discreteOptions)
  		 */
  var interval: js.UndefOr[Double] = js.undefined
  
  /**
  		 * Values (in milliseconds) selectable in the UI for the interval used to display shadows.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-ShadowCast-ShadowCastViewModel.html#discreteOptions)
  		 */
  var intervalOptions: js.UndefOr[Collection[Double]] = js.undefined
}
object ShadowCastViewModelDiscreteOptions {
  
  inline def apply(): ShadowCastViewModelDiscreteOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ShadowCastViewModelDiscreteOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ShadowCastViewModelDiscreteOptions] (val x: Self) extends AnyVal {
    
    inline def setColor(value: Color_): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
    
    inline def setInterval(value: Double): Self = StObject.set(x, "interval", value.asInstanceOf[js.Any])
    
    inline def setIntervalOptions(value: Collection[Double]): Self = StObject.set(x, "intervalOptions", value.asInstanceOf[js.Any])
    
    inline def setIntervalOptionsUndefined: Self = StObject.set(x, "intervalOptions", js.undefined)
    
    inline def setIntervalUndefined: Self = StObject.set(x, "interval", js.undefined)
  }
}
