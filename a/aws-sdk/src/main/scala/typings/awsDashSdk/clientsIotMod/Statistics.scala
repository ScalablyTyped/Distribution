package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Statistics extends js.Object {
  /**
    * The count of things that match the query.
    */
  var count: js.UndefOr[Count] = js.undefined
}

object Statistics {
  @scala.inline
  def apply(count: Int | Double = null): Statistics = {
    val __obj = js.Dynamic.literal()
    if (count != null) __obj.updateDynamic("count")(count.asInstanceOf[js.Any])
    __obj.asInstanceOf[Statistics]
  }
}

