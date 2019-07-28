package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.containerNs.XNameAccess
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** provides the access to a container of columns, typically used for tables and indexes. */
trait XColumnsSupplier extends XInterface {
  /**
    * returns the container of columns.
    * @returns the columns
    */
  val Columns: XNameAccess
  /**
    * returns the container of columns.
    * @returns the columns
    */
  def getColumns(): XNameAccess
}

object XColumnsSupplier {
  @scala.inline
  def apply(
    Columns: XNameAccess,
    acquire: () => Unit,
    getColumns: () => XNameAccess,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XColumnsSupplier = {
    val __obj = js.Dynamic.literal(Columns = Columns, acquire = js.Any.fromFunction0(acquire), getColumns = js.Any.fromFunction0(getColumns), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XColumnsSupplier]
  }
}

