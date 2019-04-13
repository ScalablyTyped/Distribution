package typings
package awsDashSdkLib.clientsAppstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteStackRequest extends js.Object {
  /**
    * The name of the stack.
    */
  var Name: String
}

object DeleteStackRequest {
  @scala.inline
  def apply(Name: String): DeleteStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name)
  
    __obj.asInstanceOf[DeleteStackRequest]
  }
}

