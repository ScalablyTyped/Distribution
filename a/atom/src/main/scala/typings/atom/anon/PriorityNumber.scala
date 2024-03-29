package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PriorityNumber extends StObject {
  
  var priority: Double
}
object PriorityNumber {
  
  inline def apply(priority: Double): PriorityNumber = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityNumber]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PriorityNumber] (val x: Self) extends AnyVal {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
