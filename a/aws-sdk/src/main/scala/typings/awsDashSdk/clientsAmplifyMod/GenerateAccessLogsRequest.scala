package typings.awsDashSdk.clientsAmplifyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateAccessLogsRequest extends js.Object {
  /**
    *  Unique Id for an Amplify App. 
    */
  var appId: AppId
  /**
    *  Name of the domain. 
    */
  var domainName: DomainName
  /**
    *  The time at which the logs should end, inclusive. 
    */
  var endTime: js.UndefOr[EndTime] = js.undefined
  /**
    *  The time at which the logs should start, inclusive. 
    */
  var startTime: js.UndefOr[StartTime] = js.undefined
}

object GenerateAccessLogsRequest {
  @scala.inline
  def apply(appId: AppId, domainName: DomainName, endTime: EndTime = null, startTime: StartTime = null): GenerateAccessLogsRequest = {
    val __obj = js.Dynamic.literal(appId = appId, domainName = domainName)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime)
    if (startTime != null) __obj.updateDynamic("startTime")(startTime)
    __obj.asInstanceOf[GenerateAccessLogsRequest]
  }
}

