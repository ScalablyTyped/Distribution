package typings.agGrid.iViewportDatasourceMod

import org.scalablytyped.runtime.NumberDictionary
import typings.agGrid.rowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IViewportDatasourceParams extends js.Object {
  /** datasource calls this when it wants a row node - typically used when it wants to update the row node */
  def getRow(rowIndex: Double): RowNode = js.native
  /** datasource calls this method when the total row count changes. This in turn sets the height of the grids vertical scroll. */
  def setRowCount(count: Double): Unit = js.native
  /** datasource calls this when new data arrives. The grid then updates the provided rows. The rows are mapped [rowIndex]=>rowData].*/
  def setRowData(rowData: NumberDictionary[js.Any]): Unit = js.native
}

object IViewportDatasourceParams {
  @scala.inline
  def apply(
    getRow: Double => RowNode,
    setRowCount: Double => Unit,
    setRowData: NumberDictionary[js.Any] => Unit
  ): IViewportDatasourceParams = {
    val __obj = js.Dynamic.literal(getRow = js.Any.fromFunction1(getRow), setRowCount = js.Any.fromFunction1(setRowCount), setRowData = js.Any.fromFunction1(setRowData))
    __obj.asInstanceOf[IViewportDatasourceParams]
  }
  @scala.inline
  implicit class IViewportDatasourceParamsOps[Self <: IViewportDatasourceParams] (val x: Self) extends AnyVal {
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
    def setGetRow(value: Double => RowNode): Self = this.set("getRow", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRowCount(value: Double => Unit): Self = this.set("setRowCount", js.Any.fromFunction1(value))
    @scala.inline
    def setSetRowData(value: NumberDictionary[js.Any] => Unit): Self = this.set("setRowData", js.Any.fromFunction1(value))
  }
  
}

