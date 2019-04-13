package typings
package awsDashSdkLib.clientsKinesisvideoarchivedmediaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FragmentSelector extends js.Object {
  /**
    * The origin of the timestamps to use (Server or Producer).
    */
  var FragmentSelectorType: awsDashSdkLib.clientsKinesisvideoarchivedmediaMod.FragmentSelectorType
  /**
    * The range of timestamps to return.
    */
  var TimestampRange: awsDashSdkLib.clientsKinesisvideoarchivedmediaMod.TimestampRange
}

object FragmentSelector {
  @scala.inline
  def apply(FragmentSelectorType: FragmentSelectorType, TimestampRange: TimestampRange): FragmentSelector = {
    val __obj = js.Dynamic.literal(FragmentSelectorType = FragmentSelectorType.asInstanceOf[js.Any], TimestampRange = TimestampRange)
  
    __obj.asInstanceOf[FragmentSelector]
  }
}

