package typings.activexLibreoffice.com_.sun.star.form.runtime

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typings.activexLibreoffice.com_.sun.star.awt.XTabController
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.form.XConfirmDeleteBroadcaster
import typings.activexLibreoffice.com_.sun.star.form.XConfirmDeleteListener
import typings.activexLibreoffice.com_.sun.star.form.XDatabaseParameterBroadcaster2
import typings.activexLibreoffice.com_.sun.star.form.XDatabaseParameterListener
import typings.activexLibreoffice.com_.sun.star.form.XFormControllerListener
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdb.XRowSetApproveBroadcaster
import typings.activexLibreoffice.com_.sun.star.sdb.XRowSetApproveListener
import typings.activexLibreoffice.com_.sun.star.sdb.XSQLErrorBroadcaster
import typings.activexLibreoffice.com_.sun.star.sdb.XSQLErrorListener
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XModeSelector
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
@js.native
trait XFormController
  extends XIndexAccess
     with XTabController
     with XChild
     with XEnumerationAccess
     with XComponent
     with XModifyBroadcaster
     with XConfirmDeleteBroadcaster
     with XSQLErrorBroadcaster
     with XRowSetApproveBroadcaster
     with XDatabaseParameterBroadcaster2
     with XModeSelector
     with XFilterController {
  
  /** allows to delegate certain tasks to the context of the form controller */
  var Context: XFormControllerContext = js.native
  
  /** provides access to the currently active control */
  var CurrentControl: XControl = js.native
  
  /**
    * denotes the instance which is used to implement operations on the form which the controller works for.
    *
    * This instance can be used, for instance, to determine the current state of certain form features.
    */
  var FormOperations: XFormOperations = js.native
  
  /** used (if not `NULL` ) for user interactions triggered by the form controller. */
  var InteractionHandler: XInteractionHandler = js.native
  
  /** adds the specified listener to receive notifications whenever the activation state of the controller changes. */
  def addActivateListener(Listener: XFormControllerListener): Unit = js.native
  
  /**
    * adds a controller to the list of child controllers
    * @throws com::sun::star::lang::IllegalArgumentException if the given controller is `NULL` , or cannot rightfully be a child controller. Since controllers
    */
  def addChildController(ChildController: XFormController): Unit = js.native
  
  /** removes the specified listener from the list of components to receive notifications whenever the activation state of the controller changes. */
  def removeActivateListener(Listener: XFormControllerListener): Unit = js.native
}
object XFormController {
  
  @scala.inline
  def apply(
    ActiveTerm: Double,
    Container: XControlContainer,
    Context: XFormControllerContext,
    Controls: SafeArray[XControl],
    Count: Double,
    CurrentControl: XControl,
    DisjunctiveTerms: Double,
    ElementType: `type`,
    FilterComponents: Double,
    FormOperations: XFormOperations,
    InteractionHandler: XInteractionHandler,
    Mode: String,
    Parent: XInterface,
    PredicateExpressions: SafeArray[SafeArray[String]],
    SupportedModes: SafeArray[String],
    acquire: () => Unit,
    activateFirst: () => Unit,
    activateLast: () => Unit,
    activateTabOrder: () => Unit,
    addActivateListener: XFormControllerListener => Unit,
    addChildController: XFormController => Unit,
    addConfirmDeleteListener: XConfirmDeleteListener => Unit,
    addDatabaseParameterListener: XDatabaseParameterListener => Unit,
    addEventListener: XEventListener => Unit,
    addFilterControllerListener: XFilterControllerListener => Unit,
    addModifyListener: XModifyListener => Unit,
    addParameterListener: XDatabaseParameterListener => Unit,
    addRowSetApproveListener: XRowSetApproveListener => Unit,
    addSQLErrorListener: XSQLErrorListener => Unit,
    appendEmptyDisjunctiveTerm: () => Unit,
    autoTabOrder: () => Unit,
    createEnumeration: () => XEnumeration,
    dispose: () => Unit,
    getByIndex: Double => js.Any,
    getContainer: () => XControlContainer,
    getControls: () => SafeArray[XControl],
    getCount: () => Double,
    getElementType: () => `type`,
    getFilterComponent: Double => XControl,
    getMode: () => String,
    getModel: () => XTabControllerModel,
    getParent: () => XInterface,
    getPredicateExpressions: () => SafeArray[SafeArray[String]],
    getSupportedModes: () => SafeArray[String],
    hasElements: () => Boolean,
    queryInterface: `type` => js.Any,
    release: () => Unit,
    removeActivateListener: XFormControllerListener => Unit,
    removeConfirmDeleteListener: XConfirmDeleteListener => Unit,
    removeDatabaseParameterListener: XDatabaseParameterListener => Unit,
    removeDisjunctiveTerm: Double => Unit,
    removeEventListener: XEventListener => Unit,
    removeFilterControllerListener: XFilterControllerListener => Unit,
    removeModifyListener: XModifyListener => Unit,
    removeParameterListener: XDatabaseParameterListener => Unit,
    removeRowSetApproveListener: XRowSetApproveListener => Unit,
    removeSQLErrorListener: XSQLErrorListener => Unit,
    setContainer: XControlContainer => Unit,
    setMode: String => Unit,
    setModel: XTabControllerModel => Unit,
    setParent: XInterface => Unit,
    setPredicateExpression: (Double, Double, String) => Unit,
    supportsMode: String => Boolean
  ): XFormController = {
    val __obj = js.Dynamic.literal(ActiveTerm = ActiveTerm.asInstanceOf[js.Any], Container = Container.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], CurrentControl = CurrentControl.asInstanceOf[js.Any], DisjunctiveTerms = DisjunctiveTerms.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FilterComponents = FilterComponents.asInstanceOf[js.Any], FormOperations = FormOperations.asInstanceOf[js.Any], InteractionHandler = InteractionHandler.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PredicateExpressions = PredicateExpressions.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), addActivateListener = js.Any.fromFunction1(addActivateListener), addChildController = js.Any.fromFunction1(addChildController), addConfirmDeleteListener = js.Any.fromFunction1(addConfirmDeleteListener), addDatabaseParameterListener = js.Any.fromFunction1(addDatabaseParameterListener), addEventListener = js.Any.fromFunction1(addEventListener), addFilterControllerListener = js.Any.fromFunction1(addFilterControllerListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addParameterListener = js.Any.fromFunction1(addParameterListener), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), addSQLErrorListener = js.Any.fromFunction1(addSQLErrorListener), appendEmptyDisjunctiveTerm = js.Any.fromFunction0(appendEmptyDisjunctiveTerm), autoTabOrder = js.Any.fromFunction0(autoTabOrder), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFilterComponent = js.Any.fromFunction1(getFilterComponent), getMode = js.Any.fromFunction0(getMode), getModel = js.Any.fromFunction0(getModel), getParent = js.Any.fromFunction0(getParent), getPredicateExpressions = js.Any.fromFunction0(getPredicateExpressions), getSupportedModes = js.Any.fromFunction0(getSupportedModes), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivateListener = js.Any.fromFunction1(removeActivateListener), removeConfirmDeleteListener = js.Any.fromFunction1(removeConfirmDeleteListener), removeDatabaseParameterListener = js.Any.fromFunction1(removeDatabaseParameterListener), removeDisjunctiveTerm = js.Any.fromFunction1(removeDisjunctiveTerm), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFilterControllerListener = js.Any.fromFunction1(removeFilterControllerListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeParameterListener = js.Any.fromFunction1(removeParameterListener), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener), removeSQLErrorListener = js.Any.fromFunction1(removeSQLErrorListener), setContainer = js.Any.fromFunction1(setContainer), setMode = js.Any.fromFunction1(setMode), setModel = js.Any.fromFunction1(setModel), setParent = js.Any.fromFunction1(setParent), setPredicateExpression = js.Any.fromFunction3(setPredicateExpression), supportsMode = js.Any.fromFunction1(supportsMode))
    __obj.asInstanceOf[XFormController]
  }
  
  @scala.inline
  implicit class XFormControllerOps[Self <: XFormController] (val x: Self) extends AnyVal {
    
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
    def setContext(value: XFormControllerContext): Self = this.set("Context", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentControl(value: XControl): Self = this.set("CurrentControl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFormOperations(value: XFormOperations): Self = this.set("FormOperations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInteractionHandler(value: XInteractionHandler): Self = this.set("InteractionHandler", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddActivateListener(value: XFormControllerListener => Unit): Self = this.set("addActivateListener", js.Any.fromFunction1(value))
    
    @scala.inline
    def setAddChildController(value: XFormController => Unit): Self = this.set("addChildController", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRemoveActivateListener(value: XFormControllerListener => Unit): Self = this.set("removeActivateListener", js.Any.fromFunction1(value))
  }
}
