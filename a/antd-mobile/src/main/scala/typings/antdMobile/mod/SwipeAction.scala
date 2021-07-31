package typings.antdMobile.mod

import typings.antdMobile.swipeActionMod.default
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("antd-mobile", "SwipeAction")
@js.native
class SwipeAction () extends default
object SwipeAction {
  
  /* static member */
  object defaultProps {
    
    @JSImport("antd-mobile", "SwipeAction.defaultProps")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile", "SwipeAction.defaultProps.autoClose")
    @js.native
    def autoClose: Boolean = js.native
    @scala.inline
    def autoClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "SwipeAction.defaultProps.disabled")
    @js.native
    def disabled: Boolean = js.native
    @scala.inline
    def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "SwipeAction.defaultProps.left")
    @js.native
    def left: js.Array[scala.Nothing] = js.native
    @scala.inline
    def left_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
    
    @scala.inline
    def onOpen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onOpen")().asInstanceOf[Unit]
    
    @JSImport("antd-mobile", "SwipeAction.defaultProps.prefixCls")
    @js.native
    def prefixCls: String = js.native
    @scala.inline
    def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
    
    @JSImport("antd-mobile", "SwipeAction.defaultProps.right")
    @js.native
    def right: js.Array[scala.Nothing] = js.native
    @scala.inline
    def right_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
  }
}
