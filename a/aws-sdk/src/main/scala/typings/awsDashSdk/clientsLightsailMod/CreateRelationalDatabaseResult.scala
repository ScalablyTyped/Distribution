package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRelationalDatabaseResult extends js.Object {
  /**
    * An object describing the result of your create relational database request.
    */
  var operations: js.UndefOr[OperationList] = js.native
}

object CreateRelationalDatabaseResult {
  @scala.inline
  def apply(operations: OperationList = null): CreateRelationalDatabaseResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRelationalDatabaseResult]
  }
}

