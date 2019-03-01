package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Template extends js.Object {
  /**
    * Visibility of the back button.
    */
  var backButton: js.UndefOr[TemplateBackButtonVisibility] = js.undefined
  var backgroundImage: js.UndefOr[Image] = js.undefined
  var image: js.UndefOr[Image] = js.undefined
  var listItems: js.UndefOr[js.Array[ListItem]] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
  var token: java.lang.String
  /**
    * Template type.
    */
  var `type`: TemplateType
}

object Template {
  @scala.inline
  def apply(
    token: java.lang.String,
    `type`: TemplateType,
    backButton: TemplateBackButtonVisibility = null,
    backgroundImage: Image = null,
    image: Image = null,
    listItems: js.Array[ListItem] = null,
    title: java.lang.String = null
  ): Template = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("token")(token)
    if (backButton != null) __obj.updateDynamic("backButton")(backButton)
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage)
    if (image != null) __obj.updateDynamic("image")(image)
    if (listItems != null) __obj.updateDynamic("listItems")(listItems)
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[Template]
  }
}

