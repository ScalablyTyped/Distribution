package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeCACertificateResponse extends js.Object {
  /**
    * The CA certificate description.
    */
  var certificateDescription: js.UndefOr[CACertificateDescription] = js.undefined
  /**
    * Information about the registration configuration.
    */
  var registrationConfig: js.UndefOr[RegistrationConfig] = js.undefined
}

object DescribeCACertificateResponse {
  @scala.inline
  def apply(
    certificateDescription: CACertificateDescription = null,
    registrationConfig: RegistrationConfig = null
  ): DescribeCACertificateResponse = {
    val __obj = js.Dynamic.literal()
    if (certificateDescription != null) __obj.updateDynamic("certificateDescription")(certificateDescription)
    if (registrationConfig != null) __obj.updateDynamic("registrationConfig")(registrationConfig)
    __obj.asInstanceOf[DescribeCACertificateResponse]
  }
}

