package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudRendererProperties extends js.Object {
  /**
    * Reduces the brightness of the point's color, based on the value of another field, usually `intensity`. High values leave the color unchanged, while low values darken the color of the point. This helps to display the scanned surface in a more realistic way.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#colorModulation)
    */
  var colorModulation: js.UndefOr[PointCloudRendererColorModulation] = js.undefined
  /**
    * Specifies how the size of the points in the point cloud is computed for rendering.  The splat algorithm automatically computes a size based on the density, which varies with the Level of Detail that is currently displayed.  The fixed size algorithm displays all points with the same size, either in screen space or real world units.  When `pointSizeAlgorithm` is not set, the default is `splat`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointSizeAlgorithm)
    */
  var pointSizeAlgorithm: js.UndefOr[PointCloudRendererPointSizeAlgorithm] = js.undefined
  /**
    * The number of points to draw per display inch. This property determines the level of detail in the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRenderer.html#pointsPerInch)
    *
    * @default 10
    */
  var pointsPerInch: js.UndefOr[Double] = js.undefined
}

object PointCloudRendererProperties {
  @scala.inline
  def apply(
    colorModulation: PointCloudRendererColorModulation = null,
    pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = null,
    pointsPerInch: Int | Double = null
  ): PointCloudRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (colorModulation != null) __obj.updateDynamic("colorModulation")(colorModulation)
    if (pointSizeAlgorithm != null) __obj.updateDynamic("pointSizeAlgorithm")(pointSizeAlgorithm)
    if (pointsPerInch != null) __obj.updateDynamic("pointsPerInch")(pointsPerInch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudRendererProperties]
  }
}

