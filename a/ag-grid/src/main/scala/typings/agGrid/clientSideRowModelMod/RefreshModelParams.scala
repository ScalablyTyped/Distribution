package typings.agGrid.clientSideRowModelMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RefreshModelParams extends js.Object {
  var animate: js.UndefOr[Boolean] = js.native
  var groupState: js.UndefOr[js.Any] = js.native
  var keepEditingRows: js.UndefOr[Boolean] = js.native
  var keepRenderedRows: js.UndefOr[Boolean] = js.native
  var newData: js.UndefOr[Boolean] = js.native
  var rowNodeOrder: js.UndefOr[StringDictionary[Double]] = js.native
  var rowNodeTransactions: js.UndefOr[js.Array[RowNodeTransaction]] = js.native
  var step: Double = js.native
}

object RefreshModelParams {
  @scala.inline
  def apply(step: Double): RefreshModelParams = {
    val __obj = js.Dynamic.literal(step = step.asInstanceOf[js.Any])
    __obj.asInstanceOf[RefreshModelParams]
  }
  @scala.inline
  implicit class RefreshModelParamsOps[Self <: RefreshModelParams] (val x: Self) extends AnyVal {
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
    def setStep(value: Double): Self = this.set("step", value.asInstanceOf[js.Any])
    @scala.inline
    def setAnimate(value: Boolean): Self = this.set("animate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAnimate: Self = this.set("animate", js.undefined)
    @scala.inline
    def setGroupState(value: js.Any): Self = this.set("groupState", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGroupState: Self = this.set("groupState", js.undefined)
    @scala.inline
    def setKeepEditingRows(value: Boolean): Self = this.set("keepEditingRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepEditingRows: Self = this.set("keepEditingRows", js.undefined)
    @scala.inline
    def setKeepRenderedRows(value: Boolean): Self = this.set("keepRenderedRows", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeepRenderedRows: Self = this.set("keepRenderedRows", js.undefined)
    @scala.inline
    def setNewData(value: Boolean): Self = this.set("newData", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNewData: Self = this.set("newData", js.undefined)
    @scala.inline
    def setRowNodeOrder(value: StringDictionary[Double]): Self = this.set("rowNodeOrder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNodeOrder: Self = this.set("rowNodeOrder", js.undefined)
    @scala.inline
    def setRowNodeTransactionsVarargs(value: RowNodeTransaction*): Self = this.set("rowNodeTransactions", js.Array(value :_*))
    @scala.inline
    def setRowNodeTransactions(value: js.Array[RowNodeTransaction]): Self = this.set("rowNodeTransactions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRowNodeTransactions: Self = this.set("rowNodeTransactions", js.undefined)
  }
  
}

