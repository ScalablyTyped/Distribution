package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsFilter extends js.Object {
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating a metrics filter. The operator must have at least two predicates, and an object must match all of the predicates in order for the filter to apply.
    */
  var And: js.UndefOr[MetricsAndOperator] = js.native
  /**
    * The prefix used when evaluating a metrics filter.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.native
  /**
    * The tag used when evaluating a metrics filter.
    */
  var Tag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Tag] = js.native
}

object MetricsFilter {
  @scala.inline
  def apply(And: MetricsAndOperator = null, Prefix: Prefix = null, Tag: Tag = null): MetricsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsFilter]
  }
}

