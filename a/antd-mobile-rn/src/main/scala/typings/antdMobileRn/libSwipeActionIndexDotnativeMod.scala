package typings.antdMobileRn

import typings.antdMobileRn.libSwipeActionPropsTypeMod.SwipeActionPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libSwipeActionIndexDotnativeMod {
  
  @JSImport("antd-mobile-rn/lib/swipe-action/index.native", JSImport.Default)
  @js.native
  open class default () extends SwipeAction
  
  @js.native
  trait SwipeAction extends Component[SwipeActionProps, Any, Any]
  
  trait SwipeActionProps
    extends StObject
       with SwipeActionPropsType[TextStyle] {
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
  }
  object SwipeActionProps {
    
    inline def apply(): SwipeActionProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SwipeActionProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: SwipeActionProps] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
