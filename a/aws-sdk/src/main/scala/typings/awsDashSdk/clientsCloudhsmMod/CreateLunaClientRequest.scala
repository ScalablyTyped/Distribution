package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateLunaClientRequest extends js.Object {
  /**
    * The contents of a Base64-Encoded X.509 v3 certificate to be installed on the HSMs used by this client.
    */
  var Certificate: typings.awsDashSdk.clientsCloudhsmMod.Certificate
  /**
    * The label for the client.
    */
  var Label: js.UndefOr[ClientLabel] = js.undefined
}

object CreateLunaClientRequest {
  @scala.inline
  def apply(Certificate: Certificate, Label: ClientLabel = null): CreateLunaClientRequest = {
    val __obj = js.Dynamic.literal(Certificate = Certificate)
    if (Label != null) __obj.updateDynamic("Label")(Label)
    __obj.asInstanceOf[CreateLunaClientRequest]
  }
}

