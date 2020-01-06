package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeUpdateRequest extends js.Object {
  /**
    * The name of the Amazon EKS cluster associated with the update.
    */
  var name: String = js.native
  /**
    * The name of the Amazon EKS node group associated with the update.
    */
  var nodegroupName: js.UndefOr[String] = js.native
  /**
    * The ID of the update to describe.
    */
  var updateId: String = js.native
}

object DescribeUpdateRequest {
  @scala.inline
  def apply(name: String, updateId: String, nodegroupName: String = null): DescribeUpdateRequest = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], updateId = updateId.asInstanceOf[js.Any])
    if (nodegroupName != null) __obj.updateDynamic("nodegroupName")(nodegroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUpdateRequest]
  }
}

