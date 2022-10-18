package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRangeFilter extends StObject {
  
  /**
    * The port number the port range begins at.
    */
  var beginInclusive: js.UndefOr[Port] = js.undefined
  
  /**
    * The port number the port range ends at.
    */
  var endInclusive: js.UndefOr[Port] = js.undefined
}
object PortRangeFilter {
  
  inline def apply(): PortRangeFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PortRangeFilter]
  }
  
  extension [Self <: PortRangeFilter](x: Self) {
    
    inline def setBeginInclusive(value: Port): Self = StObject.set(x, "beginInclusive", value.asInstanceOf[js.Any])
    
    inline def setBeginInclusiveUndefined: Self = StObject.set(x, "beginInclusive", js.undefined)
    
    inline def setEndInclusive(value: Port): Self = StObject.set(x, "endInclusive", value.asInstanceOf[js.Any])
    
    inline def setEndInclusiveUndefined: Self = StObject.set(x, "endInclusive", js.undefined)
  }
}
