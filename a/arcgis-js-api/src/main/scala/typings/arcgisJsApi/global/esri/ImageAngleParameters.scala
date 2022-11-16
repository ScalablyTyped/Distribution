package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageAngleParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageAngleParameters")
@js.native
/**
  * Input parameters for [ImageryLayer.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeAngles) or [imageService.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeAngles) methods.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleParameters.html)
  */
open class ImageAngleParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageAngleParameters {
  def this(properties: ImageAngleParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageAngleParameters {
  
  @JSGlobal("__esri.ImageAngleParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageAngleParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageAngleParameters]
}
