package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** enables the object to handle text tables. */
trait XTextTablesSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  val TextTables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
  /**
    * @returns the collection of "TextTables" currently contained in the object.
    * @see com.sun.star.text.TextTables
    * @see com.sun.star.text.TextTable
    */
  def getTextTables(): activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess
}

object XTextTablesSupplier {
  @scala.inline
  def apply(
    TextTables: activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess,
    acquire: js.Function0[scala.Unit],
    getTextTables: js.Function0[activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XNameAccess],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XTextTablesSupplier = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("TextTables")(TextTables)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getTextTables")(getTextTables)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.asInstanceOf[XTextTablesSupplier]
  }
}

