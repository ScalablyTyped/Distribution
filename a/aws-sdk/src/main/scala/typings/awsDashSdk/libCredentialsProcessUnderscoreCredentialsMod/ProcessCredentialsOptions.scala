package typings.awsDashSdk.libCredentialsProcessUnderscoreCredentialsMod

import typings.awsDashSdk.libConfigMod.HTTPOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessCredentialsOptions extends js.Object {
  var filename: js.UndefOr[String] = js.undefined
  var httpOptions: js.UndefOr[HTTPOptions] = js.undefined
  var profile: js.UndefOr[String] = js.undefined
}

object ProcessCredentialsOptions {
  @scala.inline
  def apply(filename: String = null, httpOptions: HTTPOptions = null, profile: String = null): ProcessCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[ProcessCredentialsOptions]
  }
}

