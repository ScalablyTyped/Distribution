package typings.anchorJs.mod.anchorjs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnchorOptions extends js.Object {
  var ariaLabel: js.UndefOr[String] = js.native
  var base: js.UndefOr[String] = js.native
  var `class`: js.UndefOr[String] = js.native
  var icon: js.UndefOr[String] = js.native
  var placement: js.UndefOr[AnchorPlacement] = js.native
  var titleText: js.UndefOr[String] = js.native
  var truncate: js.UndefOr[Double] = js.native
  var visible: js.UndefOr[AnchorVisibility] = js.native
}

object AnchorOptions {
  @scala.inline
  def apply(): AnchorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AnchorOptions]
  }
  @scala.inline
  implicit class AnchorOptionsOps[Self <: AnchorOptions] (val x: Self) extends AnyVal {
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
    def setAriaLabel(value: String): Self = this.set("ariaLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAriaLabel: Self = this.set("ariaLabel", js.undefined)
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBase: Self = this.set("base", js.undefined)
    @scala.inline
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    @scala.inline
    def setPlacement(value: AnchorPlacement): Self = this.set("placement", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlacement: Self = this.set("placement", js.undefined)
    @scala.inline
    def setTitleText(value: String): Self = this.set("titleText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTitleText: Self = this.set("titleText", js.undefined)
    @scala.inline
    def setTruncate(value: Double): Self = this.set("truncate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTruncate: Self = this.set("truncate", js.undefined)
    @scala.inline
    def setVisible(value: AnchorVisibility): Self = this.set("visible", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVisible: Self = this.set("visible", js.undefined)
  }
  
}

