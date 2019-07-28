package typings.awsDashSdk.clientsElastictranscoderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReadPresetRequest extends js.Object {
  /**
    * The identifier of the preset for which you want to get detailed information.
    */
  var Id: typings.awsDashSdk.clientsElastictranscoderMod.Id
}

object ReadPresetRequest {
  @scala.inline
  def apply(Id: Id): ReadPresetRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[ReadPresetRequest]
  }
}

