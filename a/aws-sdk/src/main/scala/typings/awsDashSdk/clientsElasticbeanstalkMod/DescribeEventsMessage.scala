package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeEventsMessage extends js.Object {
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to include only those associated with this application.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    *  If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur up to, but not including, the EndTime. 
    */
  var EndTime: js.UndefOr[TimeFilterEnd] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this environment.
    */
  var EnvironmentId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentId] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this environment.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * Specifies the maximum number of events that can be returned, beginning with the most recent event.
    */
  var MaxRecords: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.MaxRecords] = js.undefined
  /**
    * Pagination token. If specified, the events return the next batch of results.
    */
  var NextToken: js.UndefOr[Token] = js.undefined
  /**
    * The ARN of the version of the custom platform.
    */
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the described events to include only those associated with this request ID.
    */
  var RequestId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.RequestId] = js.undefined
  /**
    * If specified, limits the events returned from this call to include only those with the specified severity or higher.
    */
  var Severity: js.UndefOr[EventSeverity] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that occur on or after this time.
    */
  var StartTime: js.UndefOr[TimeFilterStart] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those that are associated with this environment configuration.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  /**
    * If specified, AWS Elastic Beanstalk restricts the returned descriptions to those associated with this application version.
    */
  var VersionLabel: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}

object DescribeEventsMessage {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    EndTime: TimeFilterEnd = null,
    EnvironmentId: EnvironmentId = null,
    EnvironmentName: EnvironmentName = null,
    MaxRecords: Int | Double = null,
    NextToken: Token = null,
    PlatformArn: PlatformArn = null,
    RequestId: RequestId = null,
    Severity: EventSeverity = null,
    StartTime: TimeFilterStart = null,
    TemplateName: ConfigurationTemplateName = null,
    VersionLabel: VersionLabel = null
  ): DescribeEventsMessage = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (EndTime != null) __obj.updateDynamic("EndTime")(EndTime)
    if (EnvironmentId != null) __obj.updateDynamic("EnvironmentId")(EnvironmentId)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (MaxRecords != null) __obj.updateDynamic("MaxRecords")(MaxRecords.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    if (StartTime != null) __obj.updateDynamic("StartTime")(StartTime)
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel)
    __obj.asInstanceOf[DescribeEventsMessage]
  }
}

