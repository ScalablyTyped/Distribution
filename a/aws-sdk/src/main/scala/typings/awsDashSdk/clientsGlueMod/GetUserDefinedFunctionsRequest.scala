package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetUserDefinedFunctionsRequest extends js.Object {
  /**
    * The ID of the Data Catalog where the functions to be retrieved are located. If none is supplied, the AWS account ID is used by default.
    */
  var CatalogId: js.UndefOr[CatalogIdString] = js.undefined
  /**
    * The name of the catalog database where the functions are located.
    */
  var DatabaseName: NameString
  /**
    * The maximum number of functions to return in one response.
    */
  var MaxResults: js.UndefOr[PageSize] = js.undefined
  /**
    * A continuation token, if this is a continuation call.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * An optional function-name pattern string that filters the function definitions returned.
    */
  var Pattern: NameString
}

object GetUserDefinedFunctionsRequest {
  @scala.inline
  def apply(
    DatabaseName: NameString,
    Pattern: NameString,
    CatalogId: CatalogIdString = null,
    MaxResults: js.UndefOr[PageSize] = js.undefined,
    NextToken: Token = null
  ): GetUserDefinedFunctionsRequest = {
    val __obj = js.Dynamic.literal(DatabaseName = DatabaseName, Pattern = Pattern)
    if (CatalogId != null) __obj.updateDynamic("CatalogId")(CatalogId)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[GetUserDefinedFunctionsRequest]
  }
}

