package typings.activexOutlook.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelBoolean extends StObject {
  
  var Cancel: Boolean = js.native
}
object CancelBoolean {
  
  @scala.inline
  def apply(Cancel: Boolean): CancelBoolean = {
    val __obj = js.Dynamic.literal(Cancel = Cancel.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelBoolean]
  }
  
  @scala.inline
  implicit class CancelBooleanMutableBuilder[Self <: CancelBoolean] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancel(value: Boolean): Self = StObject.set(x, "Cancel", value.asInstanceOf[js.Any])
  }
}
