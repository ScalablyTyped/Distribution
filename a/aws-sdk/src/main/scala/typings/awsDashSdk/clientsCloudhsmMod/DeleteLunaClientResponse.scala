package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteLunaClientResponse extends js.Object {
  /**
    * The status of the action.
    */
  var Status: String = js.native
}

object DeleteLunaClientResponse {
  @scala.inline
  def apply(Status: String): DeleteLunaClientResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteLunaClientResponse]
  }
}

