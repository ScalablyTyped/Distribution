package typings
package awsDashSdkLib.clientsElbv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostHeaderConditionConfig extends js.Object {
  var Values: js.UndefOr[ListOfString] = js.undefined
}

object HostHeaderConditionConfig {
  @scala.inline
  def apply(Values: ListOfString = null): HostHeaderConditionConfig = {
    val __obj = js.Dynamic.literal()
    if (Values != null) __obj.updateDynamic("Values")(Values)
    __obj.asInstanceOf[HostHeaderConditionConfig]
  }
}

