package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.validationNs

import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.unoNs.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies support for validating a component
  * @see XValidator
  */
trait XValidatable extends XInterface {
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
  def setValidator(Validator: XValidator): Unit
}

object XValidatable {
  @scala.inline
  def apply(
    Validator: XValidator,
    acquire: () => Unit,
    getValidator: () => XValidator,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    setValidator: XValidator => Unit
  ): XValidatable = {
    val __obj = js.Dynamic.literal(Validator = Validator, acquire = js.Any.fromFunction0(acquire), getValidator = js.Any.fromFunction0(getValidator), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), setValidator = js.Any.fromFunction1(setValidator))
  
    __obj.asInstanceOf[XValidatable]
  }
}

