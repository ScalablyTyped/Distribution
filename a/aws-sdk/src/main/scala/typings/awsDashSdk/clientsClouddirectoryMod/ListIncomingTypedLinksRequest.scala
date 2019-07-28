package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIncomingTypedLinksRequest extends js.Object {
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the directory where you want to list the typed links.
    */
  var DirectoryArn: Arn
  /**
    * Provides range filters for multiple attributes. When providing ranges to typed link selection, any inexact ranges must be specified at the end. Any attributes that do not have a range specified are presumed to match the entire range.
    */
  var FilterAttributeRanges: js.UndefOr[TypedLinkAttributeRangeList] = js.undefined
  /**
    * Filters are interpreted in the order of the attributes on the typed link facet, not the order in which they are supplied to any API calls.
    */
  var FilterTypedLink: js.UndefOr[TypedLinkSchemaAndFacetName] = js.undefined
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * Reference that identifies the object whose attributes will be listed.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object ListIncomingTypedLinksRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    ObjectReference: ObjectReference,
    ConsistencyLevel: ConsistencyLevel = null,
    FilterAttributeRanges: TypedLinkAttributeRangeList = null,
    FilterTypedLink: TypedLinkSchemaAndFacetName = null,
    MaxResults: js.UndefOr[NumberResults] = js.undefined,
    NextToken: NextToken = null
  ): ListIncomingTypedLinksRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, ObjectReference = ObjectReference)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (FilterAttributeRanges != null) __obj.updateDynamic("FilterAttributeRanges")(FilterAttributeRanges)
    if (FilterTypedLink != null) __obj.updateDynamic("FilterTypedLink")(FilterTypedLink)
    if (!js.isUndefined(MaxResults)) __obj.updateDynamic("MaxResults")(MaxResults)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListIncomingTypedLinksRequest]
  }
}

