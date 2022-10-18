package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PlaceGeometry extends StObject {
  
  /**
    * A single point geometry specifies a location for a Place using WGS 84 coordinates:    x — Specifies the x coordinate or longitude.     y — Specifies the y coordinate or latitude.   
    */
  var Point: js.UndefOr[Position] = js.undefined
}
object PlaceGeometry {
  
  inline def apply(): PlaceGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PlaceGeometry]
  }
  
  extension [Self <: PlaceGeometry](x: Self) {
    
    inline def setPoint(value: Position): Self = StObject.set(x, "Point", value.asInstanceOf[js.Any])
    
    inline def setPointUndefined: Self = StObject.set(x, "Point", js.undefined)
    
    inline def setPointVarargs(value: Double*): Self = StObject.set(x, "Point", js.Array(value*))
  }
}
