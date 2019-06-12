package typings
package awsDashSdkLib.clientsPersonalizeruntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetRecommendationsResponse extends js.Object {
  /**
    * A list of recommendations.
    */
  var itemList: js.UndefOr[ItemList] = js.undefined
}

object GetRecommendationsResponse {
  @scala.inline
  def apply(itemList: ItemList = null): GetRecommendationsResponse = {
    val __obj = js.Dynamic.literal()
    if (itemList != null) __obj.updateDynamic("itemList")(itemList)
    __obj.asInstanceOf[GetRecommendationsResponse]
  }
}

