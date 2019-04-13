package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHapgResponse extends js.Object {
  /**
    * The status of the action.
    */
  var Status: String
}

object DeleteHapgResponse {
  @scala.inline
  def apply(Status: String): DeleteHapgResponse = {
    val __obj = js.Dynamic.literal(Status = Status)
  
    __obj.asInstanceOf[DeleteHapgResponse]
  }
}

