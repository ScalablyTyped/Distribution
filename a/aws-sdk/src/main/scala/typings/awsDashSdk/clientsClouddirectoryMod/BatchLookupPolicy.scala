package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchLookupPolicy extends js.Object {
  /**
    * The maximum number of results to retrieve.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * Reference that identifies the object whose policies will be looked up.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object BatchLookupPolicy {
  @scala.inline
  def apply(ObjectReference: ObjectReference, MaxResults: Int | Double = null, NextToken: NextToken = null): BatchLookupPolicy = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchLookupPolicy]
  }
}

