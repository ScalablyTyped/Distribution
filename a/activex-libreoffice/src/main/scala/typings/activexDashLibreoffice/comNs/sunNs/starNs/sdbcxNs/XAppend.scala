package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcxNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.XPropertySet
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for creating and appending new objects to a specific container. */
trait XAppend extends XInterface {
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param descriptor the descriptor which should be serve to append a new object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendByDescriptor(descriptor: XPropertySet): Unit
}

object XAppend {
  @scala.inline
  def apply(
    acquire: () => Unit,
    appendByDescriptor: XPropertySet => Unit,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XAppend = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), appendByDescriptor = js.Any.fromFunction1(appendByDescriptor), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XAppend]
  }
}

