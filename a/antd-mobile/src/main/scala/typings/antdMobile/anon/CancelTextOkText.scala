package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CancelTextOkText extends StObject {
  
  var cancelText: String = js.native
  
  var okText: String = js.native
}
object CancelTextOkText {
  
  @scala.inline
  def apply(cancelText: String, okText: String): CancelTextOkText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelTextOkText]
  }
  
  @scala.inline
  implicit class CancelTextOkTextMutableBuilder[Self <: CancelTextOkText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
  }
}
