package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FieldGroupConfig extends Accessor {
  /**
    * The field's description. The description is shown below the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#description)
    */
  var description: String = js.native
  /**
    * The field configurations belonging to a group.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#fieldConfig)
    */
  var fieldConfig: js.Array[FieldConfig] = js.native
  var initialState: expanded | collapsed = js.native
  /**
    * The field's label. The label is shown above the field.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#label)
    */
  var label: String = js.native
  /**
    * A reference to an [Arcade](https://developers.arcgis.com/javascript/latest/guide/arcade/index.html) expression that returns a boolean value. When this expression evaluates to `true`, the element is displayed. When the expression evaluates to `false` the element is not displayed. If no expression is provided, the default behavior is that the element is displayed. Care must be taken when defining a visibility expression for a non-nullable field i.e. to make sure that such fields either have default values or are made visible to users so that they can provide a value before submitting the form.
    * > This only affects how the field is rendered. It does not have any impact on the attribute's values.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-FieldGroupConfig.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: String = js.native
}

