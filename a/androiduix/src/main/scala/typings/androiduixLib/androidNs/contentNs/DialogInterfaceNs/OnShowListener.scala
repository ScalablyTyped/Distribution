package typings
package androiduixLib.androidNs.contentNs.DialogInterfaceNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OnShowListener extends js.Object {
  def onShow(dialog: androiduixLib.androidNs.contentNs.DialogInterface): scala.Unit
}

object OnShowListener {
  @scala.inline
  def apply(onShow: js.Function1[androiduixLib.androidNs.contentNs.DialogInterface, scala.Unit]): OnShowListener = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onShow")(onShow)
    __obj.asInstanceOf[OnShowListener]
  }
}

