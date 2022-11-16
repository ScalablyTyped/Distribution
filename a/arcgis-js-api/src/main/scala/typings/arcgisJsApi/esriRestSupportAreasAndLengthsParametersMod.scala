package typings.arcgisJsApi

import typings.arcgisJsApi.esri.AreasAndLengthsParameters
import typings.arcgisJsApi.esri.AreasAndLengthsParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportAreasAndLengthsParametersMod {
  
  @JSImport("esri/rest/support/AreasAndLengthsParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for the areasAndLengths() method on the GeometryService.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-AreasAndLengthsParameters.html)
    */
  open class ^ ()
    extends StObject
       with AreasAndLengthsParameters {
    def this(properties: AreasAndLengthsParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/AreasAndLengthsParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): AreasAndLengthsParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[AreasAndLengthsParameters]
}
