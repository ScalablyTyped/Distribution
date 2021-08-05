package typings.activexLibreoffice.com_.sun.star.form

import typings.activexLibreoffice.LibreOffice.SeqEquiv
import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.activexLibreofficeNumbers.`10`
import typings.activexLibreoffice.activexLibreofficeNumbers.`11`
import typings.activexLibreoffice.activexLibreofficeNumbers.`12`
import typings.activexLibreoffice.activexLibreofficeNumbers.`13`
import typings.activexLibreoffice.activexLibreofficeNumbers.`14`
import typings.activexLibreoffice.activexLibreofficeNumbers.`15`
import typings.activexLibreoffice.activexLibreofficeNumbers.`16`
import typings.activexLibreoffice.activexLibreofficeNumbers.`17`
import typings.activexLibreoffice.activexLibreofficeNumbers.`18`
import typings.activexLibreoffice.activexLibreofficeNumbers.`19`
import typings.activexLibreoffice.activexLibreofficeNumbers.`1`
import typings.activexLibreoffice.activexLibreofficeNumbers.`2`
import typings.activexLibreoffice.activexLibreofficeNumbers.`3`
import typings.activexLibreoffice.activexLibreofficeNumbers.`4`
import typings.activexLibreoffice.activexLibreofficeNumbers.`5`
import typings.activexLibreoffice.activexLibreofficeNumbers.`6`
import typings.activexLibreoffice.activexLibreofficeNumbers.`7`
import typings.activexLibreoffice.activexLibreofficeNumbers.`8`
import typings.activexLibreoffice.activexLibreofficeNumbers.`9`
import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.activexLibreoffice.com_.sun.star.awt.XControlContainer
import typings.activexLibreoffice.com_.sun.star.awt.XTabController
import typings.activexLibreoffice.com_.sun.star.awt.XTabControllerModel
import typings.activexLibreoffice.com_.sun.star.beans.NamedValue
import typings.activexLibreoffice.com_.sun.star.container.XChild
import typings.activexLibreoffice.com_.sun.star.container.XEnumeration
import typings.activexLibreoffice.com_.sun.star.container.XEnumerationAccess
import typings.activexLibreoffice.com_.sun.star.container.XIndexAccess
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XComponent
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import typings.activexLibreoffice.com_.sun.star.sdb.XRowSetApproveBroadcaster
import typings.activexLibreoffice.com_.sun.star.sdb.XRowSetApproveListener
import typings.activexLibreoffice.com_.sun.star.sdb.XSQLErrorBroadcaster
import typings.activexLibreoffice.com_.sun.star.sdb.XSQLErrorListener
import typings.activexLibreoffice.com_.sun.star.sdbc.XResultSetUpdate
import typings.activexLibreoffice.com_.sun.star.sdbc.XRowSet
import typings.activexLibreoffice.com_.sun.star.task.XInteractionHandler
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import typings.activexLibreoffice.com_.sun.star.util.XModeSelector
import typings.activexLibreoffice.com_.sun.star.util.XModifyBroadcaster
import typings.activexLibreoffice.com_.sun.star.util.XModifyListener
import typings.std.SafeArray
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object runtime {
  
  /**
    * encapsulates the state of a {@link FormFeature}
    * @see XFormOperations
    * @since OOo 2.2
    */
  trait FeatureState extends StObject {
    
    /** determines whether the respective feature is enabled (i.e. available) in the current state of the form. */
    var Enabled: Boolean
    
    /** determines the state of the feature. The concrete semantics depends on the concrete {@link FormFeature} . */
    var State: js.Any
  }
  object FeatureState {
    
    inline def apply(Enabled: Boolean, State: js.Any): FeatureState = {
      val __obj = js.Dynamic.literal(Enabled = Enabled.asInstanceOf[js.Any], State = State.asInstanceOf[js.Any])
      __obj.asInstanceOf[FeatureState]
    }
    
    extension [Self <: FeatureState](x: Self) {
      
      inline def setEnabled(value: Boolean): Self = StObject.set(x, "Enabled", value.asInstanceOf[js.Any])
      
      inline def setState(value: js.Any): Self = StObject.set(x, "State", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * is an event fired by a filter controller, when the filter managed by the controller changes.
    * @see XFilterController
    * @since OOo 3.3
    */
  trait FilterEvent
    extends StObject
       with EventObject {
    
    /** denotes the index of the **disjunctive term** to which the event applies, if any. */
    var DisjunctiveTerm: Double
    
    /** denotes the index of the **filter component** to which the event applies, if any. */
    var FilterComponent: Double
    
    /** denotes the **predicate expression** associated with the event. */
    var PredicateExpression: String
  }
  object FilterEvent {
    
    inline def apply(DisjunctiveTerm: Double, FilterComponent: Double, PredicateExpression: String, Source: XInterface): FilterEvent = {
      val __obj = js.Dynamic.literal(DisjunctiveTerm = DisjunctiveTerm.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], PredicateExpression = PredicateExpression.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
      __obj.asInstanceOf[FilterEvent]
    }
    
    extension [Self <: FilterEvent](x: Self) {
      
      inline def setDisjunctiveTerm(value: Double): Self = StObject.set(x, "DisjunctiveTerm", value.asInstanceOf[js.Any])
      
      inline def setFilterComponent(value: Double): Self = StObject.set(x, "FilterComponent", value.asInstanceOf[js.Any])
      
      inline def setPredicateExpression(value: String): Self = StObject.set(x, "PredicateExpression", value.asInstanceOf[js.Any])
    }
  }
  
  /** specifies a component controlling the interaction between the user and multiple form controls belonging to a single form. */
  type FormController = typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController
  
  object FormFeature {
    
    /* Rewritten from type alias, can be one of: 
      - typings.activexLibreoffice.activexLibreofficeNumbers.`15`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`10`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`16`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`14`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`1`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`3`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`7`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`6`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`5`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`4`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`19`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`11`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`18`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`8`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`12`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`13`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`17`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`2`
      - typings.activexLibreoffice.activexLibreofficeNumbers.`9`
    */
    trait Constants extends StObject
    object Constants {
      
      inline def AutoFilter: `15` = 15.asInstanceOf[`15`]
      
      inline def DeleteRecord: `10` = 10.asInstanceOf[`10`]
      
      inline def InteractiveFilter: `16` = 16.asInstanceOf[`16`]
      
      inline def InteractiveSort: `14` = 14.asInstanceOf[`14`]
      
      inline def MoveAbsolute: `1` = 1.asInstanceOf[`1`]
      
      inline def MoveToFirst: `3` = 3.asInstanceOf[`3`]
      
      inline def MoveToInsertRow: `7` = 7.asInstanceOf[`7`]
      
      inline def MoveToLast: `6` = 6.asInstanceOf[`6`]
      
      inline def MoveToNext: `5` = 5.asInstanceOf[`5`]
      
      inline def MoveToPrevious: `4` = 4.asInstanceOf[`4`]
      
      inline def RefreshCurrentControl: `19` = 19.asInstanceOf[`19`]
      
      inline def ReloadForm: `11` = 11.asInstanceOf[`11`]
      
      inline def RemoveFilterAndSort: `18` = 18.asInstanceOf[`18`]
      
      inline def SaveRecordChanges: `8` = 8.asInstanceOf[`8`]
      
      inline def SortAscending: `12` = 12.asInstanceOf[`12`]
      
      inline def SortDescending: `13` = 13.asInstanceOf[`13`]
      
      inline def ToggleApplyFilter: `17` = 17.asInstanceOf[`17`]
      
      inline def TotalRecords: `2` = 2.asInstanceOf[`2`]
      
      inline def UndoRecordChanges: `9` = 9.asInstanceOf[`9`]
    }
  }
  
  /**
    * encapsulates operations on a database form which has a UI representation, and is interacting with the user.
    * @since OOo 2.2
    */
  trait FormOperations
    extends StObject
       with XFormOperations {
    
    /**
      * creates a `FormOperations` instance which works on a {@link com.sun.star.form.component.DataForm} instance.
      * @throws IllegalArgumentException if the given form is `NULL` , or does not support the {@link com.sun.star.form.component.DataForm} service.
      */
    def createWithForm(Form: XForm): Unit
    
    /**
      * creates a `FormOperations` instance which works on a {@link com.sun.star.form.FormController} instance.
      * @throws IllegalArgumentException if the given form controller is `NULL` , or does not have a model denoting a valid {@link com.sun.star.form.component.Da
      */
    def createWithFormController(Controller: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController): Unit
  }
  object FormOperations {
    
    inline def apply(
      Controller: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController,
      Cursor: XRowSet,
      FeatureInvalidation: XFeatureInvalidation,
      UpdateCursor: XResultSetUpdate,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      commitCurrentControl: () => Boolean,
      commitCurrentRecord: js.Array[Boolean] => Boolean,
      createWithForm: XForm => Unit,
      createWithFormController: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController => Unit,
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
    
    extension [Self <: FormOperations](x: Self) {
      
      inline def setCreateWithForm(value: XForm => Unit): Self = StObject.set(x, "createWithForm", js.Any.fromFunction1(value))
      
      inline def setCreateWithFormController(value: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController => Unit): Self = StObject.set(x, "createWithFormController", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * implements a callback for a {@link XFormOperations} instance, which is called when the state of one or more FormFeatures might have changed.
    * @see XFormOperations
    * @since OOo 2.2
    */
  trait XFeatureInvalidation extends StObject {
    
    /**
      * invalidates all features
      *
      * This method is used of it cannot be exactly and reliably determined which features might actually have changed their state. In this case, the callee
      * should assume all features it is interested in must be requeried.
      */
    def invalidateAllFeatures(): Unit
    
    /**
      * invalidates the given FormFeatures
      *
      * Invalidation means that any user interface representation (such as toolbox buttons), or any dispatches associated with the features in question are
      * potentially out-of-date, and need to be updated.
      * @param Features The set of features whose state might have changed.
      */
    def invalidateFeatures(Features: SeqEquiv[Double]): Unit
  }
  object XFeatureInvalidation {
    
    inline def apply(invalidateAllFeatures: () => Unit, invalidateFeatures: SeqEquiv[Double] => Unit): XFeatureInvalidation = {
      val __obj = js.Dynamic.literal(invalidateAllFeatures = js.Any.fromFunction0(invalidateAllFeatures), invalidateFeatures = js.Any.fromFunction1(invalidateFeatures))
      __obj.asInstanceOf[XFeatureInvalidation]
    }
    
    extension [Self <: XFeatureInvalidation](x: Self) {
      
      inline def setInvalidateAllFeatures(value: () => Unit): Self = StObject.set(x, "invalidateAllFeatures", js.Any.fromFunction0(value))
      
      inline def setInvalidateFeatures(value: SeqEquiv[Double] => Unit): Self = StObject.set(x, "invalidateFeatures", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * provides access to a form based filter for a database form
    *
    * In a form based filter, form controls bound to a searchable database field are replaced with a control which allows entering a search expression. This
    * so-called **predicate expression** is basically a part of an SQL `WHERE` clause, but without the part denoting the database column. For instance, if
    * you have a form control bound to a table column named `Name` , then entering the string `LIKE 'Smith'` effectively constitutes a SQL `WHERE` clause
    * `"Name" LIKE 'Smith'` .
    *
    * In the actual document view, there are usually some relaxations to this. For instance, keywords such as `LIKE` might be localized, according to
    * OpenOffice.org's UI locale. Also, for an equality criterion, the equality sign `=` is usually omitted. However, this interface here provides
    * programmatic access to the form based filter, so those relaxations are not considered here.
    *
    * The filter maintained by a filter controller is, logically, a disjunctive normal form of an SQL `WHERE` class. That is, it is a disjunction of **m**
    * terms, where each term is a conjunction of **n** clauses of the form `<column> <predicate> <literal>` or of the form `<column> IS [NOT] NULL` .
    *
    * **n** equals the number of filter controls which the filter controller is responsible for. This number doesn't change during one session of the form
    * based filter. On the other hand, **m** , the number of disjunctive terms, is dynamic.
    *
    *
    *
    * With the above, there are potentially **m * n****predicate expressions** (though usually only a fraction of those will actually exist). Since in a
    * form based filter, there are only **n** filter controls, and each filter control displays exactly one **predicate expression** , this means that only
    * a part of the complete filter can be displayed, in particular, only one **disjunctive term** can be displayed at a time. Thus, the filter controller
    * knows the concept of an **active term** , denoted by the {@link ActiveTerm} attribute, controls which of the terms is currently displayed in the form
    * controls.
    * @see XFormController
    * @see com.sun.star.sdbc.XResultSetMetaData.isSearchable
    * @see com.sun.star.sdb.XSingleSelectQueryAnalyzer.getStructuredFilter
    * @see com.sun.star.sdb.SQLFilterOperator
    * @since OOo 3.3
    */
  trait XFilterController extends StObject {
    
    /** denotes the [**active term**]{@link url="#active_term"} of the filter controller. */
    var ActiveTerm: Double
    
    /** is the number of **disjunctive terms** of the filter expression represented by the form based filter. */
    var DisjunctiveTerms: Double
    
    /**
      * is the number of **filter components** , or filter controls, which the filter controller is responsible for.
      *
      * This number is constant during one session of the form based filter.
      */
    var FilterComponents: Double
    
    /**
      * retrieves the entirety of the **predicate expressions** represented by the filter controller.
      *
      * Each element of the returned sequence is a **disjunctive term** , having exactly {@link FilterComponents} elements, which denote the single
      * **predicate expressions** of this term.
      */
    val PredicateExpressions: SafeArray[SafeArray[String]]
    
    /**
      * registers a listener to be notified of certain changes in the form based filter.
      *
      * Registering the same listener multiple times results in multiple notifications of the same event, and also requires multiple revocations of the
      * listener.
      */
    def addFilterControllerListener(Listener: XFilterControllerListener): Unit
    
    /** appends an empty disjunctive term to the list of terms. */
    def appendEmptyDisjunctiveTerm(): Unit
    
    /**
      * retrieves the filter component with the given index.
      *
      * The filter control has the same control model as the control which it stands in for. Consequently, you can use this method to obtain the database
      * column which the filter control works on, by examining the control model's `BoundField` property.
      * @param Component denotes the index of the filter component whose control should be obtained. Must be greater than or equal to 0, and smaller than {@link
      * @see com.sun.star.form.DataAwareControlModel.BoundField
      * @throws com::sun::star::lang::IndexOutOfBoundsException if Component is out of the allowed range.
      */
    def getFilterComponent(Component: Double): XControl
    
    /**
      * retrieves the entirety of the **predicate expressions** represented by the filter controller.
      *
      * Each element of the returned sequence is a **disjunctive term** , having exactly {@link FilterComponents} elements, which denote the single
      * **predicate expressions** of this term.
      */
    def getPredicateExpressions(): SafeArray[SafeArray[String]]
    
    /**
      * removes a given **disjunctive term**
      * @param Term the index of the term to remove. Must be greater than or equal to 0, and smaller than {@link DisjunctiveTerms} .
      * @throws com::sun::star::lang::IndexOutOfBoundsException if Term is out of the allowed range.
      */
    def removeDisjunctiveTerm(Term: Double): Unit
    
    /** revokes a listener which was previously registered to be notified of certain changes in the form based filter. */
    def removeFilterControllerListener(Listener: XFilterControllerListener): Unit
    
    /**
      * sets a given **predicate expression**
      * @param Component denotes the filter component whose expression is to be set. Must be greater than or equal to 0, and smaller than {@link FilterComponents} .
      * @param Term denotes the **disjunctive term** in which the expression is to be set. Must be greater than or equal to 0, and smaller than {@link Disjuncti
      * @param PredicateExpression denotes the **predicate expression** to set for the given filter component in the given term.
      * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the indexes is out of the allowed range
      */
    def setPredicateExpression(Component: Double, Term: Double, PredicateExpression: String): Unit
  }
  object XFilterController {
    
    inline def apply(
      ActiveTerm: Double,
      DisjunctiveTerms: Double,
      FilterComponents: Double,
      PredicateExpressions: SafeArray[SafeArray[String]],
      addFilterControllerListener: XFilterControllerListener => Unit,
      appendEmptyDisjunctiveTerm: () => Unit,
      getFilterComponent: Double => XControl,
      getPredicateExpressions: () => SafeArray[SafeArray[String]],
      removeDisjunctiveTerm: Double => Unit,
      removeFilterControllerListener: XFilterControllerListener => Unit,
      setPredicateExpression: (Double, Double, String) => Unit
    ): XFilterController = {
      val __obj = js.Dynamic.literal(ActiveTerm = ActiveTerm.asInstanceOf[js.Any], DisjunctiveTerms = DisjunctiveTerms.asInstanceOf[js.Any], FilterComponents = FilterComponents.asInstanceOf[js.Any], PredicateExpressions = PredicateExpressions.asInstanceOf[js.Any], addFilterControllerListener = js.Any.fromFunction1(addFilterControllerListener), appendEmptyDisjunctiveTerm = js.Any.fromFunction0(appendEmptyDisjunctiveTerm), getFilterComponent = js.Any.fromFunction1(getFilterComponent), getPredicateExpressions = js.Any.fromFunction0(getPredicateExpressions), removeDisjunctiveTerm = js.Any.fromFunction1(removeDisjunctiveTerm), removeFilterControllerListener = js.Any.fromFunction1(removeFilterControllerListener), setPredicateExpression = js.Any.fromFunction3(setPredicateExpression))
      __obj.asInstanceOf[XFilterController]
    }
    
    extension [Self <: XFilterController](x: Self) {
      
      inline def setActiveTerm(value: Double): Self = StObject.set(x, "ActiveTerm", value.asInstanceOf[js.Any])
      
      inline def setAddFilterControllerListener(value: XFilterControllerListener => Unit): Self = StObject.set(x, "addFilterControllerListener", js.Any.fromFunction1(value))
      
      inline def setAppendEmptyDisjunctiveTerm(value: () => Unit): Self = StObject.set(x, "appendEmptyDisjunctiveTerm", js.Any.fromFunction0(value))
      
      inline def setDisjunctiveTerms(value: Double): Self = StObject.set(x, "DisjunctiveTerms", value.asInstanceOf[js.Any])
      
      inline def setFilterComponents(value: Double): Self = StObject.set(x, "FilterComponents", value.asInstanceOf[js.Any])
      
      inline def setGetFilterComponent(value: Double => XControl): Self = StObject.set(x, "getFilterComponent", js.Any.fromFunction1(value))
      
      inline def setGetPredicateExpressions(value: () => SafeArray[SafeArray[String]]): Self = StObject.set(x, "getPredicateExpressions", js.Any.fromFunction0(value))
      
      inline def setPredicateExpressions(value: SafeArray[SafeArray[String]]): Self = StObject.set(x, "PredicateExpressions", value.asInstanceOf[js.Any])
      
      inline def setRemoveDisjunctiveTerm(value: Double => Unit): Self = StObject.set(x, "removeDisjunctiveTerm", js.Any.fromFunction1(value))
      
      inline def setRemoveFilterControllerListener(value: XFilterControllerListener => Unit): Self = StObject.set(x, "removeFilterControllerListener", js.Any.fromFunction1(value))
      
      inline def setSetPredicateExpression(value: (Double, Double, String) => Unit): Self = StObject.set(x, "setPredicateExpression", js.Any.fromFunction3(value))
    }
  }
  
  /**
    * is implemented by components listening for events fired by an {@link XFilterController} .
    * @since OOo 3.3
    */
  trait XFilterControllerListener
    extends StObject
       with XEventListener {
    
    /**
      * is fired when a **disjunctive term** was added to the filter of the filter controller.
      *
      * {@link FilterEvent.DisjunctiveTerm} is the index of the **disjunctive term** which was added.
      *
      * {@link FilterEvent.FilterComponent} and {@link FilterEvent.PredicateExpression} are not used for this event type.
      */
    def disjunctiveTermAdded(Event: FilterEvent): Unit
    
    /**
      * is fired when a **disjunctive term** was removed from the filter of the filter controller.
      *
      * {@link FilterEvent.DisjunctiveTerm} is the index of the **disjunctive term** which was removed.
      *
      * {@link FilterEvent.FilterComponent} and {@link FilterEvent.PredicateExpression} are not used for this event type.
      */
    def disjunctiveTermRemoved(Event: FilterEvent): Unit
    
    /**
      * is fired when a single **predicate expression** of the filter represented by the filter controller changed.
      *
      * {@link FilterEvent.DisjunctiveTerm} is the index of the **disjunctive term** in which the expression changed. This usually equals {@link
      * XFilterController.ActiveTerm} .
      *
      * {@link FilterEvent.FilterComponent} denotes the index of the filter component whose **predicate expression** changed.
      *
      * {@link FilterEvent.PredicateExpression} is the new **predicate expressions** .
      */
    def predicateExpressionChanged(Event: FilterEvent): Unit
  }
  object XFilterControllerListener {
    
    inline def apply(
      acquire: () => Unit,
      disjunctiveTermAdded: FilterEvent => Unit,
      disjunctiveTermRemoved: FilterEvent => Unit,
      disposing: EventObject => Unit,
      predicateExpressionChanged: FilterEvent => Unit,
      queryInterface: `type` => js.Any,
      release: () => Unit
    ): XFilterControllerListener = {
      val __obj = js.Dynamic.literal(acquire = js.Any.fromFunction0(acquire), disjunctiveTermAdded = js.Any.fromFunction1(disjunctiveTermAdded), disjunctiveTermRemoved = js.Any.fromFunction1(disjunctiveTermRemoved), disposing = js.Any.fromFunction1(disposing), predicateExpressionChanged = js.Any.fromFunction1(predicateExpressionChanged), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release))
      __obj.asInstanceOf[XFilterControllerListener]
    }
    
    extension [Self <: XFilterControllerListener](x: Self) {
      
      inline def setDisjunctiveTermAdded(value: FilterEvent => Unit): Self = StObject.set(x, "disjunctiveTermAdded", js.Any.fromFunction1(value))
      
      inline def setDisjunctiveTermRemoved(value: FilterEvent => Unit): Self = StObject.set(x, "disjunctiveTermRemoved", js.Any.fromFunction1(value))
      
      inline def setPredicateExpressionChanged(value: FilterEvent => Unit): Self = StObject.set(x, "predicateExpressionChanged", js.Any.fromFunction1(value))
    }
  }
  
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
    extends StObject
       with XTabController
       with XChild
       with XIndexAccess
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
    var Context: XFormControllerContext
    
    /** provides access to the currently active control */
    var CurrentControl: XControl
    
    /**
      * denotes the instance which is used to implement operations on the form which the controller works for.
      *
      * This instance can be used, for instance, to determine the current state of certain form features.
      */
    var FormOperations: XFormOperations
    
    /** used (if not `NULL` ) for user interactions triggered by the form controller. */
    var InteractionHandler: XInteractionHandler
    
    /** adds the specified listener to receive notifications whenever the activation state of the controller changes. */
    def addActivateListener(Listener: XFormControllerListener): Unit
    
    /**
      * adds a controller to the list of child controllers
      * @throws com::sun::star::lang::IllegalArgumentException if the given controller is `NULL` , or cannot rightfully be a child controller. Since controllers
      */
    def addChildController(ChildController: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController): Unit
    
    /** removes the specified listener from the list of components to receive notifications whenever the activation state of the controller changes. */
    def removeActivateListener(Listener: XFormControllerListener): Unit
  }
  object XFormController {
    
    inline def apply(
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
      addChildController: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController => Unit,
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
    ): typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController = {
      val __obj = js.Dynamic.literal(ActiveTerm = ActiveTerm.asInstanceOf[js.Any], Container = Container.asInstanceOf[js.Any], Context = Context.asInstanceOf[js.Any], Controls = Controls.asInstanceOf[js.Any], Count = Count.asInstanceOf[js.Any], CurrentControl = CurrentControl.asInstanceOf[js.Any], DisjunctiveTerms = DisjunctiveTerms.asInstanceOf[js.Any], ElementType = ElementType.asInstanceOf[js.Any], FilterComponents = FilterComponents.asInstanceOf[js.Any], FormOperations = FormOperations.asInstanceOf[js.Any], InteractionHandler = InteractionHandler.asInstanceOf[js.Any], Mode = Mode.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], PredicateExpressions = PredicateExpressions.asInstanceOf[js.Any], SupportedModes = SupportedModes.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), activateFirst = js.Any.fromFunction0(activateFirst), activateLast = js.Any.fromFunction0(activateLast), activateTabOrder = js.Any.fromFunction0(activateTabOrder), addActivateListener = js.Any.fromFunction1(addActivateListener), addChildController = js.Any.fromFunction1(addChildController), addConfirmDeleteListener = js.Any.fromFunction1(addConfirmDeleteListener), addDatabaseParameterListener = js.Any.fromFunction1(addDatabaseParameterListener), addEventListener = js.Any.fromFunction1(addEventListener), addFilterControllerListener = js.Any.fromFunction1(addFilterControllerListener), addModifyListener = js.Any.fromFunction1(addModifyListener), addParameterListener = js.Any.fromFunction1(addParameterListener), addRowSetApproveListener = js.Any.fromFunction1(addRowSetApproveListener), addSQLErrorListener = js.Any.fromFunction1(addSQLErrorListener), appendEmptyDisjunctiveTerm = js.Any.fromFunction0(appendEmptyDisjunctiveTerm), autoTabOrder = js.Any.fromFunction0(autoTabOrder), createEnumeration = js.Any.fromFunction0(createEnumeration), dispose = js.Any.fromFunction0(dispose), getByIndex = js.Any.fromFunction1(getByIndex), getContainer = js.Any.fromFunction0(getContainer), getControls = js.Any.fromFunction0(getControls), getCount = js.Any.fromFunction0(getCount), getElementType = js.Any.fromFunction0(getElementType), getFilterComponent = js.Any.fromFunction1(getFilterComponent), getMode = js.Any.fromFunction0(getMode), getModel = js.Any.fromFunction0(getModel), getParent = js.Any.fromFunction0(getParent), getPredicateExpressions = js.Any.fromFunction0(getPredicateExpressions), getSupportedModes = js.Any.fromFunction0(getSupportedModes), hasElements = js.Any.fromFunction0(hasElements), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeActivateListener = js.Any.fromFunction1(removeActivateListener), removeConfirmDeleteListener = js.Any.fromFunction1(removeConfirmDeleteListener), removeDatabaseParameterListener = js.Any.fromFunction1(removeDatabaseParameterListener), removeDisjunctiveTerm = js.Any.fromFunction1(removeDisjunctiveTerm), removeEventListener = js.Any.fromFunction1(removeEventListener), removeFilterControllerListener = js.Any.fromFunction1(removeFilterControllerListener), removeModifyListener = js.Any.fromFunction1(removeModifyListener), removeParameterListener = js.Any.fromFunction1(removeParameterListener), removeRowSetApproveListener = js.Any.fromFunction1(removeRowSetApproveListener), removeSQLErrorListener = js.Any.fromFunction1(removeSQLErrorListener), setContainer = js.Any.fromFunction1(setContainer), setMode = js.Any.fromFunction1(setMode), setModel = js.Any.fromFunction1(setModel), setParent = js.Any.fromFunction1(setParent), setPredicateExpression = js.Any.fromFunction3(setPredicateExpression), supportsMode = js.Any.fromFunction1(supportsMode))
      __obj.asInstanceOf[typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController]
    }
    
    extension [Self <: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController](x: Self) {
      
      inline def setAddActivateListener(value: XFormControllerListener => Unit): Self = StObject.set(x, "addActivateListener", js.Any.fromFunction1(value))
      
      inline def setAddChildController(value: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController => Unit): Self = StObject.set(x, "addChildController", js.Any.fromFunction1(value))
      
      inline def setContext(value: XFormControllerContext): Self = StObject.set(x, "Context", value.asInstanceOf[js.Any])
      
      inline def setCurrentControl(value: XControl): Self = StObject.set(x, "CurrentControl", value.asInstanceOf[js.Any])
      
      inline def setFormOperations(value: XFormOperations): Self = StObject.set(x, "FormOperations", value.asInstanceOf[js.Any])
      
      inline def setInteractionHandler(value: XInteractionHandler): Self = StObject.set(x, "InteractionHandler", value.asInstanceOf[js.Any])
      
      inline def setRemoveActivateListener(value: XFormControllerListener => Unit): Self = StObject.set(x, "removeActivateListener", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * provides a context for a {@link FormController}
    *
    * A {@link FormController} knows about the controls it is responsible for, and about the control container which those controls live in. However, it
    * doesn't know about a possible larger context, like a scrollable view which the controls are embedded into. To compensate this, it can be provided a
    * `XFormControllerContext` .
    */
  trait XFormControllerContext extends StObject {
    
    /** ensures the given control is visible, by scrolling the view if necessary. */
    def makeVisible(Control: XControl): Unit
  }
  object XFormControllerContext {
    
    inline def apply(makeVisible: XControl => Unit): XFormControllerContext = {
      val __obj = js.Dynamic.literal(makeVisible = js.Any.fromFunction1(makeVisible))
      __obj.asInstanceOf[XFormControllerContext]
    }
    
    extension [Self <: XFormControllerContext](x: Self) {
      
      inline def setMakeVisible(value: XControl => Unit): Self = StObject.set(x, "makeVisible", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * encapsulates operations on a database form.
    *
    * This instance allows for operations on a user interface form, by saving its clients from various tedious and error-prone operations.
    *
    * As an example, imagine you have a database form, displayed in some user interface, which you want to move to the next record. ;  It is as easy as
    * calling {@link com.sun.star.sdbc.XResultSet.next()} on this form, right? Wrong. First, you need to care for saving the current record, so the user
    * doesn't lose their input. So you need to call {@link com.sun.star.sdbc.XResultSetUpdate.updateRow()} or {@link
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
    extends StObject
       with XComponent {
    
    /**
      * provides access to the form controller which the instance is operating on.
      *
      * Note that it is possible to operate on a user interface form without actually having access to the form controller instance. However, in this case
      * some functionality will not be available. In particular, every feature which relies on the active control of the controller might be of limited use.
      */
    var Controller: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController
    
    /** provides access to the cursor of the form the instance is operating on. */
    var Cursor: XRowSet
    
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
    var UpdateCursor: XResultSetUpdate
    
    /**
      * commits the current control of our controller
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs
      */
    def commitCurrentControl(): Boolean
    
    /**
      * commits the current record of the form
      * @param RecordInserted will be `TRUE` if a record has been inserted, i.e. the form was positioned on the insertion row.
      * @returns `TRUE` if and only if the current record needed being committed. That's the case if the record or the active control of the form were modified.
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs
      */
    def commitCurrentRecord(RecordInserted: js.Array[Boolean]): Boolean
    
    /**
      * executes the operation associated with the given feature
      * @param Feature the feature which is to be executed. Must be one of the {@link FormFeature} constants.
      * @see executeWithArguments
      * @throws com::sun::star::lang::IllegalArgumentException if the given Feature is unknown, not executable, or strictly requires arguments to be executed.
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs
      * @throws com::sun::star::lang::WrappedTargetException if an exception is caught which is no {@link com.sun.star.uno.RuntimeException} and no {@link com.su
      */
    def execute(Feature: Double): Unit
    
    /**
      * executes the operation associated with the given feature, with passing arguments for execution
      * @param Feature the feature which is to be executed. Must be one of the {@link FormFeature} constants.
      * @param Arguments the named arguments for the feature to execute. See the {@link FormFeature} list for features which require arguments.
      * @throws com::sun::star::lang::IllegalArgumentException if the given feature is unknown, or not executable
      * @throws com::sun::star::lang::IllegalArgumentException if the given arguments are not sufficient to execute the feature
      * @throws com::sun::star::sdbc::SQLException if a database access error occurs
      * @throws com::sun::star::lang::WrappedTargetException if an exception is caught which is no {@link com.sun.star.uno.RuntimeException} and no {@link com.su
      */
    def executeWithArguments(Feature: Double, Arguments: SeqEquiv[NamedValue]): Unit
    
    /**
      * retrieves the current state of the given feature
      *
      * You would usually use this to update some user interface to reflect this state. For instance, you could imagine a toolbar button which is associated
      * with a given feature. This button would be enabled if and only if the respective feature is currently available, and be checked if and only if the
      * feature state is a `boolean` evaluating to `TRUE` .
      * @param Feature the feature whose state is to be determined. Must be one of the {@link FormFeature} constants. ;  An invalid value here will be silently
      */
    def getState(Feature: Double): FeatureState
    
    /**
      * determines whether a feature is currently enabled.
      *
      * Calling this is equivalent to calling {@link getState()} , and evaluating the {@link FeatureState.Enabled} member.
      * @param Feature the feature whose state is to be determined. Must be one of the {@link FormFeature} constants. ;  An invalid value here will be silently
      */
    def isEnabled(Feature: Double): Boolean
    
    /**
      * determines whether the form is currently positioned on the insertion row
      *
      * This is a convenience method only. Calling it is equivalent to examining the {@link com.sun.star.sdb.RowSet.IsNew} property of the form.
      * @throws com::sun::star::lang::WrappedTargetException if an error occurs obtaining the form property
      */
    def isInsertionRow(): Boolean
    
    /**
      * determines whether the current row of the form is modified
      *
      * This is a convenience method only. Calling it is equivalent to examining the {@link com.sun.star.sdb.RowSet.IsModified} property of the form.
      * @throws com::sun::star::lang::WrappedTargetException if an error occurs obtaining the form property
      */
    def isModifiedRow(): Boolean
  }
  object XFormOperations {
    
    inline def apply(
      Controller: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController,
      Cursor: XRowSet,
      FeatureInvalidation: XFeatureInvalidation,
      UpdateCursor: XResultSetUpdate,
      acquire: () => Unit,
      addEventListener: XEventListener => Unit,
      commitCurrentControl: () => Boolean,
      commitCurrentRecord: js.Array[Boolean] => Boolean,
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
    ): XFormOperations = {
      val __obj = js.Dynamic.literal(Controller = Controller.asInstanceOf[js.Any], Cursor = Cursor.asInstanceOf[js.Any], FeatureInvalidation = FeatureInvalidation.asInstanceOf[js.Any], UpdateCursor = UpdateCursor.asInstanceOf[js.Any], acquire = js.Any.fromFunction0(acquire), addEventListener = js.Any.fromFunction1(addEventListener), commitCurrentControl = js.Any.fromFunction0(commitCurrentControl), commitCurrentRecord = js.Any.fromFunction1(commitCurrentRecord), dispose = js.Any.fromFunction0(dispose), execute = js.Any.fromFunction1(execute), executeWithArguments = js.Any.fromFunction2(executeWithArguments), getState = js.Any.fromFunction1(getState), isEnabled = js.Any.fromFunction1(isEnabled), isInsertionRow = js.Any.fromFunction0(isInsertionRow), isModifiedRow = js.Any.fromFunction0(isModifiedRow), queryInterface = js.Any.fromFunction1(queryInterface), release = js.Any.fromFunction0(release), removeEventListener = js.Any.fromFunction1(removeEventListener))
      __obj.asInstanceOf[XFormOperations]
    }
    
    extension [Self <: XFormOperations](x: Self) {
      
      inline def setCommitCurrentControl(value: () => Boolean): Self = StObject.set(x, "commitCurrentControl", js.Any.fromFunction0(value))
      
      inline def setCommitCurrentRecord(value: js.Array[Boolean] => Boolean): Self = StObject.set(x, "commitCurrentRecord", js.Any.fromFunction1(value))
      
      inline def setController(value: typings.activexLibreoffice.com_.sun.star.form.runtime.XFormController): Self = StObject.set(x, "Controller", value.asInstanceOf[js.Any])
      
      inline def setCursor(value: XRowSet): Self = StObject.set(x, "Cursor", value.asInstanceOf[js.Any])
      
      inline def setExecute(value: Double => Unit): Self = StObject.set(x, "execute", js.Any.fromFunction1(value))
      
      inline def setExecuteWithArguments(value: (Double, SeqEquiv[NamedValue]) => Unit): Self = StObject.set(x, "executeWithArguments", js.Any.fromFunction2(value))
      
      inline def setFeatureInvalidation(value: XFeatureInvalidation): Self = StObject.set(x, "FeatureInvalidation", value.asInstanceOf[js.Any])
      
      inline def setGetState(value: Double => FeatureState): Self = StObject.set(x, "getState", js.Any.fromFunction1(value))
      
      inline def setIsEnabled(value: Double => Boolean): Self = StObject.set(x, "isEnabled", js.Any.fromFunction1(value))
      
      inline def setIsInsertionRow(value: () => Boolean): Self = StObject.set(x, "isInsertionRow", js.Any.fromFunction0(value))
      
      inline def setIsModifiedRow(value: () => Boolean): Self = StObject.set(x, "isModifiedRow", js.Any.fromFunction0(value))
      
      inline def setUpdateCursor(value: XResultSetUpdate): Self = StObject.set(x, "UpdateCursor", value.asInstanceOf[js.Any])
    }
  }
}
