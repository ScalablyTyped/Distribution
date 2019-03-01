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
    val __obj = js.Dynamic.literal(`bottom-left` = `bottom-left`, `bottom-mid` = `bottom-mid`, `bottom-right` = `bottom-right`, `left-mid` = `left-mid`, `mid-mid` = `mid-mid`, `right-mid` = `right-mid`, `top-left` = `top-left`, `top-mid` = `top-mid`, `top-right` = `top-right`)
    __obj.updateDynamic("bottom")(bottom)
    __obj.updateDynamic("left")(left)
    __obj.updateDynamic("mid")(mid)
    __obj.updateDynamic("middle")(middle)
    __obj.updateDynamic("right")(right)
    __obj.updateDynamic("top")(top)
    __obj.asInstanceOf[CharsOptions]
  }
}

