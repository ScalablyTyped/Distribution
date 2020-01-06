package typings.awsDashSdk.libCredentialsProcessUnderscoreCredentialsMod

import typings.awsDashSdk.libConfigMod.HTTPOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessCredentialsOptions extends js.Object {
  var filename: js.UndefOr[String] = js.native
  var httpOptions: js.UndefOr[HTTPOptions] = js.native
  var profile: js.UndefOr[String] = js.native
}

object ProcessCredentialsOptions {
  @scala.inline
  def apply(filename: String = null, httpOptions: HTTPOptions = null, profile: String = null): ProcessCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename.asInstanceOf[js.Any])
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (profile != null) __obj.updateDynamic("profile")(profile.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessCredentialsOptions]
  }
}

