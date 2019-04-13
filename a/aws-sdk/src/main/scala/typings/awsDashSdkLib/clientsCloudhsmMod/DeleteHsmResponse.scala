package typings
package awsDashSdkLib.clientsCloudhsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteHsmResponse extends js.Object {
  /**
    * The status of the operation.
    */
  var Status: String
}

object DeleteHsmResponse {
  @scala.inline
  def apply(Status: String): DeleteHsmResponse = {
    val __obj = js.Dynamic.literal(Status = Status)
  
    __obj.asInstanceOf[DeleteHsmResponse]
  }
}

