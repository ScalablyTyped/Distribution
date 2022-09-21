package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.utility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Network
  extends StObject
     with Accessor
     with Loadable
     with JSONSupport {
  
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
}
