package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceDetails extends js.Object {
  var clientId: js.UndefOr[java.lang.String] = js.undefined
  var deviceSecret: js.UndefOr[java.lang.String] = js.undefined
  var formFactor: ablyLib.ablyLibStrings.phone | ablyLib.ablyLibStrings.tablet | ablyLib.ablyLibStrings.desktop | ablyLib.ablyLibStrings.tv | ablyLib.ablyLibStrings.watch | ablyLib.ablyLibStrings.car | ablyLib.ablyLibStrings.embedded | ablyLib.ablyLibStrings.other
  var id: java.lang.String
  var metadata: js.UndefOr[js.Any] = js.undefined
  var platform: ablyLib.ablyLibStrings.android | ablyLib.ablyLibStrings.ios | ablyLib.ablyLibStrings.browser
  var push: DevicePushDetails
}

object DeviceDetails {
  @scala.inline
  def apply(
    formFactor: ablyLib.ablyLibStrings.phone | ablyLib.ablyLibStrings.tablet | ablyLib.ablyLibStrings.desktop | ablyLib.ablyLibStrings.tv | ablyLib.ablyLibStrings.watch | ablyLib.ablyLibStrings.car | ablyLib.ablyLibStrings.embedded | ablyLib.ablyLibStrings.other,
    id: java.lang.String,
    platform: ablyLib.ablyLibStrings.android | ablyLib.ablyLibStrings.ios | ablyLib.ablyLibStrings.browser,
    push: DevicePushDetails,
    clientId: java.lang.String = null,
    deviceSecret: java.lang.String = null,
    metadata: js.Any = null
  ): DeviceDetails = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("formFactor")(formFactor.asInstanceOf[js.Any])
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("platform")(platform.asInstanceOf[js.Any])
    __obj.updateDynamic("push")(push)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (deviceSecret != null) __obj.updateDynamic("deviceSecret")(deviceSecret)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[DeviceDetails]
  }
}

