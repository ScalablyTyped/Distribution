package typings.awsDashSdk.clientsCloudwatchlogsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait QueryInfo extends js.Object {
  /**
    * The date and time that this query was created.
    */
  var createTime: js.UndefOr[Timestamp] = js.undefined
  /**
    * The name of the log group scanned by this query.
    */
  var logGroupName: js.UndefOr[LogGroupName] = js.undefined
  /**
    * The unique ID number of this query.
    */
  var queryId: js.UndefOr[QueryId] = js.undefined
  /**
    * The query string used in this query.
    */
  var queryString: js.UndefOr[QueryString] = js.undefined
  /**
    * The status of this query. Possible values are Cancelled, Complete, Failed, Running, Scheduled, and Unknown.
    */
  var status: js.UndefOr[QueryStatus] = js.undefined
}

object QueryInfo {
  @scala.inline
  def apply(
    createTime: Int | Double = null,
    logGroupName: LogGroupName = null,
    queryId: QueryId = null,
    queryString: QueryString = null,
    status: QueryStatus = null
  ): QueryInfo = {
    val __obj = js.Dynamic.literal()
    if (createTime != null) __obj.updateDynamic("createTime")(createTime.asInstanceOf[js.Any])
    if (logGroupName != null) __obj.updateDynamic("logGroupName")(logGroupName)
    if (queryId != null) __obj.updateDynamic("queryId")(queryId)
    if (queryString != null) __obj.updateDynamic("queryString")(queryString)
    if (status != null) __obj.updateDynamic("status")(status.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryInfo]
  }
}

