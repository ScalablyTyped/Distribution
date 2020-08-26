package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateComputeEnvironmentResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the compute environment.
    */
  var computeEnvironmentArn: js.UndefOr[String] = js.native
  /**
    * The name of the compute environment.
    */
  var computeEnvironmentName: js.UndefOr[String] = js.native
}

object UpdateComputeEnvironmentResponse {
  @scala.inline
  def apply(): UpdateComputeEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UpdateComputeEnvironmentResponse]
  }
  @scala.inline
  implicit class UpdateComputeEnvironmentResponseOps[Self <: UpdateComputeEnvironmentResponse] (val x: Self) extends AnyVal {
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
    def setComputeEnvironmentArn(value: String): Self = this.set("computeEnvironmentArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeEnvironmentArn: Self = this.set("computeEnvironmentArn", js.undefined)
    @scala.inline
    def setComputeEnvironmentName(value: String): Self = this.set("computeEnvironmentName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteComputeEnvironmentName: Self = this.set("computeEnvironmentName", js.undefined)
  }
  
}

