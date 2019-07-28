package typings.awsDashSdk.clientsGameliftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetInstanceAccessOutput extends js.Object {
  /**
    * Object that contains connection information for a fleet instance, including IP address and access credentials.
    */
  var InstanceAccess: js.UndefOr[typings.awsDashSdk.clientsGameliftMod.InstanceAccess] = js.undefined
}

object GetInstanceAccessOutput {
  @scala.inline
  def apply(InstanceAccess: InstanceAccess = null): GetInstanceAccessOutput = {
    val __obj = js.Dynamic.literal()
    if (InstanceAccess != null) __obj.updateDynamic("InstanceAccess")(InstanceAccess)
    __obj.asInstanceOf[GetInstanceAccessOutput]
  }
}

