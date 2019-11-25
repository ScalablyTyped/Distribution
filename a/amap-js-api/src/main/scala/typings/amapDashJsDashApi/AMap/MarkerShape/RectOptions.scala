package typings.amapDashJsDashApi.AMap.MarkerShape

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.rect
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RectOptions extends Options {
  var coords: js.Tuple4[Double, Double, Double, Double]
  var `type`: rect
}

object RectOptions {
  @scala.inline
  def apply(coords: js.Tuple4[Double, Double, Double, Double], `type`: rect): RectOptions = {
    val __obj = js.Dynamic.literal(coords = coords.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RectOptions]
  }
}

