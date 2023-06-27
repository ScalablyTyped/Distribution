package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.utility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network
  extends StObject
     with Accessor
     with JSONSupport
     with Loadable {
  
  /**
  		 * The full network definition, accessible only when the network is loaded.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#dataElement)
  		 */
  var dataElement: Any = js.native
  
  /**
  		 * The physical dataset name of the network as defined in the backend database.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#datasetName)
  		 */
  val datasetName: String = js.native
  
  /**
  		 * Returns the root feature service url which this network is part of.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#featureServiceUrl)
  		 */
  val featureServiceUrl: String = js.native
  
  /**
  		 * The full extent of the network, defined from the service territory used to create the network.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#fullExtent)
  		 */
  var fullExtent: Extent = js.native
  
  /**
  		 * The network consists of sources (classes) and each source has a unique Id.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#getLayerIdBySourceId)
  		 */
  def getLayerIdBySourceId(id: Double): Double = js.native
  
  /**
  		 * Random unique id (UUID) to identify a network as defined in the webmap spec.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#id)
  		 */
  var id: String = js.native
  
  /**
  		 * The layer id of the network.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#layerId)
  		 */
  val layerId: Double = js.native
  
  /**
  		 * The full url to the network layer id as defined in the webmap spec.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#layerUrl)
  		 */
  var layerUrl: String = js.native
  
  /**
  		 * Indicates whether the network instance has loaded.
  		 *
  		 * @default false
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#loaded)
  		 */
  val loaded: Boolean = js.native
  
  /**
  		 * Returns the url of network server.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#networkServiceUrl)
  		 */
  val networkServiceUrl: String = js.native
  
  /**
  		 * Contains the url and IDs of the utility network rules, subnetworks, and dirty areas tables or layers.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#networkSystemLayers)
  		 */
  val networkSystemLayers: NetworkSystemLayers = js.native
  
  /**
  		 * The portal user owner of the network.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#owner)
  		 */
  val owner: String = js.native
  
  /**
  		 * Converts url to a url object
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#parsedUrl)
  		 */
  val parsedUrl: String = js.native
  
  /**
  		 * Named trace configurations allow you to add and store complex traces in a network that can be shared across an organization through web maps and consumed by web and field applications.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#queryNamedTraceConfigurations)
  		 */
  def queryNamedTraceConfigurations(): js.Promise[js.Array[NamedTraceConfiguration]] = js.native
  def queryNamedTraceConfigurations(query: scala.Unit, options: RequestOptions): js.Promise[js.Array[NamedTraceConfiguration]] = js.native
  def queryNamedTraceConfigurations(query: NetworkQueryNamedTraceConfigurationsQuery): js.Promise[js.Array[NamedTraceConfiguration]] = js.native
  def queryNamedTraceConfigurations(query: NetworkQueryNamedTraceConfigurationsQuery, options: RequestOptions): js.Promise[js.Array[NamedTraceConfiguration]] = js.native
  
  /**
  		 * The schema version of the network.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#schemaGeneration)
  		 */
  val schemaGeneration: Double = js.native
  
  var sourceJSON: Any = js.native
  
  /**
  		 * The spatial reference of the network, defined at the creation of the network, usually from the service territory class.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#spatialReference)
  		 */
  var spatialReference: SpatialReference = js.native
  
  /**
  		 * Whenever the network is edited or modified, the network and its features become out of date in the [network topology](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/about-network-topology.htm).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#submitTopologyValidationJob)
  		 */
  def submitTopologyValidationJob(parameters: ValidateTopologyProps): js.Promise[TopologyValidationJobInfo] = js.native
  def submitTopologyValidationJob(parameters: ValidateTopologyProps, options: RequestOptions): js.Promise[TopologyValidationJobInfo] = js.native
  
  /**
  		 * The name of the network as defined in the webmap spec.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#title)
  		 */
  var title: String = js.native
  
  /**
  		 * The type of the dataset.
  		 *
  		 * @default utility
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#type)
  		 */
  val `type`: utility | typings.arcgisJsApi.arcgisJsApiStrings.trace = js.native
  
  /**
  		 * Whenever the network is edited or modified, the network and its features become out of date in the [network topology]( https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/about-network-topology.htm).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#validateTopology)
  		 */
  def validateTopology(parameters: ValidateTopologyProps): js.Promise[ValidateNetworkTopologyResult] = js.native
  def validateTopology(parameters: ValidateTopologyProps, options: RequestOptions): js.Promise[ValidateNetworkTopologyResult] = js.native
}
