package typings.analyticsDashNode.analyticsDashNodeMod.AnalyticsNode

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data extends js.Object {
  var batch: js.Array[Message]
  var sentAt: Date
  var timestamp: Date
}

object Data {
  @scala.inline
  def apply(batch: js.Array[Message], sentAt: Date, timestamp: Date): Data = {
    val __obj = js.Dynamic.literal(batch = batch.asInstanceOf[js.Any], sentAt = sentAt.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Data]
  }
}

