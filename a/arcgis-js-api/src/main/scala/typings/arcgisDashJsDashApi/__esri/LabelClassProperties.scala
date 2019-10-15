package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-after`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-along`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-before`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-center`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-end`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-left`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-right`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`above-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`always-horizontal`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`below-after`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`below-along`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`below-before`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`below-center`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`below-end`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`below-left`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`below-right`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`below-start`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`center-after`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`center-along`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`center-before`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`center-center`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`center-end`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`center-left`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`center-right`
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.`center-start`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LabelClassProperties extends js.Object {
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html). If working with [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), use [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) instead.  Attribute values may be included in labels using SQL syntax. To include an attribute value in a label, wrap the name of the field in square brackets `[]`. See the example snippet below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    *
    * @default null
    */
  var labelExpression: js.UndefOr[String] = js.undefined
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). If working with [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), use [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    *
    * @default null
    */
  var labelExpressionInfo: js.UndefOr[LabelClassLabelExpressionInfo] = js.undefined
  /**
    * The position of the label. Possible values are based on the feature type. This property requires a value.
    *
    * | Feature Type | Possible Values |
    * |--------------|-----------------|
    * | Points       | `above-center`, `above-left`, `above-right`, `below-center`, `below-left`, `below-right`, `center-center`, `center-left`, `center-right` |
    * | Polylines    | `above-after`, `above-along`, `above-before`, `above-start`, `above-end`, `below-after`, `below-along`, `below-before`, `below-start`, `below-end`, `center-after`, `center-along`, `center-before`, `center-start`, `center-end`|
    * | Polygons     | `always-horizontal`|
    *
    * > **Known Limitations**
    *   * Currently, if the label has a [line callout](https://developers.arcgis.com/javascript/latest/api-reference/esri-symbols-callouts-LineCallout3D.html) in a 3D SceneView, then only `above-center` is supported.
    *   * Label placement only applies to [Point](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Point.html) layers in 3D SceneViews.
    *   * FeatureLayer [Polylines](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Polyline.html) only support `center-along` label placement in 2D MapViews.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelPlacement)
    *
    * @default null
    */
  var labelPlacement: js.UndefOr[
    `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
  ] = js.undefined
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view. A value of `0` means the label's visibility does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    *
    * @default 0
    */
  var maxScale: js.UndefOr[Double] = js.undefined
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view. A value of `0` means the label's visibility does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    *
    * @default 0
    */
  var minScale: js.UndefOr[Double] = js.undefined
  /**
    * Defines the symbol used for rendering the label. If not set, the default symbol will be used. See the example below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: js.UndefOr[TextSymbolProperties | LabelSymbol3DProperties] = js.undefined
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: js.UndefOr[Boolean] = js.undefined
  /**
    * A SQL where clause used to determine the features to which the label class should be applied. When specified, only features evaluating to `true` based on this expression will be labeled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    *
    * @default null
    */
  var where: js.UndefOr[String] = js.undefined
}

object LabelClassProperties {
  @scala.inline
  def apply(
    labelExpression: String = null,
    labelExpressionInfo: LabelClassLabelExpressionInfo = null,
    labelPlacement: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal` = null,
    maxScale: Int | Double = null,
    minScale: Int | Double = null,
    symbol: TextSymbolProperties | LabelSymbol3DProperties = null,
    useCodedValues: js.UndefOr[Boolean] = js.undefined,
    where: String = null
  ): LabelClassProperties = {
    val __obj = js.Dynamic.literal()
    if (labelExpression != null) __obj.updateDynamic("labelExpression")(labelExpression)
    if (labelExpressionInfo != null) __obj.updateDynamic("labelExpressionInfo")(labelExpressionInfo)
    if (labelPlacement != null) __obj.updateDynamic("labelPlacement")(labelPlacement.asInstanceOf[js.Any])
    if (maxScale != null) __obj.updateDynamic("maxScale")(maxScale.asInstanceOf[js.Any])
    if (minScale != null) __obj.updateDynamic("minScale")(minScale.asInstanceOf[js.Any])
    if (symbol != null) __obj.updateDynamic("symbol")(symbol.asInstanceOf[js.Any])
    if (!js.isUndefined(useCodedValues)) __obj.updateDynamic("useCodedValues")(useCodedValues)
    if (where != null) __obj.updateDynamic("where")(where)
    __obj.asInstanceOf[LabelClassProperties]
  }
}

