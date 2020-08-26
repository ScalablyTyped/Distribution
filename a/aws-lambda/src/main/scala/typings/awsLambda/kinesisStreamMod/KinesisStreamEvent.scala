package typings.awsLambda.kinesisStreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait KinesisStreamEvent extends js.Object {
  var Records: js.Array[KinesisStreamRecord] = js.native
}

object KinesisStreamEvent {
  @scala.inline
  def apply(Records: js.Array[KinesisStreamRecord]): KinesisStreamEvent = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    __obj.asInstanceOf[KinesisStreamEvent]
  }
  @scala.inline
  implicit class KinesisStreamEventOps[Self <: KinesisStreamEvent] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setRecordsVarargs(value: KinesisStreamRecord*): Self = this.set("Records", js.Array(value :_*))
    @scala.inline
    def setRecords(value: js.Array[KinesisStreamRecord]): Self = this.set("Records", value.asInstanceOf[js.Any])
  }
  
}

