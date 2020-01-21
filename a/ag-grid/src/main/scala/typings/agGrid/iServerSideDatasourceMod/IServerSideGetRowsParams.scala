package typings.agGrid.iServerSideDatasourceMod

import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerSideGetRowsParams extends js.Object {
  var parentNode: RowNode
  var request: IServerSideGetRowsRequest
  def failCallback(): Unit
  def successCallback(rowsThisPage: js.Array[_], lastRow: Double): Unit
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
}

