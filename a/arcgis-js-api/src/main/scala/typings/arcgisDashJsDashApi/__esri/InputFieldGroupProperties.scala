package typings.arcgisDashJsDashApi.__esri

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputFieldGroupProperties extends js.Object {
  /**
    * The group's description.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#description)
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Arcade expression to determine whether this group is visible or not
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-FeatureForm-InputFieldGroup.html#visibilityExpression)
    *
    * @default null
    */
  var visibilityExpression: js.UndefOr[String] = js.undefined
}

object InputFieldGroupProperties {
  @scala.inline
  def apply(description: String = null, visibilityExpression: String = null): InputFieldGroupProperties = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (visibilityExpression != null) __obj.updateDynamic("visibilityExpression")(visibilityExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputFieldGroupProperties]
  }
}

