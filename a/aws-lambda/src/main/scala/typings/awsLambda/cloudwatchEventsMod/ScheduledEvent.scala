package typings.awsLambda.cloudwatchEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledEvent extends js.Object {
  var account: String
  var detail: js.Any
  var `detail-type`: String
  var id: String
  var region: String
  var resources: js.Array[String]
  var source: String
  var time: String
}

object ScheduledEvent {
  @scala.inline
  def apply(
    account: String,
    detail: js.Any,
    `detail-type`: String,
    id: String,
    region: String,
    resources: js.Array[String],
    source: String,
    time: String
  ): ScheduledEvent = {
    val __obj = js.Dynamic.literal(account = account.asInstanceOf[js.Any], detail = detail.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
    __obj.updateDynamic("detail-type")(`detail-type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduledEvent]
  }
}

