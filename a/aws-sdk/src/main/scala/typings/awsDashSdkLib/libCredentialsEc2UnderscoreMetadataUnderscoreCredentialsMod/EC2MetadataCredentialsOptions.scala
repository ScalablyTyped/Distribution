package typings
package awsDashSdkLib.libCredentialsEc2UnderscoreMetadataUnderscoreCredentialsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EC2MetadataCredentialsOptions extends js.Object {
  var httpOptions: js.UndefOr[awsDashSdkLib.Anon_Timeout] = js.undefined
  var maxRetries: js.UndefOr[scala.Double] = js.undefined
}

object EC2MetadataCredentialsOptions {
  @scala.inline
  def apply(httpOptions: awsDashSdkLib.Anon_Timeout = null, maxRetries: scala.Int | scala.Double = null): EC2MetadataCredentialsOptions = {
    val __obj = js.Dynamic.literal()
    if (httpOptions != null) __obj.updateDynamic("httpOptions")(httpOptions)
    if (maxRetries != null) __obj.updateDynamic("maxRetries")(maxRetries.asInstanceOf[js.Any])
    __obj.asInstanceOf[EC2MetadataCredentialsOptions]
  }
}

