package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteParameterRequest extends js.Object {
  /**
    * The name of the parameter to delete.
    */
  var Name: PSParameterName = js.native
}

object DeleteParameterRequest {
  @scala.inline
  def apply(Name: PSParameterName): DeleteParameterRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DeleteParameterRequest]
  }
}

