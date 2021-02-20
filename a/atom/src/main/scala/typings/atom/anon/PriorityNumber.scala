package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PriorityNumber extends StObject {
  
  var priority: Double = js.native
}
object PriorityNumber {
  
  @scala.inline
  def apply(priority: Double): PriorityNumber = {
    val __obj = js.Dynamic.literal(priority = priority.asInstanceOf[js.Any])
    __obj.asInstanceOf[PriorityNumber]
  }
  
  @scala.inline
  implicit class PriorityNumberMutableBuilder[Self <: PriorityNumber] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPriority(value: Double): Self = StObject.set(x, "priority", value.asInstanceOf[js.Any])
  }
}
