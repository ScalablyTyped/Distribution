package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * encapsulates operations on a database form.
  *
  * This instance allows for operations on a user interface form, by saving its clients from various tedious and error-prone operations.
  *
  * As an example, imagine you have a database form, displayed in some user interface, which you want to move to the next record. ;  It is as easy as
  * calling {@link com.sun.star.sdbc.XResultSet.next()} on this form, right? Wrong. First, you need to care for saving the current record, so the user
  * doesn't lose her input. So you need to call {@link com.sun.star.sdbc.XResultSetUpdate.updateRow()} or {@link
  * com.sun.star.sdbc.XResultSetUpdate.insertRow()} , depending on the form's {@link com.sun.star.sdb.RowSet.IsNew} property. ;  But then you're done,
  * right? Wrong, again. ;  When the user just entered some data into one of the form fields, but did not yet leave this field, then the data is not yet
  * committed to the form, not to talk about being committed to the underlying database. So, before everything else, you would need to obtain the active
  * control of the form, and commit it. ; **Now** you're done ...
  *
  * As another example, consider that you want to delete the current record from the form. You have to take into account any
  * com::sun::star::form::XConfirmDeleteListeners registered at the {@link com.sun.star.form.FormController} or the {@link
  * com.sun.star.form.component.DataForm} .
  *
  * If you agree that this is ugly to do and maintain, then `XFormOperations` is for you. It provides a {@link execute()} method, which will do all of the
  * above for you; plus some similar convenient wrappers for similar functionality.
  * @see FormFeature
  * @since OOo 2.2
  */
trait XFormOperations
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent {
  /**
    * provides access to the form controller which the instance is operating on.
    *
    * Note that it is possible to operate on a user interface form without actually having access to the form controller instance. However, in this case
    * some functionality will not be available. In particular, every feature which relies on the active control of the controller might be of limited use.
    */
  var Controller: XFormController
  /** provides access to the cursor of the form the instance is operating on. */
  var Cursor: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet
  /**
    * denotes the instance which should be notified about features whose state might have changed.
    *
    * If this attribute is not `NULL` , the instance which it denotes will be notified whenever the state of any supported feature might have changed.
    *
    * For instance, imagine a form whose current row has just been moved to another record, using the {@link execute()} method. This means that potentially,
    * the state of all movement-related features might have changed.
    *
    * Note that the instance does not actually notify changes in the feature states, but only **potential** changes: It's up to the callee to react on this
    * appropriately. This is since OpenOffice.org's application framework features own mechanisms to cache and invalidate feature states, so we do not
    * burden this implementation here with such mechanisms.
    * @see FormFeature
    */
  var FeatureInvalidation: XFeatureInvalidation
  /** provides access to the update cursor of the form the instance is operating on. */
  var UpdateCursor: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetUpdate
  /**
    * commits the current control of our controller
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs
    */
  def commitCurrentControl(): scala.Boolean
  /**
    * commits the current record of the form
    * @param RecordInserted will be `TRUE` if a record has been inserted, i.e. the form was positioned on the insertion row.
    * @returns `TRUE` if and only if the current record needed being committed. That's the case if the record or the active control of the form were modified.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs
    */
  def commitCurrentRecord(RecordInserted: js.Array[scala.Boolean]): scala.Boolean
  /**
    * executes the operation associated with the given feature
    * @param Feature the feature which is to be executed. Must be one of the {@link FormFeature} constants.
    * @see executeWithArguments
    * @throws com::sun::star::lang::IllegalArgumentException if the given Feature is unknown, not executable, or strictly requires arguments to be executed.
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs
    * @throws com::sun::star::lang::WrappedTargetException if an exception is caught which is no {@link com.sun.star.uno.RuntimeException} and no {@link com.su
    */
  def execute(Feature: scala.Double): scala.Unit
  /**
    * executes the operation associated with the given feature, with passing arguments for execution
    * @param Feature the feature which is to be executed. Must be one of the {@link FormFeature} constants.
    * @param Arguments the named arguments for the feature to execute. See the {@link FormFeature} list for features which require arguments.
    * @throws com::sun::star::lang::IllegalArgumentException if the given feature is unknown, or not executable
    * @throws com::sun::star::lang::IllegalArgumentException if the given arguments are not sufficient to execute the feature
    * @throws com::sun::star::sdbc::SQLException if a database access error occurs
    * @throws com::sun::star::lang::WrappedTargetException if an exception is caught which is no {@link com.sun.star.uno.RuntimeException} and no {@link com.su
    */
  def executeWithArguments(
    Feature: scala.Double,
    Arguments: activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue]
  ): scala.Unit
  /**
    * retrieves the current state of the given feature
    *
    * You would usually use this to update some user interface to reflect this state. For instance, you could imagine a toolbar button which is associated
    * with a given feature. This button would be enabled if and only if the respective feature is currently available, and be checked if and only if the
    * feature state is a `boolean` evaluating to `TRUE` .
    * @param Feature the feature whose state is to be determined. Must be one of the {@link FormFeature} constants. ;  An invalid value here will be silently
    */
  def getState(Feature: scala.Double): FeatureState
  /**
    * determines whether a feature is currently enabled.
    *
    * Calling this is equivalent to calling {@link getState()} , and evaluating the {@link FeatureState.Enabled} member.
    * @param Feature the feature whose state is to be determined. Must be one of the {@link FormFeature} constants. ;  An invalid value here will be silently
    */
  def isEnabled(Feature: scala.Double): scala.Boolean
  /**
    * determines whether the form is currently positioned on the insertion row
    *
    * This is a convenience method only. Calling it is equivalent to examining the {@link com.sun.star.sdb.RowSet.IsNew} property of the form.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs obtaining the form property
    */
  def isInsertionRow(): scala.Boolean
  /**
    * determines whether the current row of the form is modified
    *
    * This is a convenience method only. Calling it is equivalent to examining the {@link com.sun.star.sdb.RowSet.IsModified} property of the form.
    * @throws com::sun::star::lang::WrappedTargetException if an error occurs obtaining the form property
    */
  def isModifiedRow(): scala.Boolean
}

object XFormOperations {
  @scala.inline
  def apply(
    Controller: XFormController,
    Cursor: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XRowSet,
    FeatureInvalidation: XFeatureInvalidation,
    UpdateCursor: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbcNs.XResultSetUpdate,
    acquire: js.Function0[scala.Unit],
    addEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit],
    commitCurrentControl: js.Function0[scala.Boolean],
    commitCurrentRecord: js.Function1[js.Array[scala.Boolean], scala.Boolean],
    dispose: js.Function0[scala.Unit],
    execute: js.Function1[scala.Double, scala.Unit],
    executeWithArguments: js.Function2[
      scala.Double, 
      activexDashLibreofficeLib.LibreOfficeNs.SeqEquiv[activexDashLibreofficeLib.comNs.sunNs.starNs.beansNs.NamedValue], 
      scala.Unit
    ],
    getState: js.Function1[scala.Double, FeatureState],
    isEnabled: js.Function1[scala.Double, scala.Boolean],
    isInsertionRow: js.Function0[scala.Boolean],
    isModifiedRow: js.Function0[scala.Boolean],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit],
    removeEventListener: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener, scala.Unit]
  ): XFormOperations = {
    val __obj = js.Dynamic.literal(Controller = Controller, Cursor = Cursor, FeatureInvalidation = FeatureInvalidation, UpdateCursor = UpdateCursor, acquire = acquire, addEventListener = addEventListener, commitCurrentControl = commitCurrentControl, commitCurrentRecord = commitCurrentRecord, dispose = dispose, execute = execute, executeWithArguments = executeWithArguments, getState = getState, isEnabled = isEnabled, isInsertionRow = isInsertionRow, isModifiedRow = isModifiedRow, queryInterface = queryInterface, release = release, removeEventListener = removeEventListener)
  
    __obj.asInstanceOf[XFormOperations]
  }
}

