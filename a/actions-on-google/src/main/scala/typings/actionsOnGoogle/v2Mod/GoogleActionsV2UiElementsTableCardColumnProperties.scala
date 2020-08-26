package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GoogleActionsV2UiElementsTableCardColumnProperties extends js.Object {
  /**
    * Header text for the column.
    */
  var header: js.UndefOr[String] = js.native
  /**
    * Horizontal alignment of content w.r.t column. If unspecified, content
    * will be aligned to the leading edge.
    */
  var horizontalAlignment: js.UndefOr[GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment] = js.native
}

object GoogleActionsV2UiElementsTableCardColumnProperties {
  @scala.inline
  def apply(): GoogleActionsV2UiElementsTableCardColumnProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsTableCardColumnProperties]
  }
  @scala.inline
  implicit class GoogleActionsV2UiElementsTableCardColumnPropertiesOps[Self <: GoogleActionsV2UiElementsTableCardColumnProperties] (val x: Self) extends AnyVal {
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
    def setHeader(value: String): Self = this.set("header", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHeader: Self = this.set("header", js.undefined)
    @scala.inline
    def setHorizontalAlignment(value: GoogleActionsV2UiElementsTableCardColumnPropertiesHorizontalAlignment): Self = this.set("horizontalAlignment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHorizontalAlignment: Self = this.set("horizontalAlignment", js.undefined)
  }
  
}

