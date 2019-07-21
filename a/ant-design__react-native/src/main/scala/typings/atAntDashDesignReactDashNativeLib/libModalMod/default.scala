package typings
package atAntDashDesignReactDashNativeLib.libModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@ant-design/react-native/lib/modal", JSImport.Default)
@js.native
class default ()
  extends atAntDashDesignReactDashNativeLib.libModalModalMod.default

/* static members */
@JSImport("@ant-design/react-native/lib/modal", JSImport.Default)
@js.native
object default extends js.Object {
  var alert: js.Function3[
    /* title */ reactLib.reactMod.ReactNode, 
    /* content */ reactLib.reactMod.ReactNode, 
    /* actions */ js.UndefOr[
      js.Array[
        atAntDashDesignReactDashNativeLib.libModalPropsTypeMod.Action[reactDashNativeLib.reactDashNativeMod.TextStyle]
      ]
    ], 
    scala.Unit
  ] = js.native
  var contextTypes: atAntDashDesignReactDashNativeLib.Anon_AntLocale = js.native
  var defaultProps: atAntDashDesignReactDashNativeLib.Anon_AnimateAppear = js.native
  var operation: js.Function1[/* repeated */ js.Any, scala.Unit] = js.native
  var prompt: js.Function6[
    /* title */ reactLib.reactMod.ReactNode, 
    /* message */ reactLib.reactMod.ReactNode, 
    /* callbackOrActions */ atAntDashDesignReactDashNativeLib.libModalPropsTypeMod.CallbackOrActions[reactDashNativeLib.reactDashNativeMod.TextStyle], 
    /* type */ js.UndefOr[java.lang.String], 
    /* defaultValue */ js.UndefOr[java.lang.String], 
    /* placeholders */ js.UndefOr[js.Array[java.lang.String]], 
    scala.Unit
  ] = js.native
}

