package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OpsEntityItem extends js.Object {
  /**
    * The time OpsItem data was captured.
    */
  var CaptureTime: js.UndefOr[OpsEntityItemCaptureTime] = js.native
  /**
    * The detailed data content for an OpsItem summaries result item.
    */
  var Content: js.UndefOr[OpsEntityItemEntryList] = js.native
}

object OpsEntityItem {
  @scala.inline
  def apply(CaptureTime: OpsEntityItemCaptureTime = null, Content: OpsEntityItemEntryList = null): OpsEntityItem = {
    val __obj = js.Dynamic.literal()
    if (CaptureTime != null) __obj.updateDynamic("CaptureTime")(CaptureTime.asInstanceOf[js.Any])
    if (Content != null) __obj.updateDynamic("Content")(Content.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpsEntityItem]
  }
}

