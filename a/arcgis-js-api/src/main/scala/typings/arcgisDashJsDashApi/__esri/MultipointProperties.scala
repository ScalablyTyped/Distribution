package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipointProperties extends GeometryProperties {
  /**
    * An array of points.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Multipoint.html#points)
    */
  var points: js.UndefOr[js.Array[js.Array[Double]]] = js.undefined
}

object MultipointProperties {
  @scala.inline
  def apply(
    hasM: js.UndefOr[Boolean] = js.undefined,
    hasZ: js.UndefOr[Boolean] = js.undefined,
    points: js.Array[js.Array[Double]] = null,
    spatialReference: SpatialReferenceProperties = null
  ): MultipointProperties = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasM)) __obj.updateDynamic("hasM")(hasM)
    if (!js.isUndefined(hasZ)) __obj.updateDynamic("hasZ")(hasZ)
    if (points != null) __obj.updateDynamic("points")(points)
    if (spatialReference != null) __obj.updateDynamic("spatialReference")(spatialReference)
    __obj.asInstanceOf[MultipointProperties]
  }
}

