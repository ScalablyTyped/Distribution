package typings.awsDashSdk.clientsFrauddetectorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOutcomesResult extends js.Object {
  /**
    * The next page token for subsequent requests.
    */
  var nextToken: js.UndefOr[String] = js.native
  /**
    * The outcomes. 
    */
  var outcomes: js.UndefOr[OutcomeList] = js.native
}

object GetOutcomesResult {
  @scala.inline
  def apply(nextToken: String = null, outcomes: OutcomeList = null): GetOutcomesResult = {
    val __obj = js.Dynamic.literal()
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    if (outcomes != null) __obj.updateDynamic("outcomes")(outcomes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOutcomesResult]
  }
}

