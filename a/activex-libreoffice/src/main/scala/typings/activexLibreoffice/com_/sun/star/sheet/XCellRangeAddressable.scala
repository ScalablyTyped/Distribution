package typings.activexLibreoffice.com_.sun.star.sheet

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.table.CellRangeAddress
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** represents a cell which can be addressed with a {@link com.sun.star.table.CellRangeAddress} . */
trait XCellRangeAddressable
  extends StObject
     with XInterface {
  
  /**
    * returns the address of the cell range in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellRangeAddress} can be used to address the range within its document.
    */
  val RangeAddress: CellRangeAddress
  
  /**
    * returns the address of the cell range in the spreadsheet document.
    *
    * The {@link com.sun.star.table.CellRangeAddress} can be used to address the range within its document.
    */
  def getRangeAddress(): CellRangeAddress
}
object XCellRangeAddressable {
  
  inline def apply(
    RangeAddress: CellRangeAddress,
    acquire: () => Unit,
    getRangeAddress: () => CellRangeAddress,
    queryInterface: `type` => Any,
    release: () => Unit
  ): XCellRangeAddressable = {
    val __obj = js.Dynamic.literal(RangeAddress = RangeAddress.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), getRangeAddress = js.Any.fromFunction0(getRangeAddress), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XCellRangeAddressable]
  }
  
  extension [Self <: XCellRangeAddressable](x: Self) {
    
    inline def setGetRangeAddress(value: () => CellRangeAddress): Self = StObject.set(x, "getRangeAddress", js.Any.fromFunction0(value))
    
    inline def setRangeAddress(value: CellRangeAddress): Self = StObject.set(x, "RangeAddress", value.asInstanceOf[js.Any])
  }
}
