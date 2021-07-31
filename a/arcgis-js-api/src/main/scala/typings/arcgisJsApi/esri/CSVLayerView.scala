package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CSVLayerView
  extends StObject
     with LayerView {
  
  /**
    * A list of attribute fields fetched for each feature including fields required for layer [rendering](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#renderer), [labeling](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#labelingInfo), [elevation info](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#elevationInfo), and additional fields defined on the [CSVLayer.outFields](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-CSVLayer.html#outFields).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#availableFields)
    */
  val availableFields: js.Array[String] = js.native
  
  /**
    * Creates a query parameter object that can be used to fetch features as they are being displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#createQuery)
    */
  def createQuery(): Query = js.native
  
  /**
    * The effect applied to the layer view.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#effect)
    */
  var effect: FeatureEffect = js.native
  
  /**
    * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-support-FeatureFilter.html#timeExtent) filter.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#filter)
    */
  var filter: FeatureFilter = js.native
  
  /**
    * Highlights the given feature(s).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#highlight)
    */
  def highlight(): Handle = js.native
  def highlight(target: js.Array[Double | Graphic]): Handle = js.native
  def highlight(target: Double): Handle = js.native
  def highlight(target: Graphic): Handle = js.native
  
  /**
    * The maximum number of features that can be displayed at a time.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeatures)
    */
  var maximumNumberOfFeatures: Double = js.native
  
  /**
    * Signifies whether the maximum number of features has been exceeded.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#maximumNumberOfFeaturesExceeded)
    */
  var maximumNumberOfFeaturesExceeded: Boolean = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#queryExtent)
    */
  def queryExtent(): js.Promise[js.Any] = js.native
  def queryExtent(query: Unit, options: CSVLayerViewQueryExtentOptions): js.Promise[js.Any] = js.native
  def queryExtent(query: Query): js.Promise[js.Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[js.Any] = js.native
  def queryExtent(query: QueryProperties, options: CSVLayerViewQueryExtentOptions): js.Promise[js.Any] = js.native
  def queryExtent(query: Query, options: CSVLayerViewQueryExtentOptions): js.Promise[js.Any] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns the number of features that satisfy the query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#queryFeatureCount)
    */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: Unit, options: CSVLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: CSVLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query, options: CSVLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-FeatureSet.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#queryFeatures)
    */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Unit, options: CSVLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: CSVLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query, options: CSVLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
    * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-tasks-support-Query.html) against features available for drawing in the layer view and returns array of the ObjectIDs of features that satisfy the input query.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-CSVLayerView.html#queryObjectIds)
    */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Unit, options: CSVLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: CSVLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query, options: CSVLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
}
