package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.utility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UtilityNetwork
  extends StObject
     with Network {
  
  /**
    * Returns all the [domain networks](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/domain-network.htm) in the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#domainNetworkNames)
    */
  val domainNetworkNames: js.Array[String] = js.native
  
  /**
    * All devices features have terminal configurations (default single terminal).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#getTerminalConfiguration)
    */
  def getTerminalConfiguration(feature: Graphic): TerminalConfiguration = js.native
  
  /**
    * Takes the name of a domain network and returns an array with the names of its tiers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#getTierNames)
    */
  def getTierNames(domainNetworkName: String): js.Array[String] = js.native
  
  /**
    * The layer id of the service containing the utility network rules table.
    *
    * @deprecated since version 4.25. Use [networkSystemLayers.rulesTableId](#networkSystemLayers) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#rulesTableId)
    */
  val rulesTableId: Double = js.native
  
  /**
    * The service url containing the utility network rules table.
    *
    * @deprecated since version 4.25. Use [networkSystemLayers.rulesTableUrl](#networkSystemLayers) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#rulesTableUrl)
    */
  val rulesTableUrl: String = js.native
  
  /**
    * The layer id of the service territory class used to define the extent of the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#serviceTerritoryFeatureLayerId)
    */
  val serviceTerritoryFeatureLayerId: Double = js.native
  
  /**
    * This property returns the list of trace configurations shared on the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#sharedNamedTraceConfigurations)
    */
  var sharedNamedTraceConfigurations: js.Array[NamedTraceConfiguration] = js.native
  
  /**
    * The layer id of the service containing the utility network's [Subnetworks table](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks-table.htm).
    *
    * @deprecated since version 4.25. Use [networkSystemLayers.subnetworksTableId](#networkSystemLayers) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#subnetworksTableId)
    */
  val subnetworksTableId: Double = js.native
  
  /**
    * The service url containing the utility network's [Subnetworks table](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks-table.htm).
    *
    * @deprecated since version 4.25. Use [networkSystemLayers.subnetworksTableUrl](#networkSystemLayers) instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#subnetworksTableUrl)
    */
  val subnetworksTableUrl: String = js.native
  
  /**
    * Returns all the terminal configurations on the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#terminalConfigurations)
    */
  val terminalConfigurations: js.Array[TerminalConfiguration] = js.native
  
  /**
    * The type of the dataset.
    *
    * @default "utility"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#type)
    */
  @JSName("type")
  val type_UtilityNetwork: utility = js.native
}
