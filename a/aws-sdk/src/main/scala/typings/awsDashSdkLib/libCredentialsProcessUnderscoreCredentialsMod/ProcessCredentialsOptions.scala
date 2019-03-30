package typings
package awsDashSdkLib.libCredentialsProcessUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessCredentialsOptions extends js.Object {
  var filename: js.UndefOr[java.lang.String] = js.undefined
  var httpOptions: js.UndefOr[awsDashSdkLib.libConfigMod.HTTPOptions] = js.undefined
  var profile: js.UndefOr[java.lang.String] = js.undefined
}

object ProcessCredentialsOptions {
  @scala.inline
  def apply(
    filename: java.lang.String = null,
    httpOptions: awsDashSdkLib.libConfigMod.HTTPOptions = null,
    profile: java.lang.String = null
  ): ProcessCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (filename != null) __obj.updateDynamic("filename")(filename)
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions)
    if (profile != null) __obj.updateDynamic("profile")(profile)
    __obj.asInstanceOf[ProcessCredentialsOptions]
  }
}

