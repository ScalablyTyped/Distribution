package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageAngleResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageAngleResult")
@js.native
/**
  * The results from [imageService.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#computeAngles) or [ImageryLayer.computeAngles()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#computeAngles) method.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageAngleResult.html)
  */
open class ImageAngleResult ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageAngleResult {
  def this(properties: ImageAngleResultProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageAngleResult {
  
  @JSGlobal("__esri.ImageAngleResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageAngleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageAngleResult]
}
