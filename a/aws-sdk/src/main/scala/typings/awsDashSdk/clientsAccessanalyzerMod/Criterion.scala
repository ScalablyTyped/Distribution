package typings.awsDashSdk.clientsAccessanalyzerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Criterion extends js.Object {
  /**
    * A "contains" operator to match for the filter used to create the rule.
    */
  var contains: js.UndefOr[ValueList] = js.native
  /**
    * An "equals" operator to match for the filter used to create the rule.
    */
  @JSName("eq")
  var eq_FCriterion: js.UndefOr[ValueList] = js.native
  /**
    * An "exists" operator to match for the filter used to create the rule. 
    */
  var exists: js.UndefOr[Boolean] = js.native
  /**
    * A "not equals" operator to match for the filter used to create the rule.
    */
  var neq: js.UndefOr[ValueList] = js.native
}

object Criterion {
  @scala.inline
  def apply(
    contains: ValueList = null,
    eq: ValueList = null,
    exists: js.UndefOr[scala.Boolean] = js.undefined,
    neq: ValueList = null
  ): Criterion = {
    val __obj = js.Dynamic.literal()
    if (contains != null) __obj.updateDynamic("contains")(contains.asInstanceOf[js.Any])
    if (eq != null) __obj.updateDynamic("eq")(eq.asInstanceOf[js.Any])
    if (!js.isUndefined(exists)) __obj.updateDynamic("exists")(exists.asInstanceOf[js.Any])
    if (neq != null) __obj.updateDynamic("neq")(neq.asInstanceOf[js.Any])
    __obj.asInstanceOf[Criterion]
  }
}

