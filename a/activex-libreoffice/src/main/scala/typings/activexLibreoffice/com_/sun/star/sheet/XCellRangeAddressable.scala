package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellRangeAddress} . */
@js.native
trait XCellRangeAddressable extends XInterface {
  
  /**
    * returns the address of the cell range in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellRangeAddress} can be used to address the range within its document.
    */
  val RangeAddress: CellRangeAddress = js.native
  
  /**
    * returns the address of the cell range in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellRangeAddress} can be used to address the range within its document.
    */
  def getRangeAddress(): CellRangeAddress = js.native
}
object XCellRangeAddressable {
  
  @scala.inline
  def apply(
    RangeAddress: CellRangeAddress,
    acquire: () => Unit,
    getRangeAddress: () => CellRangeAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellRangeAddressable = {
    val __obj = js.Dynamic.literal(RangeAddress = RangeAddress.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRangeAddress = js.Any.fromFunction0(getRangeAddress), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellRangeAddressable]
  }
  
  @scala.inline
  implicit class XCellRangeAddressableOps[Self <: XCellRangeAddressable] (val x: Self) extends AnyVal {
    
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
    def setRangeAddress(value: CellRangeAddress): Self = this.set("RangeAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetRangeAddress(value: () => CellRangeAddress): Self = this.set("getRangeAddress", js.Any.fromFunction0(value))
  }
}
