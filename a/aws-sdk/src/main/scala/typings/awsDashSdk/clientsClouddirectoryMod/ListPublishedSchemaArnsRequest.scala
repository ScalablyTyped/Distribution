package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListPublishedSchemaArnsRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The response for ListPublishedSchemaArns when this parameter is used will list all minor version ARNs for a major version.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}

object ListPublishedSchemaArnsRequest {
  @scala.inline
  def apply(
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null,
    SchemaArn: Arn = null
  ): ListPublishedSchemaArnsRequest = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn)
    __obj.asInstanceOf[ListPublishedSchemaArnsRequest]
  }
}

