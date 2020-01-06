package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListSchemaVersionsResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * An array of schema version summaries.
    */
  var SchemaVersions: js.UndefOr[__listOfSchemaVersionSummary] = js.native
}

object ListSchemaVersionsResponse {
  @scala.inline
  def apply(NextToken: __string = null, SchemaVersions: __listOfSchemaVersionSummary = null): ListSchemaVersionsResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (SchemaVersions != null) __obj.updateDynamic("SchemaVersions")(SchemaVersions.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListSchemaVersionsResponse]
  }
}

