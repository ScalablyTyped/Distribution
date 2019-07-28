package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreatePackagingGroupRequest extends js.Object {
  /**
    * The ID of the PackagingGroup.
    */
  var Id: __string
}

object CreatePackagingGroupRequest {
  @scala.inline
  def apply(Id: __string): CreatePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[CreatePackagingGroupRequest]
  }
}

