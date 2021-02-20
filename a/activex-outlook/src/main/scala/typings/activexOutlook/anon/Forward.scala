package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Forward extends StObject {
  
  var Cancel: Boolean = js.native
  
  val Forward: js.Any = js.native
}
object Forward {
  
  @scala.inline
  def apply(Cancel: Boolean, Forward: js.Any): Forward = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any], Forward = Forward.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forward]
  }
  
  @scala.inline
  implicit class ForwardMutableBuilder[Self <: Forward] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setForward(value: js.Any): Self = StObject.set(x, "Forward", value.asInstanceOf[js.Any])
  }
}
