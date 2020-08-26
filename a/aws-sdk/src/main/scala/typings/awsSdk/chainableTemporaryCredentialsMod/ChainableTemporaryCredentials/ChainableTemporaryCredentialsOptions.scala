package typings.awsSdk.chainableTemporaryCredentialsMod.ChainableTemporaryCredentials

import typings.awsSdk.credentialsMod.Credentials
import typings.awsSdk.stsMod.AssumeRoleRequest
import typings.awsSdk.stsMod.ClientConfiguration
import typings.awsSdk.stsMod.GetSessionTokenRequest
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ChainableTemporaryCredentialsOptions extends js.Object {
  var masterCredentials: js.UndefOr[Credentials] = js.native
  var params: js.UndefOr[AssumeRoleRequest | GetSessionTokenRequest] = js.native
  var stsConfig: js.UndefOr[ClientConfiguration] = js.native
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* serialNumber */ String, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.native
}

object ChainableTemporaryCredentialsOptions {
  @scala.inline
  def apply(): ChainableTemporaryCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ChainableTemporaryCredentialsOptions]
  }
  @scala.inline
  implicit class ChainableTemporaryCredentialsOptionsOps[Self <: ChainableTemporaryCredentialsOptions] (val x: Self) extends AnyVal {
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
    def setMasterCredentials(value: Credentials): Self = this.set("masterCredentials", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMasterCredentials: Self = this.set("masterCredentials", js.undefined)
    @scala.inline
    def setParams(value: AssumeRoleRequest | GetSessionTokenRequest): Self = this.set("params", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    @scala.inline
    def setStsConfig(value: ClientConfiguration): Self = this.set("stsConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStsConfig: Self = this.set("stsConfig", js.undefined)
    @scala.inline
    def setTokenCodeFn(
      value: (/* serialNumber */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit]) => Unit
    ): Self = this.set("tokenCodeFn", js.Any.fromFunction2(value))
    @scala.inline
    def deleteTokenCodeFn: Self = this.set("tokenCodeFn", js.undefined)
  }
  
}

