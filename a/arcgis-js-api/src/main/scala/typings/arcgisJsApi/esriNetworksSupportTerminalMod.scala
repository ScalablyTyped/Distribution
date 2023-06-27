package typings.arcgisJsApi

import typings.arcgisJsApi.esri.Terminal
import typings.arcgisJsApi.esri.TerminalProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriNetworksSupportTerminalMod {
  
  @JSImport("esri/networks/support/Terminal", JSImport.Namespace)
  @js.native
  /**
  		 * A device feature can be assigned a terminal configuration, which could have one or more terminals.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-Terminal.html)
  		 */
  open class ^ ()
    extends StObject
       with Terminal {
    def this(properties: TerminalProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/networks/support/Terminal", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): Terminal = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[Terminal]
}
