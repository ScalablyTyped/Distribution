package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.collapsed
import typings.arcgisJsApi.arcgisJsApiStrings.expanded
import typings.arcgisJsApi.arcgisJsApiStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GroupElement
  extends Element
     with elementsElement {
  /**
    * An array of [field elements](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-FieldElement.html) to display as grouped. These objects represent an ordered list of [form](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm.html) elements.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#elements)
    */
  var elements: js.Array[FieldElement] = js.native
  /**
    * Defines if the group should be expanded or collapsed when the form is initially displayed. If not provided, the default value is expanded.
    *
    * Possible Value | Description
    * ---------------|-------------
    * collapsed | The grouped elements appear collapsed.
    * expanded | The grouped elements appear expanded.
    *
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#initialState)
    *
    * @default expanded
    */
  var initialState: collapsed | expanded = js.native
  /**
    * The type of the [element](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html). GroupElement is of type, `group`.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-GroupElement.html#type)
    */
  @JSName("type")
  var type_GroupElement: group = js.native
}

object GroupElement {
  @scala.inline
  def apply(
    description: String,
    elements: js.Array[FieldElement],
    initialState: collapsed | expanded,
    label: String,
    toJSON: () => js.Any,
    `type`: group,
    visibilityExpression: String
  ): GroupElement = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], elements = elements.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), visibilityExpression = visibilityExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[GroupElement]
  }
  @scala.inline
  implicit class GroupElementOps[Self <: GroupElement] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: FieldElement*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: js.Array[FieldElement]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setInitialState(value: collapsed | expanded): Self = this.set("initialState", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: group): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

