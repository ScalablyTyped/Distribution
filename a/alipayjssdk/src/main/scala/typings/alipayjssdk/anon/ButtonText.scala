package typings.alipayjssdk.anon

import typings.alipayjssdk.AlipayJSSDK.CompleteCallBack
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ButtonText extends StObject {
  
  /** 按钮文字，默认’确定’ */
  var buttonText: js.UndefOr[String] = js.undefined
  
  var complete: js.UndefOr[CompleteCallBack] = js.undefined
  
  /** alert框的内容 */
  var content: String
  
  /** alert框的标题 */
  var title: js.UndefOr[String] = js.undefined
}
object ButtonText {
  
  inline def apply(content: String): ButtonText = {
    val __obj = js.Dynamic.literal(content = content.asInstanceOf[js.Any])
    __obj.asInstanceOf[ButtonText]
  }
  
  extension [Self <: ButtonText](x: Self) {
    
    inline def setButtonText(value: String): Self = StObject.set(x, "buttonText", value.asInstanceOf[js.Any])
    
    inline def setButtonTextUndefined: Self = StObject.set(x, "buttonText", js.undefined)
    
    inline def setComplete(value: /* obj */ Any => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
    
    inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
    
    inline def setContent(value: String): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
