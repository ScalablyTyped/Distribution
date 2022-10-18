package typings.antDesignReactNative

import typings.antDesignReactNative.anon.Mask
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.libToastStyleMod.ToastStyle
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.reactNative.mod.Animated.CompositeAnimation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libToastToastContainerMod {
  
  @JSImport("@ant-design/react-native/lib/toast/ToastContainer", JSImport.Default)
  @js.native
  open class default protected () extends ToastContainer {
    def this(props: ToastProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/toast/ToastContainer", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/toast/ToastContainer", "default.defaultProps")
    @js.native
    def defaultProps: Mask = js.native
    inline def defaultProps_=(x: Mask): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ToastContainer extends Component[ToastProps, Any, Any] {
    
    var anim: CompositeAnimation | Null = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MToastContainer(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MToastContainer(): Unit = js.native
  }
  
  trait ToastProps
    extends StObject
       with WithThemeStyles[ToastStyle] {
    
    var content: String | ReactNode
    
    var duration: js.UndefOr[Double] = js.undefined
    
    var mask: js.UndefOr[Boolean] = js.undefined
    
    var onAnimationEnd: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onClose: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object ToastProps {
    
    inline def apply(): ToastProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ToastProps]
    }
    
    extension [Self <: ToastProps](x: Self) {
      
      inline def setContent(value: String | ReactNode): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setMask(value: Boolean): Self = StObject.set(x, "mask", value.asInstanceOf[js.Any])
      
      inline def setMaskUndefined: Self = StObject.set(x, "mask", js.undefined)
      
      inline def setOnAnimationEnd(value: () => Unit): Self = StObject.set(x, "onAnimationEnd", js.Any.fromFunction0(value))
      
      inline def setOnAnimationEndUndefined: Self = StObject.set(x, "onAnimationEnd", js.undefined)
      
      inline def setOnClose(value: () => Unit): Self = StObject.set(x, "onClose", js.Any.fromFunction0(value))
      
      inline def setOnCloseUndefined: Self = StObject.set(x, "onClose", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
}
