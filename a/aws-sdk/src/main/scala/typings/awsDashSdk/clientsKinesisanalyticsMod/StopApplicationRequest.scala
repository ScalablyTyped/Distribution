package typings.awsDashSdk.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopApplicationRequest extends js.Object {
  /**
    * Name of the running application to stop.
    */
  var ApplicationName: typings.awsDashSdk.clientsKinesisanalyticsMod.ApplicationName
}

object StopApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName): StopApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
  
    __obj.asInstanceOf[StopApplicationRequest]
  }
}

