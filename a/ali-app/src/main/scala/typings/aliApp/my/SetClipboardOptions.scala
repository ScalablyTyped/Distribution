package typings.aliApp.my

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SetClipboardOptions
  extends BaseOptions[js.Any, js.Any] {
  
  /** 剪贴板数据 */
  var text: String = js.native
}
object SetClipboardOptions {
  
  @scala.inline
  def apply(text: String): SetClipboardOptions = {
    val __obj = js.Dynamic.literal(text = text.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetClipboardOptions]
  }
  
  @scala.inline
  implicit class SetClipboardOptionsMutableBuilder[Self <: SetClipboardOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
  }
}
