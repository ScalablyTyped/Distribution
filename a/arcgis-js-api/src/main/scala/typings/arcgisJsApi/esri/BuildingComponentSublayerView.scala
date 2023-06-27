package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BuildingComponentSublayerView
  extends StObject
     with Accessor {
  
  /**
  		 * A list of attribute fields fetched for each feature including fields required for layer [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#renderer) and additional fields defined on the [BuildingComponentSublayer.outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields) or [BuildingSceneLayer.outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html#outFields).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#availableFields)
  		 */
  val availableFields: js.Array[String] = js.native
  
  /**
  		 * Creates a query parameter object that can be used to fetch features as they are being displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#createQuery)
  		 */
  def createQuery(): Query_ = js.native
  
  /**
  		 * Applies a client-side [FeatureFilter](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html) to the displayed data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#filter)
  		 */
  var filter: FeatureFilter = js.native
  
  /**
  		 * Highlights the given feature(s).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#highlight)
  		 */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Double | Graphic]): Handle = js.native
  def highlight(target: Double): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features in the layer view and returns the 3D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
  		 *
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features in the layer view and returns the 3D [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query. If query parameters are not provided, the extent and count of all loaded features are returned.	 Read more about queries in the Query section of the [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) class description.	 To query for the extent of features directly from a Scene Service rather than those loaded for the current view, you must use the [BuildingComponentSublayer.queryExtent()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#queryExtent) method.	For making attribute based queries on a BuildingComponentSublayerView you need to specify the required fields in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields) property of the BuildingComponentSublayer to ensure that attribute values are available on the client for querying. You can use [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#availableFields) to inspect which fields are available on the client. [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#queryExtent)
  		 */
  def queryExtent(): js.Promise[Any] = js.native
  def queryExtent(query: scala.Unit, options: BuildingComponentSublayerViewQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties, options: BuildingComponentSublayerViewQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: Query_): js.Promise[Any] = js.native
  def queryExtent(query: Query_, options: BuildingComponentSublayerViewQueryExtentOptions): js.Promise[Any] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features in the layer view and returns the number of features that satisfy the query.
  		 *
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features in the layer view and returns the number of features that satisfy the query. If query parameters are not provided, the count of all loaded features is returned.	 To query for the count of features directly from a Scene Service rather than those loaded for the current view, you must use the [BuildingComponentSublayer.queryFeatureCount()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#queryFeatureCount) method.	 For making attribute based queries on a BuildingSceneLayerView you need to specify the required fields in the [outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-buildingSublayers-BuildingComponentSublayer.html#outFields) property of the BuildingComponentSublayer to ensure that attribute values are available on the client for querying. You can use [availableFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#availableFields) to inspect which fields are available on the client. Read more about queries in the Query section of the [BuildingSceneLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-BuildingSceneLayer.html) class description. [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#queryFeatureCount)
  		 */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: scala.Unit, options: BuildingComponentSublayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: BuildingComponentSublayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_, options: BuildingComponentSublayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features in the layer view and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#queryFeatures)
  		 */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: scala.Unit, options: BuildingComponentSublayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: BuildingComponentSublayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_, options: BuildingComponentSublayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features in the layer view and returns an array of the ObjectIDs of features that satisfy the input query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#queryObjectIds)
  		 */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, options: BuildingComponentSublayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: BuildingComponentSublayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, options: BuildingComponentSublayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
  		 * The sublayer being viewed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#sublayer)
  		 */
  val sublayer: BuildingComponentSublayer = js.native
  
  /**
  		 * Value is `true` if the sublayer is suspended (i.e., sublayer will not redraw or update itself when the extent changes).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#suspended)
  		 */
  val suspended: Boolean = js.native
  
  /**
  		 * Value is `true` when the sublayer is updating; for example, if it is in the process of fetching data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-BuildingComponentSublayerView.html#updating)
  		 */
  val updating: Boolean = js.native
}
