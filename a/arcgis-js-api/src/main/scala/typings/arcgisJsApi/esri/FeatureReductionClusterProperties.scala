package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.cluster
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FeatureReductionClusterProperties extends js.Object {
  /**
    * Defines the radius in points (or pixels if specified) of each area in which multiple points will be grouped and visualized as a single cluster.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#clusterRadius)
    *
    * @default 60
    */
  var clusterRadius: js.UndefOr[Double | String] = js.undefined
  /**
    * The [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html) to apply to clustered graphics. When set, a popupTemplate independent of the [layer.popupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#popupTemplate) is used. This popup can display summary information for the cluster, including the count of all features in the cluster and the average or predominant values of fields mapped by the renderer.  The table below describes the aggregate fields used internally by the cluster renderer, which you can reference in the cluster popup.  Aggregate fields:
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
  var popupTemplate: js.UndefOr[PopupTemplateProperties] = js.undefined
  /**
    * The feature reduction type.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureReductionCluster.html#type)
    */
  var `type`: js.UndefOr[cluster] = js.undefined
}

object FeatureReductionClusterProperties {
  @scala.inline
  def apply(
    clusterRadius: Double | String = null,
    popupTemplate: PopupTemplateProperties = null,
    `type`: cluster = null
  ): FeatureReductionClusterProperties = {
    val __obj = js.Dynamic.literal()
    if (clusterRadius != null) __obj.updateDynamic("clusterRadius")(clusterRadius.asInstanceOf[js.Any])
    if (popupTemplate != null) __obj.updateDynamic("popupTemplate")(popupTemplate.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[FeatureReductionClusterProperties]
  }
}

