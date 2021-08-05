package typings.antDesignReactNative

import typings.antDesignReactNative.anon.BackgroundColor
import typings.antDesignReactNative.anon.Color
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNativeSwipeout.mod.SwipeoutButtonProperties
import typings.reactNativeSwipeout.mod.SwipeoutProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object swipeActionMod {
  
  @JSImport("@ant-design/react-native/lib/swipe-action", JSImport.Default)
  @js.native
  class default () extends SwipeAction
  object default {
    
    @JSImport("@ant-design/react-native/lib/swipe-action", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/swipe-action", "default.defaultProps")
    @js.native
    def defaultProps: SwipeActionProps = js.native
    inline def defaultProps_=(x: SwipeActionProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait SwipeAction
    extends Component[SwipeActionProps, js.Object, js.Any] {
    
    def renderCustomButton(button: SwipeoutButtonProps): Color = js.native
  }
  
  trait SwipeActionProps
    extends StObject
       with SwipeoutProperties {
    
    @JSName("left")
    var left_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.undefined
    
    @JSName("right")
    var right_SwipeActionProps: js.UndefOr[js.Array[SwipeoutButtonProps]] = js.undefined
  }
  object SwipeActionProps {
    
    inline def apply(): SwipeActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeActionProps]
    }
    
    extension [Self <: SwipeActionProps](x: Self) {
      
      inline def setLeft(value: js.Array[SwipeoutButtonProps]): Self = StObject.set(x, "left", value.asInstanceOf[js.Any])
      
      inline def setLeftUndefined: Self = StObject.set(x, "left", js.undefined)
      
      inline def setLeftVarargs(value: SwipeoutButtonProps*): Self = StObject.set(x, "left", js.Array(value :_*))
      
      inline def setRight(value: js.Array[SwipeoutButtonProps]): Self = StObject.set(x, "right", value.asInstanceOf[js.Any])
      
      inline def setRightUndefined: Self = StObject.set(x, "right", js.undefined)
      
      inline def setRightVarargs(value: SwipeoutButtonProps*): Self = StObject.set(x, "right", js.Array(value :_*))
    }
  }
  
  trait SwipeoutButtonProps
    extends StObject
       with SwipeoutButtonProperties {
    
    var style: js.UndefOr[StyleProp[TextStyle] & BackgroundColor] = js.undefined
  }
  object SwipeoutButtonProps {
    
    inline def apply(): SwipeoutButtonProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeoutButtonProps]
    }
    
    extension [Self <: SwipeoutButtonProps](x: Self) {
      
      inline def setStyle(value: StyleProp[TextStyle] & BackgroundColor): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
