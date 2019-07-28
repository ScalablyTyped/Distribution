package typings.awsDashSdk.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRulesOutput extends js.Object {
  /**
    * If there are additional results, this is the marker for the next set of results. Otherwise, this is null.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[typings.awsDashSdk.clientsElbv2Mod.Rules] = js.undefined
}

object DescribeRulesOutput {
  @scala.inline
  def apply(NextMarker: Marker = null, Rules: Rules = null): DescribeRulesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextMarker != null) __obj.updateDynamic("NextMarker")(NextMarker)
    if (Rules != null) __obj.updateDynamic("Rules")(Rules)
    __obj.asInstanceOf[DescribeRulesOutput]
  }
}

