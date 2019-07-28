package typings.activexDashLibreoffice.comNs.sunNs.starNs.sheetNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.tableNs.CellRangeAddress
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a sheet into which contents of the clipboard can be pasted.
  * @deprecated Deprecated
  */
trait XSheetPastable extends XInterface {
  /** pastes the contents of the clipboard at the specified position on the sheet. */
  def paste(aDestination: CellAddress): Unit
  /**
    * pastes clipboard data from a cell range into another cell range.
    *
    * The contents of the clipboard must be from a cell range.
    */
  def pasteCellRange(
    aDestination: CellRangeAddress,
    nOperation: PasteOperation,
    nContents: Double,
    bSkipEmpty: Boolean,
    bTranspose: Boolean,
    bAsLink: Boolean,
    nInsert: CellInsertMode
  ): Unit
  /** pastes the contents of the clipboard at the specified position on the sheet, using the specified format. */
  def pasteFormat(aDestination: CellAddress, aFormat: String): Unit
}

object XSheetPastable {
  @scala.inline
  def apply(
    acquire: () => Unit,
    paste: CellAddress => Unit,
    pasteCellRange: (CellRangeAddress, PasteOperation, Double, Boolean, Boolean, Boolean, CellInsertMode) => Unit,
    pasteFormat: (CellAddress, String) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetPastable = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), paste = js.Any.fromFunction1(paste), pasteCellRange = js.Any.fromFunction7(pasteCellRange), pasteFormat = js.Any.fromFunction2(pasteFormat), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XSheetPastable]
  }
}

