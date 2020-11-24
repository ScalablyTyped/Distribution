package typings.appframework.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CssPrefix extends js.Object {
  
  var cssPrefix: String = js.native
  
  var cssTransformEnd: String = js.native
  
  var cssTransformStart: String = js.native
  
  var nativeTouchScroll: Boolean = js.native
}
object CssPrefix {
  
  @scala.inline
  def apply(cssPrefix: String, cssTransformEnd: String, cssTransformStart: String, nativeTouchScroll: Boolean): CssPrefix = {
    val __obj = js.Dynamic.literal(cssPrefix = cssPrefix.asInstanceOf[js.Any], cssTransformEnd = cssTransformEnd.asInstanceOf[js.Any], cssTransformStart = cssTransformStart.asInstanceOf[js.Any], nativeTouchScroll = nativeTouchScroll.asInstanceOf[js.Any])
    __obj.asInstanceOf[CssPrefix]
  }
  
  @scala.inline
  implicit class CssPrefixOps[Self <: CssPrefix] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCssPrefix(value: String): Self = this.set("cssPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssTransformEnd(value: String): Self = this.set("cssTransformEnd", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCssTransformStart(value: String): Self = this.set("cssTransformStart", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNativeTouchScroll(value: Boolean): Self = this.set("nativeTouchScroll", value.asInstanceOf[js.Any])
  }
}
