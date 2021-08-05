package typings.antdMobile

import typings.antdMobile.swipeActionPropsTypeMod.SwipeActionPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeActionMod {
  
  @JSImport("antd-mobile/lib/swipe-action", JSImport.Default)
  @js.native
  class default () extends SwipeAction
  object default {
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile/lib/swipe-action", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile/lib/swipe-action", "default.defaultProps.autoClose")
      @js.native
      def autoClose: Boolean = js.native
      inline def autoClose_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoClose")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/swipe-action", "default.defaultProps.disabled")
      @js.native
      def disabled: Boolean = js.native
      inline def disabled_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("disabled")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/swipe-action", "default.defaultProps.left")
      @js.native
      def left: js.Array[scala.Nothing] = js.native
      inline def left_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("left")(x.asInstanceOf[js.Any])
      
      inline def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
      
      inline def onOpen(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onOpen")().asInstanceOf[Unit]
      
      @JSImport("antd-mobile/lib/swipe-action", "default.defaultProps.prefixCls")
      @js.native
      def prefixCls: String = js.native
      inline def prefixCls_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prefixCls")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile/lib/swipe-action", "default.defaultProps.right")
      @js.native
      def right: js.Array[scala.Nothing] = js.native
      inline def right_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("right")(x.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait SwipeAction
    extends Component[SwipeActionProps, js.Any, js.Any]
  
  trait SwipeActionProps
    extends StObject
       with SwipeActionPropsType[CSSProperties] {
    
    var className: js.UndefOr[String] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object SwipeActionProps {
    
    inline def apply(): SwipeActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeActionProps]
    }
    
    extension [Self <: SwipeActionProps](x: Self) {
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
