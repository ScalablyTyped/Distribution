package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ClosestFacilityParameters
import typings.arcgisJsApi.esri.ClosestFacilityParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportClosestFacilityParametersMod {
  
  @JSImport("esri/rest/support/ClosestFacilityParameters", JSImport.Namespace)
  @js.native
  /**
  		 * ClosestFacilityParameters provides the input parameters for a [closestFacility](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-closestFacility.html) request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ClosestFacilityParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with ClosestFacilityParameters {
    def this(properties: ClosestFacilityParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ClosestFacilityParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ClosestFacilityParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ClosestFacilityParameters]
}
