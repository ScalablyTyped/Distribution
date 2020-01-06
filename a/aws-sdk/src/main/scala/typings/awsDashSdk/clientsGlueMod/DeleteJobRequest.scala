package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteJobRequest extends js.Object {
  /**
    * The name of the job definition to delete.
    */
  var JobName: NameString = js.native
}

object DeleteJobRequest {
  @scala.inline
  def apply(JobName: NameString): DeleteJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteJobRequest]
  }
}

