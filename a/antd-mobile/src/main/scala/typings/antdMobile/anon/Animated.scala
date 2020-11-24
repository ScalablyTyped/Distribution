package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Animated extends js.Object {
  
  var animated: Boolean = js.native
  
  var animationType: String = js.native
  
  var closable: Boolean = js.native
  
  var footer: js.Array[scala.Nothing] = js.native
  
  def onShow(): Unit = js.native
  
  var operation: Boolean = js.native
  
  var platform: String = js.native
  
  var popup: Boolean = js.native
  
  var prefixCls: String = js.native
  
  var transparent: Boolean = js.native
}
object Animated {
  
  @scala.inline
  def apply(
    animated: Boolean,
    animationType: String,
    closable: Boolean,
    footer: js.Array[scala.Nothing],
    onShow: () => Unit,
    operation: Boolean,
    platform: String,
    popup: Boolean,
    prefixCls: String,
    transparent: Boolean
  ): Animated = {
    val __obj = js.Dynamic.literal(animated = animated.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], onShow = js.Any.fromFunction0(onShow), operation = operation.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], prefixCls = prefixCls.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any])
    __obj.asInstanceOf[Animated]
  }
  
  @scala.inline
  implicit class AnimatedOps[Self <: Animated] (val x: Self) extends AnyVal {
    
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
    def setAnimated(value: Boolean): Self = this.set("animated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationType(value: String): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterVarargs(value: scala.Nothing*): Self = this.set("footer", js.Array(value :_*))
    
    @scala.inline
    def setFooter(value: js.Array[scala.Nothing]): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnShow(value: () => Unit): Self = this.set("onShow", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOperation(value: Boolean): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlatform(value: String): Self = this.set("platform", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: Boolean): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
  }
}
