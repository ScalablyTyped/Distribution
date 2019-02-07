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

