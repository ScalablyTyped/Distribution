package typings
package awsDashLambdaLib.awsDashLambdaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScheduledEvent extends js.Object {
  var account: java.lang.String
  var detail: js.Any
  var `detail-type`: java.lang.String
  var id: java.lang.String
  var region: java.lang.String
  var resources: js.Array[java.lang.String]
  var source: java.lang.String
  var time: java.lang.String
}

object ScheduledEvent {
  @scala.inline
  def apply(
    account: java.lang.String,
    detail: js.Any,
    `detail-type`: java.lang.String,
    id: java.lang.String,
    region: java.lang.String,
    resources: js.Array[java.lang.String],
    source: java.lang.String,
    time: java.lang.String
  ): ScheduledEvent = {
    val __obj = js.Dynamic.literal(account = account, detail = detail, id = id, region = region, resources = resources, source = source, time = time)
    __obj.updateDynamic("detail-type")(`detail-type`)
    __obj.asInstanceOf[ScheduledEvent]
  }
}

