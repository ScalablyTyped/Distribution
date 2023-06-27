package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TopologyValidationJobInfo
import typings.arcgisJsApi.esri.TopologyValidationJobInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriNetworksSupportTopologyValidationJobInfoMod {
  
  @JSImport("esri/networks/support/TopologyValidationJobInfo", JSImport.Namespace)
  @js.native
  /**
  		 * Represents information pertaining to the execution of an asynchronous [submitTopologyValidationJob()](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-Network.html#submitTopologyValidationJob) request on the server.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TopologyValidationJobInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with TopologyValidationJobInfo {
    def this(properties: TopologyValidationJobInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/networks/support/TopologyValidationJobInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TopologyValidationJobInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TopologyValidationJobInfo]
}
