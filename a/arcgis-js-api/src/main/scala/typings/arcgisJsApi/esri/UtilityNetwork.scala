package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.utility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UtilityNetwork extends StObject {
  
  /**
    * Returns all the [domain networks](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/domain-network.htm) in the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#domainNetworkNames)
    */
  val domainNetworkNames: js.Array[String]
  
  /**
    * All devices features have terminal configurations (default single terminal).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#getTerminalConfiguration)
    */
  def getTerminalConfiguration(feature: Graphic): TerminalConfiguration
  
  /**
    * Takes the name of a domain network and returns an array with the names of its tiers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#getTierNames)
    */
  def getTierNames(domainNetworkName: String): js.Array[String]
  
  /**
    * Triggers the loading of the UtilityNetwork instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#load)
    */
  def load(): js.Promise[Any]
  
  /**
    * The layer id of the service containing the utility network rules table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#rulesTableId)
    */
  val rulesTableId: Double
  
  /**
    * The service url containing the utility network rules table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#rulesTableUrl)
    */
  val rulesTableUrl: String
  
  /**
    * The layer id of the service territory class used to define the extent of the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#serviceTerritoryFeatureLayerId)
    */
  val serviceTerritoryFeatureLayerId: Double
  
  /**
    * This property returns the list of trace configurations shared on the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#sharedNamedTraceConfigurations)
    */
  var sharedNamedTraceConfigurations: js.Array[NamedTraceConfiguration]
  
  /**
    * The layer id of the service containing the utility network's [Subnetworks table](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks-table.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#subnetworksTableId)
    */
  val subnetworksTableId: Double
  
  /**
    * The service url containing the utility network's [Subnetworks table](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks-table.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#subnetworksTableUrl)
    */
  val subnetworksTableUrl: String
  
  /**
    * Returns all the terminal configurations on the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#terminalConfigurations)
    */
  val terminalConfigurations: js.Array[TerminalConfiguration]
  
  /**
    * The type of the dataset.
    *
    * @default "utility"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#type)
    */
  val `type`: utility
}
object UtilityNetwork {
  
  inline def apply(
    domainNetworkNames: js.Array[String],
    getTerminalConfiguration: Graphic => TerminalConfiguration,
    getTierNames: String => js.Array[String],
    load: () => js.Promise[Any],
    rulesTableId: Double,
    rulesTableUrl: String,
    serviceTerritoryFeatureLayerId: Double,
    sharedNamedTraceConfigurations: js.Array[NamedTraceConfiguration],
    subnetworksTableId: Double,
    subnetworksTableUrl: String,
    terminalConfigurations: js.Array[TerminalConfiguration]
  ): UtilityNetwork = {
    val __obj = js.Dynamic.literal(domainNetworkNames = domainNetworkNames.asInstanceOf[js.Any], getTerminalConfiguration = js.Any.fromFunction1(getTerminalConfiguration), getTierNames = js.Any.fromFunction1(getTierNames), load = js.Any.fromFunction0(load), rulesTableId = rulesTableId.asInstanceOf[js.Any], rulesTableUrl = rulesTableUrl.asInstanceOf[js.Any], serviceTerritoryFeatureLayerId = serviceTerritoryFeatureLayerId.asInstanceOf[js.Any], sharedNamedTraceConfigurations = sharedNamedTraceConfigurations.asInstanceOf[js.Any], subnetworksTableId = subnetworksTableId.asInstanceOf[js.Any], subnetworksTableUrl = subnetworksTableUrl.asInstanceOf[js.Any], terminalConfigurations = terminalConfigurations.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("utility")
    __obj.asInstanceOf[UtilityNetwork]
  }
  
  extension [Self <: UtilityNetwork](x: Self) {
    
    inline def setDomainNetworkNames(value: js.Array[String]): Self = StObject.set(x, "domainNetworkNames", value.asInstanceOf[js.Any])
    
    inline def setDomainNetworkNamesVarargs(value: String*): Self = StObject.set(x, "domainNetworkNames", js.Array(value*))
    
    inline def setGetTerminalConfiguration(value: Graphic => TerminalConfiguration): Self = StObject.set(x, "getTerminalConfiguration", js.Any.fromFunction1(value))
    
    inline def setGetTierNames(value: String => js.Array[String]): Self = StObject.set(x, "getTierNames", js.Any.fromFunction1(value))
    
    inline def setLoad(value: () => js.Promise[Any]): Self = StObject.set(x, "load", js.Any.fromFunction0(value))
    
    inline def setRulesTableId(value: Double): Self = StObject.set(x, "rulesTableId", value.asInstanceOf[js.Any])
    
    inline def setRulesTableUrl(value: String): Self = StObject.set(x, "rulesTableUrl", value.asInstanceOf[js.Any])
    
    inline def setServiceTerritoryFeatureLayerId(value: Double): Self = StObject.set(x, "serviceTerritoryFeatureLayerId", value.asInstanceOf[js.Any])
    
    inline def setSharedNamedTraceConfigurations(value: js.Array[NamedTraceConfiguration]): Self = StObject.set(x, "sharedNamedTraceConfigurations", value.asInstanceOf[js.Any])
    
    inline def setSharedNamedTraceConfigurationsVarargs(value: NamedTraceConfiguration*): Self = StObject.set(x, "sharedNamedTraceConfigurations", js.Array(value*))
    
    inline def setSubnetworksTableId(value: Double): Self = StObject.set(x, "subnetworksTableId", value.asInstanceOf[js.Any])
    
    inline def setSubnetworksTableUrl(value: String): Self = StObject.set(x, "subnetworksTableUrl", value.asInstanceOf[js.Any])
    
    inline def setTerminalConfigurations(value: js.Array[TerminalConfiguration]): Self = StObject.set(x, "terminalConfigurations", value.asInstanceOf[js.Any])
    
    inline def setTerminalConfigurationsVarargs(value: TerminalConfiguration*): Self = StObject.set(x, "terminalConfigurations", js.Array(value*))
    
    inline def setType(value: utility): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
