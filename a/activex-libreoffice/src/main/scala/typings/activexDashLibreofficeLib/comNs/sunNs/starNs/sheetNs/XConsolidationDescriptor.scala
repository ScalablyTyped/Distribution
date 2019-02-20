package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a consolidation descriptor.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.ConsolidationDescriptor
  */
trait XConsolidationDescriptor
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** returns the function by which the ranges are consolidated. */
  var Function: GeneralFunction
  /** returns, whether links to the original data are inserted in the output area or not. */
  var InsertLinks: scala.Boolean
  /** returns the cell ranges which are consolidated. */
  var Sources: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  var StartOutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  var UseColumnHeaders: scala.Boolean
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  var UseRowHeaders: scala.Boolean
  /** returns the function by which the ranges are consolidated. */
  def getFunction(): GeneralFunction
  /** returns, whether links to the original data are inserted in the output area or not. */
  def getInsertLinks(): scala.Boolean
  /** returns the cell ranges which are consolidated. */
  def getSources(): activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  def getStartOutputPosition(): activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  def getUseColumnHeaders(): scala.Boolean
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  def getUseRowHeaders(): scala.Boolean
  /** sets the function by which the ranges are consolidated. */
  def setFunction(nFunction: GeneralFunction): scala.Unit
  /** specifies if links to the original data are inserted in the output area. */
  def setInsertLinks(bInsertLinks: scala.Boolean): scala.Unit
  /** sets the cell ranges which are consolidated. */
  def setSources(
    aSources: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
  ): scala.Unit
  /** sets the position of the top left cell of the cell range where the consolidated data are copied. */
  def setStartOutputPosition(aStartOutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Unit
  /** specifies if column headers from the cell ranges are used to find matching data. */
  def setUseColumnHeaders(bUseColumnHeaders: scala.Boolean): scala.Unit
  /** specifies if row headers from the cell ranges are used to find matching data. */
  def setUseRowHeaders(bUseRowHeaders: scala.Boolean): scala.Unit
}

