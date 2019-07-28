package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRelationalDatabaseResult extends js.Object {
  /**
    * An object describing the result of your start relational database request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object StartRelationalDatabaseResult {
  @scala.inline
  def apply(operations: OperationList = null): StartRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[StartRelationalDatabaseResult]
  }
}

