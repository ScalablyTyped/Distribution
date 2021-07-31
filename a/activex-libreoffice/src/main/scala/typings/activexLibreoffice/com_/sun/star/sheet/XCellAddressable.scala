package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellAddress} . */
trait XCellAddressable
  extends StObject
     with XInterface {
  
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  val CellAddress: typings.activexLibreoffice.com_.sun.star.table.CellAddress
  
  /**
    * returns the address of the cell in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellAddress} can be used to address the cell within its document.
    */
  def getCellAddress(): typings.activexLibreoffice.com_.sun.star.table.CellAddress
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
  implicit class XCellAddressableMutableBuilder[Self <: XCellAddressable] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCellAddress(value: CellAddress): Self = StObject.set(x, "CellAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetCellAddress(value: () => CellAddress): Self = StObject.set(x, "getCellAddress", js.Any.fromFunction0(value))
  }
}
