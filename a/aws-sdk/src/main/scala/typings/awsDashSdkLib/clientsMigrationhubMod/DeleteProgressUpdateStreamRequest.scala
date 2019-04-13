package typings
package awsDashSdkLib.clientsMigrationhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteProgressUpdateStreamRequest extends js.Object {
  /**
    * Optional boolean flag to indicate whether any effect should take place. Used to test if the caller has permission to make the call.
    */
  var DryRun: js.UndefOr[DryRun] = js.undefined
  /**
    * The name of the ProgressUpdateStream. 
    */
  var ProgressUpdateStreamName: ProgressUpdateStream
}

object DeleteProgressUpdateStreamRequest {
  @scala.inline
  def apply(ProgressUpdateStreamName: ProgressUpdateStream, DryRun: js.UndefOr[DryRun] = js.undefined): DeleteProgressUpdateStreamRequest = {
    val __obj = js.Dynamic.literal(ProgressUpdateStreamName = ProgressUpdateStreamName)
    if (!js.isUndefined(DryRun)) __obj.updateDynamic("DryRun")(DryRun)
    __obj.asInstanceOf[DeleteProgressUpdateStreamRequest]
  }
}

