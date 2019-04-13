package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteJobRequest extends js.Object {
  /**
    * The name of the job definition to delete.
    */
  var JobName: NameString
}

object DeleteJobRequest {
  @scala.inline
  def apply(JobName: NameString): DeleteJobRequest = {
    val __obj = js.Dynamic.literal(JobName = JobName)
  
    __obj.asInstanceOf[DeleteJobRequest]
  }
}

