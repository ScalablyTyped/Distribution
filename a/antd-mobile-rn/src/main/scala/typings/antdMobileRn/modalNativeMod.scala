package typings.antdMobileRn

import typings.antdMobileRn.modalPropsTypeMod.ModalPropsType
import typings.antdMobileRn.modalStyleIndexNativeMod.IModalStyle
import typings.propTypes.mod.Requireable
import typings.react.mod.Component
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.View
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalNativeMod {
  
  @JSImport("antd-mobile-rn/lib/modal/Modal.native", JSImport.Default)
  @js.native
  class default () extends AntmModal
  object default {
    
    @JSImport("antd-mobile-rn/lib/modal/Modal.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.alert")
    @js.native
    def alert: js.Any = js.native
    inline def alert_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    /* static member */
    object contextTypes {
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.contextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.contextTypes.antLocale")
      @js.native
      def antLocale: Requireable[js.Object] = js.native
      inline def antLocale_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.animateAppear")
      @js.native
      def animateAppear: Boolean = js.native
      inline def animateAppear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateAppear")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.animationType")
      @js.native
      def animationType: String = js.native
      inline def animationType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationType")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.closable")
      @js.native
      def closable: Boolean = js.native
      inline def closable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closable")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.footer")
      @js.native
      def footer: js.Array[scala.Nothing] = js.native
      inline def footer_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footer")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.maskClosable")
      @js.native
      def maskClosable: Boolean = js.native
      inline def maskClosable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(x.asInstanceOf[js.Any])
      
      inline def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.operation")
      @js.native
      def operation: Boolean = js.native
      inline def operation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operation")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.popup")
      @js.native
      def popup: Boolean = js.native
      inline def popup_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popup")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.transparent")
      @js.native
      def transparent: Boolean = js.native
      inline def transparent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
      
      @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.defaultProps.visible")
      @js.native
      def visible: Boolean = js.native
      inline def visible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.operation")
    @js.native
    def operation: js.Any = js.native
    inline def operation_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operation")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("antd-mobile-rn/lib/modal/Modal.native", "default.prompt")
    @js.native
    def prompt: js.Any = js.native
    inline def prompt_=(x: js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prompt")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AntmModal
    extends Component[IModalNativeProps, js.Any, js.Any] {
    
    def onFooterLayout(e: LayoutChangeEvent): Unit = js.native
    
    var root: View | Null = js.native
    
    def saveRoot(root: js.Any): Unit = js.native
  }
  
  trait IModalNativeProps
    extends StObject
       with ModalPropsType[TextStyle] {
    
    var bodyStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[IModalStyle] = js.undefined
  }
  object IModalNativeProps {
    
    inline def apply(visible: Boolean): IModalNativeProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[IModalNativeProps]
    }
    
    extension [Self <: IModalNativeProps](x: Self) {
      
      inline def setBodyStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleNull: Self = StObject.set(x, "bodyStyle", null)
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: IModalStyle): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
