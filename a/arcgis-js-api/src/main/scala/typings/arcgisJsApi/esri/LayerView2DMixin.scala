package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LayerView2DMixin extends StObject {
  
  /**
  		 * A list of attribute fields fetched for each feature including fields required for layer's `renderer` `labelingInfo`, `elevationInfo`, and additional fields defined on the `outFields` properties.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#availableFields)
  		 */
  val availableFields: js.Array[String] = js.native
  
  /**
  		 * Creates query parameter object that can be used to [fetch aggregate features](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#queryAggregates) as they are being displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#createAggregateQuery)
  		 */
  def createAggregateQuery(): Query_ = js.native
  
  /**
  		 * Creates a query parameter object that can be used to fetch features as they are being displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#createQuery)
  		 */
  def createQuery(): Query_ = js.native
  
  /**
  		 * The featureEffect can be used to draw attention features of interest.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#featureEffect)
  		 */
  var featureEffect: FeatureEffect = js.native
  
  /**
  		 * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#timeExtent) filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#filter)
  		 */
  var filter: FeatureFilter = js.native
  
  /**
  		 * The maximum number of features that can be displayed at a time.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#maximumNumberOfFeatures)
  		 */
  var maximumNumberOfFeatures: Double = js.native
  
  /**
  		 * Signifies whether the maximum number of features has been exceeded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#maximumNumberOfFeaturesExceeded)
  		 */
  var maximumNumberOfFeaturesExceeded: Boolean = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against aggregate features (i.e.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#queryAggregates)
  		 */
  def queryAggregates(): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: scala.Unit, options: LayerView2DMixinQueryAggregatesOptions): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: QueryProperties, options: LayerView2DMixinQueryAggregatesOptions): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: Query_): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: Query_, options: LayerView2DMixinQueryAggregatesOptions): js.Promise[FeatureSet] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#queryExtent)
  		 */
  def queryExtent(): js.Promise[Any] = js.native
  def queryExtent(query: scala.Unit, options: LayerView2DMixinQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties, options: LayerView2DMixinQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: Query_): js.Promise[Any] = js.native
  def queryExtent(query: Query_, options: LayerView2DMixinQueryExtentOptions): js.Promise[Any] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns the number of features that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#queryFeatureCount)
  		 */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: scala.Unit, options: LayerView2DMixinQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: LayerView2DMixinQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_, options: LayerView2DMixinQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#queryFeatures)
  		 */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: scala.Unit, options: LayerView2DMixinQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: LayerView2DMixinQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_, options: LayerView2DMixinQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns array of the ObjectIDs of features that satisfy the input query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-LayerView2DMixin.html#queryObjectIds)
  		 */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, options: LayerView2DMixinQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: LayerView2DMixinQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, options: LayerView2DMixinQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
}
