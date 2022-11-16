package typings.arcgisJsApi

import typings.arcgisJsApi.esri.BufferParameters
import typings.arcgisJsApi.esri.BufferParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportBufferParametersMod {
  
  @JSImport("esri/rest/support/BufferParameters", JSImport.Namespace)
  @js.native
  /**
    * Sets the distances, units, and other parameters for the [buffer()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html#buffer) method on the [geometryService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-geometryService.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-BufferParameters.html)
    */
  open class ^ ()
    extends StObject
       with BufferParameters {
    def this(properties: BufferParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/BufferParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): BufferParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[BufferParameters]
}
