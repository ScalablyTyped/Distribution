package typings.awsDashSdk.clientsRdsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ModifyDBProxyTargetGroupRequest extends js.Object {
  /**
    * The settings that determine the size and behavior of the connection pool for the target group.
    */
  var ConnectionPoolConfig: js.UndefOr[ConnectionPoolConfiguration] = js.native
  /**
    * The name of the new proxy to which to assign the target group.
    */
  var DBProxyName: String = js.native
  /**
    * The new name for the modified DBProxyTarget. An identifier must begin with a letter and must contain only ASCII letters, digits, and hyphens; it can't end with a hyphen or contain two consecutive hyphens.
    */
  var NewName: js.UndefOr[String] = js.native
  /**
    * The name of the new target group to assign to the proxy.
    */
  var TargetGroupName: String = js.native
}

object ModifyDBProxyTargetGroupRequest {
  @scala.inline
  def apply(
    DBProxyName: String,
    TargetGroupName: String,
    ConnectionPoolConfig: ConnectionPoolConfiguration = null,
    NewName: String = null
  ): ModifyDBProxyTargetGroupRequest = {
    val __obj = js.Dynamic.literal(DBProxyName = DBProxyName.asInstanceOf[js.Any], TargetGroupName = TargetGroupName.asInstanceOf[js.Any])
    if (ConnectionPoolConfig != null) __obj.updateDynamic("ConnectionPoolConfig")(ConnectionPoolConfig.asInstanceOf[js.Any])
    if (NewName != null) __obj.updateDynamic("NewName")(NewName.asInstanceOf[js.Any])
    __obj.asInstanceOf[ModifyDBProxyTargetGroupRequest]
  }
}

