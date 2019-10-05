package typings.androiduix.android.app.AlertController

import typings.androiduix.android.content.DialogInterface
import typings.androiduix.android.os.Handler
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.app.AlertController.ButtonHandler")
@js.native
class ButtonHandler protected () extends Handler {
  def this(dialog: DialogInterface) = this()
  var mDialog: js.Any = js.native
}

/* static members */
@JSGlobal("android.app.AlertController.ButtonHandler")
@js.native
object ButtonHandler extends js.Object {
  var MSG_DISMISS_DIALOG: js.Any = js.native
}

