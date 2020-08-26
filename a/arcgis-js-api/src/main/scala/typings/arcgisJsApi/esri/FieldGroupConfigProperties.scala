package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldGroupConfigProperties extends js.Object {
  /**
    * The field's description. The description is shown below the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#description)
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The field configurations belonging to a group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#fieldConfig)
    */
  var fieldConfig: js.UndefOr[js.Array[FieldConfigProperties]] = js.native
  var initialState: js.UndefOr[expanded | collapsed] = js.native
  /**
    * The field's label. The label is shown above the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#label)
    */
  var label: js.UndefOr[String] = js.native
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value. When this expression evaluates to `true`, the element is displayed. When the expression evaluates to `false` the element is not displayed. If no expression is provided, the default behavior is that the element is displayed. Care must be taken when defining a visibility expression for a non-nullable field i.e. to make sure that such fields either have default values or are made visible to users so that they can provide a value before submitting the form.
    * > This only affects how the field is rendered. It does not have any impact on the attribute's values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: js.UndefOr[String] = js.native
}

object FieldGroupConfigProperties {
  @scala.inline
  def apply(): FieldGroupConfigProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FieldGroupConfigProperties]
  }
  @scala.inline
  implicit class FieldGroupConfigPropertiesOps[Self <: FieldGroupConfigProperties] (val x: Self) extends AnyVal {
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
    def setFieldConfigVarargs(value: FieldConfigProperties*): Self = this.set("fieldConfig", js.Array(value :_*))
    @scala.inline
    def setFieldConfig(value: js.Array[FieldConfigProperties]): Self = this.set("fieldConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFieldConfig: Self = this.set("fieldConfig", js.undefined)
    @scala.inline
    def setInitialState(value: expanded | collapsed): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
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

