package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * represents a sheet into which contents of the clipboard can be pasted.
  * @deprecated Deprecated
  */
@js.native
trait XSheetPastable extends XInterface {
  
  /** pastes the contents of the clipboard at the specified position on the sheet. */
  def paste(aDestination: CellAddress): Unit = js.native
  
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
  ): Unit = js.native
  
  /** pastes the contents of the clipboard at the specified position on the sheet, using the specified format. */
  def pasteFormat(aDestination: CellAddress, aFormat: String): Unit = js.native
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
  
  @scala.inline
  implicit class XSheetPastableMutableBuilder[Self <: XSheetPastable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPaste(value: CellAddress => Unit): Self = StObject.set(x, "paste", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPasteCellRange(
      value: (CellRangeAddress, PasteOperation, Double, Boolean, Boolean, Boolean, CellInsertMode) => Unit
    ): Self = StObject.set(x, "pasteCellRange", js.Any.fromFunction7(value))
    
    @scala.inline
    def setPasteFormat(value: (CellAddress, String) => Unit): Self = StObject.set(x, "pasteFormat", js.Any.fromFunction2(value))
  }
}
