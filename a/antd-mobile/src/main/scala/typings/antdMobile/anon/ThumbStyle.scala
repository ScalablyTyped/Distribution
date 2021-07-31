package typings.antdMobile.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ThumbStyle extends StObject {
  
  var prefixCls: String
}
object ThumbStyle {
  
  @scala.inline
  def apply(prefixCls: String): ThumbStyle = {
    val __obj = js.Dynamic.literal(prefixCls = prefixCls.asInstanceOf[js.Any])
    __obj.asInstanceOf[ThumbStyle]
  }
  
  @scala.inline
  implicit class ThumbStyleMutableBuilder[Self <: ThumbStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
  }
}
