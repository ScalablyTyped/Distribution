package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.IPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FeatureLayerView extends LayerView {
  /**
    * A list of attribute fields fetched for each feature including fields required for layer [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#renderer), [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#labelingInfo), [elevation info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#elevationInfo), and additional fields defined on the [FeatureLayer.outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#outFields). The availableFields is populated when the layer view is finished [updating](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#updating). Use this list when setting [client-side filtering](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter) or querying features on the [client-side](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#availableFields)
    */
  val availableFields: js.Array[String] = js.native
  /**
    * The effect applied to the layer view. The effect allows for the selection of features via a [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#filter), and an [includedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#includedEffect) and [excludedEffect](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureEffect.html#excludedEffect) are applied to those features that respectively pass or fail the filter requirements.
    * > **Known Limitations**  FeatureEffect is not supported in 3D [SceneViews](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-SceneView.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#effect)
    */
  var effect: FeatureEffect = js.native
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter. Only the features that satisfy the filter are displayed on the view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter)
    */
  var filter: FeatureFilter = js.native
  /**
    * The layer being viewed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#layer)
    */
  @JSName("layer")
  val layer_FeatureLayerView: FeatureLayer = js.native
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to SceneView. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: Double = js.native
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to SceneView.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: Boolean = js.native
  /**
    * Creates query parameter object that can be used to fetch features as they are being displayed. It sets the query parameter's [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields) property to `["*"]` and [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry) to `true`. The output spatial reference [outSpatialReference](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outSpatialReference) is set to the spatial reference of the view. Parameters of the [filter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#filter) currently applied to the layerview are also incorporated in the returned query object. The results will include geometries of features and values for [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#availableFields).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#createQuery)
    *
    *
    */
  def createQuery(): Query = js.native
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#highlight)
    *
    * @param target The feature(s) to highlight. When passing a graphic or array of graphics, each feature must have a valid `objectID`. You may alternatively pass one or more objectIDs as a single number or an array.
    *
    */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Double | Graphic]): Handle = js.native
  def highlight(target: Double): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. Valid only for [hosted feature services](http://doc.arcgis.com/en/arcgis-online/share-maps/hosted-web-layers.htm) on [arcgis.com](http://arcgis.com) and for ArcGIS Server 10.3.1 and later. If query parameters are not provided, the extent and count of all features available for drawing are returned.  To query for the extent of features directly from a Feature Service rather than those visible in the view, you must use the [FeatureLayer.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryExtent) method.
    * > **Known Limitations**
    *   * Spatial queries are executed against quantized geometries in the layer view. The resolution of layer view geometries, is only as precise as the scale resolution of the view. Therefore, the results of the same query could be different when executed at different scales. This also means that geometries returned from any layer view query will likewise be at the same scale resolution of the view.
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the FeatureLayerView has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryExtent)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryExtent(): IPromise[_] = js.native
  def queryExtent(query: Query): IPromise[_] = js.native
  def queryExtent(query: QueryProperties): IPromise[_] = js.native
  def queryExtent(query: QueryProperties, options: FeatureLayerViewQueryExtentOptions): IPromise[_] = js.native
  def queryExtent(query: Query, options: FeatureLayerViewQueryExtentOptions): IPromise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns the number of features that satisfy the query. If query parameters are not provided, the count of all features available for drawing is returned.  To query for the count of features directly from a Feature Service rather than those visible in the view, you must use the [FeatureLayer.queryFeatureCount()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatureCount) method.
    * > **Known Limitations**
    *   * Spatial queries are executed against quantized geometries in the layer view. The resolution of layer view geometries, is only as precise as the scale resolution of the view. Therefore, the results of the same query could be different when executed at different scales. This also means that geometries returned from any layer view query will likewise be at the same scale resolution of the view.
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the FeatureLayerView has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatureCount)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatureCount(): IPromise[Double] = js.native
  def queryFeatureCount(query: Query): IPromise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): IPromise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: FeatureLayerViewQueryFeatureCountOptions): IPromise[Double] = js.native
  def queryFeatureCount(query: Query, options: FeatureLayerViewQueryFeatureCountOptions): IPromise[Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). If query parameters are not provided, all features available for drawing are returned along with their attributes specified in [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#availableFields). For client-side attribute queries, relevant fields must exist in [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#availableFields) list for the query to be successful.  To execute a query against all the features in a Feature Service rather than only those in the client, you must use the [FeatureLayer.queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryFeatures) method.
    * > **Known Limitations**
    *   * Attribute values used in attribute queries executed against layer views are case sensitive.
    *   * Spatial queries are executed against quantized geometries in the layer view. The resolution of layer view geometries, is only as precise as the scale resolution of the view. Therefore, the results of the same query could be different when executed at different scales. This also means that geometries returned from any layer view query will likewise be at the same scale resolution of the view.
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the FeatureLayerView has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gsterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryFeatures)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned along with their attributes specified in [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#availableFields). To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatures(): IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query): IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): IPromise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: FeatureLayerViewQueryFeaturesOptions): IPromise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: FeatureLayerViewQueryFeaturesOptions): IPromise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns array of the ObjectIDs of features that satisfy the input query. If query parameters are not provided, the ObjectIDs of all features available for drawing are returned.  To query for ObjectIDs of features directly from a Feature Service rather than those visible in the view, you must use the [FeatureLayer.queryObjectIds()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-FeatureLayer.html#queryObjectIds) method.
    * > **Known Limitations**
    *   * Spatial queries are executed against quantized geometries in the layer view. The resolution of layer view geometries, is only as precise as the scale resolution of the view. Therefore, the results of the same query could be different when executed at different scales. This also means that geometries returned from any layer view query will likewise be at the same scale resolution of the view.
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries are not currently supported if the FeatureLayerView has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) – Malaysia
    *   * Gusterberg (Ferro) (8042) – Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-FeatureLayerView.html#queryObjectIds)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryObjectIds(): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: FeatureLayerViewQueryObjectIdsOptions): IPromise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: FeatureLayerViewQueryObjectIdsOptions): IPromise[js.Array[Double]] = js.native
}

@JSGlobal("__esri.FeatureLayerView")
@js.native
object FeatureLayerView extends TopLevel[FeatureLayerViewConstructor]

