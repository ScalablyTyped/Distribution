package typings.awsDashSdk.libCredentialsEcsUnderscoreCredentialsMod

import typings.awsDashSdk.Anon_Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECSCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[Anon_Timeout] = js.undefined
  var maxRetries: js.UndefOr[Double] = js.undefined
}

object ECSCredentialsOptions {
  @scala.inline
  def apply(httpOptions: Anon_Timeout = null, maxRetries: Int | Double = null): ECSCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[ECSCredentialsOptions]
  }
}

