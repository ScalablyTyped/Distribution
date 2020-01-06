package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListAppliedSchemaArnsRequest extends js.Object {
  /**
    * The ARN of the directory you are listing.
    */
  var DirectoryArn: Arn = js.native
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.native
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.native
  /**
    * The response for ListAppliedSchemaArns when this parameter is used will list all minor version ARNs for a major version.
    */
  var SchemaArn: js.UndefOr[Arn] = js.native
}

object ListAppliedSchemaArnsRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    SchemaArn: Arn = null
  ): ListAppliedSchemaArnsRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaArn != null) __obj.updateDynamic("SchemaArn")(SchemaArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListAppliedSchemaArnsRequest]
  }
}

