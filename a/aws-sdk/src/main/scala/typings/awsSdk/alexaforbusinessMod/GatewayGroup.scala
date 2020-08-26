package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GatewayGroup extends js.Object {
  /**
    * The ARN of the gateway group.
    */
  var Arn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Arn] = js.native
  /**
    * The description of the gateway group.
    */
  var Description: js.UndefOr[GatewayGroupDescription] = js.native
  /**
    * The name of the gateway group.
    */
  var Name: js.UndefOr[GatewayGroupName] = js.native
}

object GatewayGroup {
  @scala.inline
  def apply(): GatewayGroup = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GatewayGroup]
  }
  @scala.inline
  implicit class GatewayGroupOps[Self <: GatewayGroup] (val x: Self) extends AnyVal {
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
    def setArn(value: Arn): Self = this.set("Arn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteArn: Self = this.set("Arn", js.undefined)
    @scala.inline
    def setDescription(value: GatewayGroupDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setName(value: GatewayGroupName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
  }
  
}

