package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsFilter extends js.Object {
  /**
    * A conjunction (logical AND) of predicates, which is used in evaluating an analytics filter. The operator must have at least two predicates.
    */
  var And: js.UndefOr[AnalyticsAndOperator] = js.undefined
  /**
    * The prefix to use when evaluating an analytics filter.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
  /**
    * The tag to use when evaluating an analytics filter.
    */
  var Tag: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Tag] = js.undefined
}

object AnalyticsFilter {
  @scala.inline
  def apply(And: AnalyticsAndOperator = null, Prefix: Prefix = null, Tag: Tag = null): AnalyticsFilter = {
    val __obj = js.Dynamic.literal()
    if (And != null) __obj.updateDynamic("And")(And)
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tag != null) __obj.updateDynamic("Tag")(Tag)
    __obj.asInstanceOf[AnalyticsFilter]
  }
}

