package typings.activexVbide

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCancelDefault extends js.Object {
  val CancelDefault: Boolean
  val CommandBarControl: js.Any
  val handled: Boolean
}

object AnonCancelDefault {
  @scala.inline
  def apply(CancelDefault: Boolean, CommandBarControl: js.Any, handled: Boolean): AnonCancelDefault = {
    val __obj = js.Dynamic.literal(CancelDefault = CancelDefault.asInstanceOf[js.Any], CommandBarControl = CommandBarControl.asInstanceOf[js.Any], handled = handled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCancelDefault]
  }
}

