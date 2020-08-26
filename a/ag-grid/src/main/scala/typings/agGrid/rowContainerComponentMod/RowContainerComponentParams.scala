package typings.agGrid.rowContainerComponentMod

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowContainerComponentParams extends js.Object {
  var eContainer: HTMLElement = js.native
  var eViewport: js.UndefOr[HTMLElement] = js.native
  var hideWhenNoChildren: js.UndefOr[Boolean] = js.native
}

object RowContainerComponentParams {
  @scala.inline
  def apply(eContainer: HTMLElement): RowContainerComponentParams = {
    val __obj = js.Dynamic.literal(eContainer = eContainer.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowContainerComponentParams]
  }
  @scala.inline
  implicit class RowContainerComponentParamsOps[Self <: RowContainerComponentParams] (val x: Self) extends AnyVal {
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
    def setEContainer(value: HTMLElement): Self = this.set("eContainer", value.asInstanceOf[js.Any])
    @scala.inline
    def setEViewport(value: HTMLElement): Self = this.set("eViewport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEViewport: Self = this.set("eViewport", js.undefined)
    @scala.inline
    def setHideWhenNoChildren(value: Boolean): Self = this.set("hideWhenNoChildren", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHideWhenNoChildren: Self = this.set("hideWhenNoChildren", js.undefined)
  }
  
}

