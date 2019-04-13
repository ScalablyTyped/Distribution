package typings
package awsDashSdkLib.clientsMediaconvertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobRequest extends js.Object {
  /**
    * the job ID of the job.
    */
  var Id: __string
}

object GetJobRequest {
  @scala.inline
  def apply(Id: __string): GetJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[GetJobRequest]
  }
}

