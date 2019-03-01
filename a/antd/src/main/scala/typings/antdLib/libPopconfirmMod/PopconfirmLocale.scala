package typings
package antdLib.libPopconfirmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PopconfirmLocale extends js.Object {
  var cancelText: java.lang.String
  var okText: java.lang.String
}

object PopconfirmLocale {
  @scala.inline
  def apply(cancelText: java.lang.String, okText: java.lang.String): PopconfirmLocale = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("cancelText")(cancelText)
    __obj.updateDynamic("okText")(okText)
    __obj.asInstanceOf[PopconfirmLocale]
  }
}

