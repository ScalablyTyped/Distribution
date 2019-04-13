package typings
package awsDashSdkLib.clientsPinpointemailMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateDeliverabilityTestReportRequest extends js.Object {
  /**
    * The HTML body of the message that you sent when you performed the predictive inbox placement test.
    */
  var Content: EmailContent
  /**
    * The email address that the predictive inbox placement test email was sent from.
    */
  var FromEmailAddress: EmailAddress
  /**
    * A unique name that helps you to identify the predictive inbox placement test when you retrieve the results.
    */
  var ReportName: js.UndefOr[ReportName] = js.undefined
  /**
    * An object that defines the tags (keys and values) that you want to associate with the predictive inbox placement test.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}

object CreateDeliverabilityTestReportRequest {
  @scala.inline
  def apply(
    Content: EmailContent,
    FromEmailAddress: EmailAddress,
    ReportName: ReportName = null,
    Tags: TagList = null
  ): CreateDeliverabilityTestReportRequest = {
    val __obj = js.Dynamic.literal(Content = Content, FromEmailAddress = FromEmailAddress)
    if (ReportName != null) __obj.updateDynamic("ReportName")(ReportName)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    __obj.asInstanceOf[CreateDeliverabilityTestReportRequest]
  }
}

