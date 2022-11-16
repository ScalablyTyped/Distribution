package typings.arcgisJsApi

import typings.arcgisJsApi.esri.ImagePixelLocationResult
import typings.arcgisJsApi.esri.ImagePixelLocationResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* static members */
object esriRestSupportImagePixelLocationResultMod {
  
  @JSImport("esri/rest/support/ImagePixelLocationResult", JSImport.Namespace)
  @js.native
  /**
    * The results from [imageService.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computePixelSpaceLocations) or [ImageryLayer.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computePixelSpaceLocations) method.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationResult.html)
    */
  open class ^ ()
    extends StObject
       with ImagePixelLocationResult {
    def this(properties: ImagePixelLocationResultProperties) = this()
    
    /**
      * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
      *
      * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
      */
    /* CompleteClass */
    override def toJSON(): Any = js.native
  }
  @JSImport("esri/rest/support/ImagePixelLocationResult", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): ImagePixelLocationResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[ImagePixelLocationResult]
}
