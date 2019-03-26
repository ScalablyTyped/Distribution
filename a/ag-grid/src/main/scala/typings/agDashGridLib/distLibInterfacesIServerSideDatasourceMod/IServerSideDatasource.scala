package typings
package agDashGridLib.distLibInterfacesIServerSideDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IServerSideDatasource extends js.Object {
  var destroy: js.UndefOr[js.Function0[scala.Unit]] = js.undefined
  def getRows(params: IServerSideGetRowsParams): scala.Unit
}

object IServerSideDatasource {
  @scala.inline
  def apply(getRows: IServerSideGetRowsParams => scala.Unit, destroy: () => scala.Unit = null): IServerSideDatasource = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction1(getRows))
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction0(destroy))
    __obj.asInstanceOf[IServerSideDatasource]
  }
}

