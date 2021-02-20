package typings.activexAccess.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Reason extends StObject {
  
  val Reason: Double = js.native
}
object Reason {
  
  @scala.inline
  def apply(Reason: Double): Reason = {
    val __obj = js.Dynamic.literal(Reason = Reason.asInstanceOf[js.Any])
    __obj.asInstanceOf[Reason]
  }
  
  @scala.inline
  implicit class ReasonMutableBuilder[Self <: Reason] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setReason(value: Double): Self = StObject.set(x, "Reason", value.asInstanceOf[js.Any])
  }
}
