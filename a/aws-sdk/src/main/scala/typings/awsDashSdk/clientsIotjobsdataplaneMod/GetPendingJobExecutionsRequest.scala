package typings.awsDashSdk.clientsIotjobsdataplaneMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetPendingJobExecutionsRequest extends js.Object {
  /**
    * The name of the thing that is executing the job.
    */
  var thingName: ThingName
}

object GetPendingJobExecutionsRequest {
  @scala.inline
  def apply(thingName: ThingName): GetPendingJobExecutionsRequest = {
    val __obj = js.Dynamic.literal(thingName = thingName)
  
    __obj.asInstanceOf[GetPendingJobExecutionsRequest]
  }
}

