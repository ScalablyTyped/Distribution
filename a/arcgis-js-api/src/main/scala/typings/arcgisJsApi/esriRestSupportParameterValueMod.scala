package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ParameterValue
import typings.arcgisJsApi.esri.ParameterValueProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportParameterValueMod {
  
  @JSImport("esri/rest/support/ParameterValue", JSImport.Namespace)
  @js.native
  /**
  		 * Represents the output parameters of a [geoprocessor](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geoprocessor.html) method and their properties and values.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ParameterValue.html)
  		 */
  open class ^ ()
    extends StObject
       with ParameterValue {
    def this(properties: ParameterValueProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ParameterValue", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ParameterValue = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ParameterValue]
}
