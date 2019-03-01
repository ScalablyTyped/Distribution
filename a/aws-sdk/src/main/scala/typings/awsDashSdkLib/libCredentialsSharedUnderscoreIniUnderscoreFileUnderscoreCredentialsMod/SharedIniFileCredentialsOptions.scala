package typings
package awsDashSdkLib.libCredentialsSharedUnderscoreIniUnderscoreFileUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedIniFileCredentialsOptions extends js.Object {
  var disableAssumeRole: js.UndefOr[scala.Boolean] = js.undefined
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var httpOptions: js.UndefOr[awsDashSdkLib.libConfigMod.HTTPOptions] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* mfaSerial */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[nodeLib.Error], 
        /* token */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ]
  ] = js.undefined
}

object SharedIniFileCredentialsOptions {
  @scala.inline
  def apply(
    disableAssumeRole: js.UndefOr[scala.Boolean] = js.undefined,
    filename: java.lang.String = null,
    httpOptions: awsDashSdkLib.libConfigMod.HTTPOptions = null,
    profile: java.lang.String = null,
    tokenCodeFn: js.Function2[
      /* mfaSerial */ java.lang.String, 
      /* callback */ js.Function2[
        /* err */ js.UndefOr[nodeLib.Error], 
        /* token */ js.UndefOr[java.lang.String], 
        scala.Unit
      ], 
      scala.Unit
    ] = null
  ): SharedIniFileCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(disableAssumeRole)) __obj.updateDynamic("disableAssumeRole")(disableAssumeRole)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (tokenCodeFn != null) __obj.updateDynamic("tokenCodeFn")(tokenCodeFn)
    __obj.asInstanceOf[SharedIniFileCredentialsOptions]
  }
}

