package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElementMixinProperties extends js.Object {
  /**
    * The element's description providing the purpose behind it.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * A string value containing the field alias. This is not to Arcade expressions as the title is used instead.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#label)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value. When this expression evaluates to `true`, the element is displayed. When the expression evaluates to `false` the element is not displayed. If no expression is provided, the default behavior is that the element is displayed. Care must be taken when defining a visibility expression for a non-nullable field i.e. to make sure that such fields either have default values or are made visible to users so that they can provide a value before submitting the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-ElementMixin.html#visibilityExpression)
    */
  var visibilityExpression: js.UndefOr[String] = js.native
}

object ElementMixinProperties {
  @scala.inline
  def apply(): ElementMixinProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ElementMixinProperties]
  }
  @scala.inline
  implicit class ElementMixinPropertiesOps[Self <: ElementMixinProperties] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    @scala.inline
    def setVisibilityExpression(value: String): Self = this.set("visibilityExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisibilityExpression: Self = this.set("visibilityExpression", js.undefined)
  }
  
}

