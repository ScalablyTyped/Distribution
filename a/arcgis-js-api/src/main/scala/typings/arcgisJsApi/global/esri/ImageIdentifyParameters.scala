package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageIdentifyParametersProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageIdentifyParameters")
@js.native
/**
		 * Input parameters for [imageService](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-imageService.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageIdentifyParameters.html)
		 */
open class ImageIdentifyParameters ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageIdentifyParameters {
  def this(properties: ImageIdentifyParametersProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageIdentifyParameters {
  
  @JSGlobal("__esri.ImageIdentifyParameters")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageIdentifyParameters = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageIdentifyParameters]
}
