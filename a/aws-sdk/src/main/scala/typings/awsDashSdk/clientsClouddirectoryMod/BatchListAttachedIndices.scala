package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListAttachedIndices extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * A reference to the object that has indices attached.
    */
  var TargetReference: ObjectReference
}

object BatchListAttachedIndices {
  @scala.inline
  def apply(TargetReference: ObjectReference, MaxResults: Int | Double = null, NextToken: NextToken = null): BatchListAttachedIndices = {
    val __obj = js.Dynamic.literal(TargetReference = TargetReference)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchListAttachedIndices]
  }
}

