package typings.arcgisJsApi.global.esri

import typings.arcgisJsApi.esri.ImageElementProperties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("__esri.ImageElement")
@js.native
/**
		 * Represents an image element referenced in the MediaLayer's [source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
		 *
		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html)
		 */
open class ImageElement ()
  extends StObject
     with typings.arcgisJsApi.esri.ImageElement {
  def this(properties: ImageElementProperties) = this()
  
  /**
  		 * The geographic location of the image or video element to be placed on the map.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#georeference)
  		 */
  /* CompleteClass */
  var georeference: typings.arcgisJsApi.esri.ExtentAndRotationGeoreference | typings.arcgisJsApi.esri.CornersGeoreference | typings.arcgisJsApi.esri.ControlPointsGeoreference = js.native
  
  /**
  		 * The opacity of the element.
  		 *
  		 * @default 1
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-MediaElementBase.html#opacity)
  		 */
  /* CompleteClass */
  var opacity: Double = js.native
}
