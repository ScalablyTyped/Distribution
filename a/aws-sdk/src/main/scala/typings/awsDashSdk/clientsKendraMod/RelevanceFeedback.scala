package typings.awsDashSdk.clientsKendraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RelevanceFeedback extends js.Object {
  /**
    * Whether to document was relevant or not relevant to the search.
    */
  var RelevanceValue: RelevanceType = js.native
  /**
    * The unique identifier of the search result that the user provided relevance feedback for.
    */
  var ResultId: typings.awsDashSdk.clientsKendraMod.ResultId = js.native
}

object RelevanceFeedback {
  @scala.inline
  def apply(RelevanceValue: RelevanceType, ResultId: ResultId): RelevanceFeedback = {
    val __obj = js.Dynamic.literal(RelevanceValue = RelevanceValue.asInstanceOf[js.Any], ResultId = ResultId.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RelevanceFeedback]
  }
}

