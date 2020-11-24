package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.text
import typings.arcgisJsApi.esri.content.Content
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TextContent
  extends Content_
     with Content
     with contentContent {
  
  /**
    * The formatted string content to display.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html#text)
    */
  var text: String = js.native
  
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html#type)
    */
  @JSName("type")
  val type_TextContent: text = js.native
}
