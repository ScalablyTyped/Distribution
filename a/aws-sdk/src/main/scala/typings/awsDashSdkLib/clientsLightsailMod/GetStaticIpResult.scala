package typings
package awsDashSdkLib.clientsLightsailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetStaticIpResult extends js.Object {
  /**
    * An array of key-value pairs containing information about the requested static IP.
    */
  var staticIp: js.UndefOr[StaticIp] = js.undefined
}

object GetStaticIpResult {
  @scala.inline
  def apply(staticIp: StaticIp = null): GetStaticIpResult = {
    val __obj = js.Dynamic.literal()
    if (staticIp != null) __obj.updateDynamic("staticIp")(staticIp)
    __obj.asInstanceOf[GetStaticIpResult]
  }
}

