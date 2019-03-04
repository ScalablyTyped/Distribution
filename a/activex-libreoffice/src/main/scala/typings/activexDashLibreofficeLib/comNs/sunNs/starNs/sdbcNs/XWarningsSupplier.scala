package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * should be implemented of objects which may report warnings or non critical errors.
  * @see com.sun.star.sdbc.SQLWarning
  */
trait XWarningsSupplier
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /**
    * returns the first warning reported by calls on an object that supports the usage of warnings.
    *
    * **Note:** Subsequent warnings will be chained to this {@link com.sun.star.sdbc.SQLWarning} .
    * @returns the warnings
    * @throws SQLException if a database access error occurs.
    */
  val Warnings: js.Any
  /**
    * clears all warnings reported for the object implementing the interface. After a call to this method, the method {@link
    * com.sun.star.sdbc.XWarningsSupplier.getWarnings()} returns `VOID` until a new warning is reported for the object.
    * @throws SQLException if a database access error occurs.
    */
  def clearWarnings(): scala.Unit
  /**
    * returns the first warning reported by calls on an object that supports the usage of warnings.
    *
    * **Note:** Subsequent warnings will be chained to this {@link com.sun.star.sdbc.SQLWarning} .
    * @returns the warnings
    * @throws SQLException if a database access error occurs.
    */
  def getWarnings(): js.Any
}

object XWarningsSupplier {
  @scala.inline
  def apply(
    Warnings: js.Any,
    acquire: js.Function0[scala.Unit],
    clearWarnings: js.Function0[scala.Unit],
    getWarnings: js.Function0[js.Any],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XWarningsSupplier = {
    val __obj = js.Dynamic.literal(Warnings = Warnings, acquire = acquire, clearWarnings = clearWarnings, getWarnings = getWarnings, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XWarningsSupplier]
  }
}

