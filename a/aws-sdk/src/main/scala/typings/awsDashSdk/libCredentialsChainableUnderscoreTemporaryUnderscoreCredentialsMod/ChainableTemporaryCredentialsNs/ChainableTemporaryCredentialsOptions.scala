package typings.awsDashSdk.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod.ChainableTemporaryCredentialsNs

import typings.awsDashSdk.clientsStsMod.AssumeRoleRequest
import typings.awsDashSdk.clientsStsMod.ClientConfiguration
import typings.awsDashSdk.clientsStsMod.GetSessionTokenRequest
import typings.awsDashSdk.libCredentialsMod.Credentials
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableTemporaryCredentialsOptions extends js.Object {
  var masterCredentials: js.UndefOr[Credentials] = js.undefined
  var params: js.UndefOr[AssumeRoleRequest | GetSessionTokenRequest] = js.undefined
  var stsConfig: js.UndefOr[ClientConfiguration] = js.undefined
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* serialNumber */ String, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.undefined
}

object ChainableTemporaryCredentialsOptions {
  @scala.inline
  def apply(
    masterCredentials: Credentials = null,
    params: AssumeRoleRequest | GetSessionTokenRequest = null,
    stsConfig: ClientConfiguration = null,
    tokenCodeFn: (/* serialNumber */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit]) => Unit = null
  ): ChainableTemporaryCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (masterCredentials != null) __obj.updateDynamic("masterCredentials")(masterCredentials)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (stsConfig != null) __obj.updateDynamic("stsConfig")(stsConfig)
    if (tokenCodeFn != null) __obj.updateDynamic("tokenCodeFn")(js.Any.fromFunction2(tokenCodeFn))
    __obj.asInstanceOf[ChainableTemporaryCredentialsOptions]
  }
}

