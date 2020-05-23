package typings.antdMobile.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BackspaceLabel extends js.Object {
  var backspaceLabel: String
  var cancelKeyboardLabel: String
  var confirmLabel: String
}

object BackspaceLabel {
  @scala.inline
  def apply(backspaceLabel: String, cancelKeyboardLabel: String, confirmLabel: String): BackspaceLabel = {
    val __obj = js.Dynamic.literal(backspaceLabel = backspaceLabel.asInstanceOf[js.Any], cancelKeyboardLabel = cancelKeyboardLabel.asInstanceOf[js.Any], confirmLabel = confirmLabel.asInstanceOf[js.Any])
    __obj.asInstanceOf[BackspaceLabel]
  }
}

