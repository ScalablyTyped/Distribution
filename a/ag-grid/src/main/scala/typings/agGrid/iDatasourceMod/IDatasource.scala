package typings.agGrid.iDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDatasource extends js.Object {
  
  var destroy: js.UndefOr[js.Function0[Unit]] = js.native
  
  /** Callback the grid calls that you implement to fetch rows from the server. See below for params.*/
  def getRows(params: IGetRowsParams): Unit = js.native
  
  /** If you know up front how many rows are in the dataset, set it here. Otherwise leave blank.*/
  var rowCount: js.UndefOr[Double] = js.native
}
object IDatasource {
  
  @scala.inline
  def apply(getRows: IGetRowsParams => Unit): IDatasource = {
    val __obj = js.Dynamic.literal(getRows = js.Any.fromFunction1(getRows))
    __obj.asInstanceOf[IDatasource]
  }
  
  @scala.inline
  implicit class IDatasourceOps[Self <: IDatasource] (val x: Self) extends AnyVal {
    
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
    def setGetRows(value: IGetRowsParams => Unit): Self = this.set("getRows", js.Any.fromFunction1(value))
    
    @scala.inline
    def setDestroy(value: () => Unit): Self = this.set("destroy", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteDestroy: Self = this.set("destroy", js.undefined)
    
    @scala.inline
    def setRowCount(value: Double): Self = this.set("rowCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRowCount: Self = this.set("rowCount", js.undefined)
  }
}
