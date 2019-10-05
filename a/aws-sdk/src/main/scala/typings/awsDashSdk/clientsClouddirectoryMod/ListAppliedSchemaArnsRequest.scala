package typings.awsDashSdk.clientsClouddirectoryMod

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
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The response for ListAppliedSchemaArns when this parameter is used will list all minor version ARNs for a major version.
    */
  var SchemaArn: js.UndefOr[Arn] = js.undefined
}

object ListAppliedSchemaArnsRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SchemaArn: Arn = null
  ): ListAppliedSchemaArnsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn)
    __obj.asInstanceOf[ListAppliedSchemaArnsRequest]
  }
}

