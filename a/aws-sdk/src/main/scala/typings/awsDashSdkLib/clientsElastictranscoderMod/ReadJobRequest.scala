package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadJobRequest extends js.Object {
  /**
    * The identifier of the job for which you want to get detailed information.
    */
  var Id: awsDashSdkLib.clientsElastictranscoderMod.Id
}

object ReadJobRequest {
  @scala.inline
  def apply(Id: Id): ReadJobRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[ReadJobRequest]
  }
}

