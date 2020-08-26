package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextContentProperties extends ContentProperties {
  /**
    * The formatted string content to display. This may contain a field name enclosed in `{}`, such as `{FIELDNAME}`, or an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression name, referenced as `{expression/EXPRESSIONNAME}`. Text content may also leverage HTML tags such as `<b></b>`, `<p></p>`, and `<table></table>` for formatting the look and feel of the content.
    * > Set the [popupTemplate.fieldInfos](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html#fieldInfos) property for any fields that need to have number formatting within the text.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-TextContent.html#text)
    */
  var text: js.UndefOr[String] = js.native
}

object TextContentProperties {
  @scala.inline
  def apply(): TextContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextContentProperties]
  }
  @scala.inline
  implicit class TextContentPropertiesOps[Self <: TextContentProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteText: Self = this.set("text", js.undefined)
  }
  
}

