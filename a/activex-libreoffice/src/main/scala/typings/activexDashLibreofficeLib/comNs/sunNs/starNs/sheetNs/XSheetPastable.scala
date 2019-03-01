package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sheetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * represents a sheet into which contents of the clipboard can be pasted.
  * @deprecated Deprecated
  */
trait XSheetPastable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** pastes the contents of the clipboard at the specified position on the sheet. */
  def paste(aDestination: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress): scala.Unit
  /**
    * pastes clipboard data from a cell range into another cell range.
    *
    * The contents of the clipboard must be from a cell range.
    */
  def pasteCellRange(
    aDestination: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress,
    nOperation: PasteOperation,
    nContents: scala.Double,
    bSkipEmpty: scala.Boolean,
    bTranspose: scala.Boolean,
    bAsLink: scala.Boolean,
    nInsert: CellInsertMode
  ): scala.Unit
  /** pastes the contents of the clipboard at the specified position on the sheet, using the specified format. */
  def pasteFormat(
    aDestination: activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress,
    aFormat: java.lang.String
  ): scala.Unit
}

object XSheetPastable {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    paste: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, scala.Unit],
    pasteCellRange: js.Function7[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellRangeAddress, 
      PasteOperation, 
      scala.Double, 
      scala.Boolean, 
      scala.Boolean, 
      scala.Boolean, 
      CellInsertMode, 
      scala.Unit
    ],
    pasteFormat: js.Function2[
      activexDashLibreofficeLib.comNs.sunNs.starNs.tableNs.CellAddress, 
      java.lang.String, 
      scala.Unit
    ],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XSheetPastable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("paste")(paste)
    __obj.updateDynamic("pasteCellRange")(pasteCellRange)
    __obj.updateDynamic("pasteFormat")(pasteFormat)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XSheetPastable]
  }
}

