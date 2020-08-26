package typings.agGrid.rowRendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshViewParams extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var newData: js.UndefOr[Boolean] = js.native
  var newPage: js.UndefOr[Boolean] = js.native
  var onlyBody: js.UndefOr[Boolean] = js.native
  var recycleRows: js.UndefOr[Boolean] = js.native
  var suppressKeepFocus: js.UndefOr[Boolean] = js.native
}

object RefreshViewParams {
  @scala.inline
  def apply(): RefreshViewParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RefreshViewParams]
  }
  @scala.inline
  implicit class RefreshViewParamsOps[Self <: RefreshViewParams] (val x: Self) extends AnyVal {
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
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setNewData(value: Boolean): Self = this.set("newData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewData: Self = this.set("newData", js.undefined)
    @scala.inline
    def setNewPage(value: Boolean): Self = this.set("newPage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewPage: Self = this.set("newPage", js.undefined)
    @scala.inline
    def setOnlyBody(value: Boolean): Self = this.set("onlyBody", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOnlyBody: Self = this.set("onlyBody", js.undefined)
    @scala.inline
    def setRecycleRows(value: Boolean): Self = this.set("recycleRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRecycleRows: Self = this.set("recycleRows", js.undefined)
    @scala.inline
    def setSuppressKeepFocus(value: Boolean): Self = this.set("suppressKeepFocus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuppressKeepFocus: Self = this.set("suppressKeepFocus", js.undefined)
  }
  
}

