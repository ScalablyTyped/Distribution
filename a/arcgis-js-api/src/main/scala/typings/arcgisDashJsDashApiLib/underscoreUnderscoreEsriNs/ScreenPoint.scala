package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScreenPoint extends Accessor {
  /**
    * X-coordinate in pixels relative to the top-left corner of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-ScreenPoint.html#x)
    *
    * @default 0
    */
  var x: scala.Double = js.native
  /**
    * Y-coordinate in pixels relative to the top-left corner of the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-ScreenPoint.html#y)
    *
    * @default 0
    */
  var y: scala.Double = js.native
}

@JSGlobal("__esri.ScreenPoint")
@js.native
class ScreenPointCls () extends ScreenPoint {
  def this(properties: ScreenPointProperties) = this()
}

