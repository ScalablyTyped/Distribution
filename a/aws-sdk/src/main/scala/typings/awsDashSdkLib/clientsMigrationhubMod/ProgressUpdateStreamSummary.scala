package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProgressUpdateStreamSummary extends js.Object {
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStreamName: js.UndefOr[ProgressUpdateStream] = js.undefined
}

object ProgressUpdateStreamSummary {
  @scala.inline
  def apply(ProgressUpdateStreamName: ProgressUpdateStream = null): ProgressUpdateStreamSummary = {
    val __obj = js.Dynamic.literal()
    if (ProgressUpdateStreamName != null) __obj.updateDynamic("ProgressUpdateStreamName")(ProgressUpdateStreamName)
    __obj.asInstanceOf[ProgressUpdateStreamSummary]
  }
}

