package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobRequest extends js.Object {
  /**
    * The name of the job definition to retrieve.
    */
  var JobName: NameString
}

object GetJobRequest {
  @scala.inline
  def apply(JobName: NameString): GetJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName)
  
    __obj.asInstanceOf[GetJobRequest]
  }
}

