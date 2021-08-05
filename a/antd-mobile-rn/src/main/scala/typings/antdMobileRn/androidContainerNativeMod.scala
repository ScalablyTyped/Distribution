package typings.antdMobileRn

import typings.antdMobileRn.styleIndexNativeMod.ActionSheetStyle
import typings.react.mod.Component
import typings.reactNative.mod.ActionSheetIOSOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object androidContainerNativeMod {
  
  @JSImport("antd-mobile-rn/lib/action-sheet/AndroidContainer.native", JSImport.Default)
  @js.native
  class default protected () extends ActionSheetAndroid {
    def this(props: ActionSheetNativeProps) = this()
  }
  
  @js.native
  trait ActionSheetAndroid
    extends Component[ActionSheetNativeProps, js.Any, js.Any] {
    
    def close(): Unit = js.native
    
    def confirm(index: Double): Unit = js.native
  }
  
  trait ActionSheetNativeProps extends StObject {
    
    var callback: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var config: ActionSheetIOSOptions
    
    var onAnimationEnd: js.UndefOr[js.Function1[/* visible */ Boolean, Unit]] = js.undefined
    
    var styles: js.UndefOr[ActionSheetStyle] = js.undefined
    
    var visible: js.UndefOr[Boolean] = js.undefined
  }
  object ActionSheetNativeProps {
    
    inline def apply(config: ActionSheetIOSOptions): ActionSheetNativeProps = {
      val __obj = js.Dynamic.literal(config = config.asInstanceOf[js.Any])
      __obj.asInstanceOf[ActionSheetNativeProps]
    }
    
    extension [Self <: ActionSheetNativeProps](x: Self) {
      
      inline def setCallback(value: /* index */ Double => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction1(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setConfig(value: ActionSheetIOSOptions): Self = StObject.set(x, "config", value.asInstanceOf[js.Any])
      
      inline def setOnAnimationEnd(value: /* visible */ Boolean => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction1(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setStyles(value: ActionSheetStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
      
      inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
}
