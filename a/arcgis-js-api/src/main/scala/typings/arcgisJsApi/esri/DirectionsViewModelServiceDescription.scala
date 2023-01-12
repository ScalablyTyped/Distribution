package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsViewModelServiceDescription extends StObject {
  
  /**
    * Server version.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#serviceDescription)
    */
  var currentVersion: Double
  
  /**
    * Id of the default travel mode.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#serviceDescription)
    */
  var defaultTravelMode: String
  
  /**
    * Available travel modes.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#serviceDescription)
    */
  var supportedTravelModes: js.Array[TravelMode]
}
object DirectionsViewModelServiceDescription {
  
  inline def apply(currentVersion: Double, defaultTravelMode: String, supportedTravelModes: js.Array[TravelMode]): DirectionsViewModelServiceDescription = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], defaultTravelMode = defaultTravelMode.asInstanceOf[js.Any], supportedTravelModes = supportedTravelModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelServiceDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsViewModelServiceDescription] (val x: Self) extends AnyVal {
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultTravelMode(value: String): Self = StObject.set(x, "defaultTravelMode", value.asInstanceOf[js.Any])
    
    inline def setSupportedTravelModes(value: js.Array[TravelMode]): Self = StObject.set(x, "supportedTravelModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTravelModesVarargs(value: TravelMode*): Self = StObject.set(x, "supportedTravelModes", js.Array(value*))
  }
}
