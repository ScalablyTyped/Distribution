package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeCapacityStatus extends js.Object {
  /**
    * The number of currently available instances that can be used to stream sessions.
    */
  var Available: js.UndefOr[Integer] = js.native
  /**
    * The desired number of streaming instances.
    */
  var Desired: Integer = js.native
  /**
    * The number of instances in use for streaming.
    */
  var InUse: js.UndefOr[Integer] = js.native
  /**
    * The total number of simultaneous streaming instances that are running.
    */
  var Running: js.UndefOr[Integer] = js.native
}

object ComputeCapacityStatus {
  @scala.inline
  def apply(Desired: Integer): ComputeCapacityStatus = {
    val __obj = js.Dynamic.literal(Desired = Desired.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeCapacityStatus]
  }
  @scala.inline
  implicit class ComputeCapacityStatusOps[Self <: ComputeCapacityStatus] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDesired(value: Integer): Self = this.set("Desired", value.asInstanceOf[js.Any])
    @scala.inline
    def setAvailable(value: Integer): Self = this.set("Available", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAvailable: Self = this.set("Available", js.undefined)
    @scala.inline
    def setInUse(value: Integer): Self = this.set("InUse", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInUse: Self = this.set("InUse", js.undefined)
    @scala.inline
    def setRunning(value: Integer): Self = this.set("Running", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunning: Self = this.set("Running", js.undefined)
  }
  
}

