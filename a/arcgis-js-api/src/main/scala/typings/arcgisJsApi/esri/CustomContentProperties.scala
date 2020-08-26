package typings.arcgisJsApi.esri

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomContentProperties extends ContentProperties {
  /**
    * The function that is called to create the custom content element.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#creator)
    */
  var creator: js.UndefOr[PopupTemplateContentCreator] = js.native
  /**
    * The called function to cleanup custom content when it is no longer necessary.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#destroyer)
    */
  var destroyer: js.UndefOr[PopupTemplateContentDestroyer] = js.native
  /**
    * An array of field names used in the [PopupTemplate](https://developers.arcgis.com/javascript/latest/api-reference/esri-PopupTemplate.html). Use this property to indicate what fields are required to fully render the PopupTemplate. This is important if setting [content](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#content) via a function since any fields needed for successful rendering should be specified here.  To fetch the values from all fields, use `["*"]`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-popup-content-CustomContent.html#outFields)
    */
  var outFields: js.UndefOr[js.Array[String]] = js.native
}

object CustomContentProperties {
  @scala.inline
  def apply(): CustomContentProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomContentProperties]
  }
  @scala.inline
  implicit class CustomContentPropertiesOps[Self <: CustomContentProperties] (val x: Self) extends AnyVal {
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
    def setCreator(value: /* graphic */ Graphic => String | HTMLElement | Widget_ | js.Promise[js.Any]): Self = this.set("creator", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCreator: Self = this.set("creator", js.undefined)
    @scala.inline
    def setDestroyer(value: /* graphic */ Graphic => Unit): Self = this.set("destroyer", js.Any.fromFunction1(value))
    @scala.inline
    def deleteDestroyer: Self = this.set("destroyer", js.undefined)
    @scala.inline
    def setOutFieldsVarargs(value: String*): Self = this.set("outFields", js.Array(value :_*))
    @scala.inline
    def setOutFields(value: js.Array[String]): Self = this.set("outFields", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutFields: Self = this.set("outFields", js.undefined)
  }
  
}

