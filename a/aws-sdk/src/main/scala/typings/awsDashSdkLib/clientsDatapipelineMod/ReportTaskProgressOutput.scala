package typings
package awsDashSdkLib.clientsDatapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReportTaskProgressOutput extends js.Object {
  /**
    * If true, the calling task runner should cancel processing of the task. The task runner does not need to call SetTaskStatus for canceled tasks.
    */
  var canceled: scala.Boolean
}

object ReportTaskProgressOutput {
  @scala.inline
  def apply(canceled: scala.Boolean): ReportTaskProgressOutput = {
    val __obj = js.Dynamic.literal(canceled = canceled)
  
    __obj.asInstanceOf[ReportTaskProgressOutput]
  }
}

