package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetIntentsResponse extends js.Object {
  /**
    * An array of Intent objects. For more information, see PutBot.
    */
  var intents: js.UndefOr[IntentMetadataList] = js.native
  /**
    * If the response is truncated, the response includes a pagination token that you can specify in your next request to fetch the next page of intents. 
    */
  var nextToken: js.UndefOr[NextToken] = js.native
}

object GetIntentsResponse {
  @scala.inline
  def apply(intents: IntentMetadataList = null, nextToken: NextToken = null): GetIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIntentsResponse]
  }
}

