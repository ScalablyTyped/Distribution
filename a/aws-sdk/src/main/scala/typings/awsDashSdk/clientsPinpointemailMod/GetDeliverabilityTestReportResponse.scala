package typings.awsDashSdk.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetDeliverabilityTestReportResponse extends js.Object {
  /**
    * An object that contains the results of the predictive inbox placement test.
    */
  var DeliverabilityTestReport: typings.awsDashSdk.clientsPinpointemailMod.DeliverabilityTestReport = js.native
  /**
    * An object that describes how the test email was handled by several email providers, including Gmail, Hotmail, Yahoo, AOL, and others.
    */
  var IspPlacements: typings.awsDashSdk.clientsPinpointemailMod.IspPlacements = js.native
  /**
    * An object that contains the message that you sent when you performed this predictive inbox placement test.
    */
  var Message: js.UndefOr[MessageContent] = js.native
  /**
    * An object that specifies how many test messages that were sent during the predictive inbox placement test were delivered to recipients' inboxes, how many were sent to recipients' spam folders, and how many weren't delivered.
    */
  var OverallPlacement: PlacementStatistics = js.native
  /**
    * An array of objects that define the tags (keys and values) that are associated with the predictive inbox placement test.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object GetDeliverabilityTestReportResponse {
  @scala.inline
  def apply(
    DeliverabilityTestReport: DeliverabilityTestReport,
    IspPlacements: IspPlacements,
    OverallPlacement: PlacementStatistics,
    Message: MessageContent = null,
    Tags: TagList = null
  ): GetDeliverabilityTestReportResponse = {
    val __obj = js.Dynamic.literal(DeliverabilityTestReport = DeliverabilityTestReport.asInstanceOf[js.Any], IspPlacements = IspPlacements.asInstanceOf[js.Any], OverallPlacement = OverallPlacement.asInstanceOf[js.Any])
    if (Message != null) __obj.updateDynamic("Message")(Message.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetDeliverabilityTestReportResponse]
  }
}

