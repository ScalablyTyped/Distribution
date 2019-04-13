package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CountPendingDecisionTasksInput extends js.Object {
  /**
    * The name of the domain that contains the task list.
    */
  var domain: DomainName
  /**
    * The name of the task list.
    */
  var taskList: TaskList
}

object CountPendingDecisionTasksInput {
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList): CountPendingDecisionTasksInput = {
    val __obj = js.Dynamic.literal(domain = domain, taskList = taskList)
  
    __obj.asInstanceOf[CountPendingDecisionTasksInput]
  }
}

