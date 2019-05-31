package typings
package awsDashSdkLib.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopActivityStreamRequest extends js.Object {
  /**
    * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[BooleanOptional] = js.undefined
  /**
    * The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example, arn:aws:rds:us-east-1:12345667890:cluster:das-cluster. 
    */
  var ResourceArn: String
}

object StopActivityStreamRequest {
  @scala.inline
  def apply(ResourceArn: String, ApplyImmediately: js.UndefOr[BooleanOptional] = js.undefined): StopActivityStreamRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn)
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately)
    __obj.asInstanceOf[StopActivityStreamRequest]
  }
}

