package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribePackagingGroupRequest extends js.Object {
  /**
    * The ID of a MediaPackage VOD PackagingGroup resource.
    */
  var Id: __string
}

object DescribePackagingGroupRequest {
  @scala.inline
  def apply(Id: __string): DescribePackagingGroupRequest = {
    val __obj = js.Dynamic.literal(Id = Id)
  
    __obj.asInstanceOf[DescribePackagingGroupRequest]
  }
}

