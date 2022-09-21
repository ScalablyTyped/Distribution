package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.image
import typings.std.HTMLCanvasElement
import typings.std.HTMLImageElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ImageElement
  extends StObject
     with Accessor
     with MediaElementBase
     with MediaElement {
  
  /**
    * The image content referenced in the image element instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#content)
    */
  val content: HTMLImageElement | HTMLCanvasElement | ImageData = js.native
  
  /**
    * The image element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-ImageElement.html#image)
    */
  var image: String | HTMLImageElement | HTMLCanvasElement | ImageData = js.native
  
  var `type`: image = js.native
}
