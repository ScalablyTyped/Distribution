package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is implemented by components listening for events fired by an {@link XFilterController} .
  * @since OOo 3.3
  */
trait XFilterControllerListener
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.XEventListener {
  /**
    * is fired when a **disjunctive term** was added to the filter of the filter controller.
    *
    * {@link FilterEvent.DisjunctiveTerm} is the index of the **disjunctive term** which was added.
    *
    * {@link FilterEvent.FilterComponent} and {@link FilterEvent.PredicateExpression} are not used for this event type.
    */
  def disjunctiveTermAdded(Event: FilterEvent): scala.Unit
  /**
    * is fired when a **disjunctive term** was removed from the filter of the filter controller.
    *
    * {@link FilterEvent.DisjunctiveTerm} is the index of the **disjunctive term** which was removed.
    *
    * {@link FilterEvent.FilterComponent} and {@link FilterEvent.PredicateExpression} are not used for this event type.
    */
  def disjunctiveTermRemoved(Event: FilterEvent): scala.Unit
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
  def predicateExpressionChanged(Event: FilterEvent): scala.Unit
}

object XFilterControllerListener {
  @scala.inline
  def apply(
    acquire: js.Function0[scala.Unit],
    disjunctiveTermAdded: js.Function1[FilterEvent, scala.Unit],
    disjunctiveTermRemoved: js.Function1[FilterEvent, scala.Unit],
    disposing: js.Function1[activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject, scala.Unit],
    predicateExpressionChanged: js.Function1[FilterEvent, scala.Unit],
    queryInterface: js.Function1[activexDashLibreofficeLib.`type`, js.Any],
    release: js.Function0[scala.Unit]
  ): XFilterControllerListener = {
    val __obj = js.Dynamic.literal(acquire = acquire, disjunctiveTermAdded = disjunctiveTermAdded, disjunctiveTermRemoved = disjunctiveTermRemoved, disposing = disposing, predicateExpressionChanged = predicateExpressionChanged, queryInterface = queryInterface, release = release)
  
    __obj.asInstanceOf[XFilterControllerListener]
  }
}

