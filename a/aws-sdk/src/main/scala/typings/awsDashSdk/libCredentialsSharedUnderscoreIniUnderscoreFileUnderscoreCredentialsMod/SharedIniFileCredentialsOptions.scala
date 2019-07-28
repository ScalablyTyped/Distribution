package typings.awsDashSdk.libCredentialsSharedUnderscoreIniUnderscoreFileUnderscoreCredentialsMod

import typings.awsDashSdk.libConfigMod.HTTPOptions
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SharedIniFileCredentialsOptions extends js.Object {
  var callback: js.UndefOr[js.Function1[/* err */ js.UndefOr[Error], Unit]] = js.undefined
  var disableAssumeRole: js.UndefOr[Boolean] = js.undefined
  var filename: js.UndefOr[String] = js.undefined
  var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
  var tokenCodeFn: js.UndefOr[
    js.Function2[
      /* mfaSerial */ String, 
      /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit], 
      Unit
    ]
  ] = js.undefined
}

object SharedIniFileCredentialsOptions {
  @scala.inline
  def apply(
    callback: /* err */ js.UndefOr[Error] => Unit = null,
    disableAssumeRole: js.UndefOr[Boolean] = js.undefined,
    filename: String = null,
    httpOptions: HTTPOptions = null,
    profile: String = null,
    tokenCodeFn: (/* mfaSerial */ String, /* callback */ js.Function2[/* err */ js.UndefOr[Error], /* token */ js.UndefOr[String], Unit]) => Unit = null
  ): SharedIniFileCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction1(callback))
    if (!js.isUndefined(disableAssumeRole)) __obj.updateDynamic("disableAssumeRole")(disableAssumeRole)
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    if (tokenCodeFn != null) __obj.updateDynamic("tokenCodeFn")(js.Any.fromFunction2(tokenCodeFn))
    __obj.asInstanceOf[SharedIniFileCredentialsOptions]
  }
}

