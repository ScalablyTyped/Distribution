package typings.atom

import typings.atom.atomStrings.separator
import typings.atom.mod.ContextMenuOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonSeparator extends ContextMenuOptions {
  var `type`: separator
}

object AnonSeparator {
  @scala.inline
  def apply(`type`: separator): AnonSeparator = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonSeparator]
  }
}

