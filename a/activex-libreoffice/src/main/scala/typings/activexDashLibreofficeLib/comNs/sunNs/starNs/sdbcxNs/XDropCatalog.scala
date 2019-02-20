package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * may be implemented to hide the complexity of dropping a database catalog. Could normally be used only in offline mode, no connection on the database.
  * This should be checked by the driver.
  */
trait XDropCatalog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * drops a catalog identified by its name.
    * @param catalogName the catalog name
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def dropCatalog(
    catalogName: java.lang.String,
    info: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

