package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TraceLocation
import typings.arcgisJsApi.esri.TraceLocationProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestNetworksSupportTraceLocationMod {
  
  @JSImport("esri/rest/networks/support/TraceLocation", JSImport.Namespace)
  @js.native
  /**
  		 * To perform the trace analytic, users can optionally supply a list of locations in forms of globalIds (UUID) and terminals.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-TraceLocation.html)
  		 */
  open class ^ ()
    extends StObject
       with TraceLocation {
    def this(properties: TraceLocationProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/networks/support/TraceLocation", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TraceLocation = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TraceLocation]
}
