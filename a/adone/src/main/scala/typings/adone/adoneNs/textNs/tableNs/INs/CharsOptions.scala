package typings.adone.adoneNs.textNs.tableNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharsOptions extends js.Object {
  var bottom: String
  var `bottom-left`: String
  var `bottom-mid`: String
  var `bottom-right`: String
  var left: String
  var `left-mid`: String
  var mid: String
  var `mid-mid`: String
  var middle: String
  var right: String
  var `right-mid`: String
  var top: String
  var `top-left`: String
  var `top-mid`: String
  var `top-right`: String
}

object CharsOptions {
  @scala.inline
  def apply(
    bottom: String,
    `bottom-left`: String,
    `bottom-mid`: String,
    `bottom-right`: String,
    left: String,
    `left-mid`: String,
    mid: String,
    `mid-mid`: String,
    middle: String,
    right: String,
    `right-mid`: String,
    top: String,
    `top-left`: String,
    `top-mid`: String,
    `top-right`: String
  ): CharsOptions = {
    val __obj = js.Dynamic.literal(bottom = bottom, left = left, mid = mid, middle = middle, right = right, top = top)
    __obj.updateDynamic("bottom-left")(`bottom-left`)
    __obj.updateDynamic("bottom-mid")(`bottom-mid`)
    __obj.updateDynamic("bottom-right")(`bottom-right`)
    __obj.updateDynamic("left-mid")(`left-mid`)
    __obj.updateDynamic("mid-mid")(`mid-mid`)
    __obj.updateDynamic("right-mid")(`right-mid`)
    __obj.updateDynamic("top-left")(`top-left`)
    __obj.updateDynamic("top-mid")(`top-mid`)
    __obj.updateDynamic("top-right")(`top-right`)
    __obj.asInstanceOf[CharsOptions]
  }
}

