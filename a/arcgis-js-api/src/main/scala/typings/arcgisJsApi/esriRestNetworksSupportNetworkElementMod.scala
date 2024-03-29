package typings.arcgisJsApi

import typings.arcgisJsApi.esri.NetworkElement
import typings.arcgisJsApi.esri.NetworkElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestNetworksSupportNetworkElementMod {
  
  @JSImport("esri/rest/networks/support/NetworkElement", JSImport.Namespace)
  @js.native
  /**
  		 * The network element is a representation of how the network topology defines its graph.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-NetworkElement.html)
  		 */
  open class ^ ()
    extends StObject
       with NetworkElement {
    def this(properties: NetworkElementProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/networks/support/NetworkElement", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): NetworkElement = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[NetworkElement]
}
