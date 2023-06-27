package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Network
import typings.arcgisJsApi.esri.NetworkFromPortalItemParams
import typings.arcgisJsApi.esri.NetworkProperties
import typings.arcgisJsApi.esri.UtilityNetwork
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriNetworksNetworkMod {
  
  @JSImport("esri/networks/Network", JSImport.Namespace)
  @js.native
  /**
  		 * Class defining high level properties that describes utility networks and trace networks.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html)
  		 */
  open class ^ ()
    extends StObject
       with Network {
    def this(properties: NetworkProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/networks/Network", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Network = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Network]
  
  /**
  		 * Creates a new network instance from an ArcGIS Online or ArcGIS Enterprise [portal item](https://developers.arcgis.com/javascript/latest/api-reference/esri-portal-PortalItem.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#fromPortalItem)
  		 */
  inline def fromPortalItem(params: NetworkFromPortalItemParams): js.Promise[UtilityNetwork] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromPortalItem")(params.asInstanceOf[js.Any]).asInstanceOf[js.Promise[UtilityNetwork]]
}
