package typings.antDesignReactNative

import typings.antDesignReactNative.libModalPropsTypeMod.Action
import typings.antDesignReactNative.libModalPropsTypeMod.CallbackOnBackHandler
import typings.antDesignReactNative.libModalPropsTypeMod.CallbackOrActions
import typings.antDesignReactNative.libModalPropsTypeMod.ModalPropsType
import typings.antDesignReactNative.libModalStyleMod.ModalStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.Context
import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.TextStyle
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libModalModalMod {
  
  @JSImport("@ant-design/react-native/lib/modal/Modal", JSImport.Default)
  @js.native
  open class default () extends AntmModal
  object default {
    
    @JSImport("@ant-design/react-native/lib/modal/Modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof alert` */
    @JSImport("@ant-design/react-native/lib/modal/Modal", "default.alert")
    @js.native
    def alert: js.Function4[
        /* title */ ReactNode, 
        /* content */ ReactNode, 
        /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    inline def alert_=(
      x: js.Function4[
          /* title */ ReactNode, 
          /* content */ ReactNode, 
          /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
          /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
          Double
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("alert")(x.asInstanceOf[js.Any])
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/modal/Modal", "default.contextType")
    @js.native
    def contextType: Context[js.Object] = js.native
    inline def contextType_=(x: Context[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("contextType")(x.asInstanceOf[js.Any])
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.animateAppear")
      @js.native
      def animateAppear: Boolean = js.native
      inline def animateAppear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateAppear")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.animationType")
      @js.native
      def animationType: String = js.native
      inline def animationType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationType")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.closable")
      @js.native
      def closable: Boolean = js.native
      inline def closable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closable")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.footer")
      @js.native
      def footer: js.Array[scala.Nothing] = js.native
      inline def footer_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footer")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.maskClosable")
      @js.native
      def maskClosable: Boolean = js.native
      inline def maskClosable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(x.asInstanceOf[js.Any])
      
      inline def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.operation")
      @js.native
      def operation: Boolean = js.native
      inline def operation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operation")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.popup")
      @js.native
      def popup: Boolean = js.native
      inline def popup_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popup")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.transparent")
      @js.native
      def transparent: Boolean = js.native
      inline def transparent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal/Modal", "default.defaultProps.visible")
      @js.native
      def visible: Boolean = js.native
      inline def visible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    /* was `typeof operation` */
    @JSImport("@ant-design/react-native/lib/modal/Modal", "default.operation")
    @js.native
    def operation: js.Function2[
        /* actions */ js.Array[Any], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    inline def operation_=(
      x: js.Function2[
          /* actions */ js.Array[Any], 
          /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
          Double
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operation")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof prompt` */
    @JSImport("@ant-design/react-native/lib/modal/Modal", "default.prompt")
    @js.native
    def prompt: js.Function7[
        /* title */ ReactNode, 
        /* message */ ReactNode, 
        /* callbackOrActions */ CallbackOrActions[TextStyle], 
        /* type */ js.UndefOr[String], 
        /* defaultValue */ js.UndefOr[String], 
        /* placeholders */ js.UndefOr[js.Array[String]], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        js.UndefOr[Double]
      ] = js.native
    inline def prompt_=(
      x: js.Function7[
          /* title */ ReactNode, 
          /* message */ ReactNode, 
          /* callbackOrActions */ CallbackOrActions[TextStyle], 
          /* type */ js.UndefOr[String], 
          /* defaultValue */ js.UndefOr[String], 
          /* placeholders */ js.UndefOr[js.Array[String]], 
          /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
          js.UndefOr[Double]
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("prompt")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait AntmModal extends Component[ModalProps, Any, Any]
  
  trait ModalProps
    extends StObject
       with ModalPropsType[TextStyle]
       with WithThemeStyles[ModalStyle] {
    
    var bodyStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var onRequestClose: js.UndefOr[CallbackOnBackHandler] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
  }
  object ModalProps {
    
    inline def apply(visible: Boolean): ModalProps = {
      val __obj = js.Dynamic.literal(visible = visible.asInstanceOf[js.Any])
      __obj.asInstanceOf[ModalProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ModalProps] (val x: Self) extends AnyVal {
      
      inline def setBodyStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "bodyStyle", value.asInstanceOf[js.Any])
      
      inline def setBodyStyleNull: Self = StObject.set(x, "bodyStyle", null)
      
      inline def setBodyStyleUndefined: Self = StObject.set(x, "bodyStyle", js.undefined)
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setOnRequestClose(value: () => Boolean): Self = StObject.set(x, "onRequestClose", js.Any.fromFunction0(value))
      
      inline def setOnRequestCloseUndefined: Self = StObject.set(x, "onRequestClose", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
}
