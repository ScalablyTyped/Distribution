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
    acquire: js.Function0[scala.Unit],
    autoOutline: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    clearOutline: js.Function0[scala.Unit],
    group: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation, 
      scala.Unit
    ],
    hideDetail: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    showDetail: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, scala.Unit],
    showLevel: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation, 
      scala.Unit
    ],
    ungroup: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.TableOrientation, 
      scala.Unit
    ]
  ): XSheetOutline = {
    val __obj = js.Dynamic.literal(acquire = acquire, autoOutline = autoOutline, clearOutline = clearOutline, group = group, hideDetail = hideDetail, queryInterface = queryInterface, release = release, showDetail = showDetail, showLevel = showLevel, ungroup = ungroup)
  
    __obj.asInstanceOf[XSheetOutline]
  }
}

