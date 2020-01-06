package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagingGroupRequest extends js.Object {
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: __string = js.native
}

object DescribePackagingGroupRequest {
  @scala.inline
  def apply(Id: __string): DescribePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribePackagingGroupRequest]
  }
}

