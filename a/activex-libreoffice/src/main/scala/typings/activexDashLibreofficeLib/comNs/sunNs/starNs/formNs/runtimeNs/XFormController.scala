package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * specifies a component controlling the interaction between the user and form functionality.
  *
  * As soon as a form (containing controls) is to be presented to the user, there is a need for an instance controlling the user interaction. ;  Such a
  * `FormController` is responsible for dialog processing, like controlling the tab order and the grouping of controls.
  *
  * As a form may contain one or many subforms, a {@link FormController} may contain one or more other FormControllers, so the form model structure or
  * hierarchy is reflected in the structure of FormControllers. That is, retrieving the parent of the model of a controller will give you the same object
  * as retrieving the model of the parent of the controller. Similarly, retrieving the model of the `n`<sup>th</sup> child of a controller gives you the
  * same object as retrieving the `n`<sup>th</sup> child of the model of the controller.
  *
  * A controller is called **active** if one of the controls it is responsible for has the focus, else inactive. To be notified whenever this activation
  * state of a given controller changes, you can add listeners.
  *
  * This interface supersedes the {@link com.sun.star.form.FormController} .
  *
  * **Responsibilities**
  *
  * A {@link FormController} is responsible for a {@link com.sun.star.awt.UnoControlContainer} , and all controls therein.
  *
  * Furthermore, a form controller is responsible for preventing invalid user input. That is, if the form contains controls bound to a database, or to an
  * external validator, then the form controller will check their current value when the current record is to be saved to the database.
  *
  * First, it will check whether any controls with an external validator exist. If so, those validators will be asked to validate the current control
  * content. If this fails, the message provided by the validator is displayed to the user, the control is focused, and the update of the record is
  * vetoed.
  *
  * Second, the controls are examined for NULL values. If a control is bound to a database field which is declared to be `NOT NULL` , no auto-increment
  * field, but still `NULL` , then an error message is shown to the user saying that input is required, the respective control is focused, and the update
  * of the record is vetoed.
  *
  * Note that you can present the second check - for database fields containing `NULL` values - on a per-form and a per-database basis. ;  For the former,
  * you need to add a boolean property `FormsCheckRequiredFields` to the form (aka the `FormController` 's model), using its {@link
  * com.sun.star.beans.XPropertyContainer.addProperty()} method, with a value of `FALSE` . ;  For the latter, you need to set the respective property of
  * the data source's `Settings` (also named `FormsCheckRequiredFields` ) to `FALSE` .
  *
  * Alternatively, you can prevent the check on a per-control basis, using the {@link DataAwareControlModel.InputRequired} property of a single control
  * model.
  *
  * If a control which the controller is responsible for supports the {@link com.sun.star.frame.XDispatchProviderInterception} interface, the controller
  * registers a dispatch interceptor. Then, the control can try to delegate part of its functionality to the controller by querying the dispatch
  * interceptor for it.
  *
  * Below, there's a list of URLs which have a defined meaning - if an implementation supports one of them, there must be a guaranteed semantics. However,
  * concrete implementations may support an arbitrary sub or super set of these URLs.
  *
  * In general, all URLs start with the same prefix, namely **.uno:FormController/ ** . To this, a suffix is appended which describes the requested
  * functionality. ;  Example: The URL suffix for deleting the current record is **deleteRecord** , so the complete URL for requesting a dispatcher for
  * this functionality is **.uno:FormController/deleteRecord** .
  *
  * Some URLs may require parameters. For this, the sequence of {@link com.sun.star.beans.PropertyValues} passed to the {@link
  * com.sun.star.frame.XDispatch.dispatch()} call is used - every property value is used as one named parameter.
  *
  * For all URLs, interested parties can register as status listeners ( {@link com.sun.star.frame.XStatusListener} ) at the dispatchers, and be notified
  * whenever the functionality associated with the URL becomes enabled or disabled. ;  For instance, the URL with the suffix **moveToFirst** is associated
  * with moving the form to the first record, and it will be disabled in case the form is already positioned on the first record.
  *
  * {{table here, see documentation}}
  * @see com.sun.star.form.component:Form
  * @see com.sun.star.form.binding.BindableControlModel
  * @see com.sun.star.sdb.DataSource.Settings
  * @since OOo 3.3
  */
trait XFormController
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XIndexAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabController
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XChild
     with activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumerationAccess
     with activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XComponent
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XConfirmDeleteBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSQLErrorBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XRowSetApproveBroadcaster
     with activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XDatabaseParameterBroadcaster2
     with activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModeSelector
     with XFilterController {
  /** allows to delegate certain tasks to the context of the form controller */
  var Context: XFormControllerContext
  /** provides access to the currently active control */
  var CurrentControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl
  /**
    * denotes the instance which is used to implement operations on the form which the controller works for.
    *
    * This instance can be used, for instance, to determine the current state of certain form features.
    */
  var FormOperations: XFormOperations
  /** used (if not `NULL` ) for user interactions triggered by the form controller. */
  var InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler
  /** adds the specified listener to receive notifications whenever the activation state of the controller changes. */
  def addActivateListener(Listener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XFormControllerListener): scala.Unit
  /**
    * adds a controller to the list of child controllers
    * @throws com::sun::star::lang::IllegalArgumentException if the given controller is `NULL` , or cannot rightfully be a child controller. Since controllers
    */
  def addChildController(ChildController: XFormController): scala.Unit
  /** removes the specified listener from the list of components to receive notifications whenever the activation state of the controller changes. */
  def removeActivateListener(Listener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XFormControllerListener): scala.Unit
}

object XFormController {
  @scala.inline
  def apply(
    ActiveTerm: scala.Double,
    Container: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer,
    Context: XFormControllerContext,
    Controls: stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    Count: scala.Double,
    CurrentControl: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    DisjunctiveTerms: scala.Double,
    ElementType: activexDashLibreofficeLib.`type`,
    FilterComponents: scala.Double,
    FormOperations: XFormOperations,
    InteractionHandler: activexDashLibreofficeLib.comNs.sunNs.starNs.taskNs.XInteractionHandler,
    Mode: java.lang.String,
    Parent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    PredicateExpressions: stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    SupportedModes: stdLib.SafeArray[java.lang.String],
    acquire: () => scala.Unit,
    activateFirst: () => scala.Unit,
    activateLast: () => scala.Unit,
    activateTabOrder: () => scala.Unit,
    addActivateListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XFormControllerListener => scala.Unit,
    addChildController: XFormController => scala.Unit,
    addConfirmDeleteListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XConfirmDeleteListener => scala.Unit,
    addDatabaseParameterListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XDatabaseParameterListener => scala.Unit,
    addEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    addFilterControllerListener: XFilterControllerListener => scala.Unit,
    addModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    addParameterListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XDatabaseParameterListener => scala.Unit,
    addRowSetApproveListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XRowSetApproveListener => scala.Unit,
    addSQLErrorListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSQLErrorListener => scala.Unit,
    appendEmptyDisjunctiveTerm: () => scala.Unit,
    autoTabOrder: () => scala.Unit,
    createEnumeration: () => activexDashLibreofficeLib.comNs.sunNs.starNs.containerNs.XEnumeration,
    dispose: () => scala.Unit,
    getByIndex: scala.Double => js.Any,
    getContainer: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer,
    getControls: () => stdLib.SafeArray[activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl],
    getCount: () => scala.Double,
    getElementType: () => activexDashLibreofficeLib.`type`,
    getFilterComponent: scala.Double => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControl,
    getMode: () => java.lang.String,
    getModel: () => activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel,
    getParent: () => activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface,
    getPredicateExpressions: () => stdLib.SafeArray[stdLib.SafeArray[java.lang.String]],
    getSupportedModes: () => stdLib.SafeArray[java.lang.String],
    hasElements: () => scala.Boolean,
    queryInterface: activexDashLibreofficeLib.`type` => js.Any,
    release: () => scala.Unit,
    removeActivateListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XFormControllerListener => scala.Unit,
    removeConfirmDeleteListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XConfirmDeleteListener => scala.Unit,
    removeDatabaseParameterListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XDatabaseParameterListener => scala.Unit,
    removeDisjunctiveTerm: scala.Double => scala.Unit,
    removeEventListener: activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener => scala.Unit,
    removeFilterControllerListener: XFilterControllerListener => scala.Unit,
    removeModifyListener: activexDashLibreofficeLib.comNs.sunNs.starNs.utilNs.XModifyListener => scala.Unit,
    removeParameterListener: activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.XDatabaseParameterListener => scala.Unit,
    removeRowSetApproveListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XRowSetApproveListener => scala.Unit,
    removeSQLErrorListener: activexDashLibreofficeLib.comNs.sunNs.starNs.sdbNs.XSQLErrorListener => scala.Unit,
    setContainer: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XControlContainer => scala.Unit,
    setMode: java.lang.String => scala.Unit,
    setModel: activexDashLibreofficeLib.comNs.sunNs.starNs.awtNs.XTabControllerModel => scala.Unit,
    setParent: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface => scala.Unit,
    setPredicateExpression: (scala.Double, scala.Double, java.lang.String) => scala.Unit,
    supportsMode: java.lang.String => scala.Boolean
  ): XFormController = {
    val __obj = js.Dynamic.literal(ActiveTerm = ActiveTerm, Container = Container, Context = Context, Controls = Controls, Count = Count, CurrentControl = CurrentControl, DisjunctiveTerms = DisjunctiveTerms, ElementType = ElementType, FilterComponents = FilterComponents, FormOperations = FormOperations, InteractionHandler = InteractionHandler, Mode = Mode, Parent = Parent, PredicateExpressions = PredicateExpressions, SupportedModes = SupportedModes, acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), addActivateListener = js.Any.fromFunction1(addActivateListener), addChildController = js.Any.fromFunction1(addChildController), addConfirmDeleteListener = js.Any.fromFunction1(addConfirmDeleteListener), addDatabaseParameterListener = js.Any.fromFunction1(addDatabaseParameterListener), addEventListener = js.Any.fromFunction1(addEventListener), addFilterControllerListener = js.Any.fromFunction1(addFilterControllerListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addParameterListener = js.Any.fromFunction1(addParameterListener), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), addSQLErrorListener = js.Any.fromFunction1(addSQLErrorListener), appendEmptyDisjunctiveTerm = js.Any.fromFunction0(appendEmptyDisjunctiveTerm), autoTabOrder = js.Any.fromFunction0(autoTabOrder), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFilterComponent = js.Any.fromFunction1(getFilterComponent), getMode = js.Any.fromFunction0(getMode), getModel = js.Any.fromFunction0(getModel), getParent = js.Any.fromFunction0(getParent), getPredicateExpressions = js.Any.fromFunction0(getPredicateExpressions), getSupportedModes = js.Any.fromFunction0(getSupportedModes), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivateListener = js.Any.fromFunction1(removeActivateListener), removeConfirmDeleteListener = js.Any.fromFunction1(removeConfirmDeleteListener), removeDatabaseParameterListener = js.Any.fromFunction1(removeDatabaseParameterListener), removeDisjunctiveTerm = js.Any.fromFunction1(removeDisjunctiveTerm), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFilterControllerListener = js.Any.fromFunction1(removeFilterControllerListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeParameterListener = js.Any.fromFunction1(removeParameterListener), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener), removeSQLErrorListener = js.Any.fromFunction1(removeSQLErrorListener), setContainer = js.Any.fromFunction1(setContainer), setMode = js.Any.fromFunction1(setMode), setModel = js.Any.fromFunction1(setModel), setParent = js.Any.fromFunction1(setParent), setPredicateExpression = js.Any.fromFunction3(setPredicateExpression), supportsMode = js.Any.fromFunction1(supportsMode))
  
    __obj.asInstanceOf[XFormController]
  }
}

