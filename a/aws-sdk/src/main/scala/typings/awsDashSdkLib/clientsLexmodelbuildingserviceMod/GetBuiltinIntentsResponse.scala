package typings
package awsDashSdkLib.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBuiltinIntentsResponse extends js.Object {
  /**
    * An array of builtinIntentMetadata objects, one for each intent in the response.
    */
  var intents: js.UndefOr[BuiltinIntentMetadataList] = js.undefined
  /**
    * A pagination token that fetches the next page of intents. If the response to this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, specify the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}

object GetBuiltinIntentsResponse {
  @scala.inline
  def apply(intents: BuiltinIntentMetadataList = null, nextToken: NextToken = null): GetBuiltinIntentsResponse = {
    val __obj = js.Dynamic.literal()
    if (intents != null) __obj.updateDynamic("intents")(intents)
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    __obj.asInstanceOf[GetBuiltinIntentsResponse]
  }
}

