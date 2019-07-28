package typings.awsDashSdk.clientsEcsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SystemControl extends js.Object {
  /**
    * The namespaced kernel parameter for which to set a value.
    */
  var namespace: js.UndefOr[String] = js.undefined
  /**
    * The value for the namespaced kernel parameter specified in namespace.
    */
  var value: js.UndefOr[String] = js.undefined
}

object SystemControl {
  @scala.inline
  def apply(namespace: String = null, value: String = null): SystemControl = {
    val __obj = js.Dynamic.literal()
    if (namespace != null) __obj.updateDynamic("namespace")(namespace)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[SystemControl]
  }
}

