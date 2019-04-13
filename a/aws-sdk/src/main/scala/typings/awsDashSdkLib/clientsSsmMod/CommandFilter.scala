package typings
package awsDashSdkLib.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandFilter extends js.Object {
  /**
    * The name of the filter.
    */
  var key: CommandFilterKey
  /**
    * The filter value. Valid values for each filter key are as follows:    InvokedAfter: Specify a timestamp to limit your results. For example, specify 2018-07-07T00:00:00Z to see a list of command executions occurring July 7, 2018, and later.    InvokedBefore: Specify a timestamp to limit your results. For example, specify 2018-07-07T00:00:00Z to see a list of command executions from before July 7, 2018.    Status: Specify a valid command status to see a list of all command executions with that status. Status values you can specify include:    Pending     InProgress     Success     Cancelled     Failed     TimedOut     Cancelling       DocumentName: Specify name of the SSM document for which you want to see command execution results. For example, specify AWS-RunPatchBaseline to see command executions that used this SSM document to perform security patching operations on instances.     ExecutionStage: Specify one of the following values:    Executing: Returns a list of command executions that are currently still running.    Complete: Returns a list of command executions that have already completed.     
    */
  var value: CommandFilterValue
}

object CommandFilter {
  @scala.inline
  def apply(key: CommandFilterKey, value: CommandFilterValue): CommandFilter = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], value = value)
  
    __obj.asInstanceOf[CommandFilter]
  }
}

