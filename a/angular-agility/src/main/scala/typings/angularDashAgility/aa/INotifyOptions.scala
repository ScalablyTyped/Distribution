package typings.angularDashAgility.aa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyOptions extends js.Object {
  var allowHtml: Boolean
  var cssClasses: js.UndefOr[String] = js.undefined
  var message: String
  var messageType: String
}

object INotifyOptions {
  @scala.inline
  def apply(allowHtml: Boolean, message: String, messageType: String, cssClasses: String = null): INotifyOptions = {
    val __obj = js.Dynamic.literal(allowHtml = allowHtml, message = message, messageType = messageType)
    if (cssClasses != null) __obj.updateDynamic("cssClasses")(cssClasses)
    __obj.asInstanceOf[INotifyOptions]
  }
}

