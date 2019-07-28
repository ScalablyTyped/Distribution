package typings.awsDashSdk.clientsPersonalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPersonalizedRankingResponse extends js.Object {
  /**
    * A list of items in order of most likely interest to the user.
    */
  var personalizedRanking: js.UndefOr[ItemList] = js.undefined
}

object GetPersonalizedRankingResponse {
  @scala.inline
  def apply(personalizedRanking: ItemList = null): GetPersonalizedRankingResponse = {
    val __obj = js.Dynamic.literal()
    if (personalizedRanking != null) __obj.updateDynamic("personalizedRanking")(personalizedRanking)
    __obj.asInstanceOf[GetPersonalizedRankingResponse]
  }
}

