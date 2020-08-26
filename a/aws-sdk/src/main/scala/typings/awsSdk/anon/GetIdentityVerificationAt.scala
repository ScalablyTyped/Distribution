package typings.awsSdk.anon

import typings.awsSdk.serviceMod.WaiterConfiguration
import typings.awsSdk.sesMod.Identity
import typings.awsSdk.sesMod.IdentityList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined aws-sdk.aws-sdk/clients/ses.GetIdentityVerificationAttributesRequest & {  $waiter :aws-sdk.aws-sdk/lib/service.WaiterConfiguration | undefined} */
@js.native
trait GetIdentityVerificationAt extends js.Object {
  @JSName("$waiter")
  var $waiter: js.UndefOr[WaiterConfiguration] = js.native
  /**
    * A list of identities.
    */
  var Identities: IdentityList = js.native
}

object GetIdentityVerificationAt {
  @scala.inline
  def apply(Identities: IdentityList): GetIdentityVerificationAt = {
    val __obj = js.Dynamic.literal(Identities = Identities.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetIdentityVerificationAt]
  }
  @scala.inline
  implicit class GetIdentityVerificationAtOps[Self <: GetIdentityVerificationAt] (val x: Self) extends AnyVal {
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
    def setIdentitiesVarargs(value: Identity*): Self = this.set("Identities", js.Array(value :_*))
    @scala.inline
    def setIdentities(value: IdentityList): Self = this.set("Identities", value.asInstanceOf[js.Any])
    @scala.inline
    def set$waiter(value: WaiterConfiguration): Self = this.set("$waiter", value.asInstanceOf[js.Any])
    @scala.inline
    def delete$waiter: Self = this.set("$waiter", js.undefined)
  }
  
}

