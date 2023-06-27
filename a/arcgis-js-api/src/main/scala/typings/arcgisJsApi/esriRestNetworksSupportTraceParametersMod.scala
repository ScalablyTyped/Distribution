package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TraceParameters
import typings.arcgisJsApi.esri.TraceParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestNetworksSupportTraceParametersMod {
  
  @JSImport("esri/rest/networks/support/TraceParameters", JSImport.Namespace)
  @js.native
  /**
  		 * The list of parameters that are needed to determine how the trace analytic will be executed.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with TraceParameters {
    def this(properties: TraceParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/networks/support/TraceParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TraceParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TraceParameters]
}
