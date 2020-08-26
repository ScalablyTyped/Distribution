package typings.agGrid.iServerSideDatasourceMod

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerSideGetRowsParams extends js.Object {
  var parentNode: RowNode = js.native
  var request: IServerSideGetRowsRequest = js.native
  def failCallback(): Unit = js.native
  def successCallback(rowsThisPage: js.Array[_], lastRow: Double): Unit = js.native
}

object IServerSideGetRowsParams {
  @scala.inline
  def apply(
    failCallback: () => Unit,
    parentNode: RowNode,
    request: IServerSideGetRowsRequest,
    successCallback: (js.Array[_], Double) => Unit
  ): IServerSideGetRowsParams = {
    val __obj = js.Dynamic.literal(failCallback = js.Any.fromFunction0(failCallback), parentNode = parentNode.asInstanceOf[js.Any], request = request.asInstanceOf[js.Any], successCallback = js.Any.fromFunction2(successCallback))
    __obj.asInstanceOf[IServerSideGetRowsParams]
  }
  @scala.inline
  implicit class IServerSideGetRowsParamsOps[Self <: IServerSideGetRowsParams] (val x: Self) extends AnyVal {
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
    def setFailCallback(value: () => Unit): Self = this.set("failCallback", js.Any.fromFunction0(value))
    @scala.inline
    def setParentNode(value: RowNode): Self = this.set("parentNode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequest(value: IServerSideGetRowsRequest): Self = this.set("request", value.asInstanceOf[js.Any])
    @scala.inline
    def setSuccessCallback(value: (js.Array[_], Double) => Unit): Self = this.set("successCallback", js.Any.fromFunction2(value))
  }
  
}

