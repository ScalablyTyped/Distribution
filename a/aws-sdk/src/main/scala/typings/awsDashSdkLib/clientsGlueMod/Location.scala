package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Location extends js.Object {
  /**
    * A DynamoDB Table location.
    */
  var DynamoDB: js.UndefOr[CodeGenNodeArgs] = js.undefined
  /**
    * A JDBC location.
    */
  var Jdbc: js.UndefOr[CodeGenNodeArgs] = js.undefined
  /**
    * An Amazon S3 location.
    */
  var S3: js.UndefOr[CodeGenNodeArgs] = js.undefined
}

object Location {
  @scala.inline
  def apply(DynamoDB: CodeGenNodeArgs = null, Jdbc: CodeGenNodeArgs = null, S3: CodeGenNodeArgs = null): Location = {
    val __obj = js.Dynamic.literal()
    if (DynamoDB != null) __obj.updateDynamic("DynamoDB")(DynamoDB)
    if (Jdbc != null) __obj.updateDynamic("Jdbc")(Jdbc)
    if (S3 != null) __obj.updateDynamic("S3")(S3)
    __obj.asInstanceOf[Location]
  }
}

