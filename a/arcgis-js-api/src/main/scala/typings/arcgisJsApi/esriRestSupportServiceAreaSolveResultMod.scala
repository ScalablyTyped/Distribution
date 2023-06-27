package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ServiceAreaSolveResult
import typings.arcgisJsApi.esri.ServiceAreaSolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportServiceAreaSolveResultMod {
  
  @JSImport("esri/rest/support/ServiceAreaSolveResult", JSImport.Namespace)
  @js.native
  /**
  		 * The result from [serviceArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-serviceArea.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaSolveResult.html)
  		 */
  open class ^ ()
    extends StObject
       with ServiceAreaSolveResult {
    def this(properties: ServiceAreaSolveResultProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ServiceAreaSolveResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ServiceAreaSolveResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ServiceAreaSolveResult]
}
