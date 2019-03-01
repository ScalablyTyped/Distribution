package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudRGBRendererProperties extends PointCloudRendererProperties {
  /**
    * The name of the field containing RGB values used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html#field)
    */
  var field: js.UndefOr[java.lang.String] = js.undefined
}

object PointCloudRGBRendererProperties {
  @scala.inline
  def apply(
    colorModulation: PointCloudRendererColorModulation = null,
    field: java.lang.String = null,
    pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = null,
    pointsPerInch: scala.Int | scala.Double = null
  ): PointCloudRGBRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (colorModulation != null) __obj.updateDynamic("colorModulation")(colorModulation)
    if (field != null) __obj.updateDynamic("field")(field)
    if (pointSizeAlgorithm != null) __obj.updateDynamic("pointSizeAlgorithm")(pointSizeAlgorithm)
    if (pointsPerInch != null) __obj.updateDynamic("pointsPerInch")(pointsPerInch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudRGBRendererProperties]
  }
}

