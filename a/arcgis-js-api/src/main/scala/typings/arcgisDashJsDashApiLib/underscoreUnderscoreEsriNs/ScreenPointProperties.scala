package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScreenPointProperties extends js.Object {
  /**
    * X-coordinate in pixels relative to the top-left corner of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-ScreenPoint.html#x)
    *
    * @default 0
    */
  var x: js.UndefOr[scala.Double] = js.undefined
  /**
    * Y-coordinate in pixels relative to the top-left corner of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-ScreenPoint.html#y)
    *
    * @default 0
    */
  var y: js.UndefOr[scala.Double] = js.undefined
}

object ScreenPointProperties {
  @scala.inline
  def apply(x: scala.Int | scala.Double = null, y: scala.Int | scala.Double = null): ScreenPointProperties = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x.asInstanceOf[js.Any])
    if (y != null) __obj.updateDynamic("y")(y.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScreenPointProperties]
  }
}

