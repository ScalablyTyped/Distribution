package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DecimalPlacesConfiguration extends StObject {
  
  /**
    * The values of the decimal places.
    */
  var DecimalPlaces: typings.awsSdk.clientsQuicksightMod.DecimalPlaces
}
object DecimalPlacesConfiguration {
  
  inline def apply(DecimalPlaces: DecimalPlaces): DecimalPlacesConfiguration = {
    val __obj = js.Dynamic.literal(DecimalPlaces = DecimalPlaces.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecimalPlacesConfiguration]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DecimalPlacesConfiguration] (val x: Self) extends AnyVal {
    
    inline def setDecimalPlaces(value: DecimalPlaces): Self = StObject.set(x, "DecimalPlaces", value.asInstanceOf[js.Any])
  }
}
