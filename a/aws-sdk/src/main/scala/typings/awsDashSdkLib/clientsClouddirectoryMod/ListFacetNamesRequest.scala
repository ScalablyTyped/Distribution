package typings
package awsDashSdkLib.clientsClouddirectoryMod

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
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) to retrieve facet names from.
    */
  var SchemaArn: Arn
}

object ListFacetNamesRequest {
  @scala.inline
  def apply(SchemaArn: Arn, MaxResults: js.UndefOr[NumberResults] = js.undefined, NextToken: NextToken = null): ListFacetNamesRequest = {
    val __obj = js.Dynamic.literal(SchemaArn = SchemaArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFacetNamesRequest]
  }
}

