package typings.awsSdk.acmpcaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  /**
    * The private CA actions that can be performed by the designated AWS service.
    */
  var Actions: js.UndefOr[ActionList] = js.native
  /**
    * The Amazon Resource Number (ARN) of the private CA from which the permission was issued.
    */
  var CertificateAuthorityArn: js.UndefOr[Arn] = js.native
  /**
    * The time at which the permission was created.
    */
  var CreatedAt: js.UndefOr[TStamp] = js.native
  /**
    * The name of the policy that is associated with the permission.
    */
  var Policy: js.UndefOr[String] = js.native
  /**
    * The AWS service or entity that holds the permission. At this time, the only valid principal is acm.amazonaws.com.
    */
  var Principal: js.UndefOr[String] = js.native
  /**
    * The ID of the account that assigned the permission.
    */
  var SourceAccount: js.UndefOr[String] = js.native
}

object Permission {
  @scala.inline
  def apply(): Permission = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Permission]
  }
  @scala.inline
  implicit class PermissionOps[Self <: Permission] (val x: Self) extends AnyVal {
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
    def setActionsVarargs(value: ActionType*): Self = this.set("Actions", js.Array(value :_*))
    @scala.inline
    def setActions(value: ActionList): Self = this.set("Actions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteActions: Self = this.set("Actions", js.undefined)
    @scala.inline
    def setCertificateAuthorityArn(value: Arn): Self = this.set("CertificateAuthorityArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCertificateAuthorityArn: Self = this.set("CertificateAuthorityArn", js.undefined)
    @scala.inline
    def setCreatedAt(value: TStamp): Self = this.set("CreatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("CreatedAt", js.undefined)
    @scala.inline
    def setPolicy(value: String): Self = this.set("Policy", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePolicy: Self = this.set("Policy", js.undefined)
    @scala.inline
    def setPrincipal(value: String): Self = this.set("Principal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrincipal: Self = this.set("Principal", js.undefined)
    @scala.inline
    def setSourceAccount(value: String): Self = this.set("SourceAccount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSourceAccount: Self = this.set("SourceAccount", js.undefined)
  }
  
}

