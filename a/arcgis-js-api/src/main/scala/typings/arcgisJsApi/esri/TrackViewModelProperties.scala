package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrackViewModelProperties
  extends StObject
     with GeolocationPositioningProperties
     with GoToProperties {
  
  /**
  		 * A function that is used as an expression to evaluate geolocation points, and returns a boolean value.
  		 *
  		 * @default null
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Track-TrackViewModel.html#positionFilterFunction)
  		 */
  var positionFilterFunction: js.UndefOr[js.Function] = js.undefined
}
object TrackViewModelProperties {
  
  inline def apply(): TrackViewModelProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrackViewModelProperties]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TrackViewModelProperties] (val x: Self) extends AnyVal {
    
    inline def setPositionFilterFunction(value: js.Function): Self = StObject.set(x, "positionFilterFunction", value.asInstanceOf[js.Any])
    
    inline def setPositionFilterFunctionUndefined: Self = StObject.set(x, "positionFilterFunction", js.undefined)
  }
}
