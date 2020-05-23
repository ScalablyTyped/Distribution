package typings.activexLibreoffice.com_.sun.star.form.runtime

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an event fired by a filter controller, when the filter managed by the controller changes.
  * @see XFilterController
  * @since OOo 3.3
  */
trait FilterEvent extends EventObject {
  /** denotes the index of the **disjunctive term** to which the event applies, if any. */
  var DisjunctiveTerm: Double
  /** denotes the index of the **filter component** to which the event applies, if any. */
  var FilterComponent: Double
  /** denotes the **predicate expression** associated with the event. */
  var PredicateExpression: String
}

object FilterEvent {
  @scala.inline
  def apply(DisjunctiveTerm: Double, FilterComponent: Double, PredicateExpression: String, Source: XInterface): FilterEvent = {
    val __obj = js.Dynamic.literal(DisjunctiveTerm = DisjunctiveTerm.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], PredicateExpression = PredicateExpression.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEvent]
  }
}

