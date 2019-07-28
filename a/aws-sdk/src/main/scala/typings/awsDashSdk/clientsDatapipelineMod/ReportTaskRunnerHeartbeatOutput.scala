package typings.awsDashSdk.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTaskRunnerHeartbeatOutput extends js.Object {
  /**
    * Indicates whether the calling task runner should terminate.
    */
  var terminate: Boolean
}

object ReportTaskRunnerHeartbeatOutput {
  @scala.inline
  def apply(terminate: Boolean): ReportTaskRunnerHeartbeatOutput = {
    val __obj = js.Dynamic.literal(terminate = terminate)
  
    __obj.asInstanceOf[ReportTaskRunnerHeartbeatOutput]
  }
}

