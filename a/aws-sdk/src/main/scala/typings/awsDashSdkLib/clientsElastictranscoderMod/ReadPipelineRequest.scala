package typings
package awsDashSdkLib.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadPipelineRequest extends js.Object {
  /**
    * The identifier of the pipeline to read.
    */
  var Id: awsDashSdkLib.clientsElastictranscoderMod.Id
}

object ReadPipelineRequest {
  @scala.inline
  def apply(Id: Id): ReadPipelineRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[ReadPipelineRequest]
  }
}

