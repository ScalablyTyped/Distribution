package typings.awsSdk.apigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VpcLink extends js.Object {
  /**
    * The description of the VPC link.
    */
  var description: js.UndefOr[String] = js.native
  /**
    * The identifier of the VpcLink. It is used in an Integration to reference this VpcLink.
    */
  var id: js.UndefOr[String] = js.native
  /**
    * The name used to label and identify the VPC link.
    */
  var name: js.UndefOr[String] = js.native
  /**
    * The status of the VPC link. The valid values are AVAILABLE, PENDING, DELETING, or FAILED. Deploying an API will wait if the status is PENDING and will fail if the status is DELETING. 
    */
  var status: js.UndefOr[VpcLinkStatus] = js.native
  /**
    * A description about the VPC link status.
    */
  var statusMessage: js.UndefOr[String] = js.native
  /**
    * The collection of tags. Each tag element is associated with a given resource.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.native
  /**
    * The ARN of the network load balancer of the VPC targeted by the VPC link. The network load balancer must be owned by the same AWS account of the API owner.
    */
  var targetArns: js.UndefOr[ListOfString] = js.native
}

object VpcLink {
  @scala.inline
  def apply(): VpcLink = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VpcLink]
  }
  @scala.inline
  implicit class VpcLinkOps[Self <: VpcLink] (val x: Self) extends AnyVal {
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setStatus(value: VpcLinkStatus): Self = this.set("status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    @scala.inline
    def setStatusMessage(value: String): Self = this.set("statusMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusMessage: Self = this.set("statusMessage", js.undefined)
    @scala.inline
    def setTags(value: MapOfStringToString): Self = this.set("tags", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
    @scala.inline
    def setTargetArnsVarargs(value: String*): Self = this.set("targetArns", js.Array(value :_*))
    @scala.inline
    def setTargetArns(value: ListOfString): Self = this.set("targetArns", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetArns: Self = this.set("targetArns", js.undefined)
  }
  
}

