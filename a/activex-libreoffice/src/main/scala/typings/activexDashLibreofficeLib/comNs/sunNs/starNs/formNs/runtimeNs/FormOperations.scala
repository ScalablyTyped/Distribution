package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

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
  def createWithForm(Form: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XForm): scala.Unit
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.FormController} instance.
    * @throws IllegalArgumentException if the given form controller is `NULL` , or does not have a model denoting a valid {@link com.sun.star.form.component.Da
    */
  def createWithFormController(Controller: XFormController): scala.Unit
}

object FormOperations {
  @scala.inline
  def apply(
    Controller: XFormController,
    Cursor: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet,
    FeatureInvalidation: XFeatureInvalidation,
    UpdateCursor: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetUpdate,
    acquire: () => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    commitCurrentControl: () => scala.Boolean,
    commitCurrentRecord: js.Array[scala.Boolean] => scala.Boolean,
    createWithForm: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XForm => scala.Unit,
    createWithFormController: XFormController => scala.Unit,
    dispose: () => scala.Unit,
    execute: scala.Double => scala.Unit,
    executeWithArguments: (scala.Double, activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]) => scala.Unit,
    getState: scala.Double => FeatureState,
    isEnabled: scala.Double => scala.Boolean,
    isInsertionRow: () => scala.Boolean,
    isModifiedRow: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit
  ): FormOperations = {
    val __obj = js.Dynamic.literal(Controller = Controller, Cursor = Cursor, FeatureInvalidation = FeatureInvalidation, UpdateCursor = UpdateCursor, acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), commitCurrentControl = js.Any.fromFunction0(commitCurrentControl), commitCurrentRecord = js.Any.fromFunction1(commitCurrentRecord), createWithForm = js.Any.fromFunction1(createWithForm), createWithFormController = js.Any.fromFunction1(createWithFormController), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction1(execute), executeWithArguments = js.Any.fromFunction2(executeWithArguments), getState = js.Any.fromFunction1(getState), isEnabled = js.Any.fromFunction1(isEnabled), isInsertionRow = js.Any.fromFunction0(isInsertionRow), isModifiedRow = js.Any.fromFunction0(isModifiedRow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
  
    __obj.asInstanceOf[FormOperations]
  }
}

