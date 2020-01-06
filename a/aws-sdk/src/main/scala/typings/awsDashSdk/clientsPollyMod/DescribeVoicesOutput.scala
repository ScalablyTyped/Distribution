package typings.awsDashSdk.clientsPollyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeVoicesOutput extends js.Object {
  /**
    * The pagination token to use in the next request to continue the listing of voices. NextToken is returned only if the response is truncated.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsPollyMod.NextToken] = js.native
  /**
    * A list of voices with their properties.
    */
  var Voices: js.UndefOr[VoiceList] = js.native
}

object DescribeVoicesOutput {
  @scala.inline
  def apply(NextToken: NextToken = null, Voices: VoiceList = null): DescribeVoicesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Voices != null) __obj.updateDynamic("Voices")(Voices.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeVoicesOutput]
  }
}

