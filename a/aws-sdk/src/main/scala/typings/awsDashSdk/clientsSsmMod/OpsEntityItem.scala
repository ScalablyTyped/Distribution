package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OpsEntityItem extends js.Object {
  /**
    * The detailed data content for an OpsItem summaries result item.
    */
  var Content: js.UndefOr[OpsEntityItemEntryList] = js.undefined
}

object OpsEntityItem {
  @scala.inline
  def apply(Content: OpsEntityItemEntryList = null): OpsEntityItem = {
    val __obj = js.Dynamic.literal()
    if (Content != null) __obj.updateDynamic("Content")(Content)
    __obj.asInstanceOf[OpsEntityItem]
  }
}

