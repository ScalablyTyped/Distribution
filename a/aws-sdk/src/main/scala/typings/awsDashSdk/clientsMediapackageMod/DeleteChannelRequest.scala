package typings.awsDashSdk.clientsMediapackageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteChannelRequest extends js.Object {
  /**
    * The ID of the Channel to delete.
    */
  var Id: __string
}

object DeleteChannelRequest {
  @scala.inline
  def apply(Id: __string): DeleteChannelRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DeleteChannelRequest]
  }
}

