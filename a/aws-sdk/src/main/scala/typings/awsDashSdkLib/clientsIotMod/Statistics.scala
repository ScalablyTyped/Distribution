package typings
package awsDashSdkLib.clientsIotMod

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
  def apply(count: js.UndefOr[Count] = js.undefined): Statistics = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(count)) __obj.updateDynamic("count")(count)
    __obj.asInstanceOf[Statistics]
  }
}

