package typings.awsSdk.clientsInspector2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortRange extends StObject {
  
  /**
    * The beginning port in a port range.
    */
  var begin: Port
  
  /**
    * The ending port in a port range.
    */
  var end: Port
}
object PortRange {
  
  inline def apply(begin: Port, end: Port): PortRange = {
    val __obj = js.Dynamic.literal(begin = begin.asInstanceOf[js.Any], end = end.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortRange]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PortRange] (val x: Self) extends AnyVal {
    
    inline def setBegin(value: Port): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Port): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
  }
}
