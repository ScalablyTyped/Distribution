package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.video
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait VideoElement
  extends StObject
     with Accessor
     with MediaElementBase
     with MediaElement {
  
  /**
    * The video content referenced in the video element instance.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html#content)
    */
  val content: Any = js.native
  
  var `type`: video = js.native
  
  /**
    * The video element to be added to the [media layer's source](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-MediaLayer.html#source).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-VideoElement.html#video)
    */
  var video: String | Any = js.native
}
