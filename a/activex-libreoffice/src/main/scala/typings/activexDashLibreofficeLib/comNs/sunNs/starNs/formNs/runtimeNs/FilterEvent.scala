package typings
package activexDashLibreofficeLib.comNs.sunNs.starNs.formNs.runtimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * is an event fired by a filter controller, when the filter managed by the controller changes.
  * @see XFilterController
  * @since OOo 3.3
  */
trait FilterEvent
  extends activexDashLibreofficeLib.comNs.sunNs.starNs.langNs.EventObject {
  /** denotes the index of the **disjunctive term** to which the event applies, if any. */
  var DisjunctiveTerm: scala.Double
  /** denotes the index of the **filter component** to which the event applies, if any. */
  var FilterComponent: scala.Double
  /** denotes the **predicate expression** associated with the event. */
  var PredicateExpression: java.lang.String
}

object FilterEvent {
  @scala.inline
  def apply(
    DisjunctiveTerm: scala.Double,
    FilterComponent: scala.Double,
    PredicateExpression: java.lang.String,
    Source: activexDashLibreofficeLib.comNs.sunNs.starNs.unoNs.XInterface
  ): FilterEvent = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DisjunctiveTerm")(DisjunctiveTerm)
    __obj.updateDynamic("FilterComponent")(FilterComponent)
    __obj.updateDynamic("PredicateExpression")(PredicateExpression)
    __obj.updateDynamic("Source")(Source)
    __obj.asInstanceOf[FilterEvent]
  }
}

