package typings.actionsOnGoogle.tableMod

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsTableCardColumnProperties
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableColumn extends GoogleActionsV2UiElementsTableCardColumnProperties {
  /**
    * Alias for `horizontalAlignment`
    *
    * Horizontal alignment of content w.r.t column. If unspecified, content
    * will be aligned to the leading edge.
    * @public
    */
  var align: js.UndefOr[GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment] = js.native
}

object TableColumn {
  @scala.inline
  def apply(): TableColumn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TableColumn]
  }
  @scala.inline
  implicit class TableColumnOps[Self <: TableColumn] (val x: Self) extends AnyVal {
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
    def setAlign(value: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment): Self = this.set("align", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAlign: Self = this.set("align", js.undefined)
  }
  
}

