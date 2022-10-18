package typings.awsSdk.clientsLocationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LegGeometry extends StObject {
  
  /**
    * An ordered list of positions used to plot a route on a map.  The first position is closest to the start position for the leg, and the last position is the closest to the end position for the leg.   For example, [[-123.117, 49.284],[-123.115, 49.285],[-123.115, 49.285]]   
    */
  var LineString: js.UndefOr[typings.awsSdk.clientsLocationMod.LineString] = js.undefined
}
object LegGeometry {
  
  inline def apply(): LegGeometry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LegGeometry]
  }
  
  extension [Self <: LegGeometry](x: Self) {
    
    inline def setLineString(value: LineString): Self = StObject.set(x, "LineString", value.asInstanceOf[js.Any])
    
    inline def setLineStringUndefined: Self = StObject.set(x, "LineString", js.undefined)
    
    inline def setLineStringVarargs(value: Position*): Self = StObject.set(x, "LineString", js.Array(value*))
  }
}
