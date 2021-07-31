package typings.atom.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Pending extends StObject {
  
  var pending: Boolean
}
object Pending {
  
  @scala.inline
  def apply(pending: Boolean): Pending = {
    val __obj = js.Dynamic.literal(pending = pending.asInstanceOf[js.Any])
    __obj.asInstanceOf[Pending]
  }
  
  @scala.inline
  implicit class PendingMutableBuilder[Self <: Pending] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPending(value: Boolean): Self = StObject.set(x, "pending", value.asInstanceOf[js.Any])
  }
}
