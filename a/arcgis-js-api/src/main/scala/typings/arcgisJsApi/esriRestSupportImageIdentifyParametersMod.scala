package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImageIdentifyParameters
import typings.arcgisJsApi.esri.ImageIdentifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportImageIdentifyParametersMod {
  
  @JSImport("esri/rest/support/ImageIdentifyParameters", JSImport.Namespace)
  @js.native
  /**
    * Input parameters for [imageService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html)
    */
  open class ^ ()
    extends StObject
       with ImageIdentifyParameters {
    def this(properties: ImageIdentifyParametersProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ImageIdentifyParameters", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImageIdentifyParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImageIdentifyParameters]
}
