package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.validationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies support for validating a component
  * @see XValidator
  */
trait XValidatable
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface {
  /** retrieves the external instance which is currently used to validate the component */
  var Validator: XValidator
  /** retrieves the external instance which is currently used to validate the component */
  def getValidator(): XValidator
  /**
    * sets an external instance which is able to validate the component
    *
    * Any previously active validator will be revoked - there can be only one!
    * @param Validator the new validator which is to be used by the component. May be `NULL` , in this case only the current validator is revoked.
    * @throws com::sun::star::util::VetoException if changing the validator is not allowed in the current component state
    */
  def setValidator(Validator: XValidator): scala.Unit
}

object XValidatable {
  @scala.inline
  def apply(
    Validator: XValidator,
    acquire: js.Function0[scala.Unit],
    getValidator: js.Function0[XValidator],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    setValidator: js.Function1[XValidator, scala.Unit]
  ): XValidatable = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Validator")(Validator)
    __obj.updateDynamic("acquire")(acquire)
    __obj.updateDynamic("getValidator")(getValidator)
    __obj.updateDynamic("queryInterface")(queryInterface)
    __obj.updateDynamic("release")(release)
    __obj.updateDynamic("setValidator")(setValidator)
    __obj.asInstanceOf[XValidatable]
  }
}

