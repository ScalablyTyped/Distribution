package typings.awsDashSdk.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobMessages extends js.Object {
  /**
    * List of messages that are informational only and don't indicate a problem with your job.
    */
  var Info: js.UndefOr[__listOf__string] = js.undefined
  /**
    * List of messages that warn about conditions that might cause your job not to run or to fail.
    */
  var Warning: js.UndefOr[__listOf__string] = js.undefined
}

object JobMessages {
  @scala.inline
  def apply(Info: __listOf__string = null, Warning: __listOf__string = null): JobMessages = {
    val __obj = js.Dynamic.literal()
    if (Info != null) __obj.updateDynamic("Info")(Info)
    if (Warning != null) __obj.updateDynamic("Warning")(Warning)
    __obj.asInstanceOf[JobMessages]
  }
}

