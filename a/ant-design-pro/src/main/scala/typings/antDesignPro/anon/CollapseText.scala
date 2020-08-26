package typings.antDesignPro.anon

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollapseText extends js.Object {
  var collapseText: js.UndefOr[ReactNode] = js.native
  var expandText: js.UndefOr[ReactNode] = js.native
  var selectAllText: js.UndefOr[ReactNode] = js.native
}

object CollapseText {
  @scala.inline
  def apply(): CollapseText = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollapseText]
  }
  @scala.inline
  implicit class CollapseTextOps[Self <: CollapseText] (val x: Self) extends AnyVal {
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
    def setCollapseText(value: ReactNode): Self = this.set("collapseText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollapseText: Self = this.set("collapseText", js.undefined)
    @scala.inline
    def setExpandText(value: ReactNode): Self = this.set("expandText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpandText: Self = this.set("expandText", js.undefined)
    @scala.inline
    def setSelectAllText(value: ReactNode): Self = this.set("selectAllText", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectAllText: Self = this.set("selectAllText", js.undefined)
  }
  
}

