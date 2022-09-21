package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsViewModelServiceDescription
  extends StObject
     with Object {
  
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
  
  inline def apply(
    constructor: js.Function,
    currentVersion: Double,
    defaultTravelMode: String,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    supportedTravelModes: js.Array[TravelMode]
  ): DirectionsViewModelServiceDescription = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], currentVersion = currentVersion.asInstanceOf[js.Any], defaultTravelMode = defaultTravelMode.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable), supportedTravelModes = supportedTravelModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelServiceDescription]
  }
  
  extension [Self <: DirectionsViewModelServiceDescription](x: Self) {
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultTravelMode(value: String): Self = StObject.set(x, "defaultTravelMode", value.asInstanceOf[js.Any])
    
    inline def setSupportedTravelModes(value: js.Array[TravelMode]): Self = StObject.set(x, "supportedTravelModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTravelModesVarargs(value: TravelMode*): Self = StObject.set(x, "supportedTravelModes", js.Array(value*))
  }
}
