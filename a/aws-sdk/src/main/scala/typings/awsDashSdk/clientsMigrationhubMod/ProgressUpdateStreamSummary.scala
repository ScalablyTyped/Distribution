package typings.awsDashSdk.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProgressUpdateStreamSummary extends js.Object {
  /**
    * The name of the ProgressUpdateStream. Do not store personal data in this field. 
    */
  var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.native
}

object ProgressUpdateStreamSummary {
  @scala.inline
  def apply(ProgressUpdateStreamName: ProgressUpdateStream = null): ProgressUpdateStreamSummary = {
    val __obj = js.Dynamic.literal()
    if (ProgressUpdateStreamName != null) __obj.updateDynamic("ProgressUpdateStreamName")(ProgressUpdateStreamName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProgressUpdateStreamSummary]
  }
}

