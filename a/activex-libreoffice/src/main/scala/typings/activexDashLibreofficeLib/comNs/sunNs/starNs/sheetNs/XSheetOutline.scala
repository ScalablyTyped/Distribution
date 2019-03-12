package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides methods to access the outlines of a sheet. */
trait XSheetOutline
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates outline groups from formula references in a range.
    * @param aRange the cell range for which outlines are generated.
    */
  def autoOutline(aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /** removes all outline groups from the sheet. */
  def clearOutline(): scala.Unit
  /**
    * creates an outline group.
    * @param aRange contains the range of rows or columns, depending on the parameter nOrientation.
    * @param nOrientation the orientation of the new outline (columns or rows).
    */
  def group(
    aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    nOrientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation
  ): scala.Unit
  /**
    * collapses an outline group.
    * @param aRange the cell range for which the outlines are collapsed.
    */
  def hideDetail(aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /**
    * reopens an outline group.
    * @param aRange the cell range for which the outlines are reopened.
    */
  def showDetail(aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress): scala.Unit
  /**
    * shows all outlined groups below a specific level.
    * @param nLevel all outline levels from 1 to this value will be opened and the higher levels will be closed.
    * @param nOrientation the orientation of the outlines (columns or rows).
    */
  def showLevel(
    nLevel: scala.Double,
    nOrientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation
  ): scala.Unit
  /**
    * removes outline groups.
    *
    * In the specified range, all outline groups on the innermost level are removed.
    * @param aRange contains the range of rows or columns, depending on the parameter nOrientation.
    * @param nOrientation the orientation of the outlines to remove (columns or rows).
    */
  def ungroup(
    aRange: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    nOrientation: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation
  ): scala.Unit
}

object XSheetOutline {
  @scala.inline
  def apply(
    acquire: () => scala.Unit,
    autoOutline: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => scala.Unit,
    clearOutline: () => scala.Unit,
    group: (activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation) => scala.Unit,
    hideDetail: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => scala.Unit,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    showDetail: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress => scala.Unit,
    showLevel: (scala.Double, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation) => scala.Unit,
    ungroup: (activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation) => scala.Unit
  ): XSheetOutline = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), autoOutline = js.Any.fromFunction1(autoOutline), clearOutline = js.Any.fromFunction0(clearOutline), group = js.Any.fromFunction2(group), hideDetail = js.Any.fromFunction1(hideDetail), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), showDetail = js.Any.fromFunction1(showDetail), showLevel = js.Any.fromFunction2(showLevel), ungroup = js.Any.fromFunction2(ungroup))
  
    __obj.asInstanceOf[XSheetOutline]
  }
}

