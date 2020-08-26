package typings.arcgisJsApi.esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FormTemplateProperties extends js.Object {
  /**
    * The description of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * An array of [form element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html) objects that represent an ordered list of form elements.  Elements are designed to allow the form author the ability to define the layout for fields when collecting and/or editing data.
    * > Nested group elements are not supported.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#elements)
    */
  var elements: js.UndefOr[js.Array[ElementProperties]] = js.native
  /**
    * An array of objects or [ExpressionInfo[]](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-ExpressionInfo.html) that reference [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expressions.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#expressionInfos)
    */
  var expressionInfos: js.UndefOr[js.Array[ExpressionInfoProperties]] = js.native
  /**
    * The string template for defining how to format the title used in a popup. This appears at the top of the form.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-FormTemplate.html#title)
    */
  var title: js.UndefOr[String] = js.native
}

object FormTemplateProperties {
  @scala.inline
  def apply(): FormTemplateProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FormTemplateProperties]
  }
  @scala.inline
  implicit class FormTemplatePropertiesOps[Self <: FormTemplateProperties] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: ElementProperties*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[ElementProperties]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteElements: Self = this.set("elements", js.undefined)
    @scala.inline
    def setExpressionInfosVarargs(value: ExpressionInfoProperties*): Self = this.set("expressionInfos", js.Array(value :_*))
    @scala.inline
    def setExpressionInfos(value: js.Array[ExpressionInfoProperties]): Self = this.set("expressionInfos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpressionInfos: Self = this.set("expressionInfos", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

