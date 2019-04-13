package typings
package awsDashSdkLib.clientsSwfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PollForDecisionTaskInput extends js.Object {
  /**
    * The name of the domain containing the task lists to poll.
    */
  var domain: DomainName
  /**
    * Identity of the decider making the request, which is recorded in the DecisionTaskStarted event in the workflow history. This enables diagnostic tracing when problems arise. The form of this identity is user defined.
    */
  var identity: js.UndefOr[Identity] = js.undefined
  /**
    * The maximum number of results that are returned per call. nextPageToken can be used to obtain futher pages of results. The default is 1000, which is the maximum allowed page size. You can, however, specify a page size smaller than the maximum. This is an upper limit only; the actual number of results returned per call may be fewer than the specified maximum.
    */
  var maximumPageSize: js.UndefOr[PageSize] = js.undefined
  /**
    * If a NextPageToken was returned by a previous call, there are more results available. To retrieve the next page of results, make the call again using the returned token in nextPageToken. Keep all other arguments unchanged. The configured maximumPageSize determines how many results can be returned in a single call.  The nextPageToken returned by this action cannot be used with GetWorkflowExecutionHistory to get the next page. You must call PollForDecisionTask again (with the nextPageToken) to retrieve the next page of history records. Calling PollForDecisionTask with a nextPageToken doesn't return a new decision task. 
    */
  var nextPageToken: js.UndefOr[PageToken] = js.undefined
  /**
    * When set to true, returns the events in reverse order. By default the results are returned in ascending order of the eventTimestamp of the events.
    */
  var reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  /**
    * Specifies the task list to poll for decision tasks. The specified string must not start or end with whitespace. It must not contain a : (colon), / (slash), | (vertical bar), or any control characters (\\u0000-\\u001f | \\u007f-\\u009f). Also, it must not contain the literal string arn.
    */
  var taskList: TaskList
}

object PollForDecisionTaskInput {
  @scala.inline
  def apply(
    domain: DomainName,
    taskList: TaskList,
    identity: Identity = null,
    maximumPageSize: js.UndefOr[PageSize] = js.undefined,
    nextPageToken: PageToken = null,
    reverseOrder: js.UndefOr[ReverseOrder] = js.undefined
  ): PollForDecisionTaskInput = {
    val __obj = js.Dynamic.literal(domain = domain, taskList = taskList)
    if (identity != null) __obj.updateDynamic("identity")(identity)
    if (!js.isUndefined(maximumPageSize)) __obj.updateDynamic("maximumPageSize")(maximumPageSize)
    if (nextPageToken != null) __obj.updateDynamic("nextPageToken")(nextPageToken)
    if (!js.isUndefined(reverseOrder)) __obj.updateDynamic("reverseOrder")(reverseOrder)
    __obj.asInstanceOf[PollForDecisionTaskInput]
  }
}

