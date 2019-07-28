package typings.awsDashSdk.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateClientCertificateRequest extends js.Object {
  /**
    * The description of the ClientCertificate.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The key-value map of strings. The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must not start with aws:. The tag value can be up to 256 characters.
    */
  var tags: js.UndefOr[MapOfStringToString] = js.undefined
}

object GenerateClientCertificateRequest {
  @scala.inline
  def apply(description: String = null, tags: MapOfStringToString = null): GenerateClientCertificateRequest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (tags != null) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[GenerateClientCertificateRequest]
  }
}

