package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`absolute-value`
import typings.arcgisJsApi.arcgisJsApiStrings.`high-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`low-four-bit`
import typings.arcgisJsApi.arcgisJsApiStrings.`modulo-ten`
import typings.arcgisJsApi.arcgisJsApiStrings.none
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
    * A transform that is applied to the field value before evaluating the renderer.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudClassBreaksRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: js.UndefOr[none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten`] = js.undefined
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
    fieldTransformType: none | `low-four-bit` | `high-four-bit` | `absolute-value` | `modulo-ten` = null,
    legendOptions: PointCloudClassBreaksRendererLegendOptions = null,
    pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = null,
    pointsPerInch: js.UndefOr[Double] = js.undefined
  ): PointCloudClassBreaksRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (colorClassBreakInfos != null) __obj.updateDynamic("colorClassBreakInfos")(colorClassBreakInfos.asInstanceOf[js.Any])
    if (colorModulation != null) __obj.updateDynamic("colorModulation")(colorModulation.asInstanceOf[js.Any])
    if (field != null) __obj.updateDynamic("field")(field.asInstanceOf[js.Any])
    if (fieldTransformType != null) __obj.updateDynamic("fieldTransformType")(fieldTransformType.asInstanceOf[js.Any])
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions.asInstanceOf[js.Any])
    if (pointSizeAlgorithm != null) __obj.updateDynamic("pointSizeAlgorithm")(pointSizeAlgorithm.asInstanceOf[js.Any])
    if (!js.isUndefined(pointsPerInch)) __obj.updateDynamic("pointsPerInch")(pointsPerInch.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudClassBreaksRendererProperties]
  }
}

