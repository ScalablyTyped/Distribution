package typings.arcgisJsApi

import typings.arcgisJsApi.esri.TrimExtendParameters
import typings.arcgisJsApi.esri.TrimExtendParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportTrimExtendParametersMod {
  
  @JSImport("esri/rest/support/TrimExtendParameters", JSImport.Namespace)
  @js.native
  /**
  		 * Used to set the parameters for the [geometryService.trimExtend](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#trimExtend) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-TrimExtendParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with TrimExtendParameters {
    def this(properties: TrimExtendParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/TrimExtendParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): TrimExtendParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[TrimExtendParameters]
}
