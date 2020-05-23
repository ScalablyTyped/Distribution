package typings.astring.anon

import typings.astring.astringStrings.BreakStatement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Type extends js.Object {
  var `type`: BreakStatement
}

object Type {
  @scala.inline
  def apply(`type`: BreakStatement): Type = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
}

