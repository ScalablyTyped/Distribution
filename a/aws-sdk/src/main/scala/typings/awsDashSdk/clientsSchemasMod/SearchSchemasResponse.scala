package typings.awsDashSdk.clientsSchemasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchSchemasResponse extends js.Object {
  /**
    * The token that specifies the next page of results to return. To request the first page, leave NextToken empty. The token will expire in 24 hours, and cannot be shared with other accounts.
    */
  var NextToken: js.UndefOr[__string] = js.native
  /**
    * An array of SearchSchemaSummary information.
    */
  var Schemas: js.UndefOr[__listOfSearchSchemaSummary] = js.native
}

object SearchSchemasResponse {
  @scala.inline
  def apply(NextToken: __string = null, Schemas: __listOfSearchSchemaSummary = null): SearchSchemasResponse = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (Schemas != null) __obj.updateDynamic("Schemas")(Schemas.asInstanceOf[js.Any])
    __obj.asInstanceOf[SearchSchemasResponse]
  }
}

