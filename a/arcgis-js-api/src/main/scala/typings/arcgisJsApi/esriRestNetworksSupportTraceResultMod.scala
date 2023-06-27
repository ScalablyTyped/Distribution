package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TraceResult
import typings.arcgisJsApi.esri.TraceResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestNetworksSupportTraceResultMod {
  
  @JSImport("esri/rest/networks/support/TraceResult", JSImport.Namespace)
  @js.native
  /**
  		 * This class defines the collection of results returned from the trace function.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceResult.html)
  		 */
  open class ^ ()
    extends StObject
       with TraceResult {
    def this(properties: TraceResultProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/networks/support/TraceResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TraceResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TraceResult]
}
