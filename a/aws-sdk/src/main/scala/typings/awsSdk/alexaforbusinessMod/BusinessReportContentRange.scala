package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BusinessReportContentRange extends js.Object {
  /**
    * The interval of the content range.
    */
  var Interval: BusinessReportInterval = js.native
}

object BusinessReportContentRange {
  @scala.inline
  def apply(Interval: BusinessReportInterval): BusinessReportContentRange = {
    val __obj = js.Dynamic.literal(Interval = Interval.asInstanceOf[js.Any])
    __obj.asInstanceOf[BusinessReportContentRange]
  }
}

