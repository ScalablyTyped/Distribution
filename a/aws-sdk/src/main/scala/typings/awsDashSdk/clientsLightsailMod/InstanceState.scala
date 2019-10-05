package typings.awsDashSdk.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InstanceState extends js.Object {
  /**
    * The status code for the instance.
    */
  var code: js.UndefOr[integer] = js.undefined
  /**
    * The state of the instance (e.g., running or pending).
    */
  var name: js.UndefOr[String] = js.undefined
}

object InstanceState {
  @scala.inline
  def apply(code: Int | Double = null, name: String = null): InstanceState = {
    val __obj = js.Dynamic.literal()
    if (code != null) __obj.updateDynamic("code")(code.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[InstanceState]
  }
}

