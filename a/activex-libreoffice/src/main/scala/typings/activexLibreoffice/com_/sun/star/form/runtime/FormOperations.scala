package typings.activexLibreoffice.com_.sun.star.form.runtime

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.form.XForm
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSetUpdate
import typings.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * encapsulates operations on a database form which has a UI representation, and is interacting with the user.
  * @since OOo 2.2
  */
@js.native
trait FormOperations extends XFormOperations {
  
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.component.DataForm} instance.
    * @throws IllegalArgumentException if the given form is `NULL` , or does not support the {@link com.sun.star.form.component.DataForm} service.
    */
  def createWithForm(Form: XForm): Unit = js.native
  
  /**
    * creates a `FormOperations` instance which works on a {@link com.sun.star.form.FormController} instance.
    * @throws IllegalArgumentException if the given form controller is `NULL` , or does not have a model denoting a valid {@link com.sun.star.form.component.Da
    */
  def createWithFormController(Controller: XFormController): Unit = js.native
}
object FormOperations {
  
  @scala.inline
  def apply(
    Controller: XFormController,
    Cursor: XRowSet,
    FeatureInvalidation: XFeatureInvalidation,
    UpdateCursor: XResultSetUpdate,
    acquire: () => Unit,
    addEventListener: XEventListener => Unit,
    commitCurrentControl: () => Boolean,
    commitCurrentRecord: js.Array[Boolean] => Boolean,
    createWithForm: XForm => Unit,
    createWithFormController: XFormController => Unit,
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
    val __obj = js.Dynamic.literal(Controller = Controller.asInstanceOf[js.Any], Cursor = Cursor.asInstanceOf[js.Any], FeatureInvalidation = FeatureInvalidation.asInstanceOf[js.Any], UpdateCursor = UpdateCursor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), commitCurrentControl = js.Any.fromFunction0(commitCurrentControl), commitCurrentRecord = js.Any.fromFunction1(commitCurrentRecord), createWithForm = js.Any.fromFunction1(createWithForm), createWithFormController = js.Any.fromFunction1(createWithFormController), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction1(execute), executeWithArguments = js.Any.fromFunction2(executeWithArguments), getState = js.Any.fromFunction1(getState), isEnabled = js.Any.fromFunction1(isEnabled), isInsertionRow = js.Any.fromFunction0(isInsertionRow), isModifiedRow = js.Any.fromFunction0(isModifiedRow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
    __obj.asInstanceOf[FormOperations]
  }
  
  @scala.inline
  implicit class FormOperationsOps[Self <: FormOperations] (val x: Self) extends AnyVal {
    
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
    def setCreateWithForm(value: XForm => Unit): Self = this.set("createWithForm", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCreateWithFormController(value: XFormController => Unit): Self = this.set("createWithFormController", js.Any.fromFunction1(value))
  }
}
