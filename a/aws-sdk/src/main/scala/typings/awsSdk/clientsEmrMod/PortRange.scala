package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRange extends StObject {
  
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MaxRange: js.UndefOr[Port] = js.undefined
  
  /**
    * The smallest port number in a specified range of port numbers.
    */
  var MinRange: Port
}
object PortRange {
  
  inline def apply(MinRange: Port): PortRange = {
    val __obj = js.Dynamic.literal(MinRange = MinRange.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortRange] (val x: Self) extends AnyVal {
    
    inline def setMaxRange(value: Port): Self = StObject.set(x, "MaxRange", value.asInstanceOf[js.Any])
    
    inline def setMaxRangeUndefined: Self = StObject.set(x, "MaxRange", js.undefined)
    
    inline def setMinRange(value: Port): Self = StObject.set(x, "MinRange", value.asInstanceOf[js.Any])
  }
}
