package typings
package adoneLib.adoneNs.textNs.tableNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StyleOptions extends js.Object {
  var border: js.Array[java.lang.String]
  var compact: scala.Boolean
  var head: js.Array[java.lang.String]
  var `padding-left`: scala.Double
  var `padding-right`: scala.Double
}

object StyleOptions {
  @scala.inline
  def apply(
    border: js.Array[java.lang.String],
    compact: scala.Boolean,
    head: js.Array[java.lang.String],
    `padding-left`: scala.Double,
    `padding-right`: scala.Double
  ): StyleOptions = {
    val __obj = js.Dynamic.literal(`padding-left` = `padding-left`, `padding-right` = `padding-right`)
    __obj.updateDynamic("border")(border)
    __obj.updateDynamic("compact")(compact)
    __obj.updateDynamic("head")(head)
    __obj.asInstanceOf[StyleOptions]
  }
}

