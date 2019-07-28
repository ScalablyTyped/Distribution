package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsFilter extends js.Object {
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
    */
  var And: js.UndefOr[MetricsAndOperator] = js.undefined
  /**
    * The prefix used when evaluating a metrics filter.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
  /**
    * The tag used when evaluating a metrics filter.
    */
  var Tag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Tag] = js.undefined
}

object MetricsFilter {
  @scala.inline
  def apply(And: MetricsAndOperator = null, Prefix: Prefix = null, Tag: Tag = null): MetricsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[MetricsFilter]
  }
}

