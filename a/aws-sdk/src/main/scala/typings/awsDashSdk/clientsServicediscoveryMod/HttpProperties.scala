package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HttpProperties extends js.Object {
  /**
    * The name of an HTTP namespace.
    */
  var HttpName: js.UndefOr[NamespaceName] = js.native
}

object HttpProperties {
  @scala.inline
  def apply(HttpName: NamespaceName = null): HttpProperties = {
    val __obj = js.Dynamic.literal()
    if (HttpName != null) __obj.updateDynamic("HttpName")(HttpName.asInstanceOf[js.Any])
    __obj.asInstanceOf[HttpProperties]
  }
}

