package typings
package awsDashSdkLib.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListAppliedSchemaArnsRequest extends js.Object {
  /**
    * The ARN of the directory you are listing.
    */
  var DirectoryArn: Arn
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The response for ListAppliedSchemaArns when this parameter is used will list all minor version ARNs for a major version.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}

object ListAppliedSchemaArnsRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null,
    SchemaArn: Arn = null
  ): ListAppliedSchemaArnsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn)
    __obj.asInstanceOf[ListAppliedSchemaArnsRequest]
  }
}

