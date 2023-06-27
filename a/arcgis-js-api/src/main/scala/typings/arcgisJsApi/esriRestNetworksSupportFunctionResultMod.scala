package typings.arcgisJsApi

import typings.arcgisJsApi.esri.FunctionResult
import typings.arcgisJsApi.esri.FunctionResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestNetworksSupportFunctionResultMod {
  
  @JSImport("esri/rest/networks/support/FunctionResult", JSImport.Namespace)
  @js.native
  /**
  		 * A trace can optionally return a aggregated function result if the trace configuration asked for it.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-networks-support-FunctionResult.html)
  		 */
  open class ^ ()
    extends StObject
       with FunctionResult {
    def this(properties: FunctionResultProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/networks/support/FunctionResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): FunctionResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[FunctionResult]
}
