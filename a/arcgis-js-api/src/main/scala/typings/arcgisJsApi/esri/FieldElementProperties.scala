package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.field
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldElementProperties extends ElementMixinProperties {
  /**
    * The [coded value domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-CodedValueDomain.html) or [range domain](https://developers.arcgis.com/javascript/latest/api-reference/esri-layers-support-RangeDomain.html) of the field. If it is defined, this domain takes precedence over domains defined within the form's [fieldConfig](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldConfig.html).
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#domain)
    */
  var domain: js.UndefOr[CodedValueDomainProperties | RangeDomainProperties] = js.native
  /**
    * Indicates whether the field can be edited.
    * > This does not change the underlying service's field and whether it can be edited.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#editable)
    *
    * @default true
    */
  var editable: js.UndefOr[Boolean] = js.native
  /**
    * The field name as defined by the feature layer. Set this property to indicate which field to edit.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#fieldName)
    */
  var fieldName: js.UndefOr[String] = js.native
  /**
    * Contains a hint used to help editors while editing fields.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#hint)
    */
  var hint: js.UndefOr[String] = js.native
  /**
    * The input user interface to use for the element. The client application is responsible for defining the default user interface.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#input)
    */
  var input: js.UndefOr[TextBoxInputProperties | TextAreaInputProperties] = js.native
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value. When this expression evaluates to `true` and the element is visible, the element must have a valid value in order for the feature to be created or edited. When the expression evaluates to `false`, the element is not required. If no expression is provided, the default behavior is that the element is not required. If the referenced field is non-nullable, the required expression is ignored and the element is always required.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#requiredExpression)
    */
  var requiredExpression: js.UndefOr[String] = js.native
  /**
    * Indicates the type of form [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html). FieldElement is of type, `field`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html#type)
    */
  var `type`: js.UndefOr[field] = js.native
}

object FieldElementProperties {
  @scala.inline
  def apply(): FieldElementProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldElementProperties]
  }
  @scala.inline
  implicit class FieldElementPropertiesOps[Self <: FieldElementProperties] (val x: Self) extends AnyVal {
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
    def setDomain(value: CodedValueDomainProperties | RangeDomainProperties): Self = this.set("domain", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDomain: Self = this.set("domain", js.undefined)
    @scala.inline
    def setEditable(value: Boolean): Self = this.set("editable", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEditable: Self = this.set("editable", js.undefined)
    @scala.inline
    def setFieldName(value: String): Self = this.set("fieldName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldName: Self = this.set("fieldName", js.undefined)
    @scala.inline
    def setHint(value: String): Self = this.set("hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHint: Self = this.set("hint", js.undefined)
    @scala.inline
    def setInput(value: TextBoxInputProperties | TextAreaInputProperties): Self = this.set("input", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInput: Self = this.set("input", js.undefined)
    @scala.inline
    def setRequiredExpression(value: String): Self = this.set("requiredExpression", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequiredExpression: Self = this.set("requiredExpression", js.undefined)
    @scala.inline
    def setType(value: field): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

