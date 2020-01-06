package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MetricsAndOperator extends js.Object {
  /**
    * The prefix used when evaluating an AND predicate.
    */
  var Prefix: js.UndefOr[typings.awsDashSdk.clientsS3Mod.Prefix] = js.native
  /**
    * The list of tags used when evaluating an AND predicate.
    */
  var Tags: js.UndefOr[TagSet] = js.native
}

object MetricsAndOperator {
  @scala.inline
  def apply(Prefix: Prefix = null, Tags: TagSet = null): MetricsAndOperator = {
    val __obj = js.Dynamic.literal()
    if (Prefix != null) __obj.updateDynamic("Prefix")(Prefix.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetricsAndOperator]
  }
}

