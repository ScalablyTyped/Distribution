package typings.awsDashSdk.clientsKinesisanalyticsv2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopApplicationRequest extends js.Object {
  /**
    * The name of the running application to stop.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsv2Mod.ApplicationName
}

object StopApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName): StopApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
  
    __obj.asInstanceOf[StopApplicationRequest]
  }
}

