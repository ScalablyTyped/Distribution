package typings.awsDashSdk.clientsDetectiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  /**
    * The ARN of the behavior graph.
    */
  var Arn: js.UndefOr[GraphArn] = js.native
  /**
    * The date and time that the behavior graph was created. The value is in milliseconds since the epoch.
    */
  var CreatedTime: js.UndefOr[Timestamp] = js.native
}

object Graph {
  @scala.inline
  def apply(Arn: GraphArn = null, CreatedTime: Timestamp = null): Graph = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (CreatedTime != null) __obj.updateDynamic("CreatedTime")(CreatedTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[Graph]
  }
}

