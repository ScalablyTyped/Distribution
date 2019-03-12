package typings
package awsDashSdkLib.libCredentialsChainableUnderscoreTemporaryUnderscoreCredentialsMod.ChainableTemporaryCredentialsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChainableTemporaryCredentialsOptions extends js.Object {
  var masterCredentials: js.UndefOr[awsDashSdkLib.libCredentialsMod.Credentials] = js.undefined
  var params: js.UndefOr[
    awsDashSdkLib.clientsStsMod.STSNs.AssumeRoleRequest | awsDashSdkLib.clientsStsMod.STSNs.GetSessionTokenRequest
  ] = js.undefined
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* serialNumber */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[stdLib.Error], 
        /* token */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
}

object ChainableTemporaryCredentialsOptions {
  @scala.inline
  def apply(
    masterCredentials: awsDashSdkLib.libCredentialsMod.Credentials = null,
    params: awsDashSdkLib.clientsStsMod.STSNs.AssumeRoleRequest | awsDashSdkLib.clientsStsMod.STSNs.GetSessionTokenRequest = null,
    tokenCodeFn: (/* serialNumber */ java.lang.String, /* callback */ js.Function2[
      /* err */ js.UndefOr[stdLib.Error], 
      /* token */ js.UndefOr[java.lang.String], 
      scala.Unit
    ]) => scala.Unit = null
  ): ChainableTemporaryCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (masterCredentials != null) __obj.updateDynamic("masterCredentials")(masterCredentials)
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (tokenCodeFn != null) __obj.updateDynamic("tokenCodeFn")(js.Any.fromFunction2(tokenCodeFn))
    __obj.asInstanceOf[ChainableTemporaryCredentialsOptions]
  }
}

