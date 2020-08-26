package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartHumanLoopResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopArn] = js.native
}

object StartHumanLoopResponse {
  @scala.inline
  def apply(): StartHumanLoopResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartHumanLoopResponse]
  }
  @scala.inline
  implicit class StartHumanLoopResponseOps[Self <: StartHumanLoopResponse] (val x: Self) extends AnyVal {
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
    def setHumanLoopArn(value: HumanLoopArn): Self = this.set("HumanLoopArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHumanLoopArn: Self = this.set("HumanLoopArn", js.undefined)
  }
  
}

