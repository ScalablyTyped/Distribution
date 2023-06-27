package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TraceJobInfo
import typings.arcgisJsApi.esri.TraceJobInfoProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriNetworksSupportTraceJobInfoMod {
  
  @JSImport("esri/networks/support/TraceJobInfo", JSImport.Namespace)
  @js.native
  /**
  		 * Represents information pertaining to the execution of an asynchronous request on the server.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-networks-support-TraceJobInfo.html)
  		 */
  open class ^ ()
    extends StObject
       with TraceJobInfo {
    def this(properties: TraceJobInfoProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/networks/support/TraceJobInfo", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TraceJobInfo = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TraceJobInfo]
}
