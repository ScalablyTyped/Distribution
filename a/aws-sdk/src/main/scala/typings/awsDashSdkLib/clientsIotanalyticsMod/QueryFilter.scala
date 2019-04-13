package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryFilter extends js.Object {
  /**
    * Used to limit data to that which has arrived since the last execution of the action.
    */
  var deltaTime: js.UndefOr[DeltaTime] = js.undefined
}

object QueryFilter {
  @scala.inline
  def apply(deltaTime: DeltaTime = null): QueryFilter = {
    val __obj = js.Dynamic.literal()
    if (deltaTime != null) __obj.updateDynamic("deltaTime")(deltaTime)
    __obj.asInstanceOf[QueryFilter]
  }
}

