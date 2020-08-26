package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.cluster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureReductionCluster
  extends Accessor
     with JSONSupport {
  /**
    * Defines the symbol size of the largest cluster in points (or pixels if specified). Adjusting `clusterMaxSize` generally should be considered if the [clusterRadius](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius) is modified.  For example, if you prefer cluster icons to not overlap, then the `clusterMaxSize` should be substantially smaller than the `clusterRadius`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMaxSize)
    *
    * @default 37.5
    */
  var clusterMaxSize: Double = js.native
  /**
    * Defines the symbol size of the smallest cluster in points (or pixels if specified). If [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) clusters with a count or some other information in the center of the cluster, then having a `clusterMinSize` larger than the default is generally preferred.  Keep in mind that this size may be smaller than the symbol size of individual non-clustered features in the layer. In that scenario, you should either reduce the size of the symbol(s) in the layer's renderer or increase the `clusterMinSize` to be larger than the size of individual points to avoid confusion for the end user. This can most likely happen when cluster size represents feature count.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMinSize)
    *
    * @default 9
    */
  var clusterMinSize: Double = js.native
  /**
    * Defines the radius in points (or pixels if specified) of each area in which multiple points will be grouped and visualized as a single cluster. Adjusting `clusterRadius` generally should be considered if the [clusterMaxSize](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterMaxSize) is modified.  For example, if you prefer cluster icons to not overlap, then the `clusterRadius` should be substantially larger than the `clusterMaxSize`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius)
    *
    * @default 60
    */
  var clusterRadius: Double = js.native
  /**
    * Defines labels for clusters as an array of [LabelClass](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html). When set, labels independent of the [layer.labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo) are used to convey information about the clusters, including the count of all features in the cluster, the average, or predominant values of fields mapped by the renderer.  It is advisable to turn off [label deconfliction](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-LabelClass.html#deconflictionStrategy) when labeling clusters with a count in the center of the cluster. To generate suggested labels for your cluster configuration based on the layer's renderer, see [clusterLabelCreator](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-labels-clusters.html).  The table below describes the aggregate fields used internally by the cluster renderer, which you can reference in the label expression.  Aggregate fields:
    *
    * Field Name | Type | Description
    * -----------|------|------------
    * `cluster_count` | number | The number of features in the cluster.
    * `cluster_avg_{fieldName}` | number | For renderers visualizing a number field either with size, opacity, continuous color, or class breaks, this field describes the average of the rendered field among all features in the cluster.
    * `cluster_type_{fieldName}` | string | For layers with a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html), this field describes the mode, or predominant string of the rendered field among all features within the cluster.
    *
    * Multiple Label classes with different `where` clauses can be used to define several labels with varying styles on the same feature. Likewise, multiple label classes may be used to label different types of clusters (e.g. blue labels for small clusters and red labels for large ones).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo)
    */
  var labelingInfo: js.Array[LabelClass] = js.native
  /**
    * Indicates whether to display labels for the clusters. If `true`, labels will appear as defined in the [labelingInfo](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelingInfo) property.  Labels will not render for clusters if the [labelsVisible](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelsVisible) property on the layer is set to `false` even if `labelsVisible` on `featureReduction` is `true`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#labelsVisible)
    *
    * @default true
    */
  var labelsVisible: Boolean = js.native
  /**
    * Indicates whether to display the cluster popup. If `true`, popups will open when the user clicks or taps a cluster. If `false`, the popup as defined in the [popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate) will be persisted, but won't be displayed on click/tap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupEnabled)
    *
    * @default true
    */
  var popupEnabled: Boolean = js.native
  /**
    * The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) to apply to clustered graphics. When set, a popupTemplate independent of the [layer.popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) is used. This popup can display summary information for the cluster, including the count of all features in the cluster and the average or predominant values of fields mapped by the renderer.  To generate a suggested predefined popup template for your cluster configuration based on the layer's renderer, see [clusterPopupTemplateCreator](https://developers.arcgis.com/javascript/latest/api-reference/esri-smartMapping-popup-clusters.html).  The table below describes the aggregate fields used internally by the cluster renderer, which you can reference in the cluster popup.  Aggregate fields:
    *
    * Field Name | Type | Description
    * -----------|------|------------
    * `cluster_count` | number | The number of features in the cluster.
    * `cluster_avg_{fieldName}` | number | For renderers visualizing a number field either with size, opacity, continuous color, or class breaks, this field describes the average of the rendered field among all features in the cluster.
    * `cluster_type_{fieldName}` | string | For layers with a [UniqueValueRenderer](https://developers.arcgis.com/javascript/latest/api-reference/esri-renderers-UniqueValueRenderer.html), this field describes the mode, or predominant string of the rendered field among all features within the cluster.
    *
    * The following `popupTemplate` configurations will display the popups shown in the images below.  **Cluster count**
    * ```js
    * layer.featureReduction = {
    *   type: "cluster",
    *   popupTemplate: {
    *     content: "This cluster represents {cluster_count} earthquakes."
    *   }
    * };
    * ```
    *
    * [![clustering-simple-popup](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/clustering-simple-popup.png)](https://developers.arcgis.com/javascript/latest/sample-code/featurereduction-cluster/index.html)
    *
    * **Clusters by predominant type**
    *
    *
    * The following featureReduction configuration assumes the layer's renderer is a UniqueValueRenderer
    * who's field is named `religion`.
    *
    * ```js
    * layer.featureReduction = {
    *   type: "cluster",
    *   popupTemplate: {
    *     content: [{
    *       type: "text",
    *       text: "This cluster represents <b>{cluster_count}</b> features."
    *     }, {
    *       type: "text",
    *       text: "The predominant place of worship in this cluster is <b>{cluster_type_religion}</b>."
    *     }]
    *   }
    * };
    * ```
    *
    * [![clustering-types-popup](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/clustering-types-popup.png)](https://developers.arcgis.com/javascript/latest/sample-code/featurereduction-cluster-filter/index.html)
    *
    * **Clusters with visual variables**
    *
    * The following featureReduction configuration assumes the layer's renderer contains visual variables
    * referencing fields named `WIND_SPEED`, `WIND_DIRECT`, `TEMP`.
    *
    * ```js
    * layer.featureReduction = {
    *   type: "cluster",
    *   popupTemplate: {
    *     content: [{
    *       type: "text",
    *       text: "This cluster represents <b>{cluster_count}</b> weather stations."
    *     }, {
    *       type: "fields",
    *       fieldInfos: [{
    *         fieldName: "cluster_avg_WIND_SPEED",
    *         label: "Average wind speed (km/h)",
    *         format: {
    *           places: 0
    *         }
    *       }, {
    *         fieldName: "cluster_avg_WIND_DIRECT",
    *         label: "Average wind direction (degrees)",
    *           format: {
    *             places: 0
    *           }
    *       }, {
    *           fieldName: "cluster_avg_TEMP",
    *           label: "Average temperature (°F)",
    *           format: {
    *            places: 0
    *           }
    *        }]
    *     }]
    *   }
    * };
    * ```
    *
    * [![clustering-color-size-popup](https://developers.arcgis.com/javascript/assets/img/apiref/layers/clustering/clustering-color-size-popup.png)](https://developers.arcgis.com/javascript/latest/sample-code/featurereduction-cluster-visualvariables/index.html)
    *
    *
    * > **Known Limitations**  Aggregate fields referring to values in renderers calculated with a `normalizationField` or `valueExpression` are not supported. Support for these scenarios is coming at a future release.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#popupTemplate)
    */
  var popupTemplate: PopupTemplate = js.native
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#type)
    */
  var `type`: cluster = js.native
}

