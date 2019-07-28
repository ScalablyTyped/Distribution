package typings.awsDashSdk.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteLunaClientResponse extends js.Object {
  /**
    * The status of the action.
    */
  var Status: String
}

object DeleteLunaClientResponse {
  @scala.inline
  def apply(Status: String): DeleteLunaClientResponse = {
    val __obj = js.Dynamic.literal(Status = Status)
  
    __obj.asInstanceOf[DeleteLunaClientResponse]
  }
}

