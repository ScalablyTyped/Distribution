package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeRulesOutput extends js.Object {
  /**
    * The marker to use when requesting the next set of results. If there are no additional results, the string is empty.
    */
  var NextMarker: js.UndefOr[Marker] = js.undefined
  /**
    * Information about the rules.
    */
  var Rules: js.UndefOr[Rules] = js.undefined
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

