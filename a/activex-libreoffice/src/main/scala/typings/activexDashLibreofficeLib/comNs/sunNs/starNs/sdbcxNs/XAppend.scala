package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** is used for creating and appending new objects to a specific container. */
trait XAppend
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * creates a new object using the given descriptor and appends it to the related container. ** Note: ** The descriptor will not be changed and can be
    * used again to append another object.
    * @param descriptor the descriptor which should be serve to append a new object
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs.
    */
  def appendByDescriptor(descriptor: activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet): scala.Unit
}

object XAppend {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    appendByDescriptor: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.XPropertySet, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XAppend = {
    val __obj = js.Dynamic.literal(acquire = acquire, appendByDescriptor = appendByDescriptor, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XAppend]
  }
}

