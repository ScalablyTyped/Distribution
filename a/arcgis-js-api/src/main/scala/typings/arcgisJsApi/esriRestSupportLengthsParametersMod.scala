package typings.arcgisJsApi

import typings.arcgisJsApi.esri.LengthsParameters
import typings.arcgisJsApi.esri.LengthsParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportLengthsParametersMod {
  
  @JSImport("esri/rest/support/LengthsParameters", JSImport.Namespace)
  @js.native
  /**
  		 * Sets the length units and other parameters for the [geometryService.lengths()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#lengths) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-LengthsParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with LengthsParameters {
    def this(properties: LengthsParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/LengthsParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): LengthsParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[LengthsParameters]
}
