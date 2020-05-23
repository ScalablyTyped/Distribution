package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudRGBRendererProperties extends PointCloudRendererProperties {
  /**
    * The name of the field containing RGB values used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudRGBRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
}

object PointCloudRGBRendererProperties {
  @scala.inline
  def apply(
    colorModulation: PointCloudRendererColorModulation = null,
    field: String = null,
    pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = null,
    pointsPerInch: js.UndefOr[Double] = js.undefined
  ): PointCloudRGBRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (colorModulation != null) __obj.updateDynamic("colorModulation")(colorModulation.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (pointSizeAlgorithm != null) __obj.updateDynamic("pointSizeAlgorithm")(pointSizeAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsPerInch)) __obj.updateDynamic("pointsPerInch")(pointsPerInch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudRGBRendererProperties]
  }
}

