package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RegisterThingResponse extends js.Object {
  /**
    * .
    */
  var certificatePem: js.UndefOr[CertificatePem] = js.undefined
  /**
    * ARNs for the generated resources.
    */
  var resourceArns: js.UndefOr[ResourceArns] = js.undefined
}

object RegisterThingResponse {
  @scala.inline
  def apply(certificatePem: CertificatePem = null, resourceArns: ResourceArns = null): RegisterThingResponse = {
    val __obj = js.Dynamic.literal()
    if (certificatePem != null) __obj.updateDynamic("certificatePem")(certificatePem)
    if (resourceArns != null) __obj.updateDynamic("resourceArns")(resourceArns)
    __obj.asInstanceOf[RegisterThingResponse]
  }
}

