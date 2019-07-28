package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAttributesResponse extends js.Object {
  /**
    * A list of attribute objects that meet the criteria of the request.
    */
  var attributes: js.UndefOr[Attributes] = js.undefined
  /**
    * The nextToken value to include in a future ListAttributes request. When the results of a ListAttributes request exceed maxResults, this value can be used to retrieve the next page of results. This value is null when there are no more results to return.
    */
  var nextToken: js.UndefOr[String] = js.undefined
}

object ListAttributesResponse {
  @scala.inline
  def apply(attributes: Attributes = null, nextToken: String = null): ListAttributesResponse = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[ListAttributesResponse]
  }
}

