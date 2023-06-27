package typings.arcgisJsApi.esri.CIM

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CIMCalloutBase extends StObject {
  
  /**
  			 * The leader offset which is an offset value defining the distance (in points) between the anchor point and the beginning of the drawn leader.
  			 */
  var leaderOffset: js.UndefOr[Double] = js.undefined
  
  /**
  			 * The leader tolerance which is the closest distance (in points) to the text the anchor point can be for the callout to draw.
  			 */
  var leaderTolerance: js.UndefOr[Double] = js.undefined
  
  var `type`: String
}
object CIMCalloutBase {
  
  inline def apply(`type`: String): CIMCalloutBase = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CIMCalloutBase]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CIMCalloutBase] (val x: Self) extends AnyVal {
    
    inline def setLeaderOffset(value: Double): Self = StObject.set(x, "leaderOffset", value.asInstanceOf[js.Any])
    
    inline def setLeaderOffsetUndefined: Self = StObject.set(x, "leaderOffset", js.undefined)
    
    inline def setLeaderTolerance(value: Double): Self = StObject.set(x, "leaderTolerance", value.asInstanceOf[js.Any])
    
    inline def setLeaderToleranceUndefined: Self = StObject.set(x, "leaderTolerance", js.undefined)
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
