package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FilterPortRange extends StObject {
  
  /**
    * The first port in the range.
    */
  var FromPort: js.UndefOr[Port] = js.undefined
  
  /**
    * The last port in the range.
    */
  var ToPort: js.UndefOr[Port] = js.undefined
}
object FilterPortRange {
  
  inline def apply(): FilterPortRange = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FilterPortRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FilterPortRange] (val x: Self) extends AnyVal {
    
    inline def setFromPort(value: Port): Self = StObject.set(x, "FromPort", value.asInstanceOf[js.Any])
    
    inline def setFromPortUndefined: Self = StObject.set(x, "FromPort", js.undefined)
    
    inline def setToPort(value: Port): Self = StObject.set(x, "ToPort", value.asInstanceOf[js.Any])
    
    inline def setToPortUndefined: Self = StObject.set(x, "ToPort", js.undefined)
  }
}
