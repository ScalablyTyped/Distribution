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
    val __obj = js.Dynamic.literal(height = height, name = name, width = width)
    __obj.updateDynamic("type")(`type`)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[DisplayOptions]
  }
}

