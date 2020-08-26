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
@js.native
trait FilterEvent extends EventObject {
  /** denotes the index of the **disjunctive term** to which the event applies, if any. */
  var DisjunctiveTerm: Double = js.native
  /** denotes the index of the **filter component** to which the event applies, if any. */
  var FilterComponent: Double = js.native
  /** denotes the **predicate expression** associated with the event. */
  var PredicateExpression: String = js.native
}

object FilterEvent {
  @scala.inline
  def apply(DisjunctiveTerm: Double, FilterComponent: Double, PredicateExpression: String, Source: XInterface): FilterEvent = {
    val __obj = js.Dynamic.literal(DisjunctiveTerm = DisjunctiveTerm.asInstanceOf[js.Any], FilterComponent = FilterComponent.asInstanceOf[js.Any], PredicateExpression = PredicateExpression.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[FilterEvent]
  }
  @scala.inline
  implicit class FilterEventOps[Self <: FilterEvent] (val x: Self) extends AnyVal {
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
    def setDisjunctiveTerm(value: Double): Self = this.set("DisjunctiveTerm", value.asInstanceOf[js.Any])
    @scala.inline
    def setFilterComponent(value: Double): Self = this.set("FilterComponent", value.asInstanceOf[js.Any])
    @scala.inline
    def setPredicateExpression(value: String): Self = this.set("PredicateExpression", value.asInstanceOf[js.Any])
  }
  
}

