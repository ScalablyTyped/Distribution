package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImageIdentifyResult
import typings.arcgisJsApi.esri.ImageIdentifyResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportImageIdentifyResultMod {
  
  @JSImport("esri/rest/support/ImageIdentifyResult", JSImport.Namespace)
  @js.native
  /**
  		 * The results from [imageService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html).
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html)
  		 */
  open class ^ ()
    extends StObject
       with ImageIdentifyResult {
    def this(properties: ImageIdentifyResultProperties) = this()
    
    /**
    		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    		 *
    		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    		 */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ImageIdentifyResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImageIdentifyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImageIdentifyResult]
}
