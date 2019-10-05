package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudClassBreaksRendererProperties extends PointCloudRendererProperties {
  /**
    * Each element in the array is an object that provides information about a class break associated with the renderer. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#colorClassBreakInfos)
    */
  var colorClassBreakInfos: js.UndefOr[js.Array[PointCloudClassBreaksRendererColorClassBreakInfos]] = js.undefined
  /**
    * The name of the field that is used to drive the color visualization for the renderer. The value of this field determines which class break each point is assigned.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * A transform that is applied to the field value before evaluating the renderer.  **Possible Values:** none | low-four-bit | high-four-bit | absolute-value | modulo-ten
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: js.UndefOr[String] = js.undefined
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudClassBreaksRendererLegendOptions] = js.undefined
}

object PointCloudClassBreaksRendererProperties {
  @scala.inline
  def apply(
    colorClassBreakInfos: js.Array[PointCloudClassBreaksRendererColorClassBreakInfos] = null,
    colorModulation: PointCloudRendererColorModulation = null,
    field: String = null,
    fieldTransformType: String = null,
    legendOptions: PointCloudClassBreaksRendererLegendOptions = null,
    pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = null,
    pointsPerInch: Int | Double = null
  ): PointCloudClassBreaksRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (colorClassBreakInfos != null) __obj.updateDynamic("colorClassBreakInfos")(colorClassBreakInfos)
    if (colorModulation != null) __obj.updateDynamic("colorModulation")(colorModulation)
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldTransformType != null) __obj.updateDynamic("fieldTransformType")(fieldTransformType)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (pointSizeAlgorithm != null) __obj.updateDynamic("pointSizeAlgorithm")(pointSizeAlgorithm)
    if (pointsPerInch != null) __obj.updateDynamic("pointsPerInch")(pointsPerInch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudClassBreaksRendererProperties]
  }
}

