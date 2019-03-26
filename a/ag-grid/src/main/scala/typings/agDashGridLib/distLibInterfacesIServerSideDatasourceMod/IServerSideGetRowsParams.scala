package typings
package agDashGridLib.distLibInterfacesIServerSideDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerSideGetRowsParams extends js.Object {
  var parentNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  var request: IServerSideGetRowsRequest
  def failCallback(): scala.Unit
  def successCallback(rowsThisPage: js.Array[_], lastRow: scala.Double): scala.Unit
}

object IServerSideGetRowsParams {
  @scala.inline
  def apply(
    failCallback: () => scala.Unit,
    parentNode: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    request: IServerSideGetRowsRequest,
    successCallback: (js.Array[_], scala.Double) => scala.Unit
  ): IServerSideGetRowsParams = {
    val __obj = js.Dynamic.literal(failCallback = js.Any.fromFunction0(failCallback), parentNode = parentNode, request = request, successCallback = js.Any.fromFunction2(successCallback))
  
    __obj.asInstanceOf[IServerSideGetRowsParams]
  }
}

