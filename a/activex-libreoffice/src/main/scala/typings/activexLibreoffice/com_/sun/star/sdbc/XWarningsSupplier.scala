package typings.activexLibreoffice.com_.sun.star.sdbc

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * should be implemented of objects which may report warnings or non critical errors.
  * @see com.sun.star.sdbc.SQLWarning
  */
@js.native
trait XWarningsSupplier extends XInterface {
  /**
    * returns the first warning reported by calls on an object that supports the usage of warnings.
    *
    * **Note:** Subsequent warnings will be chained to this {@link com.sun.star.sdbc.SQLWarning} .
    * @returns the warnings
    * @throws SQLException if a database access error occurs.
    */
  val Warnings: js.Any = js.native
  /**
    * clears all warnings reported for the object implementing the interface. After a call to this method, the method {@link
    * com.sun.star.sdbc.XWarningsSupplier.getWarnings()} returns `VOID` until a new warning is reported for the object.
    * @throws SQLException if a database access error occurs.
    */
  def clearWarnings(): Unit = js.native
  /**
    * returns the first warning reported by calls on an object that supports the usage of warnings.
    *
    * **Note:** Subsequent warnings will be chained to this {@link com.sun.star.sdbc.SQLWarning} .
    * @returns the warnings
    * @throws SQLException if a database access error occurs.
    */
  def getWarnings(): js.Any = js.native
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
    val __obj = js.Dynamic.literal(Warnings = Warnings.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), clearWarnings = js.Any.fromFunction0(clearWarnings), getWarnings = js.Any.fromFunction0(getWarnings), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
    __obj.asInstanceOf[XWarningsSupplier]
  }
  @scala.inline
  implicit class XWarningsSupplierOps[Self <: XWarningsSupplier] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setWarnings(value: js.Any): Self = this.set("Warnings", value.asInstanceOf[js.Any])
    @scala.inline
    def setClearWarnings(value: () => Unit): Self = this.set("clearWarnings", js.Any.fromFunction0(value))
    @scala.inline
    def setGetWarnings(value: () => js.Any): Self = this.set("getWarnings", js.Any.fromFunction0(value))
  }
  
}

