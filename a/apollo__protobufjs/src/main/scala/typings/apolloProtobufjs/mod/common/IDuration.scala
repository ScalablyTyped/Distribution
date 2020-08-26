package typings.apolloProtobufjs.mod.common

import typings.long.mod.Long
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of a google.protobuf.Duration message. */
@js.native
trait IDuration extends js.Object {
  var nanos: js.UndefOr[Double] = js.native
  var seconds: js.UndefOr[Double | Long] = js.native
}

object IDuration {
  @scala.inline
  def apply(): IDuration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDuration]
  }
  @scala.inline
  implicit class IDurationOps[Self <: IDuration] (val x: Self) extends AnyVal {
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
    def setNanos(value: Double): Self = this.set("nanos", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNanos: Self = this.set("nanos", js.undefined)
    @scala.inline
    def setSeconds(value: Double | Long): Self = this.set("seconds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSeconds: Self = this.set("seconds", js.undefined)
  }
  
}

