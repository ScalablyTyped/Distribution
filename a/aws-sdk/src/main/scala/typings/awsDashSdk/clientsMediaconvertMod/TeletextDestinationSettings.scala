package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TeletextDestinationSettings extends js.Object {
  /**
    * Set pageNumber to the Teletext page number for the destination captions for this output. This value must be a three-digit hexadecimal string; strings ending in -FF are invalid. If you are passing through the entire set of Teletext data, do not use this field.
    */
  var PageNumber: js.UndefOr[__stringMin3Max3Pattern1809aFAF09aEAE] = js.undefined
  /**
    * Specify the page types for this Teletext page. If you don't specify a value here, the service sets the page type to the default value Subtitle (PAGE_TYPE_SUBTITLE). If you pass through the entire set of Teletext data, don't use this field. When you pass through a set of Teletext pages, your output has the same page types as your input.
    */
  var PageTypes: js.UndefOr[__listOfTeletextPageType] = js.undefined
}

object TeletextDestinationSettings {
  @scala.inline
  def apply(
    PageNumber: __stringMin3Max3Pattern1809aFAF09aEAE = null,
    PageTypes: __listOfTeletextPageType = null
  ): TeletextDestinationSettings = {
    val __obj = js.Dynamic.literal()
    if (PageNumber != null) __obj.updateDynamic("PageNumber")(PageNumber)
    if (PageTypes != null) __obj.updateDynamic("PageTypes")(PageTypes)
    __obj.asInstanceOf[TeletextDestinationSettings]
  }
}

