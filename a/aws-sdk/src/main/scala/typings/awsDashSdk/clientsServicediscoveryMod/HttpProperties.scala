package typings.awsDashSdk.clientsServicediscoveryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpProperties extends js.Object {
  /**
    * The name of an HTTP namespace.
    */
  var HttpName: js.UndefOr[NamespaceName] = js.undefined
}

object HttpProperties {
  @scala.inline
  def apply(HttpName: NamespaceName = null): HttpProperties = {
    val __obj = js.Dynamic.literal()
    if (HttpName != null) __obj.updateDynamic("HttpName")(HttpName)
    __obj.asInstanceOf[HttpProperties]
  }
}

