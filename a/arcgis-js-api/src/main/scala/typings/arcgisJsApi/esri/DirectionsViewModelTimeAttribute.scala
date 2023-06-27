package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DirectionsViewModelTimeAttribute extends StObject {
  
  /**
  		 * The name of the network attribute to use for the drive time when computing directions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#timeAttribute)
  		 */
  var name: String
  
  /**
  		 * The units to use when calculating drive time for directions.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Directions-DirectionsViewModel.html#timeAttribute)
  		 */
  var units: String
}
object DirectionsViewModelTimeAttribute {
  
  inline def apply(name: String, units: String): DirectionsViewModelTimeAttribute = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], units = units.asInstanceOf[js.Any])
    __obj.asInstanceOf[DirectionsViewModelTimeAttribute]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DirectionsViewModelTimeAttribute] (val x: Self) extends AnyVal {
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setUnits(value: String): Self = StObject.set(x, "units", value.asInstanceOf[js.Any])
  }
}
