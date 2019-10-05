package typings.arcgisDashJsDashApi.__esri

import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GeoJSONLayerView extends LayerView {
  /**
    * The effect applied to the layer view. The effect allows for the selection of features via a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter), and an [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) are applied to those features that respectively pass or fail the filter requirements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#effect)
    */
  var effect: FeatureEffect = js.native
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter. Only the features that satisfy the filter are displayed on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#filter)
    */
  var filter: FeatureFilter = js.native
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to SceneView. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: Double = js.native
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: Boolean = js.native
  /**
    * Creates a query parameter object that can be used to fetch features as they are being displayed. It sets the query parameter's [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields) property to `["*"]` and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry) to `true`. The output spatial reference [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) is set to the spatial reference of the view. Parameters of the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#filter) currently applied to the layerview are also incorporated in the returned query object. The results will include geometries of features and values for all fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#createQuery)
    *
    *
    */
  def createQuery(): Query = js.native
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#highlight)
    *
    * @param target The feature(s) to highlight. When passing a graphic or array of graphics, each feature must have a valid `objectID`. You may alternatively pass one or more objectIDs as a single number or an array.
    *
    */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Double | Graphic]): Handle = js.native
  def highlight(target: Double): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#queryExtent)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryExtent(): IPromise[_] = js.native
  def queryExtent(query: Query): IPromise[_] = js.native
  def queryExtent(query: QueryProperties): IPromise[_] = js.native
  def queryExtent(query: QueryProperties, options: GeoJSONLayerViewQueryExtentOptions): IPromise[_] = js.native
  def queryExtent(query: Query, options: GeoJSONLayerViewQueryExtentOptions): IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns the number of features that satisfy the query. If query parameters are not provided, the count of all features available for drawing is returned.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#queryFeatureCount)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatureCount(): IPromise[Double] = js.native
  def queryFeatureCount(query: Query): IPromise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): IPromise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: GeoJSONLayerViewQueryFeatureCountOptions): IPromise[Double] = js.native
  def queryFeatureCount(query: Query, options: GeoJSONLayerViewQueryFeatureCountOptions): IPromise[Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). If query parameters are not provided, all features available for drawing are returned.
    * > **Known Limitations**
    *   * Attribute values used in attribute queries executed against layer views are case sensitive.
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#queryFeatures)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatures(): IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query): IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: GeoJSONLayerViewQueryFeaturesOptions): IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: GeoJSONLayerViewQueryFeaturesOptions): IPromise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns array of the ObjectIDs of features that satisfy the input query. If query parameters are not provided, the ObjectIDs of all features available for drawing are returned.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the layer view has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-GeoJSONLayerView.html#queryObjectIds)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryObjectIds(): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: GeoJSONLayerViewQueryObjectIdsOptions): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: GeoJSONLayerViewQueryObjectIdsOptions): IPromise[js.Array[Double]] = js.native
}

