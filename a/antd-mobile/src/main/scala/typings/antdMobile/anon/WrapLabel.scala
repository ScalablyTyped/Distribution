package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WrapLabel extends StObject {
  
  var prefixCls: String
  
  var wrapLabel: Boolean
}
object WrapLabel {
  
  @scala.inline
  def apply(prefixCls: String, wrapLabel: Boolean): WrapLabel = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any], wrapLabel = wrapLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapLabel]
  }
  
  @scala.inline
  implicit class WrapLabelMutableBuilder[Self <: WrapLabel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWrapLabel(value: Boolean): Self = StObject.set(x, "wrapLabel", value.asInstanceOf[js.Any])
  }
}
