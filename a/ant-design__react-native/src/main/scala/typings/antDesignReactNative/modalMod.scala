package typings.antDesignReactNative

import typings.antDesignReactNative.modalPropsTypeMod.Action
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOnBackHandler
import typings.antDesignReactNative.modalPropsTypeMod.CallbackOrActions
import typings.propTypes.mod.Requireable
import typings.react.mod.ReactNode
import typings.reactNative.mod.TextStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modalMod {
  
  @JSImport("@ant-design/react-native/lib/modal", JSImport.Default)
  @js.native
  class default ()
    extends typings.antDesignReactNative.modalModalMod.default
  object default {
    
    @JSImport("@ant-design/react-native/lib/modal", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    /* was `typeof alert` */
    @JSImport("@ant-design/react-native/lib/modal", "default.alert")
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
    object contextTypes {
      
      @JSImport("@ant-design/react-native/lib/modal", "default.contextTypes")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/modal", "default.contextTypes.antLocale")
      @js.native
      def antLocale: Requireable[js.Object] = js.native
      inline def antLocale_=(x: Requireable[js.Object]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("antLocale")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    object defaultProps {
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps")
      @js.native
      val ^ : js.Any = js.native
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.animateAppear")
      @js.native
      def animateAppear: Boolean = js.native
      inline def animateAppear_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animateAppear")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.animationType")
      @js.native
      def animationType: String = js.native
      inline def animationType_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationType")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.closable")
      @js.native
      def closable: Boolean = js.native
      inline def closable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("closable")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.footer")
      @js.native
      def footer: js.Array[scala.Nothing] = js.native
      inline def footer_=(x: js.Array[scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("footer")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.maskClosable")
      @js.native
      def maskClosable: Boolean = js.native
      inline def maskClosable_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("maskClosable")(x.asInstanceOf[js.Any])
      
      inline def onClose(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("onClose")().asInstanceOf[Unit]
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.operation")
      @js.native
      def operation: Boolean = js.native
      inline def operation_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operation")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.popup")
      @js.native
      def popup: Boolean = js.native
      inline def popup_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popup")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.transparent")
      @js.native
      def transparent: Boolean = js.native
      inline def transparent_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("transparent")(x.asInstanceOf[js.Any])
      
      @JSImport("@ant-design/react-native/lib/modal", "default.defaultProps.visible")
      @js.native
      def visible: Boolean = js.native
      inline def visible_=(x: Boolean): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("visible")(x.asInstanceOf[js.Any])
    }
    
    /* static member */
    /* was `typeof operation` */
    @JSImport("@ant-design/react-native/lib/modal", "default.operation")
    @js.native
    def operation: js.Function2[
        /* actions */ js.Array[js.Any], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    inline def operation_=(
      x: js.Function2[
          /* actions */ js.Array[js.Any], 
          /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
          Double
        ]
    ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("operation")(x.asInstanceOf[js.Any])
    
    /* static member */
    /* was `typeof prompt` */
    @JSImport("@ant-design/react-native/lib/modal", "default.prompt")
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
}
