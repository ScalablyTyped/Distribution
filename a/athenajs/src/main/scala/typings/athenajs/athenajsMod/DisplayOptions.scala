package typings.athenajs.athenajsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DisplayOptions extends js.Object {
  var height: Double
  var layers: js.UndefOr[js.Array[Boolean]] = js.undefined
  var name: String
  var `type`: String
  var width: Double
}

object DisplayOptions {
  @scala.inline
  def apply(height: Double, name: String, `type`: String, width: Double, layers: js.Array[Boolean] = null): DisplayOptions = {
    val __obj = js.Dynamic.literal(height = height, name = name, width = width)
    __obj.updateDynamic("type")(`type`)
    if (layers != null) __obj.updateDynamic("layers")(layers)
    __obj.asInstanceOf[DisplayOptions]
  }
}

