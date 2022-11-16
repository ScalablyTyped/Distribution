package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImagePixelLocationParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImagePixelLocationParameters")
@js.native
/**
  * Input parameters for the [ImageryLayer.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computePixelSpaceLocations) or [imageService.computePixelSpaceLocations()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computePixelSpaceLocations) methods.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePixelLocationParameters.html)
  */
open class ImagePixelLocationParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.ImagePixelLocationParameters {
  def this(properties: ImagePixelLocationParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImagePixelLocationParameters {
  
  @JSGlobal("__esri.ImagePixelLocationParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImagePixelLocationParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImagePixelLocationParameters]
}
