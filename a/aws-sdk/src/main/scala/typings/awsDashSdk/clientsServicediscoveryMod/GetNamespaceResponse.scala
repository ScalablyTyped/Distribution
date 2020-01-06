package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetNamespaceResponse extends js.Object {
  /**
    * A complex type that contains information about the specified namespace.
    */
  var Namespace: js.UndefOr[typings.awsDashSdk.clientsServicediscoveryMod.Namespace] = js.native
}

object GetNamespaceResponse {
  @scala.inline
  def apply(Namespace: Namespace = null): GetNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetNamespaceResponse]
  }
}

