package typings.awsDashSdk.clientsMediapackagevodMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribePackagingGroupResponse extends js.Object {
  /**
    * The ARN of the PackagingGroup.
    */
  var Arn: js.UndefOr[__string] = js.native
  /**
    * The fully qualified domain name for Assets in the PackagingGroup.
    */
  var DomainName: js.UndefOr[__string] = js.native
  /**
    * The ID of the PackagingGroup.
    */
  var Id: js.UndefOr[__string] = js.native
}

object DescribePackagingGroupResponse {
  @scala.inline
  def apply(Arn: __string = null, DomainName: __string = null, Id: __string = null): DescribePackagingGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn.asInstanceOf[js.Any])
    if (DomainName != null) __obj.updateDynamic("DomainName")(DomainName.asInstanceOf[js.Any])
    if (Id != null) __obj.updateDynamic("Id")(Id.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribePackagingGroupResponse]
  }
}

