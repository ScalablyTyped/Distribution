package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TwitterParameters extends js.Object {
  /**
    * Maximum number of rows to query Twitter.
    */
  var MaxRows: PositiveInteger = js.native
  /**
    * Twitter query string.
    */
  var Query: typings.awsDashSdk.clientsQuicksightMod.Query = js.native
}

object TwitterParameters {
  @scala.inline
  def apply(MaxRows: PositiveInteger, Query: Query): TwitterParameters = {
    val __obj = js.Dynamic.literal(MaxRows = MaxRows.asInstanceOf[js.Any], Query = Query.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TwitterParameters]
  }
}

