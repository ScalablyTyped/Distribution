package typings.awsDashLambda.awsDashLambdaMod

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
    val __obj = js.Dynamic.literal(account = account, detail = detail, id = id, region = region, resources = resources, source = source, time = time)
    __obj.updateDynamic("detail-type")(`detail-type`)
    __obj.asInstanceOf[ScheduledEvent]
  }
}

