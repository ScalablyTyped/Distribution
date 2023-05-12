package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageHeightParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageHeightParameters")
@js.native
/**
  * Input parameters used by the [ImageryLayer.measureHeight()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measureHeight) or [imageService.measureHeight()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measureHeight) methods to perform imagery height mensuration.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageHeightParameters.html)
  */
open class ImageHeightParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageHeightParameters {
  def this(properties: ImageHeightParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageHeightParameters {
  
  @JSGlobal("__esri.ImageHeightParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageHeightParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageHeightParameters]
}
