package typings.antDesignReactNative.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Extra extends StObject {
  
  /** 取消 */
  var dismissText: String
  
  /** 请选择 */
  var extra: String
  
  /** 确定 */
  var okText: String
}
object Extra {
  
  @scala.inline
  def apply(dismissText: String, extra: String, okText: String): Extra = {
    val __obj = js.Dynamic.literal(dismissText = dismissText.asInstanceOf[js.Any], extra = extra.asInstanceOf[js.Any], okText = okText.asInstanceOf[js.Any])
    __obj.asInstanceOf[Extra]
  }
  
  @scala.inline
  implicit class ExtraMutableBuilder[Self <: Extra] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDismissText(value: String): Self = StObject.set(x, "dismissText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExtra(value: String): Self = StObject.set(x, "extra", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOkText(value: String): Self = StObject.set(x, "okText", value.asInstanceOf[js.Any])
  }
}
