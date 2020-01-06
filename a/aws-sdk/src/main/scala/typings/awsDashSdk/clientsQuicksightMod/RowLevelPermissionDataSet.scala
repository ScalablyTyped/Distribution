package typings.awsDashSdk.clientsQuicksightMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowLevelPermissionDataSet extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the permission dataset.
    */
  var Arn: typings.awsDashSdk.clientsQuicksightMod.Arn = js.native
  /**
    * Permission policy.
    */
  var PermissionPolicy: RowLevelPermissionPolicy = js.native
}

object RowLevelPermissionDataSet {
  @scala.inline
  def apply(Arn: Arn, PermissionPolicy: RowLevelPermissionPolicy): RowLevelPermissionDataSet = {
    val __obj = js.Dynamic.literal(Arn = Arn.asInstanceOf[js.Any], PermissionPolicy = PermissionPolicy.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RowLevelPermissionDataSet]
  }
}

