package typings
package arcgisDashJsDashApiLib.underscoreUnderscoreEsriNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CSVLayerView extends LayerView {
  /**
    * The effect applied to the layer view. The effect allows for the selection of features via a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter), and an [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) are applied to those features that respectively pass or fail the filter requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#effect)
    */
  var effect: FeatureEffect = js.native
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter. Only the features that satisfy the filter are displayed on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#filter)
    */
  var filter: FeatureFilter = js.native
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to SceneView. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: scala.Double = js.native
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: scala.Boolean = js.native
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#highlight)
    *
    * @param target The feature(s) to highlight. When passing a graphic or array of graphics, each feature must have a valid `objectID`. You may alternatively pass one or more objectIDs as a single number or an array.
    *
    */
  def highlight(): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  def highlight(target: js.Array[scala.Double | Graphic]): Handle = js.native
  def highlight(target: scala.Double): Handle = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    * > **Known Limitations**
    *   * Queries with `outStatistics` and any other parameter involving statistics are currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#queryExtent)
    *
    * @param params Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    *
    */
  def queryExtent(): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def queryExtent(params: Query): arcgisDashJsDashApiLib.IPromise[_] = js.native
  def queryExtent(params: QueryProperties): arcgisDashJsDashApiLib.IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns the number of features that satisfy the query. If query parameters are not provided, the count of all features available for drawing is returned.
    * > **Known Limitations**
    *   * Queries with `outStatistics` and any other parameter involving statistics are currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#queryFeatureCount)
    *
    * @param params Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    *
    */
  def queryFeatureCount(): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  def queryFeatureCount(params: Query): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  def queryFeatureCount(params: QueryProperties): arcgisDashJsDashApiLib.IPromise[scala.Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). If query parameters are not provided, all features available for drawing are returned.
    * > **Known Limitations**
    *   * Queries with `outStatistics` and any other parameter involving statistics are currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#queryFeatures)
    *
    * @param params Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    *
    */
  def queryFeatures(): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(params: Query): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  def queryFeatures(params: QueryProperties): arcgisDashJsDashApiLib.IPromise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns array of the ObjectIDs of features that satisfy the input query. If query parameters are not provided, the ObjectIDs of all features available for drawing are returned.
    * > **Known Limitations**
    *   * Queries with `outStatistics` and any other parameter involving statistics are currently not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#queryObjectIds)
    *
    * @param params Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    *
    */
  def queryObjectIds(): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
  def queryObjectIds(params: Query): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
  def queryObjectIds(params: QueryProperties): arcgisDashJsDashApiLib.IPromise[js.Array[scala.Double]] = js.native
}

