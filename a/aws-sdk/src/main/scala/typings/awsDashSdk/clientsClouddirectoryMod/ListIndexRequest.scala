package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListIndexRequest extends js.Object {
  /**
    * The consistency level to execute the request at.
    */
  var ConsistencyLevel: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.ConsistencyLevel] = js.undefined
  /**
    * The ARN of the directory that the index exists in.
    */
  var DirectoryArn: Arn
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference
  /**
    * The maximum number of objects in a single page to retrieve from the index during a request. For more information, see Amazon Cloud Directory Limits.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * Specifies the ranges of indexed values that you want to query.
    */
  var RangesOnIndexedValues: js.UndefOr[ObjectAttributeRangeList] = js.undefined
}

object ListIndexRequest {
  @scala.inline
  def apply(
    DirectoryArn: Arn,
    IndexReference: ObjectReference,
    ConsistencyLevel: ConsistencyLevel = null,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    RangesOnIndexedValues: ObjectAttributeRangeList = null
  ): ListIndexRequest = {
    val __obj = js.Dynamic.literal(DirectoryArn = DirectoryArn, IndexReference = IndexReference)
    if (ConsistencyLevel != null) __obj.updateDynamic("ConsistencyLevel")(ConsistencyLevel.asInstanceOf[js.Any])
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RangesOnIndexedValues != null) __obj.updateDynamic("RangesOnIndexedValues")(RangesOnIndexedValues)
    __obj.asInstanceOf[ListIndexRequest]
  }
}

