package typings
package antdLib.libModalActionButtonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ActionButtonProps extends js.Object {
  var actionFn: js.UndefOr[js.Function1[/* repeated */ js.Any, _ | js.Thenable[_]]] = js.undefined
  var autoFocus: js.UndefOr[scala.Boolean] = js.undefined
  var buttonProps: js.UndefOr[antdLib.libButtonButtonMod.NativeButtonProps] = js.undefined
  var closeModal: js.Function
  var `type`: js.UndefOr[antdLib.libButtonButtonMod.ButtonType] = js.undefined
}

