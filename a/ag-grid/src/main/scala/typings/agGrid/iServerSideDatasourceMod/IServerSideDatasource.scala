package typings.agGrid.iServerSideDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IServerSideDatasource extends js.Object {
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  def getRows(params: IServerSideGetRowsParams): Unit = js.native
}

object IServerSideDatasource {
  @scala.inline
  def apply(getRows: IServerSideGetRowsParams => Unit): IServerSideDatasource = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction1(getRows))
    __obj.asInstanceOf[IServerSideDatasource]
  }
  @scala.inline
  implicit class IServerSideDatasourceOps[Self <: IServerSideDatasource] (val x: Self) extends AnyVal {
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
    def setGetRows(value: IServerSideGetRowsParams => Unit): Self = this.set("getRows", js.Any.fromFunction1(value))
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
  }
  
}

