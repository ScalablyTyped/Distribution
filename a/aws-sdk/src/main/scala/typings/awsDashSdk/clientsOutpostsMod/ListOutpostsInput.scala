package typings.awsDashSdk.clientsOutpostsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListOutpostsInput extends js.Object {
  var MaxResults: js.UndefOr[MaxResults1000] = js.native
  var NextToken: js.UndefOr[Token] = js.native
}

object ListOutpostsInput {
  @scala.inline
  def apply(MaxResults: Int | Double = null, NextToken: Token = null): ListOutpostsInput = {
    val __obj = js.Dynamic.literal()
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListOutpostsInput]
  }
}

