package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OGCFeatureLayerView
  extends StObject
     with LayerView {
  
  /**
    * A list of attribute fields fetched for each feature including fields required for layer [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#renderer), [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#labelingInfo), and [elevation info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-OGCFeatureLayer.html#elevationInfo).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#availableFields)
    */
  val availableFields: js.Array[String] = js.native
  
  /**
    * Creates query parameter object that can be used to [fetch aggregate features](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#queryAggregates) as they are being displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#createAggregateQuery)
    */
  def createAggregateQuery(): Query_ = js.native
  
  /**
    * Creates a query parameter object that can be used to fetch features as they are being displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#createQuery)
    */
  def createQuery(): Query_ = js.native
  
  /**
    * The featureEffect can be used to draw attention features of interest.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#featureEffect)
    */
  var featureEffect: FeatureEffect = js.native
  
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#timeExtent) filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#filter)
    */
  var filter: FeatureFilter = js.native
  
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#highlight)
    */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Double | Graphic]): Handle = js.native
  def highlight(target: Double): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against aggregate features (i.e.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#queryAggregates)
    */
  def queryAggregates(): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: scala.Unit, options: OGCFeatureLayerViewQueryAggregatesOptions): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: QueryProperties, options: OGCFeatureLayerViewQueryAggregatesOptions): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: Query_): js.Promise[FeatureSet] = js.native
  def queryAggregates(query: Query_, options: OGCFeatureLayerViewQueryAggregatesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#queryExtent)
    */
  def queryExtent(): js.Promise[Any] = js.native
  def queryExtent(query: scala.Unit, options: OGCFeatureLayerViewQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties, options: OGCFeatureLayerViewQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: Query_): js.Promise[Any] = js.native
  def queryExtent(query: Query_, options: OGCFeatureLayerViewQueryExtentOptions): js.Promise[Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns the number of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#queryFeatureCount)
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: scala.Unit, options: OGCFeatureLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: OGCFeatureLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_, options: OGCFeatureLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: scala.Unit, options: OGCFeatureLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: OGCFeatureLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_, options: OGCFeatureLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns array of the ObjectIDs of features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-OGCFeatureLayerView.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, options: OGCFeatureLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: OGCFeatureLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, options: OGCFeatureLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
}
