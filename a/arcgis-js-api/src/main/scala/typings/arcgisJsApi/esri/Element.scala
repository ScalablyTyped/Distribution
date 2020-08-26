package typings.arcgisJsApi.esri

import typings.arcgisJsApi.arcgisJsApiStrings.field
import typings.arcgisJsApi.arcgisJsApiStrings.group
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Element
  extends JSONSupport
     with ElementMixin {
  /**
    * The type of form element displayed.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-form-elements-Element.html#type)
    */
  val `type`: field | group = js.native
}

object Element {
  @scala.inline
  def apply(
    description: String,
    label: String,
    toJSON: () => js.Any,
    `type`: field | group,
    visibilityExpression: String
  ): Element = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], toJSON = js.Any.fromFunction0(toJSON), visibilityExpression = visibilityExpression.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Element]
  }
  @scala.inline
  implicit class ElementOps[Self <: Element] (val x: Self) extends AnyVal {
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
    def setType(value: field | group): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

