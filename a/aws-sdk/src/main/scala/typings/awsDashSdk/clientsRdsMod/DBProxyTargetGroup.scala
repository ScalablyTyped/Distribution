package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DBProxyTargetGroup extends js.Object {
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfigurationInfo] = js.native
  /**
    * The date and time when the target group was first created.
    */
  var CreatedDate: js.UndefOr[TStamp] = js.native
  /**
    * The identifier for the RDS proxy associated with this target group.
    */
  var DBProxyName: js.UndefOr[String] = js.native
  /**
    * Whether this target group is the first one used for connection requests by the associated proxy. Because each proxy is currently associated with a single target group, currently this setting is always true.
    */
  var IsDefault: js.UndefOr[Boolean] = js.native
  /**
    * The current status of this target group. A status of available means the target group is correctly associated with a database. Other values indicate that you must wait for the target group to be ready, or take some action to resolve an issue.
    */
  var Status: js.UndefOr[String] = js.native
  /**
    * The Amazon Resource Name (ARN) representing the target group.
    */
  var TargetGroupArn: js.UndefOr[String] = js.native
  /**
    * The identifier for the target group. This name must be unique for all target groups owned by your AWS account in the specified AWS Region.
    */
  var TargetGroupName: js.UndefOr[String] = js.native
  /**
    * The date and time when the target group was last updated.
    */
  var UpdatedDate: js.UndefOr[TStamp] = js.native
}

object DBProxyTargetGroup {
  @scala.inline
  def apply(
    ConnectionPoolConfig: ConnectionPoolConfigurationInfo = null,
    CreatedDate: TStamp = null,
    DBProxyName: String = null,
    IsDefault: js.UndefOr[scala.Boolean] = js.undefined,
    Status: String = null,
    TargetGroupArn: String = null,
    TargetGroupName: String = null,
    UpdatedDate: TStamp = null
  ): DBProxyTargetGroup = {
    val __obj = js.Dynamic.literal()
    if (ConnectionPoolConfig != null) __obj.updateDynamic("ConnectionPoolConfig")(ConnectionPoolConfig.asInstanceOf[js.Any])
    if (CreatedDate != null) __obj.updateDynamic("CreatedDate")(CreatedDate.asInstanceOf[js.Any])
    if (DBProxyName != null) __obj.updateDynamic("DBProxyName")(DBProxyName.asInstanceOf[js.Any])
    if (!js.isUndefined(IsDefault)) __obj.updateDynamic("IsDefault")(IsDefault.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (TargetGroupArn != null) __obj.updateDynamic("TargetGroupArn")(TargetGroupArn.asInstanceOf[js.Any])
    if (TargetGroupName != null) __obj.updateDynamic("TargetGroupName")(TargetGroupName.asInstanceOf[js.Any])
    if (UpdatedDate != null) __obj.updateDynamic("UpdatedDate")(UpdatedDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[DBProxyTargetGroup]
  }
}

