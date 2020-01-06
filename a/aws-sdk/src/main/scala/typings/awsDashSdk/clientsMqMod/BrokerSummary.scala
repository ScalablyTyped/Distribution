package typings.awsDashSdk.clientsMqMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BrokerSummary extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the broker.
    */
  var BrokerArn: js.UndefOr[__string] = js.native
  /**
    * The unique ID that Amazon MQ generates for the broker.
    */
  var BrokerId: js.UndefOr[__string] = js.native
  /**
    * The name of the broker. This value must be unique in your AWS account, 1-50 characters long, must contain only letters, numbers, dashes, and underscores, and must not contain whitespaces, brackets, wildcard characters, or special characters.
    */
  var BrokerName: js.UndefOr[__string] = js.native
  /**
    * The status of the broker.
    */
  var BrokerState: js.UndefOr[typings.awsDashSdk.clientsMqMod.BrokerState] = js.native
  /**
    * The time when the broker was created.
    */
  var Created: js.UndefOr[__timestampIso8601] = js.native
  /**
    * Required. The deployment mode of the broker.
    */
  var DeploymentMode: js.UndefOr[typings.awsDashSdk.clientsMqMod.DeploymentMode] = js.native
  /**
    * The broker's instance type.
    */
  var HostInstanceType: js.UndefOr[__string] = js.native
}

object BrokerSummary {
  @scala.inline
  def apply(
    BrokerArn: __string = null,
    BrokerId: __string = null,
    BrokerName: __string = null,
    BrokerState: BrokerState = null,
    Created: __timestampIso8601 = null,
    DeploymentMode: DeploymentMode = null,
    HostInstanceType: __string = null
  ): BrokerSummary = {
    val __obj = js.Dynamic.literal()
    if (BrokerArn != null) __obj.updateDynamic("BrokerArn")(BrokerArn.asInstanceOf[js.Any])
    if (BrokerId != null) __obj.updateDynamic("BrokerId")(BrokerId.asInstanceOf[js.Any])
    if (BrokerName != null) __obj.updateDynamic("BrokerName")(BrokerName.asInstanceOf[js.Any])
    if (BrokerState != null) __obj.updateDynamic("BrokerState")(BrokerState.asInstanceOf[js.Any])
    if (Created != null) __obj.updateDynamic("Created")(Created.asInstanceOf[js.Any])
    if (DeploymentMode != null) __obj.updateDynamic("DeploymentMode")(DeploymentMode.asInstanceOf[js.Any])
    if (HostInstanceType != null) __obj.updateDynamic("HostInstanceType")(HostInstanceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[BrokerSummary]
  }
}

