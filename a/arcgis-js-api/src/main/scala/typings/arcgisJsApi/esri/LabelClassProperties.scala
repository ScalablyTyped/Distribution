package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`above-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`above-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`always-horizontal`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`below-start`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-after`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-along`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-before`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-center`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-end`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-left`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-right`
import typings.arcgisJsApi.arcgisJsApiStrings.`center-start`
import typings.arcgisJsApi.arcgisJsApiStrings.none
import typings.arcgisJsApi.arcgisJsApiStrings.static
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelClassProperties extends js.Object {
  /**
    * Defines how labels should be placed relative to one another. By default, labels have a `static` deconfliction strategy, meaning labels that overlap are dropped to make them easier to read.  In some cases where few labels overlap, it may be preferable to turn off label deconfliction with the `none` option. It is also advisable to turn off deconfliction when [labeling clusters](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) with a count of features in the center of the cluster.  >>> esri-read-more  The following images illustrate when you may, or may not, want labels to deconflict.  When labeling dense layers, the default deconfliction strategy (`static`) is preferable since labeling all features causes significant overlap, making the labels illegible. Keeping the default setting allows some labels to render. As the user zooms in, all labels will eventually come into view.
    *
    * static (default) | none
    * -----------------|------
    * ![layer-deconfliction-on](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/layer-deconfliction-on.png) | ![layer-deconfliction-off](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/layer-deconfliction-off.png)
    *
    * When labeling clusters (or even sparsely distributed features) with small labels, it may be preferable to allow labels to slightly overlap since the information is still legible and doesn't significantly occlude the visualization. In the clustering scenario, a label deconfliction setting of `static` may actually cause more confusion, making some features not appear to be clusters.
    *
    * static (default) | none
    * -----------------|------
    * ![cluster-deconfliction-on](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/cluster-deconfliction-on.png) | ![cluster-deconfliction-off](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/cluster-deconfliction-off.png)
    *
    * >>>
    *
    * > **Known Limitations**  Currently, this property only applies to FeatureLayer, CSVLayer, and StreamLayer in 2D MapViews.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#deconflictionStrategy)
    *
    * @default static
    */
  var deconflictionStrategy: js.UndefOr[none | static] = js.native
  /**
    * Defines the content of label text for [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html). If working with [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html), use [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) instead.  Attribute values may be included in labels using SQL syntax. To include an attribute value in a label, wrap the name of the field in square brackets `[]`. See the example snippet below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression)
    *
    * @default null
    */
  var labelExpression: js.UndefOr[String] = js.native
  /**
    * Defines the content of label text for [FeatureLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html). If working with [MapImageLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MapImageLayer.html), use [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo)
    *
    * @default null
    */
  var labelExpressionInfo: js.UndefOr[LabelClassLabelExpressionInfo] = js.native
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
  ] = js.native
  /**
    * The maximum scale (most zoomed in) at which labels are visible in the view. A value of `0` means the label's visibility does not have a maximum scale. The maxScale value should always be smaller than the [minScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale) value, and greater than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale)
    *
    * @default 0
    */
  var maxScale: js.UndefOr[Double] = js.native
  /**
    * The minimum scale (most zoomed out) at which labels are visible in the view. A value of `0` means the label's visibility does not have a minimum scale. The minScale value should always be larger than the [maxScale](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#maxScale) value, and lesser than or equal to the service specification.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#minScale)
    *
    * @default 0
    */
  var minScale: js.UndefOr[Double] = js.native
  /**
    * Defines the symbol used for rendering the label. If not set, the default symbol will be used. See the example below.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#symbol)
    */
  var symbol: js.UndefOr[TextSymbolProperties | LabelSymbol3DProperties] = js.native
  /**
    * Indicates whether to use domain names if the fields in the [labelExpression](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpression) or [labelExpressionInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#labelExpressionInfo) have domains.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#useCodedValues)
    */
  var useCodedValues: js.UndefOr[Boolean] = js.native
  /**
    * A SQL where clause used to determine the features to which the label class should be applied. When specified, only features evaluating to `true` based on this expression will be labeled.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#where)
    *
    * @default null
    */
  var where: js.UndefOr[String] = js.native
}

object LabelClassProperties {
  @scala.inline
  def apply(): LabelClassProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelClassProperties]
  }
  @scala.inline
  implicit class LabelClassPropertiesOps[Self <: LabelClassProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeconflictionStrategy(value: none | static): Self = this.set("deconflictionStrategy", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeconflictionStrategy: Self = this.set("deconflictionStrategy", js.undefined)
    @scala.inline
    def setLabelExpression(value: String): Self = this.set("labelExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelExpression: Self = this.set("labelExpression", js.undefined)
    @scala.inline
    def setLabelExpressionInfo(value: LabelClassLabelExpressionInfo): Self = this.set("labelExpressionInfo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelExpressionInfo: Self = this.set("labelExpressionInfo", js.undefined)
    @scala.inline
    def setLabelPlacement(
      value: `above-center` | `above-left` | `above-right` | `below-center` | `below-left` | `below-right` | `center-center` | `center-left` | `center-right` | `above-after` | `above-along` | `above-before` | `above-start` | `above-end` | `below-after` | `below-along` | `below-before` | `below-start` | `below-end` | `center-after` | `center-along` | `center-before` | `center-start` | `center-end` | `always-horizontal`
    ): Self = this.set("labelPlacement", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabelPlacement: Self = this.set("labelPlacement", js.undefined)
    @scala.inline
    def setMaxScale(value: Double): Self = this.set("maxScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxScale: Self = this.set("maxScale", js.undefined)
    @scala.inline
    def setMinScale(value: Double): Self = this.set("minScale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinScale: Self = this.set("minScale", js.undefined)
    @scala.inline
    def setSymbol(value: TextSymbolProperties | LabelSymbol3DProperties): Self = this.set("symbol", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSymbol: Self = this.set("symbol", js.undefined)
    @scala.inline
    def setUseCodedValues(value: Boolean): Self = this.set("useCodedValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUseCodedValues: Self = this.set("useCodedValues", js.undefined)
    @scala.inline
    def setWhere(value: String): Self = this.set("where", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWhere: Self = this.set("where", js.undefined)
  }
  
}

