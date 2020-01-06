package typings.awsDashSdk.clientsPersonalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetRecommendationsResponse extends js.Object {
  /**
    * A list of recommendations sorted in ascending order by prediction score. There can be a maximum of 500 items in the list.
    */
  var itemList: js.UndefOr[ItemList] = js.native
}

object GetRecommendationsResponse {
  @scala.inline
  def apply(itemList: ItemList = null): GetRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    if (itemList != null) __obj.updateDynamic("itemList")(itemList.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetRecommendationsResponse]
  }
}

