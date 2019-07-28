package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * may be implemented to hide the complexity of dropping a database catalog. Could normally be used only in offline mode, no connection on the database.
  * This should be checked by the driver.
  */
trait XDropCatalog extends XInterface {
  /**
    * drops a catalog identified by its name.
    * @param catalogName the catalog name
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropCatalog(catalogName: String, info: SeqEquiv[PropertyValue]): Unit
}

object XDropCatalog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    dropCatalog: (String, SeqEquiv[PropertyValue]) => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XDropCatalog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), dropCatalog = js.Any.fromFunction2(dropCatalog), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XDropCatalog]
  }
}

