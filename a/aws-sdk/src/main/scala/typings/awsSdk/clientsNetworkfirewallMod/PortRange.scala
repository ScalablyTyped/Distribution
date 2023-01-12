package typings.awsSdk.clientsNetworkfirewallMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRange extends StObject {
  
  /**
    * The lower limit of the port range. This must be less than or equal to the ToPort specification. 
    */
  var FromPort: PortRangeBound
  
  /**
    * The upper limit of the port range. This must be greater than or equal to the FromPort specification. 
    */
  var ToPort: PortRangeBound
}
object PortRange {
  
  inline def apply(FromPort: PortRangeBound, ToPort: PortRangeBound): PortRange = {
    val __obj = js.Dynamic.literal(FromPort = FromPort.asInstanceOf[js.Any], ToPort = ToPort.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortRange] (val x: Self) extends AnyVal {
    
    inline def setFromPort(value: PortRangeBound): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setToPort(value: PortRangeBound): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
  }
}
