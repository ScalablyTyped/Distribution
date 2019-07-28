package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopRelationalDatabaseResult extends js.Object {
  /**
    * An object describing the result of your stop relational database request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object StopRelationalDatabaseResult {
  @scala.inline
  def apply(operations: OperationList = null): StopRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[StopRelationalDatabaseResult]
  }
}

