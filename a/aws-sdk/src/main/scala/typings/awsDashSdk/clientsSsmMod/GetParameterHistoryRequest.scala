package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetParameterHistoryRequest extends js.Object {
  /**
    * The maximum number of items to return for this call. The call also returns a token that you can specify in a subsequent call to get the next set of results.
    */
  var MaxResults: js.UndefOr[typings.awsDashSdk.clientsSsmMod.MaxResults] = js.undefined
  /**
    * The name of a parameter you want to query.
    */
  var Name: PSParameterName
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
  /**
    * Return decrypted values for secure string parameters. This flag is ignored for String and StringList parameter types.
    */
  var WithDecryption: js.UndefOr[Boolean] = js.undefined
}

object GetParameterHistoryRequest {
  @scala.inline
  def apply(
    Name: PSParameterName,
    MaxResults: js.UndefOr[MaxResults] = js.undefined,
    NextToken: NextToken = null,
    WithDecryption: js.UndefOr[Boolean] = js.undefined
  ): GetParameterHistoryRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (!js.isUndefined(WithDecryption)) __obj.updateDynamic("WithDecryption")(WithDecryption)
    __obj.asInstanceOf[GetParameterHistoryRequest]
  }
}

