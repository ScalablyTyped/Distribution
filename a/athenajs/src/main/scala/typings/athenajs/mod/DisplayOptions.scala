package typings.athenajs.mod

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
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayOptions]
  }
}

