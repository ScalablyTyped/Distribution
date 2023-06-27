package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageIdentifyResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageIdentifyResult")
@js.native
/**
		 * The results from [imageService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyResult.html)
		 */
open class ImageIdentifyResult ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageIdentifyResult {
  def this(properties: ImageIdentifyResultProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageIdentifyResult {
  
  @JSGlobal("__esri.ImageIdentifyResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageIdentifyResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageIdentifyResult]
}
