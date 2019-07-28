package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnalyticsAndOperator extends js.Object {
  /**
    * The prefix to use when evaluating an AND predicate: The prefix that an object must have to be included in the metrics results.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.undefined
  /**
    * The list of tags to use when evaluating an AND predicate.
    */
  var Tags: js.UndefOr[TagSet] = js.undefined
}

object AnalyticsAndOperator {
  @scala.inline
  def apply(Prefix: Prefix = null, Tags: TagSet = null): AnalyticsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[AnalyticsAndOperator]
  }
}

