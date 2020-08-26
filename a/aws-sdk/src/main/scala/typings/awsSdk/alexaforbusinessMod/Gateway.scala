package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Gateway extends js.Object {
  /**
    * The ARN of the gateway.
    */
  var Arn: js.UndefOr[typings.awsSdk.alexaforbusinessMod.Arn] = js.native
  /**
    * The description of the gateway.
    */
  var Description: js.UndefOr[GatewayDescription] = js.native
  /**
    * The ARN of the gateway group that the gateway is associated to.
    */
  var GatewayGroupArn: js.UndefOr[Arn] = js.native
  /**
    * The name of the gateway.
    */
  var Name: js.UndefOr[GatewayName] = js.native
  /**
    * The software version of the gateway. The gateway automatically updates its software version during normal operation.
    */
  var SoftwareVersion: js.UndefOr[GatewayVersion] = js.native
}

object Gateway {
  @scala.inline
  def apply(): Gateway = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Gateway]
  }
  @scala.inline
  implicit class GatewayOps[Self <: Gateway] (val x: Self) extends AnyVal {
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
    def setDescription(value: GatewayDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
    @scala.inline
    def setGatewayGroupArn(value: Arn): Self = this.set("GatewayGroupArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteGatewayGroupArn: Self = this.set("GatewayGroupArn", js.undefined)
    @scala.inline
    def setName(value: GatewayName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSoftwareVersion(value: GatewayVersion): Self = this.set("SoftwareVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSoftwareVersion: Self = this.set("SoftwareVersion", js.undefined)
  }
  
}

