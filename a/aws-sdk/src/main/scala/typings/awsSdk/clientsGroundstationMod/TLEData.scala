package typings.awsSdk.clientsGroundstationMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TLEData extends StObject {
  
  /**
    * First line of two-line element set (TLE) data.
    */
  var tleLine1: TleLineOne
  
  /**
    * Second line of two-line element set (TLE) data.
    */
  var tleLine2: TleLineTwo
  
  /**
    * The valid time range for the TLE. Gaps or overlap are not permitted.
    */
  var validTimeRange: TimeRange
}
object TLEData {
  
  inline def apply(tleLine1: TleLineOne, tleLine2: TleLineTwo, validTimeRange: TimeRange): TLEData = {
    val __obj = js.Dynamic.literal(tleLine1 = tleLine1.asInstanceOf[js.Any], tleLine2 = tleLine2.asInstanceOf[js.Any], validTimeRange = validTimeRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[TLEData]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TLEData] (val x: Self) extends AnyVal {
    
    inline def setTleLine1(value: TleLineOne): Self = StObject.set(x, "tleLine1", value.asInstanceOf[js.Any])
    
    inline def setTleLine2(value: TleLineTwo): Self = StObject.set(x, "tleLine2", value.asInstanceOf[js.Any])
    
    inline def setValidTimeRange(value: TimeRange): Self = StObject.set(x, "validTimeRange", value.asInstanceOf[js.Any])
  }
}
