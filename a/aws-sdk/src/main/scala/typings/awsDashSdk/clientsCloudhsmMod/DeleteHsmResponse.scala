package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteHsmResponse extends js.Object {
  /**
    * The status of the operation.
    */
  var Status: String = js.native
}

object DeleteHsmResponse {
  @scala.inline
  def apply(Status: String): DeleteHsmResponse = {
    val __obj = js.Dynamic.literal(Status = Status.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteHsmResponse]
  }
}

