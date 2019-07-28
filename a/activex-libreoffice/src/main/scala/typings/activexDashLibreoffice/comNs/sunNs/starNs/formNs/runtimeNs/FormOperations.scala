package typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.runtimeNs

import typings.activexDashLibreoffice.LibreOfficeNs.SeqEquiv
import typings.activexDashLibreoffice.`type`
import typings.activexDashLibreoffice.comNs.sunNs.starNs.beansNs.NamedValue
import typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.XForm
import typings.activexDashLibreoffice.comNs.sunNs.starNs.langNs.XEventListener
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XResultSetUpdate
import typings.activexDashLibreoffice.comNs.sunNs.starNs.sdbcNs.XRowSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates operations on a database form which has a UI representation, and is interacting with the user.
  * @since OOo 2.2
  */
trait FormOperations extends XFormOperations {
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.component.DataForm} instance.
    * @throws IllegalArgumentException if the given form is `NULL` , or does not support the {@link com.sun.star.form.component.DataForm} service.
    */
  def createWithForm(Form: XForm): Unit
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.FormController} instance.
    * @throws IllegalArgumentException if the given form controller is `NULL` , or does not have a model denoting a valid {@link com.sun.star.form.component.Da
    */
  def createWithFormController(Controller: typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.runtimeNs.XFormController): Unit
}

object FormOperations {
  @scala.inline
  def apply(
    Controller: typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.runtimeNs.XFormController,
    Cursor: XRowSet,
    FeatureInvalidation: XFeatureInvalidation,
    UpdateCursor: XResultSetUpdate,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    commitCurrentControl: () => Boolean,
    commitCurrentRecord: js.Array[Boolean] => Boolean,
    createWithForm: XForm => Unit,
    createWithFormController: typings.activexDashLibreoffice.comNs.sunNs.starNs.formNs.runtimeNs.XFormController => Unit,
    dispose: () => Unit,
    execute: Double => Unit,
    executeWithArguments: (Double, SeqEquiv[NamedValue]) => Unit,
    getState: Double => FeatureState,
    isEnabled: Double => Boolean,
    isInsertionRow: () => Boolean,
    isModifiedRow: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeEventListener: XEventListener => Unit
  ): FormOperations = {
    val __obj = js.Dynamic.literal(Controller = Controller, Cursor = Cursor, FeatureInvalidation = FeatureInvalidation, UpdateCursor = UpdateCursor, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), commitCurrentControl = js.Any.fromFunction0(commitCurrentControl), commitCurrentRecord = js.Any.fromFunction1(commitCurrentRecord), createWithForm = js.Any.fromFunction1(createWithForm), createWithFormController = js.Any.fromFunction1(createWithFormController), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction1(execute), executeWithArguments = js.Any.fromFunction2(executeWithArguments), getState = js.Any.fromFunction1(getState), isEnabled = js.Any.fromFunction1(isEnabled), isInsertionRow = js.Any.fromFunction0(isInsertionRow), isModifiedRow = js.Any.fromFunction0(isModifiedRow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[FormOperations]
  }
}

