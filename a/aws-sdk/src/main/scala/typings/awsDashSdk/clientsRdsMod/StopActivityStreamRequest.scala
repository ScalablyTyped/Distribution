package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StopActivityStreamRequest extends js.Object {
  /**
    * Specifies whether or not the database activity stream is to stop as soon as possible, regardless of the maintenance window for the database.
    */
  var ApplyImmediately: js.UndefOr[BooleanOptional] = js.native
  /**
    * The Amazon Resource Name (ARN) of the DB cluster for the database activity stream. For example, arn:aws:rds:us-east-1:12345667890:cluster:das-cluster. 
    */
  var ResourceArn: String = js.native
}

object StopActivityStreamRequest {
  @scala.inline
  def apply(ResourceArn: String, ApplyImmediately: js.UndefOr[scala.Boolean] = js.undefined): StopActivityStreamRequest = {
    val __obj = js.Dynamic.literal(ResourceArn = ResourceArn.asInstanceOf[js.Any])
    if (!js.isUndefined(ApplyImmediately)) __obj.updateDynamic("ApplyImmediately")(ApplyImmediately.asInstanceOf[js.Any])
    __obj.asInstanceOf[StopActivityStreamRequest]
  }
}

