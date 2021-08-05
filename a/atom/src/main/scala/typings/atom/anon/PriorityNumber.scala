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
  
  extension [Self <: PriorityNumber](x: Self) {
    
    inline def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
