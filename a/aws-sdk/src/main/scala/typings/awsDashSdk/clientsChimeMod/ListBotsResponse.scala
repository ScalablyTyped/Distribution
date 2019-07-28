package typings.awsDashSdk.clientsChimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListBotsResponse extends js.Object {
  /**
    * List of bots and bot details.
    */
  var Bots: js.UndefOr[BotList] = js.undefined
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}

object ListBotsResponse {
  @scala.inline
  def apply(Bots: BotList = null, NextToken: String = null): ListBotsResponse = {
    val __obj = js.Dynamic.literal()
    if (Bots != null) __obj.updateDynamic("Bots")(Bots)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListBotsResponse]
  }
}

