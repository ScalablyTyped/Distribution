package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRelationalDatabaseResult extends js.Object {
  /**
    * An object describing the result of your update relational database request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object UpdateRelationalDatabaseResult {
  @scala.inline
  def apply(operations: OperationList = null): UpdateRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRelationalDatabaseResult]
  }
}

