package typings.arcgisDashJsDashApi.__esri

import org.scalablytyped.runtime.TopLevel
import typings.arcgisDashJsDashApi.arcgisDashJsDashApiStrings.text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextContent
  extends Content
     with typings.arcgisDashJsDashApi.__esri.content.Content
     with contentContent {
  /**
    * The formatted string content to display. This may contain a field name enclosed in `{}`, such as `{FIELDNAME}`, or an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression name, referenced as `{expression/EXPRESSIONNAME}`. Text content may also leverage HTML tags such as `<b></b>`, `<p></p>`, and `<table></table>` for formatting the look and feel of the content.
    * > Set the [popupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property for any fields that need to have number formatting within the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html#text)
    */
  var text: String = js.native
  /**
    * The type of popup element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html#type)
    *
    * @default text
    */
  @JSName("type")
  val type_TextContent: text = js.native
}

@JSGlobal("__esri.TextContent")
@js.native
object TextContent extends TopLevel[TextContentConstructor]

