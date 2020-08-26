package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateGatewayRequest extends js.Object {
  /**
    * The updated description of the gateway.
    */
  var Description: js.UndefOr[GatewayDescription] = js.native
  /**
    * The ARN of the gateway to update.
    */
  var GatewayArn: Arn = js.native
  /**
    * The updated name of the gateway.
    */
  var Name: js.UndefOr[GatewayName] = js.native
  /**
    * The updated software version of the gateway. The gateway automatically updates its software version during normal operation.
    */
  var SoftwareVersion: js.UndefOr[GatewayVersion] = js.native
}

object UpdateGatewayRequest {
  @scala.inline
  def apply(GatewayArn: Arn): UpdateGatewayRequest = {
    val __obj = js.Dynamic.literal(GatewayArn = GatewayArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateGatewayRequest]
  }
  @scala.inline
  implicit class UpdateGatewayRequestOps[Self <: UpdateGatewayRequest] (val x: Self) extends AnyVal {
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
    def setGatewayArn(value: Arn): Self = this.set("GatewayArn", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: GatewayDescription): Self = this.set("Description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("Description", js.undefined)
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

