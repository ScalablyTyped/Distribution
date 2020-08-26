package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellAddress} . */
@js.native
trait XCellAddressable extends XInterface {
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  val CellAddress: typings.activexLibreoffice.com_.sun.star.table.CellAddress = js.native
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  def getCellAddress(): typings.activexLibreoffice.com_.sun.star.table.CellAddress = js.native
}

object XCellAddressable {
  @scala.inline
  def apply(
    CellAddress: CellAddress,
    acquire: () => Unit,
    getCellAddress: () => CellAddress,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCellAddressable = {
    val __obj = js.Dynamic.literal(CellAddress = CellAddress.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getCellAddress = js.Any.fromFunction0(getCellAddress), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellAddressable]
  }
  @scala.inline
  implicit class XCellAddressableOps[Self <: XCellAddressable] (val x: Self) extends AnyVal {
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
    def setCellAddress(value: CellAddress): Self = this.set("CellAddress", value.asInstanceOf[js.Any])
    @scala.inline
    def setGetCellAddress(value: () => CellAddress): Self = this.set("getCellAddress", js.Any.fromFunction0(value))
  }
  
}

