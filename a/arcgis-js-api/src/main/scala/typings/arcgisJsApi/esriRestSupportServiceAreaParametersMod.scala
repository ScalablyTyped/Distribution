package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ServiceAreaParameters
import typings.arcgisJsApi.esri.ServiceAreaParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportServiceAreaParametersMod {
  
  @JSImport("esri/rest/support/ServiceAreaParameters", JSImport.Namespace)
  @js.native
  /**
  		 * ServiceAreaParameters provides the input parameters for a [serviceArea](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-serviceArea.html) request.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ServiceAreaParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with ServiceAreaParameters {
    def this(properties: ServiceAreaParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ServiceAreaParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ServiceAreaParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ServiceAreaParameters]
}
