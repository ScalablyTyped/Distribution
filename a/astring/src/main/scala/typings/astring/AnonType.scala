package typings.astring

import typings.astring.astringStrings.BreakStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonType extends js.Object {
  var `type`: BreakStatement
}

object AnonType {
  @scala.inline
  def apply(`type`: BreakStatement): AnonType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonType]
  }
}

