package typings
package awsDashSdkLib.clientsKinesisanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopApplicationRequest extends js.Object {
  /**
    * Name of the running application to stop.
    */
  var ApplicationName: awsDashSdkLib.clientsKinesisanalyticsMod.ApplicationName
}

object StopApplicationRequest {
  @scala.inline
  def apply(ApplicationName: ApplicationName): StopApplicationRequest = {
    val __obj = js.Dynamic.literal(ApplicationName = ApplicationName)
  
    __obj.asInstanceOf[StopApplicationRequest]
  }
}

