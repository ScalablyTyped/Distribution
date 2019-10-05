package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListTypedLinkFacetAttributesRequest extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The unique name of the typed link facet.
    */
  var Name: TypedLinkName
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}

object ListTypedLinkFacetAttributesRequest {
  @scala.inline
  def apply(Name: TypedLinkName, SchemaArn: Arn, MaxResults: Int | Double = null, NextToken: NextToken = null): ListTypedLinkFacetAttributesRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SchemaArn = SchemaArn)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTypedLinkFacetAttributesRequest]
  }
}

