package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateRelationalDatabaseParametersResult extends js.Object {
  /**
    * An object describing the result of your update relational database parameters request.
    */
  var operations: js.UndefOr[OperationList] = js.undefined
}

object UpdateRelationalDatabaseParametersResult {
  @scala.inline
  def apply(operations: OperationList = null): UpdateRelationalDatabaseParametersResult = {
    val __obj = js.Dynamic.literal()
    if (operations != null) __obj.updateDynamic("operations")(operations)
    __obj.asInstanceOf[UpdateRelationalDatabaseParametersResult]
  }
}

