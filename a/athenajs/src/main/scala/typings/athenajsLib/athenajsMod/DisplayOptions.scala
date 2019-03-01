package typings
package athenajsLib.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayOptions extends js.Object {
  var height: scala.Double
  var layers: js.UndefOr[js.Array[scala.Boolean]] = js.undefined
  var name: java.lang.String
  var `type`: java.lang.String
  var width: scala.Double
}

object DisplayOptions {
  @scala.inline
  def apply(
    height: scala.Double,
    name: java.lang.String,
    `type`: java.lang.String,
    width: scala.Double,
    layers: js.Array[scala.Boolean] = null
  ): DisplayOptions = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("height")(height)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("width")(width)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[DisplayOptions]
  }
}

