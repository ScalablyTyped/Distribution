package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.PropertyValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** may be implemented to hide the complexity of creating a database catalog. */
trait XCreateCatalog extends XInterface {
  /**
    * creates the catalog by using a sequence of property values. The kind of properties depends on the provider.
    * @param info driver specific information
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def createCatalog(info: SeqEquiv[PropertyValue]): Unit
}

object XCreateCatalog {
  @scala.inline
  def apply(
    acquire: () => Unit,
    createCatalog: SeqEquiv[PropertyValue] => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XCreateCatalog = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), createCatalog = js.Any.fromFunction1(createCatalog), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XCreateCatalog]
  }
}

