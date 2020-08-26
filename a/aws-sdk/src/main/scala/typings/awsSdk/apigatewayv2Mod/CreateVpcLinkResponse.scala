package typings.awsSdk.apigatewayv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateVpcLinkResponse extends js.Object {
  /**
    * The timestamp when the VPC link was created.
    */
  var CreatedDate: js.UndefOr[timestampIso8601] = js.native
  /**
    * The name of the VPC link.
    */
  var Name: js.UndefOr[StringWithLengthBetween1And128] = js.native
  /**
    * A list of security group IDs for the VPC link.
    */
  var SecurityGroupIds: js.UndefOr[SecurityGroupIdList] = js.native
  /**
    * A list of subnet IDs to include in the VPC link.
    */
  var SubnetIds: js.UndefOr[SubnetIdList] = js.native
  /**
    * Tags for the VPC link.
    */
  var Tags: js.UndefOr[typings.awsSdk.apigatewayv2Mod.Tags] = js.native
  /**
    * The ID of the VPC link.
    */
  var VpcLinkId: js.UndefOr[Id] = js.native
  /**
    * The status of the VPC link.
    */
  var VpcLinkStatus: js.UndefOr[typings.awsSdk.apigatewayv2Mod.VpcLinkStatus] = js.native
  /**
    * A message summarizing the cause of the status of the VPC link.
    */
  var VpcLinkStatusMessage: js.UndefOr[StringWithLengthBetween0And1024] = js.native
  /**
    * The version of the VPC link.
    */
  var VpcLinkVersion: js.UndefOr[typings.awsSdk.apigatewayv2Mod.VpcLinkVersion] = js.native
}

object CreateVpcLinkResponse {
  @scala.inline
  def apply(): CreateVpcLinkResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateVpcLinkResponse]
  }
  @scala.inline
  implicit class CreateVpcLinkResponseOps[Self <: CreateVpcLinkResponse] (val x: Self) extends AnyVal {
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
    def setCreatedDate(value: timestampIso8601): Self = this.set("CreatedDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedDate: Self = this.set("CreatedDate", js.undefined)
    @scala.inline
    def setName(value: StringWithLengthBetween1And128): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setSecurityGroupIdsVarargs(value: string*): Self = this.set("SecurityGroupIds", js.Array(value :_*))
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIdList): Self = this.set("SecurityGroupIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSecurityGroupIds: Self = this.set("SecurityGroupIds", js.undefined)
    @scala.inline
    def setSubnetIdsVarargs(value: string*): Self = this.set("SubnetIds", js.Array(value :_*))
    @scala.inline
    def setSubnetIds(value: SubnetIdList): Self = this.set("SubnetIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSubnetIds: Self = this.set("SubnetIds", js.undefined)
    @scala.inline
    def setTags(value: Tags): Self = this.set("Tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    @scala.inline
    def setVpcLinkId(value: Id): Self = this.set("VpcLinkId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcLinkId: Self = this.set("VpcLinkId", js.undefined)
    @scala.inline
    def setVpcLinkStatus(value: VpcLinkStatus): Self = this.set("VpcLinkStatus", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcLinkStatus: Self = this.set("VpcLinkStatus", js.undefined)
    @scala.inline
    def setVpcLinkStatusMessage(value: StringWithLengthBetween0And1024): Self = this.set("VpcLinkStatusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcLinkStatusMessage: Self = this.set("VpcLinkStatusMessage", js.undefined)
    @scala.inline
    def setVpcLinkVersion(value: VpcLinkVersion): Self = this.set("VpcLinkVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcLinkVersion: Self = this.set("VpcLinkVersion", js.undefined)
  }
  
}

