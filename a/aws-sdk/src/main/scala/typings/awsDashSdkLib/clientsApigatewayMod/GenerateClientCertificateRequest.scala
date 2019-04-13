package typings
package awsDashSdkLib.clientsApigatewayMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateClientCertificateRequest extends js.Object {
  /**
    * The description of the ClientCertificate.
    */
  var description: js.UndefOr[String] = js.undefined
}

object GenerateClientCertificateRequest {
  @scala.inline
  def apply(description: String = null): GenerateClientCertificateRequest = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[GenerateClientCertificateRequest]
  }
}

