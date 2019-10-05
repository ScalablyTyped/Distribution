package typings.awsDashSdk.clientsLexmodelbuildingserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetBuiltinIntentsRequest extends js.Object {
  /**
    * A list of locales that the intent supports.
    */
  var locale: js.UndefOr[Locale] = js.undefined
  /**
    * The maximum number of intents to return in the response. The default is 10.
    */
  var maxResults: js.UndefOr[MaxResults] = js.undefined
  /**
    * A pagination token that fetches the next page of intents. If this API call is truncated, Amazon Lex returns a pagination token in the response. To fetch the next page of intents, use the pagination token in the next request.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * Substring to match in built-in intent signatures. An intent will be returned if any part of its signature matches the substring. For example, "xyz" matches both "xyzabc" and "abcxyz." To find the signature for an intent, see Standard Built-in Intents in the Alexa Skills Kit.
    */
  var signatureContains: js.UndefOr[String] = js.undefined
}

object GetBuiltinIntentsRequest {
  @scala.inline
  def apply(
    locale: Locale = null,
    maxResults: Int | Double = null,
    nextToken: NextToken = null,
    signatureContains: String = null
  ): GetBuiltinIntentsRequest = {
    val __obj = js.Dynamic.literal()
    if (locale != null) __obj.updateDynamic("locale")(locale.asInstanceOf[js.Any])
    if (maxResults != null) __obj.updateDynamic("maxResults")(maxResults.asInstanceOf[js.Any])
    if (nextToken != null) __obj.updateDynamic("nextToken")(nextToken)
    if (signatureContains != null) __obj.updateDynamic("signatureContains")(signatureContains)
    __obj.asInstanceOf[GetBuiltinIntentsRequest]
  }
}

