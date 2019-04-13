package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeletePipelineRequest extends js.Object {
  /**
    * The identifier of the pipeline that you want to delete.
    */
  var Id: awsDashSdkLib.clientsElastictranscoderMod.Id
}

object DeletePipelineRequest {
  @scala.inline
  def apply(Id: Id): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeletePipelineRequest]
  }
}

