package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeletePipelineRequest extends js.Object {
  /**
    * The identifier of the pipeline that you want to delete.
    */
  var Id: typings.awsDashSdk.clientsElastictranscoderMod.Id = js.native
}

object DeletePipelineRequest {
  @scala.inline
  def apply(Id: Id): DeletePipelineRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeletePipelineRequest]
  }
}

