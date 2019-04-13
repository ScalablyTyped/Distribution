package typings
package awsDashSdkLib.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeVoicesOutput extends js.Object {
  /**
    * The pagination token to use in the next request to continue the listing of voices. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of voices with their properties.
    */
  var Voices: js.UndefOr[VoiceList] = js.undefined
}

object DescribeVoicesOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Voices: VoiceList = null): DescribeVoicesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (Voices != null) __obj.updateDynamic("Voices")(Voices)
    __obj.asInstanceOf[DescribeVoicesOutput]
  }
}

