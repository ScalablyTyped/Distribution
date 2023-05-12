package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImagePointParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImagePointParameters")
@js.native
/**
  * Input parameters used by the [ImageryLayer.measurePointOrCentroid()](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#measurePointOrCentroid) or [imageService.measurePointOrCentroid()](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html#measurePointOrCentroid) methods to perform imagery point or centroid mensuration.
  *
  * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImagePointParameters.html)
  */
open class ImagePointParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.ImagePointParameters {
  def this(properties: ImagePointParametersProperties) = this()
  
  /**
    * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
    */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImagePointParameters {
  
  @JSGlobal("__esri.ImagePointParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImagePointParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImagePointParameters]
}
