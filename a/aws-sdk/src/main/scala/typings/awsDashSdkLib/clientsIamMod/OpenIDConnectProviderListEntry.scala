package typings
package awsDashSdkLib.clientsIamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpenIDConnectProviderListEntry extends js.Object {
  var Arn: js.UndefOr[arnType] = js.undefined
}

object OpenIDConnectProviderListEntry {
  @scala.inline
  def apply(Arn: arnType = null): OpenIDConnectProviderListEntry = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    __obj.asInstanceOf[OpenIDConnectProviderListEntry]
  }
}

