package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsViewModelImpedanceAttribute extends StObject {
  
  /**
    * Name of the impedance network attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#impedanceAttribute)
    */
  var name: String
  
  /**
    * Units of this network attribute.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#impedanceAttribute)
    */
  var units: String
}
object DirectionsViewModelImpedanceAttribute {
  
  inline def apply(name: String, units: String): DirectionsViewModelImpedanceAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelImpedanceAttribute]
  }
  
  extension [Self <: DirectionsViewModelImpedanceAttribute](x: Self) {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
