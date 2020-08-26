package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsTableCard extends js.Object {
  /**
    * Buttons.
    * Currently at most 1 button is supported.
    * Optional.
    */
  var buttons: js.UndefOr[js.Array[GoogleActionsV2UiElementsButton]] = js.native
  /**
    * Headers and alignment of columns.
    */
  var columnProperties: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardColumnProperties]] = js.native
  /**
    * Image associated with the table. Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  /**
    * Row data of the table. The first 3 rows are guaranteed to be shown but
    * others might be cut on certain surfaces. Please test with the simulator to
    * see which rows will be shown for a given surface. On surfaces that support
    * the WEB_BROWSER capability, you can point the user to
    * a web page with more data.
    */
  var rows: js.UndefOr[js.Array[GoogleActionsV2UiElementsTableCardRow]] = js.native
  /**
    * Subtitle for the table. Optional.
    */
  var subtitle: js.UndefOr[String] = js.native
  /**
    * Overall title of the table. Optional but must be set if subtitle is set.
    */
  var title: js.UndefOr[String] = js.native
}

object GoogleActionsV2UiElementsTableCard {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsTableCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCard]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsTableCardOps[Self <: GoogleActionsV2UiElementsTableCard] (val x: Self) extends AnyVal {
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
    def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = this.set("buttons", js.Array(value :_*))
    @scala.inline
    def setButtons(value: js.Array[GoogleActionsV2UiElementsButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    @scala.inline
    def setColumnPropertiesVarargs(value: GoogleActionsV2UiElementsTableCardColumnProperties*): Self = this.set("columnProperties", js.Array(value :_*))
    @scala.inline
    def setColumnProperties(value: js.Array[GoogleActionsV2UiElementsTableCardColumnProperties]): Self = this.set("columnProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteColumnProperties: Self = this.set("columnProperties", js.undefined)
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    @scala.inline
    def setRowsVarargs(value: GoogleActionsV2UiElementsTableCardRow*): Self = this.set("rows", js.Array(value :_*))
    @scala.inline
    def setRows(value: js.Array[GoogleActionsV2UiElementsTableCardRow]): Self = this.set("rows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRows: Self = this.set("rows", js.undefined)
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
  
}

