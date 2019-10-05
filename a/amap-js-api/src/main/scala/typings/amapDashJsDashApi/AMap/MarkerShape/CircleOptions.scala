package typings.amapDashJsDashApi.AMap.MarkerShape

import typings.amapDashJsDashApi.amapDashJsDashApiStrings.circle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CircleOptions extends Options {
  var coords: js.Tuple3[Double, Double, Double]
  var `type`: circle
}

object CircleOptions {
  @scala.inline
  def apply(coords: js.Tuple3[Double, Double, Double], `type`: circle): CircleOptions = {
    val __obj = js.Dynamic.literal(coords = coords)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[CircleOptions]
  }
}

