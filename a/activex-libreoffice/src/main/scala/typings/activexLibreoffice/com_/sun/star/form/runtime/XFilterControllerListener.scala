package typings.activexLibreoffice.com_.sun.star.form.runtime

import typings.activexLibreoffice.`type`
import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.lang.XEventListener
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by components listening for events fired by an {@link XFilterController} .
  * @since OOo 3.3
  */
@js.native
trait XFilterControllerListener extends XEventListener {
  /**
    * is fired when a **disjunctive term** was added to the filter of the filter controller.
    *
    * {@link FilterEvent.DisjunctiveTerm} is the index of the **disjunctive term** which was added.
    *
    * {@link FilterEvent.FilterComponent} and {@link FilterEvent.PredicateExpression} are not used for this event type.
    */
  def disjunctiveTermAdded(Event: FilterEvent): Unit = js.native
  /**
    * is fired when a **disjunctive term** was removed from the filter of the filter controller.
    *
    * {@link FilterEvent.DisjunctiveTerm} is the index of the **disjunctive term** which was removed.
    *
    * {@link FilterEvent.FilterComponent} and {@link FilterEvent.PredicateExpression} are not used for this event type.
    */
  def disjunctiveTermRemoved(Event: FilterEvent): Unit = js.native
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
  def predicateExpressionChanged(Event: FilterEvent): Unit = js.native
}

object XFilterControllerListener {
  @scala.inline
  def apply(
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
  @scala.inline
  implicit class XFilterControllerListenerOps[Self <: XFilterControllerListener] (val x: Self) extends AnyVal {
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
    def setDisjunctiveTermAdded(value: FilterEvent => Unit): Self = this.set("disjunctiveTermAdded", js.Any.fromFunction1(value))
    @scala.inline
    def setDisjunctiveTermRemoved(value: FilterEvent => Unit): Self = this.set("disjunctiveTermRemoved", js.Any.fromFunction1(value))
    @scala.inline
    def setPredicateExpressionChanged(value: FilterEvent => Unit): Self = this.set("predicateExpressionChanged", js.Any.fromFunction1(value))
  }
  
}

