package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFacetNamesRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) to retrieve facet names from.
    */
  var SchemaArn: Arn
}

object ListFacetNamesRequest {
  @scala.inline
  def apply(SchemaArn: Arn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListFacetNamesRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFacetNamesRequest]
  }
}

