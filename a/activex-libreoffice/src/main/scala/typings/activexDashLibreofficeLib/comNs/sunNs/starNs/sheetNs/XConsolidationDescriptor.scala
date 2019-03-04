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

object XConsolidationDescriptor {
  @scala.inline
  def apply(
    Function: GeneralFunction,
    InsertLinks: scala.Boolean,
    Sources: activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress],
    StartOutputPosition: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    UseColumnHeaders: scala.Boolean,
    UseRowHeaders: scala.Boolean,
    acquire: js.Function0[scala.Unit],
    getFunction: js.Function0[GeneralFunction],
    getInsertLinks: js.Function0[scala.Boolean],
    getSources: js.Function0[
      activexDashInteropLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress]
    ],
    getStartOutputPosition: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress],
    getUseColumnHeaders: js.Function0[scala.Boolean],
    getUseRowHeaders: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setFunction: js.Function1[GeneralFunction, scala.Unit],
    setInsertLinks: js.Function1[scala.Boolean, scala.Unit],
    setSources: js.Function1[
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress], 
      scala.Unit
    ],
    setStartOutputPosition: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Unit],
    setUseColumnHeaders: js.Function1[scala.Boolean, scala.Unit],
    setUseRowHeaders: js.Function1[scala.Boolean, scala.Unit]
  ): XConsolidationDescriptor = {
    val __obj = js.Dynamic.literal(Function = Function, InsertLinks = InsertLinks, Sources = Sources, StartOutputPosition = StartOutputPosition, UseColumnHeaders = UseColumnHeaders, UseRowHeaders = UseRowHeaders, acquire = acquire, getFunction = getFunction, getInsertLinks = getInsertLinks, getSources = getSources, getStartOutputPosition = getStartOutputPosition, getUseColumnHeaders = getUseColumnHeaders, getUseRowHeaders = getUseRowHeaders, queryInterface = queryInterface, release = release, setFunction = setFunction, setInsertLinks = setInsertLinks, setSources = setSources, setStartOutputPosition = setStartOutputPosition, setUseColumnHeaders = setUseColumnHeaders, setUseRowHeaders = setUseRowHeaders)
  
    __obj.asInstanceOf[XConsolidationDescriptor]
  }
}

