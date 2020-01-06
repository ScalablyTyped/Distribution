package typings.atAntDashDesignReactDashNative

import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.Action
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOnBackHandler
import typings.atAntDashDesignReactDashNative.libModalPropsTypeMod.CallbackOrActions
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal", JSImport.Namespace)
@js.native
object libModalMod extends js.Object {
  @js.native
  class default ()
    extends typings.atAntDashDesignReactDashNative.libModalModalMod.default
  
  /* static members */
  @js.native
  object default extends js.Object {
    var alert: js.Function4[
        /* title */ ReactNode, 
        /* content */ ReactNode, 
        /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    var contextTypes: Anon_AntLocale = js.native
    var defaultProps: Anon_AnimateAppear = js.native
    var operation: js.Function2[
        /* actions */ js.Array[_], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        Double
      ] = js.native
    var prompt: js.Function7[
        /* title */ ReactNode, 
        /* message */ ReactNode, 
        /* callbackOrActions */ CallbackOrActions[TextStyle], 
        /* type */ js.UndefOr[String], 
        /* defaultValue */ js.UndefOr[String], 
        /* placeholders */ js.UndefOr[js.Array[String]], 
        /* onBackHandler */ js.UndefOr[CallbackOnBackHandler], 
        js.UndefOr[Double]
      ] = js.native
  }
  
}

