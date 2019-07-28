package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListFacetAttributesRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The name of the facet whose attributes will be retrieved.
    */
  var Name: FacetName
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The ARN of the schema where the facet resides.
    */
  var SchemaArn: Arn
}

object ListFacetAttributesRequest {
  @scala.inline
  def apply(
    Name: FacetName,
    SchemaArn: Arn,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): ListFacetAttributesRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SchemaArn = SchemaArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListFacetAttributesRequest]
  }
}

