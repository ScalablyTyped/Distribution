package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelText extends StObject {
  
  /** 取消 */
  var cancelText: String
}
object CancelText {
  
  @scala.inline
  def apply(cancelText: String): CancelText = {
    val __obj = js.Dynamic.literal(cancelText = cancelText.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelText]
  }
  
  @scala.inline
  implicit class CancelTextMutableBuilder[Self <: CancelText] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCancelText(value: String): Self = StObject.set(x, "cancelText", value.asInstanceOf[js.Any])
  }
}
