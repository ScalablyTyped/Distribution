package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * provides methods to access cell ranges in a collection via index and other helper methods.
  * @see com.sun.star.sheet.SheetCellRanges
  */
@js.native
trait XSheetCellRanges extends XIndexAccess {
  
  /**
    * returns the collection of all used cells.
    * @see com.sun.star.sheet.Cells
    */
  val Cells: XEnumerationAccess = js.native
  
  /**
    * creates a sequence with addresses of all contained cell ranges.
    * @returns a sequence with the addresses of all cell ranges.
    */
  val RangeAddresses: SafeArray[CellRangeAddress] = js.native
  
  /**
    * creates a string with addresses of all contained cell ranges.
    *
    * The range addresses are separated with semicolons. For instance the string could have the form "Sheet1.A1:C3;Sheet2.D5:F8".
    * @returns a string containing the addresses of all cell ranges.
    */
  val RangeAddressesAsString: String = js.native
  
  /**
    * returns the collection of all used cells.
    * @see com.sun.star.sheet.Cells
    */
  def getCells(): XEnumerationAccess = js.native
  
  /**
    * creates a sequence with addresses of all contained cell ranges.
    * @returns a sequence with the addresses of all cell ranges.
    */
  def getRangeAddresses(): SafeArray[CellRangeAddress] = js.native
  
  /**
    * creates a string with addresses of all contained cell ranges.
    *
    * The range addresses are separated with semicolons. For instance the string could have the form "Sheet1.A1:C3;Sheet2.D5:F8".
    * @returns a string containing the addresses of all cell ranges.
    */
  def getRangeAddressesAsString(): String = js.native
}
object XSheetCellRanges {
  
  @scala.inline
  def apply(
    Cells: XEnumerationAccess,
    Count: Double,
    ElementType: `type`,
    RangeAddresses: SafeArray[CellRangeAddress],
    RangeAddressesAsString: String,
    acquire: () => Unit,
    getByIndex: Double => js.Any,
    getCells: () => XEnumerationAccess,
    getCount: () => Double,
    getElementType: () => `type`,
    getRangeAddresses: () => SafeArray[CellRangeAddress],
    getRangeAddressesAsString: () => String,
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XSheetCellRanges = {
    val __obj = js.Dynamic.literal(Cells = Cells.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], RangeAddresses = RangeAddresses.asInstanceOf[js.Any], RangeAddressesAsString = RangeAddressesAsString.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getByIndex = js.Any.fromFunction1(getByIndex), getCells = js.Any.fromFunction0(getCells), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getRangeAddresses = js.Any.fromFunction0(getRangeAddresses), getRangeAddressesAsString = js.Any.fromFunction0(getRangeAddressesAsString), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XSheetCellRanges]
  }
  
  @scala.inline
  implicit class XSheetCellRangesOps[Self <: XSheetCellRanges] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCells(value: XEnumerationAccess): Self = this.set("Cells", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeAddresses(value: SafeArray[CellRangeAddress]): Self = this.set("RangeAddresses", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRangeAddressesAsString(value: String): Self = this.set("RangeAddressesAsString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCells(value: () => XEnumerationAccess): Self = this.set("getCells", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRangeAddresses(value: () => SafeArray[CellRangeAddress]): Self = this.set("getRangeAddresses", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetRangeAddressesAsString(value: () => String): Self = this.set("getRangeAddressesAsString", js.Any.fromFunction0(value))
  }
}
