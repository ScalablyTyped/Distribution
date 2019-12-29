package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SceneLayerView extends LayerView {
  /**
    * A list of attribute fields fetched for each feature including fields required for layer [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#renderer) and additional fields defined on the [SceneLayer.outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields). The availableFields is populated when the layer view is finished [updating](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#updating). Use this list when querying features on the [client-side](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryFeatures).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields)
    */
  val availableFields: js.Array[String] = js.native
  /**
    * Applies a client-side [FeatureFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html) to the displayed data. Only the features that satisfy the filter are displayed.  For 3D object scene layers, only spatial filters with [spatialRelationship](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#spatialRelationship) set to `contains`, `intersects` or `disjoint` are supported.  The fields to be used for the filter must be present in the layer view's [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields) list.  The [timeExtent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) property is not supported on a SceneLayerView filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#filter)
    */
  var filter: FeatureFilter = js.native
  /**
    * The maximum number of features that can be displayed at a time. This setting currently only applies to point scene layers. By default, the maximum number of features is estimated automatically depending on the symbology, geometry complexity, memory consumption and display quality profile.  Changing this setting to a higher value may lead to a significant decrease in performance and increase in memory usage.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: Double = js.native
  /**
    * Signifies whether the maximum number of features has been exceeded. Not all features could be displayed when this value is `true`. This setting currently only applies to point scene layers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: Boolean = js.native
  /**
    * Creates query parameter object that can be used to fetch features as they are being displayed. It sets the query parameter's [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#outFields) property to `["*"]` amd [returnGeometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#returnGeometry) to `true`. The output spatial reference is set to the spatial reference of the view. The filter that currently applies to the layerview is also incorporated in the returned query object.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#createQuery)
    *
    *
    */
  def createQuery(): Query = js.native
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#highlight)
    *
    * @param target The feature(s) to highlight. When passing a graphic or array of graphics, each feature must have a valid `objectID`. You may alternatively pass one or more objectIDs as a single number or an array.
    *
    */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Double | Graphic]): Handle = js.native
  def highlight(target: Double): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features in the layer view and returns the 3D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. If query parameters are not provided, the extent and count of all loaded features are returned.  Read more about queries in the Query section of the [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) class description.  To query for the extent of features directly from a Scene Service rather than those loaded for the current view, you must use the [SceneLayer.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryExtent) method.  For making attribute based queries on a SceneLayerView you need to specify the required fields in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields) property of the SceneLayer to ensure that attribute values are available on the client for querying. You can use [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields) to inspect which fields are available on the client.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries on 3D Object SceneLayerView use the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the feature and not the footprint when calculating the spatial relationship with the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). As a result a feature might be returned from the query, even though its footprint is not in a spatial relationship with the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#geometry).
    *   * Spatial queries are not currently supported if the SceneLayerView has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) - Malaysia
    *   * Gsterberg (Ferro) (8042) - Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryExtent)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryExtent(): js.Promise[_] = js.native
  def queryExtent(query: Query): js.Promise[_] = js.native
  def queryExtent(query: QueryProperties): js.Promise[_] = js.native
  def queryExtent(query: QueryProperties, options: SceneLayerViewQueryExtentOptions): js.Promise[_] = js.native
  def queryExtent(query: Query, options: SceneLayerViewQueryExtentOptions): js.Promise[_] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features in the layer view and returns the number of features that satisfy the query. If query parameters are not provided, the count of all loaded features is returned. Read more about queries in the [Query]() section of the [SceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html) class description.  To query for the count of features directly from a Scene Service rather than those loaded for the current view, you must use the [SceneLayer.queryFeatureCount()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatureCount) method.  For making attribute based queries on a SceneLayerView you need to specify the required fields in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields) property of the SceneLayer to ensure that attribute values are available on the client for querying. You can use [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields) to inspect which fields are available on the client.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries on 3D Object SceneLayerView use the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the feature and not the footprint when calculating the spatial relationship with the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). As a result a feature might be returned from the query, even though its footprint is not in a spatial relationship with the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#geometry).
    *   * Spatial queries are not currently supported if the SceneLayerView has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) - Malaysia
    *   * Gsterberg (Ferro) (8042) - Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryFeatureCount)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned. To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: SceneLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query, options: SceneLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features in the layer view and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html). If query parameters are not provided, all loaded features are returned.  To execute a query against all the features in a Scene Service rather than only those loaded for the current view, you must use the [SceneLayer.queryFeatures()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryFeatures) method.  For making attribute based queries on a SceneLayerView you need to specify the required fields in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields) property of the SceneLayer to ensure that attribute values are available on the client for querying. You can use [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields) to inspect which fields are available on the client.
    * > **Known Limitations**
    *   * Spatial queries have the same limitations as those listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries on 3D Object SceneLayerView use the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the feature and not the footprint when calculating the spatial relationship with the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). As a result a feature might be returned from the query, even though its footprint is not in a spatial relationship with the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#geometry).
    *   * Spatial queries are not currently supported if the SceneLayerView has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) - Malaysia
    *   * Gsterberg (Ferro) (8042) - Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryFeatures)
    *
    * @param query Specifies the attributes and spatial filter of the query. When no parameters are passed to this method, all features in the client are returned along with their attributes specified in [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields). To only return features visible in the view, set the `geometry` parameter in the query object to the view's extent.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: SceneLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: SceneLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features in the layer view and returns an array of the ObjectIDs of features that satisfy the input query. If query parameters are not provided, the ObjectIDs of all loaded features are returned.  To query for ObjectIDs of features directly from a Scene Service rather than those loaded for the current view, you must use the [SceneLayer.queryObjectIds()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#queryObjectIds) method.  For making attribute based queries on a SceneLayerView you need to specify the required fields in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-SceneLayer.html#outFields) property of the SceneLayer to ensure that attribute values are available on the client for querying. You can use [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#availableFields) to inspect which fields are available on the client.
    * > **Known Limitations**
    *   * Spatial queries have the limitations listed in the [projection engine](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-projection.html) documentation.
    *   * Spatial queries on 3D Object SceneLayerView use the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of the feature and not the footprint when calculating the spatial relationship with the [query geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html#geometry). As a result a feature might be returned from the query, even though its footprint is not in a spatial relationship with the [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#geometry).
    *   * Spatial queries are not currently supported if the SceneLayerView has any of the following [SpatialReferences](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-SpatialReference.html):
    *   * GDM 2000 (4742) - Malaysia
    *   * Gsterberg (Ferro) (8042) - Austria/Czech Republic
    *   * ISN2016 (8086) - Iceland
    *   * SVY21 (4757) - Singapore
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-SceneLayerView.html#queryObjectIds)
    *
    * @param query Specifies the attributes of the query. If query parameters are not provided, all loaded features are returned.
    * @param options An object with the following properties.
    * @param options.signal Signal object that can be used to abort the asynchronous task. The returned promise will be rejected with an [Error](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-Error.html) named `AbortError` when an abort is signaled. See also [AbortController](https://developer.mozilla.org/en-US/docs/Web/API/AbortController) for more information on how to construct a controller that can be used to deliver abort signals.
    *
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: SceneLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: SceneLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
}

