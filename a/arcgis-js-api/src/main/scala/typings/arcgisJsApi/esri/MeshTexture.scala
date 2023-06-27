package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.clamp
import typings.arcgisJsApi.arcgisJsApiStrings.mirror
import typings.arcgisJsApi.arcgisJsApiStrings.repeat
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MeshTexture
  extends StObject
     with Accessor {
  
  /**
  		 * A direct reference to the image or video data.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#data)
  		 */
  var data: HTMLImageElement | HTMLCanvasElement | Any | ImageData = js.native
  
  /**
  		 * Indicates whether the image data should be interpreted as being semi-transparent.
  		 *
  		 * @default undefined
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#transparent)
  		 */
  var transparent: Boolean = js.native
  
  /**
  		 * The url to the image resource.
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#url)
  		 */
  var url: String = js.native
  
  /**
  		 * Specifies how uv coordinates outside the [0, 1] range are handled.
  		 *
  		 * @default "repeat"
  		 *
  		 * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-geometry-support-MeshTexture.html#wrap)
  		 */
  var wrap: clamp | repeat | mirror | SeparableWrapModes = js.native
}
