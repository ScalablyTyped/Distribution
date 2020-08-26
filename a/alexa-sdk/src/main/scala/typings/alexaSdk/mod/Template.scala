package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Template extends js.Object {
  /**
    * Visibility of the back button.
    */
  var backButton: js.UndefOr[TemplateBackButtonVisibility] = js.native
  var backgroundImage: js.UndefOr[Image] = js.native
  var image: js.UndefOr[Image] = js.native
  var listItems: js.UndefOr[js.Array[ListItem]] = js.native
  var title: js.UndefOr[String] = js.native
  var token: String = js.native
  /**
    * Template type.
    */
  var `type`: TemplateType = js.native
}

object Template {
  @scala.inline
  def apply(token: String, `type`: TemplateType): Template = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Template]
  }
  @scala.inline
  implicit class TemplateOps[Self <: Template] (val x: Self) extends AnyVal {
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
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: TemplateType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setBackButton(value: TemplateBackButtonVisibility): Self = this.set("backButton", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackButton: Self = this.set("backButton", js.undefined)
    @scala.inline
    def setBackgroundImage(value: Image): Self = this.set("backgroundImage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBackgroundImage: Self = this.set("backgroundImage", js.undefined)
    @scala.inline
    def setImage(value: Image): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setListItemsVarargs(value: ListItem*): Self = this.set("listItems", js.Array(value :_*))
    @scala.inline
    def setListItems(value: js.Array[ListItem]): Self = this.set("listItems", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteListItems: Self = this.set("listItems", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

