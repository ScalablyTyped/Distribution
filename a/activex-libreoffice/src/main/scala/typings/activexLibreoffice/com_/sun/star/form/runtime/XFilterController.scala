package typings.activexLibreoffice.com_.sun.star.form.runtime

import typings.activexLibreoffice.com_.sun.star.awt.XControl
import typings.std.SafeArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
@js.native
trait XFilterController extends js.Object {
  /** denotes the [**active term**]{@link url="#active_term"} of the filter controller. */
  var ActiveTerm: Double = js.native
  /** is the number of **disjunctive terms** of the filter expression represented by the form based filter. */
  var DisjunctiveTerms: Double = js.native
  /**
    * is the number of **filter components** , or filter controls, which the filter controller is responsible for.
    *
    * This number is constant during one session of the form based filter.
    */
  var FilterComponents: Double = js.native
  /**
    * retrieves the entirety of the **predicate expressions** represented by the filter controller.
    *
    * Each element of the returned sequence is a **disjunctive term** , having exactly {@link FilterComponents} elements, which denote the single
    * **predicate expressions** of this term.
    */
  val PredicateExpressions: SafeArray[SafeArray[String]] = js.native
  /**
    * registers a listener to be notified of certain changes in the form based filter.
    *
    * Registering the same listener multiple times results in multiple notifications of the same event, and also requires multiple revocations of the
    * listener.
    */
  def addFilterControllerListener(Listener: XFilterControllerListener): Unit = js.native
  /** appends an empty disjunctive term to the list of terms. */
  def appendEmptyDisjunctiveTerm(): Unit = js.native
  /**
    * retrieves the filter component with the given index.
    *
    * The filter control has the same control model as the control which it stands in for. Consequently, you can use this method to obtain the database
    * column which the filter control works on, by examining the control model's `BoundField` property.
    * @param Component denotes the index of the filter component whose control should be obtained. Must be greater than or equal to 0, and smaller than {@link
    * @see com.sun.star.form.DataAwareControlModel.BoundField
    * @throws com::sun::star::lang::IndexOutOfBoundsException if Component is out of the allowed range.
    */
  def getFilterComponent(Component: Double): XControl = js.native
  /**
    * retrieves the entirety of the **predicate expressions** represented by the filter controller.
    *
    * Each element of the returned sequence is a **disjunctive term** , having exactly {@link FilterComponents} elements, which denote the single
    * **predicate expressions** of this term.
    */
  def getPredicateExpressions(): SafeArray[SafeArray[String]] = js.native
  /**
    * removes a given **disjunctive term**
    * @param Term the index of the term to remove. Must be greater than or equal to 0, and smaller than {@link DisjunctiveTerms} .
    * @throws com::sun::star::lang::IndexOutOfBoundsException if Term is out of the allowed range.
    */
  def removeDisjunctiveTerm(Term: Double): Unit = js.native
  /** revokes a listener which was previously registered to be notified of certain changes in the form based filter. */
  def removeFilterControllerListener(Listener: XFilterControllerListener): Unit = js.native
  /**
    * sets a given **predicate expression**
    * @param Component denotes the filter component whose expression is to be set. Must be greater than or equal to 0, and smaller than {@link FilterComponents} .
    * @param Term denotes the **disjunctive term** in which the expression is to be set. Must be greater than or equal to 0, and smaller than {@link Disjuncti
    * @param PredicateExpression denotes the **predicate expression** to set for the given filter component in the given term.
    * @throws com::sun::star::lang::IndexOutOfBoundsException if one of the indexes is out of the allowed range
    */
  def setPredicateExpression(Component: Double, Term: Double, PredicateExpression: String): Unit = js.native
}

object XFilterController {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class XFilterControllerOps[Self <: XFilterController] (val x: Self) extends AnyVal {
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
    def setActiveTerm(value: Double): Self = this.set("ActiveTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def setDisjunctiveTerms(value: Double): Self = this.set("DisjunctiveTerms", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterComponents(value: Double): Self = this.set("FilterComponents", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicateExpressions(value: SafeArray[SafeArray[String]]): Self = this.set("PredicateExpressions", value.asInstanceOf[js.Any])
    @scala.inline
    def setAddFilterControllerListener(value: XFilterControllerListener => Unit): Self = this.set("addFilterControllerListener", js.Any.fromFunction1(value))
    @scala.inline
    def setAppendEmptyDisjunctiveTerm(value: () => Unit): Self = this.set("appendEmptyDisjunctiveTerm", js.Any.fromFunction0(value))
    @scala.inline
    def setGetFilterComponent(value: Double => XControl): Self = this.set("getFilterComponent", js.Any.fromFunction1(value))
    @scala.inline
    def setGetPredicateExpressions(value: () => SafeArray[SafeArray[String]]): Self = this.set("getPredicateExpressions", js.Any.fromFunction0(value))
    @scala.inline
    def setRemoveDisjunctiveTerm(value: Double => Unit): Self = this.set("removeDisjunctiveTerm", js.Any.fromFunction1(value))
    @scala.inline
    def setRemoveFilterControllerListener(value: XFilterControllerListener => Unit): Self = this.set("removeFilterControllerListener", js.Any.fromFunction1(value))
    @scala.inline
    def setSetPredicateExpression(value: (Double, Double, String) => Unit): Self = this.set("setPredicateExpression", js.Any.fromFunction3(value))
  }
  
}

