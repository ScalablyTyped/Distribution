package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ClosestFacilitySolveResult
import typings.arcgisJsApi.esri.ClosestFacilitySolveResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportClosestFacilitySolveResultMod {
  
  @JSImport("esri/rest/support/ClosestFacilitySolveResult", JSImport.Namespace)
  @js.native
  /**
  		 * The result from [closestFacility](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-closestFacility.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilitySolveResult.html)
  		 */
  open class ^ ()
    extends StObject
       with ClosestFacilitySolveResult {
    def this(properties: ClosestFacilitySolveResultProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ClosestFacilitySolveResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ClosestFacilitySolveResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ClosestFacilitySolveResult]
}
