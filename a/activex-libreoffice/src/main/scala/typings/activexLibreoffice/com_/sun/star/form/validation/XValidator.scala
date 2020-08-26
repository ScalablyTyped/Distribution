package typings.activexLibreoffice.com_.sun.star.form.validation

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component able to validate (the content of) other components
  *
  * Validators support simple validity checks and retrieving justifications for invalidity.
  *
  * Validators may additionally support dynamic validity constraints. In such a case, the validity of a given value may change, without the value changing
  * itself. ;  To be notified about this, interested components should register as {@link XValidityConstraintListener} .
  * @see XValidatable
  */
@js.native
trait XValidator extends XInterface {
  /**
    * registers the given validity listener.
    *
    * Usually, an {@link XValidatable} instance will also add itself as validity listener, as soon as the validator is introduced to it.
    *
    * Implementations which do not support dynamic validity constraints should simply ignore this call.
    * @see XValidityConstraintListener
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def addValidityConstraintListener(Listener: XValidityConstraintListener): Unit = js.native
  /**
    * retrieves a justification for the invalidity of the given value
    * @param Value the value which has been recognized as being invalid
    * @returns a human-readable string, which explains why the given value is considered invalid.
    */
  def explainInvalid(Value: js.Any): String = js.native
  /**
    * determines whether the given value is valid
    * @param Value the value to check for validity
    * @returns `TRUE` if and only if the value is considered valid.
    */
  def isValid(Value: js.Any): Boolean = js.native
  /**
    * revokes the given validity listener
    * @see XValidityConstraintListener
    * @throws com::sun::star::lang::NullPointerException if the given listener is `NULL`
    */
  def removeValidityConstraintListener(Listener: XValidityConstraintListener): Unit = js.native
}

object XValidator {
  @scala.inline
  def apply(
    acquire: () => Unit,
    addValidityConstraintListener: XValidityConstraintListener => Unit,
    explainInvalid: js.Any => String,
    isValid: js.Any => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeValidityConstraintListener: XValidityConstraintListener => Unit
  ): XValidator = {
    val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), addValidityConstraintListener = js.Any.fromFunction1(addValidityConstraintListener), explainInvalid = js.Any.fromFunction1(explainInvalid), isValid = js.Any.fromFunction1(isValid), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeValidityConstraintListener = js.Any.fromFunction1(removeValidityConstraintListener))
    __obj.asInstanceOf[XValidator]
  }
  @scala.inline
  implicit class XValidatorOps[Self <: XValidator] (val x: Self) extends AnyVal {
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
    def setAddValidityConstraintListener(value: XValidityConstraintListener => Unit): Self = this.set("addValidityConstraintListener", js.Any.fromFunction1(value))
    @scala.inline
    def setExplainInvalid(value: js.Any => String): Self = this.set("explainInvalid", js.Any.fromFunction1(value))
    @scala.inline
    def setIsValid(value: js.Any => Boolean): Self = this.set("isValid", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveValidityConstraintListener(value: XValidityConstraintListener => Unit): Self = this.set("removeValidityConstraintListener", js.Any.fromFunction1(value))
  }
  
}

