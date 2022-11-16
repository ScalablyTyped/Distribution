package typings.arcgisJsApi.esri

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NetworkSystemLayers
  extends StObject
     with Accessor {
  
  /**
    * The layer ID of the service containing the utility network's [dirty areas](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/dirty-areas-in-a-utility-network.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NetworkSystemLayers.html#dirtyAreasLayerId)
    */
  val dirtyAreasLayerId: Double = js.native
  
  /**
    * The service url containing the utility network's [dirty areas](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/dirty-areas-in-a-utility-network.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NetworkSystemLayers.html#dirtyAreasLayerUrl)
    */
  val dirtyAreasLayerUrl: String = js.native
  
  /**
    * The layer ID of the service containing the network rules table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NetworkSystemLayers.html#rulesTableId)
    */
  val rulesTableId: Double = js.native
  
  /**
    * The service url containing the network rules table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NetworkSystemLayers.html#rulesTableUrl)
    */
  val rulesTableUrl: String = js.native
  
  /**
    * The layer ID of the service containing the utility network's [Subnetworks table](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks-table.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NetworkSystemLayers.html#subnetworksTableId)
    */
  val subnetworksTableId: Double = js.native
  
  /**
    * The service url containing the utility network's [Subnetworks table](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks-table.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-NetworkSystemLayers.html#subnetworksTableUrl)
    */
  val subnetworksTableUrl: String = js.native
}
