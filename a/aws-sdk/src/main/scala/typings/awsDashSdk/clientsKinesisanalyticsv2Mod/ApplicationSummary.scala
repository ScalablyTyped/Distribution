package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSummary extends js.Object {
  /**
    * The ARN of the application.
    */
  var ApplicationARN: ResourceARN
  /**
    * The name of the application.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * The status of the application.
    */
  var ApplicationStatus: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationStatus
  /**
    * Provides the current application version.
    */
  var ApplicationVersionId: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationVersionId
  /**
    * The runtime environment for the application (SQL-1.0 or FLINK-1_6).
    */
  var RuntimeEnvironment: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.RuntimeEnvironment
}

object ApplicationSummary {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus,
    ApplicationVersionId: ApplicationVersionId,
    RuntimeEnvironment: RuntimeEnvironment
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN, ApplicationName = ApplicationName, ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any], ApplicationVersionId = ApplicationVersionId, RuntimeEnvironment = RuntimeEnvironment.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationSummary]
  }
}

