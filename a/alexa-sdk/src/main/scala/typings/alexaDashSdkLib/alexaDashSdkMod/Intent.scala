package typings
package alexaDashSdkLib.alexaDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Intent extends js.Object {
  var confirmationStatus: js.UndefOr[ConfirmationStatuses] = js.undefined
  var name: java.lang.String
  var slots: stdLib.Record[java.lang.String, SlotValue]
}

