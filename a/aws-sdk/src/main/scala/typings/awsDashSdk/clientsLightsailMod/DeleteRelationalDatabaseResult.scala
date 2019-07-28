package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRelationalDatabaseResult extends js.Object {
  /**
    * An object describing the result of your delete relational database request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object DeleteRelationalDatabaseResult {
  @scala.inline
  def apply(operations: OperationList = null): DeleteRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[DeleteRelationalDatabaseResult]
  }
}

