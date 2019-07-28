package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListObjectAttributesRequest extends js.Object {
  /**
    * Represents the manner and timing in which the successful write or update of an object is reflected in a subsequent read operation of that same object.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  /**
    * The Amazon Resource Name (ARN) that is associated with the Directory where the object resides. For more information, see arns.
    */
  var DirectoryArn: Arn
  /**
    * Used to filter the list of object attributes that are associated with a certain facet.
    */
  var FacetFilter: js.UndefOr[SchemaFacet] = js.undefined
  /**
    * The maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * The reference that identifies the object whose attributes will be listed.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object ListObjectAttributesRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    ConsistencyLevel: ConsistencyLevel = null,
    FacetFilter: SchemaFacet = null,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): ListObjectAttributesRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (FacetFilter != null) __obj.updateDynamic("FacetFilter")(FacetFilter)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListObjectAttributesRequest]
  }
}

