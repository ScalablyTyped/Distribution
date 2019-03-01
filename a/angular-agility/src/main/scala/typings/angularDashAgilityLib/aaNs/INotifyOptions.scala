package typings
package angularDashAgilityLib.aaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait INotifyOptions extends js.Object {
  var allowHtml: scala.Boolean
  var cssClasses: js.UndefOr[java.lang.String] = js.undefined
  var message: java.lang.String
  var messageType: java.lang.String
}

object INotifyOptions {
  @scala.inline
  def apply(
    allowHtml: scala.Boolean,
    message: java.lang.String,
    messageType: java.lang.String,
    cssClasses: java.lang.String = null
  ): INotifyOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allowHtml")(allowHtml)
    __obj.updateDynamic("message")(message)
    __obj.updateDynamic("messageType")(messageType)
    if (cssClasses != null) __obj.updateDynamic("cssClasses")(cssClasses)
    __obj.asInstanceOf[INotifyOptions]
  }
}

