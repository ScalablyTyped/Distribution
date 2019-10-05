package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListObjectParents extends js.Object {
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object BatchListObjectParents {
  @scala.inline
  def apply(ObjectReference: ObjectReference, MaxResults: Int | Double = null, NextToken: NextToken = null): BatchListObjectParents = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchListObjectParents]
  }
}

