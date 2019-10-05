package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListIndex extends js.Object {
  /**
    * The reference to the index to list.
    */
  var IndexReference: ObjectReference
  /**
    * The maximum number of results to retrieve.
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

object BatchListIndex {
  @scala.inline
  def apply(
    IndexReference: ObjectReference,
    MaxResults: Int | Double = null,
    NextToken: NextToken = null,
    RangesOnIndexedValues: ObjectAttributeRangeList = null
  ): BatchListIndex = {
    val __obj = js.Dynamic.literal(IndexReference = IndexReference)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (RangesOnIndexedValues != null) __obj.updateDynamic("RangesOnIndexedValues")(RangesOnIndexedValues)
    __obj.asInstanceOf[BatchListIndex]
  }
}

