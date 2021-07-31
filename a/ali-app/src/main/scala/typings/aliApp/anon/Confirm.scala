package typings.aliApp.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Confirm extends StObject {
  
  var confirm: Boolean
}
object Confirm {
  
  @scala.inline
  def apply(confirm: Boolean): Confirm = {
    val __obj = js.Dynamic.literal(confirm = confirm.asInstanceOf[js.Any])
    __obj.asInstanceOf[Confirm]
  }
  
  @scala.inline
  implicit class ConfirmMutableBuilder[Self <: Confirm] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfirm(value: Boolean): Self = StObject.set(x, "confirm", value.asInstanceOf[js.Any])
  }
}
