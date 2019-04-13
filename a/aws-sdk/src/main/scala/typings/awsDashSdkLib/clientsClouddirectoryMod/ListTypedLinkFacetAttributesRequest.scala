package typings
package awsDashSdkLib.clientsClouddirectoryMod

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
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the schema. For more information, see arns.
    */
  var SchemaArn: Arn
}

object ListTypedLinkFacetAttributesRequest {
  @scala.inline
  def apply(
    Name: TypedLinkName,
    SchemaArn: Arn,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): ListTypedLinkFacetAttributesRequest = {
    val __obj = js.Dynamic.literal(Name = Name, SchemaArn = SchemaArn)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListTypedLinkFacetAttributesRequest]
  }
}

