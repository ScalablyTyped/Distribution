package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ApplicationSummary extends js.Object {
  /**
    * ARN of the application.
    */
  var ApplicationARN: ResourceARN
  /**
    * Name of the application.
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.ApplicationName
  /**
    * Status of the application.
    */
  var ApplicationStatus: awsDashSdkLib.clientsKinesisanalyticsMod.ApplicationStatus
}

object ApplicationSummary {
  @scala.inline
  def apply(
    ApplicationARN: ResourceARN,
    ApplicationName: ApplicationName,
    ApplicationStatus: ApplicationStatus
  ): ApplicationSummary = {
    val __obj = js.Dynamic.literal(ApplicationARN = ApplicationARN, ApplicationName = ApplicationName, ApplicationStatus = ApplicationStatus.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ApplicationSummary]
  }
}

