package typings.antDesignReactNative.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnimateAppear extends js.Object {
  
  var animateAppear: Boolean = js.native
  
  var animationType: String = js.native
  
  var closable: Boolean = js.native
  
  var footer: js.Array[scala.Nothing] = js.native
  
  var maskClosable: Boolean = js.native
  
  def onClose(): Unit = js.native
  
  var operation: Boolean = js.native
  
  var popup: Boolean = js.native
  
  var transparent: Boolean = js.native
  
  var visible: Boolean = js.native
}
object AnimateAppear {
  
  @scala.inline
  def apply(
    animateAppear: Boolean,
    animationType: String,
    closable: Boolean,
    footer: js.Array[scala.Nothing],
    maskClosable: Boolean,
    onClose: () => Unit,
    operation: Boolean,
    popup: Boolean,
    transparent: Boolean,
    visible: Boolean
  ): AnimateAppear = {
    val __obj = js.Dynamic.literal(animateAppear = animateAppear.asInstanceOf[js.Any], animationType = animationType.asInstanceOf[js.Any], closable = closable.asInstanceOf[js.Any], footer = footer.asInstanceOf[js.Any], maskClosable = maskClosable.asInstanceOf[js.Any], onClose = js.Any.fromFunction0(onClose), operation = operation.asInstanceOf[js.Any], popup = popup.asInstanceOf[js.Any], transparent = transparent.asInstanceOf[js.Any], visible = visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnimateAppear]
  }
  
  @scala.inline
  implicit class AnimateAppearOps[Self <: AnimateAppear] (val x: Self) extends AnyVal {
    
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
    def setAnimateAppear(value: Boolean): Self = this.set("animateAppear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationType(value: String): Self = this.set("animationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClosable(value: Boolean): Self = this.set("closable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFooterVarargs(value: scala.Nothing*): Self = this.set("footer", js.Array(value :_*))
    
    @scala.inline
    def setFooter(value: js.Array[scala.Nothing]): Self = this.set("footer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaskClosable(value: Boolean): Self = this.set("maskClosable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClose(value: () => Unit): Self = this.set("onClose", js.Any.fromFunction0(value))
    
    @scala.inline
    def setOperation(value: Boolean): Self = this.set("operation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopup(value: Boolean): Self = this.set("popup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTransparent(value: Boolean): Self = this.set("transparent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("visible", value.asInstanceOf[js.Any])
  }
}
