package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteStackRequest extends js.Object {
  /**
    * The name of the stack.
    */
  var Name: String = js.native
}

object DeleteStackRequest {
  @scala.inline
  def apply(Name: String): DeleteStackRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStackRequest]
  }
}

