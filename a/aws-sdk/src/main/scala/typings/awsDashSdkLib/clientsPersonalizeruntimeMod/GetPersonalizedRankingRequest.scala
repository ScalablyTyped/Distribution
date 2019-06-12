package typings
package awsDashSdkLib.clientsPersonalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPersonalizedRankingRequest extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the campaign to use for generating the personalized ranking.
    */
  var campaignArn: Arn
  /**
    * A list of items (itemId's) to rank. If an item was not included in the training dataset, the item is appended to the end of the reranked list.
    */
  var inputList: InputList
  /**
    * The user for which you want the campaign to provide a personalized ranking.
    */
  var userId: UserID
}

object GetPersonalizedRankingRequest {
  @scala.inline
  def apply(campaignArn: Arn, inputList: InputList, userId: UserID): GetPersonalizedRankingRequest = {
    val __obj = js.Dynamic.literal(campaignArn = campaignArn, inputList = inputList, userId = userId)
  
    __obj.asInstanceOf[GetPersonalizedRankingRequest]
  }
}

