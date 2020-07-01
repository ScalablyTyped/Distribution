package typings.awsSdk.amplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GenerateAccessLogsRequest extends js.Object {
  /**
    *  The unique ID for an Amplify app. 
    */
  var appId: AppId = js.native
  /**
    *  The name of the domain. 
    */
  var domainName: DomainName = js.native
  /**
    *  The time at which the logs should end. The time range specified is inclusive of the end time. 
    */
  var endTime: js.UndefOr[EndTime] = js.native
  /**
    *  The time at which the logs should start. The time range specified is inclusive of the start time. 
    */
  var startTime: js.UndefOr[StartTime] = js.native
}

object GenerateAccessLogsRequest {
  @scala.inline
  def apply(appId: AppId, domainName: DomainName, endTime: EndTime = null, startTime: StartTime = null): GenerateAccessLogsRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], domainName = domainName.asInstanceOf[js.Any])
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateAccessLogsRequest]
  }
}

