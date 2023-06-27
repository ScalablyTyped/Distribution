package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ServiceDescription extends StObject {
  
  /**
  		 * Server version.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networkService.html#ServiceDescription)
  		 */
  var currentVersion: Double
  
  /**
  		 * Default travel mode.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networkService.html#ServiceDescription)
  		 */
  var defaultTravelMode: TravelMode
  
  /**
  		 * Available travel modes.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networkService.html#ServiceDescription)
  		 */
  var supportedTravelModes: js.Array[TravelMode]
}
object ServiceDescription {
  
  inline def apply(currentVersion: Double, defaultTravelMode: TravelMode, supportedTravelModes: js.Array[TravelMode]): ServiceDescription = {
    val __obj = js.Dynamic.literal(currentVersion = currentVersion.asInstanceOf[js.Any], defaultTravelMode = defaultTravelMode.asInstanceOf[js.Any], supportedTravelModes = supportedTravelModes.asInstanceOf[js.Any])
    __obj.asInstanceOf[ServiceDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ServiceDescription] (val x: Self) extends AnyVal {
    
    inline def setCurrentVersion(value: Double): Self = StObject.set(x, "currentVersion", value.asInstanceOf[js.Any])
    
    inline def setDefaultTravelMode(value: TravelMode): Self = StObject.set(x, "defaultTravelMode", value.asInstanceOf[js.Any])
    
    inline def setSupportedTravelModes(value: js.Array[TravelMode]): Self = StObject.set(x, "supportedTravelModes", value.asInstanceOf[js.Any])
    
    inline def setSupportedTravelModesVarargs(value: TravelMode*): Self = StObject.set(x, "supportedTravelModes", js.Array(value*))
  }
}
