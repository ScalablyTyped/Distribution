package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypedLinkFacetNamesRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}

object ListTypedLinkFacetNamesRequest {
  @scala.inline
  def apply(SchemaArn: Arn, MaxResults: js.UndefOr[NumberResults] = js.undefined, NextToken: NextToken = null): ListTypedLinkFacetNamesRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTypedLinkFacetNamesRequest]
  }
}

