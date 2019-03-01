package typings
package antdLib.libModalModalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ModalLocale extends js.Object {
  var cancelText: java.lang.String
  var justOkText: java.lang.String
  var okText: java.lang.String
}

object ModalLocale {
  @scala.inline
  def apply(cancelText: java.lang.String, justOkText: java.lang.String, okText: java.lang.String): ModalLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelText")(cancelText)
    __obj.updateDynamic("justOkText")(justOkText)
    __obj.updateDynamic("okText")(okText)
    __obj.asInstanceOf[ModalLocale]
  }
}

