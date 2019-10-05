package typings.ably.ablyMod.Types

import typings.ably.ablyStrings.android
import typings.ably.ablyStrings.browser
import typings.ably.ablyStrings.car
import typings.ably.ablyStrings.desktop
import typings.ably.ablyStrings.embedded
import typings.ably.ablyStrings.ios
import typings.ably.ablyStrings.other
import typings.ably.ablyStrings.phone
import typings.ably.ablyStrings.tablet
import typings.ably.ablyStrings.tv
import typings.ably.ablyStrings.watch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeviceDetails extends js.Object {
  var clientId: js.UndefOr[String] = js.undefined
  var deviceSecret: js.UndefOr[String] = js.undefined
  var formFactor: phone | tablet | desktop | tv | watch | car | embedded | other
  var id: String
  var metadata: js.UndefOr[js.Any] = js.undefined
  var platform: android | ios | browser
  var push: DevicePushDetails
}

object DeviceDetails {
  @scala.inline
  def apply(
    formFactor: phone | tablet | desktop | tv | watch | car | embedded | other,
    id: String,
    platform: android | ios | browser,
    push: DevicePushDetails,
    clientId: String = null,
    deviceSecret: String = null,
    metadata: js.Any = null
  ): DeviceDetails = {
    val __obj = js.Dynamic.literal(formFactor = formFactor.asInstanceOf[js.Any], id = id, platform = platform.asInstanceOf[js.Any], push = push)
    if (clientId != null) __obj.updateDynamic("clientId")(clientId)
    if (deviceSecret != null) __obj.updateDynamic("deviceSecret")(deviceSecret)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    __obj.asInstanceOf[DeviceDetails]
  }
}

