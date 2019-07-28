package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * provides access to the settings of a consolidation descriptor.
  * @deprecated Deprecated
  * @see com.sun.star.sheet.ConsolidationDescriptor
  */
trait XConsolidationDescriptor extends XInterface {
  /** returns the function by which the ranges are consolidated. */
  var Function: GeneralFunction
  /** returns, whether links to the original data are inserted in the output area or not. */
  var InsertLinks: Boolean
  /** returns the cell ranges which are consolidated. */
  var Sources: SafeArray[CellRangeAddress]
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  var StartOutputPosition: CellAddress
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  var UseColumnHeaders: Boolean
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  var UseRowHeaders: Boolean
  /** returns the function by which the ranges are consolidated. */
  def getFunction(): GeneralFunction
  /** returns, whether links to the original data are inserted in the output area or not. */
  def getInsertLinks(): Boolean
  /** returns the cell ranges which are consolidated. */
  def getSources(): SafeArray[CellRangeAddress]
  /** returns the position of the top left cell of the cell range where the consolidated data are copied. */
  def getStartOutputPosition(): CellAddress
  /** returns, whether column headers from the cell ranges are used to find matching data or not. */
  def getUseColumnHeaders(): Boolean
  /** returns, whether row headers from the cell ranges are used to find matching data or not. */
  def getUseRowHeaders(): Boolean
  /** sets the function by which the ranges are consolidated. */
  def setFunction(nFunction: GeneralFunction): Unit
  /** specifies if links to the original data are inserted in the output area. */
  def setInsertLinks(bInsertLinks: Boolean): Unit
  /** sets the cell ranges which are consolidated. */
  def setSources(aSources: SeqEquiv[CellRangeAddress]): Unit
  /** sets the position of the top left cell of the cell range where the consolidated data are copied. */
  def setStartOutputPosition(aStartOutputPosition: CellAddress): Unit
  /** specifies if column headers from the cell ranges are used to find matching data. */
  def setUseColumnHeaders(bUseColumnHeaders: Boolean): Unit
  /** specifies if row headers from the cell ranges are used to find matching data. */
  def setUseRowHeaders(bUseRowHeaders: Boolean): Unit
}

object XConsolidationDescriptor {
  @scala.inline
  def apply(
    Function: GeneralFunction,
    InsertLinks: Boolean,
    Sources: SafeArray[CellRangeAddress],
    StartOutputPosition: CellAddress,
    UseColumnHeaders: Boolean,
    UseRowHeaders: Boolean,
    acquire: () => Unit,
    getFunction: () => GeneralFunction,
    getInsertLinks: () => Boolean,
    getSources: () => SafeArray[CellRangeAddress],
    getStartOutputPosition: () => CellAddress,
    getUseColumnHeaders: () => Boolean,
    getUseRowHeaders: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setFunction: GeneralFunction => Unit,
    setInsertLinks: Boolean => Unit,
    setSources: SeqEquiv[CellRangeAddress] => Unit,
    setStartOutputPosition: CellAddress => Unit,
    setUseColumnHeaders: Boolean => Unit,
    setUseRowHeaders: Boolean => Unit
  ): XConsolidationDescriptor = {
    val __obj = js.Dynamic.literal(Function = Function, InsertLinks = InsertLinks, Sources = Sources, StartOutputPosition = StartOutputPosition, UseColumnHeaders = UseColumnHeaders, UseRowHeaders = UseRowHeaders, acquire = js.Any.fromFunction0(acquire), getFunction = js.Any.fromFunction0(getFunction), getInsertLinks = js.Any.fromFunction0(getInsertLinks), getSources = js.Any.fromFunction0(getSources), getStartOutputPosition = js.Any.fromFunction0(getStartOutputPosition), getUseColumnHeaders = js.Any.fromFunction0(getUseColumnHeaders), getUseRowHeaders = js.Any.fromFunction0(getUseRowHeaders), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setFunction = js.Any.fromFunction1(setFunction), setInsertLinks = js.Any.fromFunction1(setInsertLinks), setSources = js.Any.fromFunction1(setSources), setStartOutputPosition = js.Any.fromFunction1(setStartOutputPosition), setUseColumnHeaders = js.Any.fromFunction1(setUseColumnHeaders), setUseRowHeaders = js.Any.fromFunction1(setUseRowHeaders))
  
    __obj.asInstanceOf[XConsolidationDescriptor]
  }
}

