package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollForActivityTaskInput extends js.Object {
  /**
    * The name of the domain that contains the task lists being polled.
    */
  var domain: DomainName
  /**
    * Identity of the worker making the request, recorded in the ActivityTaskStarted event in the workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.undefined
  /**
    * Specifies the task list to poll for activity tasks. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not be the literal string arn.
    */
  var taskList: TaskList
}

object PollForActivityTaskInput {
  @scala.inline
  def apply(domain: DomainName, taskList: TaskList, identity: Identity = null): PollForActivityTaskInput = {
    val __obj = js.Dynamic.literal(domain = domain, taskList = taskList)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    __obj.asInstanceOf[PollForActivityTaskInput]
  }
}

