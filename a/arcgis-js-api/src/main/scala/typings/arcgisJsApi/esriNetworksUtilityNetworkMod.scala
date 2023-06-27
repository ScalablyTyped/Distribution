package typings.arcgisJsApi

import typings.arcgisJsApi.esri.UtilityNetwork
import typings.arcgisJsApi.esri.UtilityNetworkProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriNetworksUtilityNetworkMod {
  
  @JSImport("esri/networks/UtilityNetwork", JSImport.Namespace)
  @js.native
  /**
  		 * This class contains metadata about the utility network dataset retrieved from a [WebMap](https://developers.arcgis.com/javascript/latest/api-reference/esri-WebMap.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-UtilityNetwork.html)
  		 */
  open class ^ ()
    extends StObject
       with UtilityNetwork {
    def this(properties: UtilityNetworkProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/networks/UtilityNetwork", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): UtilityNetwork = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[UtilityNetwork]
}
