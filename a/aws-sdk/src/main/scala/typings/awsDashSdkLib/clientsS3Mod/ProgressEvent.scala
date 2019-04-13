package typings
package awsDashSdkLib.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressEvent extends js.Object {
  /**
    * The Progress event details.
    */
  var Details: js.UndefOr[Progress] = js.undefined
}

object ProgressEvent {
  @scala.inline
  def apply(Details: Progress = null): ProgressEvent = {
    val __obj = js.Dynamic.literal()
    if (Details != null) __obj.updateDynamic("Details")(Details)
    __obj.asInstanceOf[ProgressEvent]
  }
}

