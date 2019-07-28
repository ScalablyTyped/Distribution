package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeletextDestinationSettings extends js.Object {
  /**
    * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of Teletext data, do not use this field.
    */
  var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined
}

object TeletextDestinationSettings {
  @scala.inline
  def apply(PageNumber: __stringMin3Max3Pattern1809aFAF09aEAE = null): TeletextDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (PageNumber != null) __obj.updateDynamic("PageNumber")(PageNumber)
    __obj.asInstanceOf[TeletextDestinationSettings]
  }
}

