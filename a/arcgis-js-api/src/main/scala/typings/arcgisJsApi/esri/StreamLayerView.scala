package typings.arcgisJsApi.esri

import typings.arcgisJsApi.IHandle
import typings.arcgisJsApi.arcgisJsApiStrings.`data-received`
import typings.arcgisJsApi.arcgisJsApiStrings.`message-received`
import typings.arcgisJsApi.arcgisJsApiStrings.`update-rate`
import typings.arcgisJsApi.arcgisJsApiStrings.connected
import typings.arcgisJsApi.arcgisJsApiStrings.disconnected
import typings.arcgisJsApi.arcgisJsApiStrings.paused
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StreamLayerView
  extends StObject
     with LayerView
     with HighlightLayerViewMixin
     with Evented {
  
  /**
  		 * The error that explains an unsuccessful attempt to connect to the stream service or an unexpected disconnection from the stream service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#connectionError)
  		 */
  val connectionError: Error = js.native
  
  /**
  		 * The status of the Web Socket connection with the stream service.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#connectionStatus)
  		 */
  val connectionStatus: connected | disconnected | paused = js.native
  
  /**
  		 * Creates a query parameter object that can be used to fetch features as they are being displayed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#createQuery)
  		 */
  def createQuery(): Query_ = js.native
  
  /**
  		 * The featureEffect can be used to draw attention features of interest.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#featureEffect)
  		 */
  var featureEffect: FeatureEffect = js.native
  
  /**
  		 * The [attribute](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#where), [geometry](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#geometry), and [time extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-FeatureFilter.html#timeExtent) filter.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#filter)
  		 */
  var filter: FeatureFilter = js.native
  
  @JSName("on")
  def on_datareceived(name: `data-received`, eventHandler: StreamLayerViewDataReceivedEventHandler): IHandle = js.native
  @JSName("on")
  def on_messagereceived(name: `message-received`, eventHandler: StreamLayerViewMessageReceivedEventHandler): IHandle = js.native
  @JSName("on")
  def on_updaterate(name: `update-rate`, eventHandler: StreamLayerViewUpdateRateEventHandler): IHandle = js.native
  
  /**
  		 * Pauses the connection and stops new observations from being applied until [resume()](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#resume) is called.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#pause)
  		 */
  def pause(): scala.Unit = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns the [Extent](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-Extent.html) of features that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#queryExtent)
  		 */
  def queryExtent(): js.Promise[Any] = js.native
  def queryExtent(query: scala.Unit, options: StreamLayerViewQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties): js.Promise[Any] = js.native
  def queryExtent(query: QueryProperties, options: StreamLayerViewQueryExtentOptions): js.Promise[Any] = js.native
  def queryExtent(query: Query_): js.Promise[Any] = js.native
  def queryExtent(query: Query_, options: StreamLayerViewQueryExtentOptions): js.Promise[Any] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns the number of features that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#queryFeatureCount)
  		 */
  def queryFeatureCount(): js.Promise[Double] = js.native
  def queryFeatureCount(query: scala.Unit, options: StreamLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties): js.Promise[Double] = js.native
  def queryFeatureCount(query: QueryProperties, options: StreamLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_): js.Promise[Double] = js.native
  def queryFeatureCount(query: Query_, options: StreamLayerViewQueryFeatureCountOptions): js.Promise[Double] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#queryFeatures)
  		 */
  def queryFeatures(): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: scala.Unit, options: StreamLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: QueryProperties, options: StreamLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_): js.Promise[FeatureSet] = js.native
  def queryFeatures(query: Query_, options: StreamLayerViewQueryFeaturesOptions): js.Promise[FeatureSet] = js.native
  
  /**
  		 * If a [trackIdField](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-TimeInfo.html#trackIdField) is specified on the stream service, this method executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns a [FeatureSet](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-FeatureSet.html) of the latest observations for each `trackId` that satisfy the query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#queryLatestObservations)
  		 */
  def queryLatestObservations(): js.Promise[FeatureSet] = js.native
  def queryLatestObservations(query: scala.Unit, options: StreamLayerViewQueryLatestObservationsOptions): js.Promise[FeatureSet] = js.native
  def queryLatestObservations(query: QueryProperties): js.Promise[FeatureSet] = js.native
  def queryLatestObservations(query: QueryProperties, options: StreamLayerViewQueryLatestObservationsOptions): js.Promise[FeatureSet] = js.native
  def queryLatestObservations(query: Query_): js.Promise[FeatureSet] = js.native
  def queryLatestObservations(query: Query_, options: StreamLayerViewQueryLatestObservationsOptions): js.Promise[FeatureSet] = js.native
  
  /**
  		 * Executes a [Query](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-Query.html) against features available for drawing in the layerView and returns array of the ObjectIDs of features that satisfy the input query.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#queryObjectIds)
  		 */
  def queryObjectIds(): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: scala.Unit, options: StreamLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: QueryProperties, options: StreamLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_): js.Promise[js.Array[Double]] = js.native
  def queryObjectIds(query: Query_, options: StreamLayerViewQueryObjectIdsOptions): js.Promise[js.Array[Double]] = js.native
  
  /**
  		 * Resumes the connection and the new observations will be applied.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-views-layers-StreamLayerView.html#resume)
  		 */
  def resume(): scala.Unit = js.native
}
