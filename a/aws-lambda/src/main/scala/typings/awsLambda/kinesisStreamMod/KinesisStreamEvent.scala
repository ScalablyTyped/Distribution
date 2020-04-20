package typings.awsLambda.kinesisStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KinesisStreamEvent extends js.Object {
  var Records: js.Array[KinesisStreamRecord]
}

object KinesisStreamEvent {
  @scala.inline
  def apply(Records: js.Array[KinesisStreamRecord]): KinesisStreamEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamEvent]
  }
}

