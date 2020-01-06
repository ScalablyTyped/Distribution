package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TeletextSourceSettings extends js.Object {
  /**
    * Use Page Number (PageNumber) to specify the three-digit hexadecimal page number that will be used for Teletext captions. Do not use this setting if you are passing through teletext from the input source to output.
    */
  var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.native
}

object TeletextSourceSettings {
  @scala.inline
  def apply(PageNumber: __stringMin3Max3Pattern1809aFAF09aEAE = null): TeletextSourceSettings = {
    val __obj = js.Dynamic.literal()
    if (PageNumber != null) __obj.updateDynamic("PageNumber")(PageNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeletextSourceSettings]
  }
}

