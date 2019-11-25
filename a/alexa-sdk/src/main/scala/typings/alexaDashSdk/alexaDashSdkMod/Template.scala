package typings.alexaDashSdk.alexaDashSdkMod

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
  var title: js.UndefOr[String] = js.undefined
  var token: String
  /**
    * Template type.
    */
  var `type`: TemplateType
}

object Template {
  @scala.inline
  def apply(
    token: String,
    `type`: TemplateType,
    backButton: TemplateBackButtonVisibility = null,
    backgroundImage: Image = null,
    image: Image = null,
    listItems: js.Array[ListItem] = null,
    title: String = null
  ): Template = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (backButton != null) __obj.updateDynamic("backButton")(backButton.asInstanceOf[js.Any])
    if (backgroundImage != null) __obj.updateDynamic("backgroundImage")(backgroundImage.asInstanceOf[js.Any])
    if (image != null) __obj.updateDynamic("image")(image.asInstanceOf[js.Any])
    if (listItems != null) __obj.updateDynamic("listItems")(listItems.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
}

