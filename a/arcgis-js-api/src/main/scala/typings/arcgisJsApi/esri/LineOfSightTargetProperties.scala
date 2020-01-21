package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LineOfSightTargetProperties extends js.Object {
  /**
    * A [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) representing the location of the target. Once the location is set, a new line of sight analysis will synchronously calculate the intersection and the visibility.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-LineOfSight-LineOfSightTarget.html#location)
    */
  var location: js.UndefOr[PointProperties] = js.undefined
}

object LineOfSightTargetProperties {
  @scala.inline
  def apply(location: PointProperties = null): LineOfSightTargetProperties = {
    val __obj = js.Dynamic.literal()
    if (location != null) __obj.updateDynamic("location")(location.asInstanceOf[js.Any])
    __obj.asInstanceOf[LineOfSightTargetProperties]
  }
}

