package typings
package adoneLib.adoneNs.textNs.tableNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CharsOptions extends js.Object {
  var bottom: java.lang.String
  var `bottom-left`: java.lang.String
  var `bottom-mid`: java.lang.String
  var `bottom-right`: java.lang.String
  var left: java.lang.String
  var `left-mid`: java.lang.String
  var mid: java.lang.String
  var `mid-mid`: java.lang.String
  var middle: java.lang.String
  var right: java.lang.String
  var `right-mid`: java.lang.String
  var top: java.lang.String
  var `top-left`: java.lang.String
  var `top-mid`: java.lang.String
  var `top-right`: java.lang.String
}

object CharsOptions {
  @scala.inline
  def apply(
    bottom: java.lang.String,
    `bottom-left`: java.lang.String,
    `bottom-mid`: java.lang.String,
    `bottom-right`: java.lang.String,
    left: java.lang.String,
    `left-mid`: java.lang.String,
    mid: java.lang.String,
    `mid-mid`: java.lang.String,
    middle: java.lang.String,
    right: java.lang.String,
    `right-mid`: java.lang.String,
    top: java.lang.String,
    `top-left`: java.lang.String,
    `top-mid`: java.lang.String,
    `top-right`: java.lang.String
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

