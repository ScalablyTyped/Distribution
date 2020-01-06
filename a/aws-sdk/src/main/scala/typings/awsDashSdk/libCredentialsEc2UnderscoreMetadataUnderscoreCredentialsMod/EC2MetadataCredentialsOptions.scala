package typings.awsDashSdk.libCredentialsEc2UnderscoreMetadataUnderscoreCredentialsMod

import typings.awsDashSdk.Anon_Timeout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EC2MetadataCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[Anon_Timeout] = js.native
  var maxRetries: js.UndefOr[Double] = js.native
}

object EC2MetadataCredentialsOptions {
  @scala.inline
  def apply(httpOptions: Anon_Timeout = null, maxRetries: Int | Double = null): EC2MetadataCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions.asInstanceOf[js.Any])
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2MetadataCredentialsOptions]
  }
}

