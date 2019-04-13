package typings
package awsDashSdkLib.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartApplicationRequest extends js.Object {
  /**
    * The name of the application.
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsv2Mod.ApplicationName
  /**
    * Identifies the run configuration (start parameters) of a Kinesis Data Analytics application.
    */
  var RunConfiguration: awsDashSdkLib.clientsKinesisanalyticsv2Mod.RunConfiguration
}

object StartApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName, RunConfiguration: RunConfiguration): StartApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName, RunConfiguration = RunConfiguration)
  
    __obj.asInstanceOf[StartApplicationRequest]
  }
}

