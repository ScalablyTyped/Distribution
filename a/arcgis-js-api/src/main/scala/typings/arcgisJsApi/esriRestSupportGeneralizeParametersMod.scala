package typings.arcgisJsApi

import typings.arcgisJsApi.esri.GeneralizeParameters
import typings.arcgisJsApi.esri.GeneralizeParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportGeneralizeParametersMod {
  
  @JSImport("esri/rest/support/GeneralizeParameters", JSImport.Namespace)
  @js.native
  /**
  		 * Sets the geometries, maximum deviation and units for the [generalize](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#generalize) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-GeneralizeParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with GeneralizeParameters {
    def this(properties: GeneralizeParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/GeneralizeParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): GeneralizeParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[GeneralizeParameters]
}
