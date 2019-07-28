package typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * should be implemented of objects which may report warnings or non critical errors.
  * @see com.sun.star.sdbc.SQLWarning
  */
trait XWarningsSupplier extends XInterface {
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
  def clearWarnings(): Unit
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
    acquire: () => Unit,
    clearWarnings: () => Unit,
    getWarnings: () => js.Any,
    queryInterface: `type` => js.Any,
    release: () => Unit
  ): XWarningsSupplier = {
    val __obj = js.Dynamic.literal(Warnings = Warnings, acquire = js.Any.fromFunction0(acquire), clearWarnings = js.Any.fromFunction0(clearWarnings), getWarnings = js.Any.fromFunction0(getWarnings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
  
    __obj.asInstanceOf[XWarningsSupplier]
  }
}

