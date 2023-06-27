package typings.arcgisJsApi

import typings.arcgisJsApi.esri.OffsetParameters
import typings.arcgisJsApi.esri.OffsetParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportOffsetParametersMod {
  
  @JSImport("esri/rest/support/OffsetParameters", JSImport.Namespace)
  @js.native
  /**
  		 * Sets the offset distance, type and other parameters for the [geometryService.offset](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#offset) operation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-OffsetParameters.html)
  		 */
  open class ^ ()
    extends StObject
       with OffsetParameters {
    def this(properties: OffsetParametersProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/OffsetParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): OffsetParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[OffsetParameters]
}
