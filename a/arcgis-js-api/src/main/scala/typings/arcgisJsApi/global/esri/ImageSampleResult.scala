package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageSampleResultProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageSampleResult")
@js.native
/**
		 * The result from the [getSamples](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html#getSamples) method on [ImageryLayer](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-ImageryLayer.html) containing array of [ImageSample](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSample.html).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-rest-support-ImageSampleResult.html)
		 */
open class ImageSampleResult ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageSampleResult {
  def this(properties: ImageSampleResultProperties) = this()
  
  /**
  		 * Converts an instance of this class to its [ArcGIS portal JSON](https://developers.arcgis.com/documentation/common-data-types/geometry-objects.htm) representation.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-core-JSONSupport.html#toJSON)
  		 */
  /* CompleteClass */
  override def toJSON(): Any = js.native
}
/* static members */
object ImageSampleResult {
  
  @JSGlobal("__esri.ImageSampleResult")
  @js.native
  val ^ : js.Any = js.native
  
  inline def fromJSON(json: Any): typings.arcgisJsApi.esri.ImageSampleResult = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSON")(json.asInstanceOf[js.Any]).asInstanceOf[typings.arcgisJsApi.esri.ImageSampleResult]
}
