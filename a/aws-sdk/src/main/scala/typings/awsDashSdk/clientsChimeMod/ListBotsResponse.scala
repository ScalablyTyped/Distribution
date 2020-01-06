package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListBotsResponse extends js.Object {
  /**
    * List of bots and bot details.
    */
  var Bots: js.UndefOr[BotList] = js.native
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.native
}

object ListBotsResponse {
  @scala.inline
  def apply(Bots: BotList = null, NextToken: String = null): ListBotsResponse = {
    val __obj = js.Dynamic.literal()
    if (Bots != null) __obj.updateDynamic("Bots")(Bots.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListBotsResponse]
  }
}

