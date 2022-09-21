package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.arcgisJsApiStrings.utility
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor, it was renamed because a distinct type already exists with the same name. */
@JSGlobal("__esri.UtilityNetwork")
@js.native
/**
  * This class contains metadata about the utility network dataset retrieved from a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html)
  */
open class UtilityNetworkCls ()
  extends StObject
     with typings.arcgisJsApi.esri.UtilityNetwork {
  def this(properties: Any) = this()
  
  /**
    * Returns all the [domain networks](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/domain-network.htm) in the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#domainNetworkNames)
    */
  /* CompleteClass */
  override val domainNetworkNames: js.Array[String] = js.native
  
  /**
    * All devices features have terminal configurations (default single terminal).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#getTerminalConfiguration)
    */
  /* CompleteClass */
  override def getTerminalConfiguration(feature: typings.arcgisJsApi.esri.Graphic): typings.arcgisJsApi.esri.TerminalConfiguration = js.native
  
  /**
    * Takes the name of a domain network and returns an array with the names of its tiers.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#getTierNames)
    */
  /* CompleteClass */
  override def getTierNames(domainNetworkName: String): js.Array[String] = js.native
  
  /**
    * Triggers the loading of the UtilityNetwork instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#load)
    */
  /* CompleteClass */
  override def load(): js.Promise[Any] = js.native
  
  /**
    * The layer id of the service containing the utility network rules table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#rulesTableId)
    */
  /* CompleteClass */
  override val rulesTableId: Double = js.native
  
  /**
    * The service url containing the utility network rules table.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#rulesTableUrl)
    */
  /* CompleteClass */
  override val rulesTableUrl: String = js.native
  
  /**
    * The layer id of the service territory class used to define the extent of the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#serviceTerritoryFeatureLayerId)
    */
  /* CompleteClass */
  override val serviceTerritoryFeatureLayerId: Double = js.native
  
  /**
    * This property returns the list of trace configurations shared on the webmap.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#sharedNamedTraceConfigurations)
    */
  /* CompleteClass */
  var sharedNamedTraceConfigurations: js.Array[typings.arcgisJsApi.esri.NamedTraceConfiguration] = js.native
  
  /**
    * The layer id of the service containing the utility network's [Subnetworks table](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks-table.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#subnetworksTableId)
    */
  /* CompleteClass */
  override val subnetworksTableId: Double = js.native
  
  /**
    * The service url containing the utility network's [Subnetworks table](https://pro.arcgis.com/en/pro-app/latest/help/data/utility-network/subnetworks-table.htm).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#subnetworksTableUrl)
    */
  /* CompleteClass */
  override val subnetworksTableUrl: String = js.native
  
  /**
    * Returns all the terminal configurations on the utility network.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#terminalConfigurations)
    */
  /* CompleteClass */
  override val terminalConfigurations: js.Array[typings.arcgisJsApi.esri.TerminalConfiguration] = js.native
  
  /**
    * The type of the dataset.
    *
    * @default "utility"
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html#type)
    */
  /* CompleteClass */
  override val `type`: utility = js.native
}
