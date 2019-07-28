package typings.activexDashLibreoffice.comNs.sunNs.starNs.textNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables the object to handle text tables. */
trait XTextTablesSupplier extends XInterface {
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  val TextTables: XNameAccess
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  def getTextTables(): XNameAccess
}

object XTextTablesSupplier {
  @scala.inline
  def apply(
    TextTables: XNameAccess,
    acquire: () => Unit,
    getTextTables: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XTextTablesSupplier = {
    val __obj = js.Dynamic.literal(TextTables = TextTables, acquire = js.Any.fromFunction0(acquire), getTextTables = js.Any.fromFunction0(getTextTables), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XTextTablesSupplier]
  }
}

