package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeletextSourceSettings extends js.Object {
  /**
    * Specifies the teletext page number within the data stream from which to extract captions. Range of 0x100 (256) to 0x8FF (2303). Unused for passthrough. Should be specified as a hexadecimal string with no "0x" prefix.
    */
  var PageNumber: js.UndefOr[__string] = js.undefined
}

object TeletextSourceSettings {
  @scala.inline
  def apply(PageNumber: __string = null): TeletextSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (PageNumber != null) __obj.updateDynamic("PageNumber")(PageNumber)
    __obj.asInstanceOf[TeletextSourceSettings]
  }
}

