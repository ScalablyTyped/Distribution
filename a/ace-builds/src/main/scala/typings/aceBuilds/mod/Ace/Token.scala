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
  def apply(
    `type`: String,
    value: String,
    index: js.UndefOr[Double] = js.undefined,
    start: js.UndefOr[Double] = js.undefined
  ): Token = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(index)) __obj.updateDynamic("index")(index.get.asInstanceOf[js.Any])
    if (!js.isUndefined(start)) __obj.updateDynamic("start")(start.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Token]
  }
}

