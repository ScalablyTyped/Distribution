package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnalyticsFilter extends js.Object {
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.
    */
  var And: js.UndefOr[AnalyticsAndOperator] = js.native
  /**
    * The prefix to use when evaluating an analytics filter.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.native
  /**
    * The tag to use when evaluating an analytics filter.
    */
  var Tag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Tag] = js.native
}

object AnalyticsFilter {
  @scala.inline
  def apply(And: AnalyticsAndOperator = null, Prefix: Prefix = null, Tag: Tag = null): AnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And.asInstanceOf[js.Any])
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tag != null) __obj.updateDynamic("Tag")(Tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnalyticsFilter]
  }
}

