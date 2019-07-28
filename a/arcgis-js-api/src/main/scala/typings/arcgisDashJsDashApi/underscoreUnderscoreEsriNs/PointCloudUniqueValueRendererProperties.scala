package typings.arcgisDashJsDashApi.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PointCloudUniqueValueRendererProperties extends PointCloudRendererProperties {
  /**
    * Each element in the array is an object that matches a unique value with a specific color. Features with equal values to those specified here will be assigned the associated color. For example, you may choose to visualize points representing low vegetation with a green color and points representing power lines with a gray color. Each object has the following specification:
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#colorUniqueValueInfos)
    */
  var colorUniqueValueInfos: js.UndefOr[js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos]] = js.undefined
  /**
    * The name of the field whose values are used to drive the visualization.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#field)
    */
  var field: js.UndefOr[String] = js.undefined
  /**
    * A transform that is applied to the field value before evaluating the renderer.  **Possible Values:** none | low-four-bit | high-four-bit | absolute-value | modulo-ten
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#fieldTransformType)
    *
    * @default null
    */
  var fieldTransformType: js.UndefOr[String] = js.undefined
  /**
    * An object providing options for displaying the renderer in the Legend.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-PointCloudUniqueValueRenderer.html#legendOptions)
    */
  var legendOptions: js.UndefOr[PointCloudUniqueValueRendererLegendOptions] = js.undefined
}

object PointCloudUniqueValueRendererProperties {
  @scala.inline
  def apply(
    colorModulation: PointCloudRendererColorModulation = null,
    colorUniqueValueInfos: js.Array[PointCloudUniqueValueRendererColorUniqueValueInfos] = null,
    field: String = null,
    fieldTransformType: String = null,
    legendOptions: PointCloudUniqueValueRendererLegendOptions = null,
    pointSizeAlgorithm: PointCloudRendererPointSizeAlgorithm = null,
    pointsPerInch: Int | Double = null
  ): PointCloudUniqueValueRendererProperties = {
    val __obj = js.Dynamic.literal()
    if (colorModulation != null) __obj.updateDynamic("colorModulation")(colorModulation)
    if (colorUniqueValueInfos != null) __obj.updateDynamic("colorUniqueValueInfos")(colorUniqueValueInfos)
    if (field != null) __obj.updateDynamic("field")(field)
    if (fieldTransformType != null) __obj.updateDynamic("fieldTransformType")(fieldTransformType)
    if (legendOptions != null) __obj.updateDynamic("legendOptions")(legendOptions)
    if (pointSizeAlgorithm != null) __obj.updateDynamic("pointSizeAlgorithm")(pointSizeAlgorithm)
    if (pointsPerInch != null) __obj.updateDynamic("pointsPerInch")(pointsPerInch.asInstanceOf[js.Any])
    __obj.asInstanceOf[PointCloudUniqueValueRendererProperties]
  }
}

