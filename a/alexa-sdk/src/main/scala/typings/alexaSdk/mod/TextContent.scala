package typings.alexaSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TextContent extends js.Object {
  var primaryText: js.UndefOr[TextField] = js.native
  var secondaryText: js.UndefOr[TextField] = js.native
  var tertiaryText: js.UndefOr[TextField] = js.native
}

object TextContent {
  @scala.inline
  def apply(): TextContent = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TextContent]
  }
  @scala.inline
  implicit class TextContentOps[Self <: TextContent] (val x: Self) extends AnyVal {
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
    def setPrimaryText(value: TextField): Self = this.set("primaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrimaryText: Self = this.set("primaryText", js.undefined)
    @scala.inline
    def setSecondaryText(value: TextField): Self = this.set("secondaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecondaryText: Self = this.set("secondaryText", js.undefined)
    @scala.inline
    def setTertiaryText(value: TextField): Self = this.set("tertiaryText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTertiaryText: Self = this.set("tertiaryText", js.undefined)
  }
  
}

