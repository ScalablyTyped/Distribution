package typings
package awsDashSdkLib.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetNamespaceResponse extends js.Object {
  /**
    * A complex type that contains information about the specified namespace.
    */
  var Namespace: js.UndefOr[Namespace] = js.undefined
}

object GetNamespaceResponse {
  @scala.inline
  def apply(Namespace: Namespace = null): GetNamespaceResponse = {
    val __obj = js.Dynamic.literal()
    if (Namespace != null) __obj.updateDynamic("Namespace")(Namespace)
    __obj.asInstanceOf[GetNamespaceResponse]
  }
}

