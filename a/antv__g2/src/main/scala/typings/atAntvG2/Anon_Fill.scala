package typings.atAntvG2

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Fill extends js.Object {
  var fill: js.UndefOr[String] = js.undefined
  var fillOpacity: js.UndefOr[Double] = js.undefined
}

object Anon_Fill {
  @scala.inline
  def apply(fill: String = null, fillOpacity: Int | Double = null): Anon_Fill = {
    val __obj = js.Dynamic.literal()
    if (fill != null) __obj.updateDynamic("fill")(fill.asInstanceOf[js.Any])
    if (fillOpacity != null) __obj.updateDynamic("fillOpacity")(fillOpacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Fill]
  }
}

