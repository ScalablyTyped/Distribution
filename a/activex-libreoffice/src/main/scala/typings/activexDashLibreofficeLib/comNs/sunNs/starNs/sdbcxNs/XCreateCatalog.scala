package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** may be implemented to hide the complexity of creating a database catalog. */
trait XCreateCatalog
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates the catalog by using a sequence of property values. The kind of properties depends on the provider.
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def createCatalog(
    info: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.PropertyValue]
  ): scala.Unit
}

