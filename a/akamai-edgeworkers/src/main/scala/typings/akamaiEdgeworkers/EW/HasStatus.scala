package typings.akamaiEdgeworkers.EW

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HasStatus extends StObject {
  
  /**
    * The HTTP status of a response sent to the client.
    */
  var status: Double
}
object HasStatus {
  
  @scala.inline
  def apply(status: Double): HasStatus = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[HasStatus]
  }
  
  @scala.inline
  implicit class HasStatusMutableBuilder[Self <: HasStatus] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setStatus(value: Double): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
  }
}
