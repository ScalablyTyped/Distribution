package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OkText extends StObject {
  
  var dismissText: String = js.native
  
  var extra: String = js.native
  
  var okText: String = js.native
}
object OkText {
  
  @scala.inline
  def apply(dismissText: String, extra: String, okText: String): OkText = {
    val __obj = js.Dynamic.literal(dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[OkText]
  }
  
  @scala.inline
  implicit class OkTextMutableBuilder[Self <: OkText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismissText(value: String): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
  }
}
