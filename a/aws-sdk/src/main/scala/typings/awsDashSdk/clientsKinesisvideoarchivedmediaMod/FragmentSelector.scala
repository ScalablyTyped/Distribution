package typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FragmentSelector extends js.Object {
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.FragmentSelectorType = js.native
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: typings.awsDashSdk.clientsKinesisvideoarchivedmediaMod.TimestampRange = js.native
}

object FragmentSelector {
  @scala.inline
  def apply(FragmentSelectorType: FragmentSelectorType, TimestampRange: TimestampRange): FragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[FragmentSelector]
  }
}

