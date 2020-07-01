package typings.astring.anon

import typings.astring.astringStrings.Super
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait `42` extends js.Object {
  var `type`: Super
}

object `42` {
  @scala.inline
  def apply(`type`: Super): `42` = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[`42`]
  }
}

