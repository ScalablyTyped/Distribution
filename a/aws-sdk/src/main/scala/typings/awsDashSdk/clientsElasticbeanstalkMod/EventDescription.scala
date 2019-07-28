package typings.awsDashSdk.clientsElasticbeanstalkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventDescription extends js.Object {
  /**
    * The application associated with the event.
    */
  var ApplicationName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.ApplicationName] = js.undefined
  /**
    * The name of the environment associated with this event.
    */
  var EnvironmentName: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EnvironmentName] = js.undefined
  /**
    * The date when the event occurred.
    */
  var EventDate: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.EventDate] = js.undefined
  /**
    * The event message.
    */
  var Message: js.UndefOr[EventMessage] = js.undefined
  /**
    * The ARN of the platform.
    */
  var PlatformArn: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.PlatformArn] = js.undefined
  /**
    * The web service request ID for the activity of this event.
    */
  var RequestId: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.RequestId] = js.undefined
  /**
    * The severity level of this event.
    */
  var Severity: js.UndefOr[EventSeverity] = js.undefined
  /**
    * The name of the configuration associated with this event.
    */
  var TemplateName: js.UndefOr[ConfigurationTemplateName] = js.undefined
  /**
    * The release label for the application version associated with this event.
    */
  var VersionLabel: js.UndefOr[typings.awsDashSdk.clientsElasticbeanstalkMod.VersionLabel] = js.undefined
}

object EventDescription {
  @scala.inline
  def apply(
    ApplicationName: ApplicationName = null,
    EnvironmentName: EnvironmentName = null,
    EventDate: EventDate = null,
    Message: EventMessage = null,
    PlatformArn: PlatformArn = null,
    RequestId: RequestId = null,
    Severity: EventSeverity = null,
    TemplateName: ConfigurationTemplateName = null,
    VersionLabel: VersionLabel = null
  ): EventDescription = {
    val __obj = js.Dynamic.literal()
    if (ApplicationName != null) __obj.updateDynamic("ApplicationName")(ApplicationName)
    if (EnvironmentName != null) __obj.updateDynamic("EnvironmentName")(EnvironmentName)
    if (EventDate != null) __obj.updateDynamic("EventDate")(EventDate)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    if (PlatformArn != null) __obj.updateDynamic("PlatformArn")(PlatformArn)
    if (RequestId != null) __obj.updateDynamic("RequestId")(RequestId)
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    if (TemplateName != null) __obj.updateDynamic("TemplateName")(TemplateName)
    if (VersionLabel != null) __obj.updateDynamic("VersionLabel")(VersionLabel)
    __obj.asInstanceOf[EventDescription]
  }
}

