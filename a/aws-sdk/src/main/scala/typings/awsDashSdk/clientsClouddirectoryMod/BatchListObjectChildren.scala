package typings.awsDashSdk.clientsClouddirectoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchListObjectChildren extends js.Object {
  /**
    * Maximum number of items to be retrieved in a single call. This is an approximate number.
    */
  var MaxResults: js.UndefOr[NumberResults] = js.undefined
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsClouddirectoryMod.NextToken] = js.undefined
  /**
    * Reference of the object for which child objects are being listed.
    */
  var ObjectReference: typings.awsDashSdk.clientsClouddirectoryMod.ObjectReference
}

object BatchListObjectChildren {
  @scala.inline
  def apply(ObjectReference: ObjectReference, MaxResults: Int | Double = null, NextToken: NextToken = null): BatchListObjectChildren = {
    val __obj = js.Dynamic.literal(ObjectReference = ObjectReference)
    if (MaxResults != null) __obj.updateDynamic("MaxResults")(MaxResults.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[BatchListObjectChildren]
  }
}

