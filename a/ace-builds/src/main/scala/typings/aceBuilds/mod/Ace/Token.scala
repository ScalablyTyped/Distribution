package typings.aceBuilds.mod.Ace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Token extends js.Object {
  var index: js.UndefOr[Double] = js.undefined
  var start: js.UndefOr[Double] = js.undefined
  var `type`: String
  var value: String
}

object Token {
  @scala.inline
  def apply(`type`: String, value: String, index: Int | Double = null, start: Int | Double = null): Token = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (index != null) __obj.updateDynamic("index")(index.asInstanceOf[js.Any])
    if (start != null) __obj.updateDynamic("start")(start.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

