package typings.atAntDashDesignReactDashNative.esMod

import typings.atAntDashDesignReactDashNative.Anon_AnimateAppear
import typings.atAntDashDesignReactDashNative.Anon_AntLocale
import typings.atAntDashDesignReactDashNative.esModalMod.default
import typings.atAntDashDesignReactDashNative.esModalPropsTypeMod.Action
import typings.atAntDashDesignReactDashNative.esModalPropsTypeMod.CallbackOrActions
import typings.react.reactMod.ReactNode
import typings.reactDashNative.reactDashNativeMod.TextStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/es", "Modal")
@js.native
class Modal () extends default

/* static members */
@JSImport("@ant-design/react-native/es", "Modal")
@js.native
object Modal extends js.Object {
  var alert: js.Function3[
    /* title */ ReactNode, 
    /* content */ ReactNode, 
    /* actions */ js.UndefOr[js.Array[Action[TextStyle]]], 
    Unit
  ] = js.native
  var contextTypes: Anon_AntLocale = js.native
  var defaultProps: Anon_AnimateAppear = js.native
  var operation: js.Function1[/* repeated */ js.Any, Unit] = js.native
  var prompt: js.Function6[
    /* title */ ReactNode, 
    /* message */ ReactNode, 
    /* callbackOrActions */ CallbackOrActions[TextStyle], 
    /* type */ js.UndefOr[String], 
    /* defaultValue */ js.UndefOr[String], 
    /* placeholders */ js.UndefOr[js.Array[String]], 
    Unit
  ] = js.native
}

