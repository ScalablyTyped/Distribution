package typings
package agDashGridLib.distLibInterfacesIViewportDatasourceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IViewportDatasourceParams extends js.Object {
  /** datasource calls this when it wants a row node - typically used when it wants to update the row node */
  def getRow(rowIndex: scala.Double): agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  /** datasource calls this method when the total row count changes. This in turn sets the height of the grids vertical scroll. */
  def setRowCount(count: scala.Double): scala.Unit
  /** datasource calls this when new data arrives. The grid then updates the provided rows. The rows are mapped [rowIndex]=>rowData].*/
  def setRowData(rowData: org.scalablytyped.runtime.NumberDictionary[js.Any]): scala.Unit
}

object IViewportDatasourceParams {
  @scala.inline
  def apply(
    getRow: scala.Double => agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    setRowCount: scala.Double => scala.Unit,
    setRowData: org.scalablytyped.runtime.NumberDictionary[js.Any] => scala.Unit
  ): IViewportDatasourceParams = {
    val __obj = js.Dynamic.literal(getRow = js.Any.fromFunction1(getRow), setRowCount = js.Any.fromFunction1(setRowCount), setRowData = js.Any.fromFunction1(setRowData))
  
    __obj.asInstanceOf[IViewportDatasourceParams]
  }
}

