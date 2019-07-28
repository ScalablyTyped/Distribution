package typings.agDashGrid.distLibInterfacesIViewportDatasourceMod

import org.scalablytyped.runtime.NumberDictionary
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewportDatasourceParams extends js.Object {
  /** datasource calls this when it wants a row node - typically used when it wants to update the row node */
  def getRow(rowIndex: Double): RowNode
  /** datasource calls this method when the total row count changes. This in turn sets the height of the grids vertical scroll. */
  def setRowCount(count: Double): Unit
  /** datasource calls this when new data arrives. The grid then updates the provided rows. The rows are mapped [rowIndex]=>rowData].*/
  def setRowData(rowData: NumberDictionary[js.Any]): Unit
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
}

