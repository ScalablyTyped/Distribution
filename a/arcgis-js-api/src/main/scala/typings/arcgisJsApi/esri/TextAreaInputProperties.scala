package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.`text-area`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextAreaInputProperties extends TextInputProperties {
  /**
    * The type of form element input.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-inputs-TextAreaInput.html#type)
    */
  var `type`: js.UndefOr[`text-area`] = js.native
}

object TextAreaInputProperties {
  @scala.inline
  def apply(): TextAreaInputProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextAreaInputProperties]
  }
  @scala.inline
  implicit class TextAreaInputPropertiesOps[Self <: TextAreaInputProperties] (val x: Self) extends AnyVal {
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
    def setType(value: `text-area`): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

