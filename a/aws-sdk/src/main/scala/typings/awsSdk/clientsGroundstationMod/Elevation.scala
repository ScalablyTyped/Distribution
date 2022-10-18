package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Elevation extends StObject {
  
  /**
    * Elevation angle units.
    */
  var unit: AngleUnits
  
  /**
    * Elevation angle value.
    */
  var value: Double
}
object Elevation {
  
  inline def apply(unit: AngleUnits, value: Double): Elevation = {
    val __obj = js.Dynamic.literal(unit = unit.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Elevation]
  }
  
  extension [Self <: Elevation](x: Self) {
    
    inline def setUnit(value: AngleUnits): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
    
    inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
