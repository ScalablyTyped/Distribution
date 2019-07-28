package typings.awsDashSdk.clientsServerlessapplicationrepositoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RollbackConfiguration extends js.Object {
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var MonitoringTimeInMinutes: js.UndefOr[__integer] = js.undefined
  /**
    * This property corresponds to the content of the same name for the AWS CloudFormation RollbackConfiguration
    Data Type.
    */
  var RollbackTriggers: js.UndefOr[__listOfRollbackTrigger] = js.undefined
}

object RollbackConfiguration {
  @scala.inline
  def apply(
    MonitoringTimeInMinutes: js.UndefOr[__integer] = js.undefined,
    RollbackTriggers: __listOfRollbackTrigger = null
  ): RollbackConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(MonitoringTimeInMinutes)) __obj.updateDynamic("MonitoringTimeInMinutes")(MonitoringTimeInMinutes)
    if (RollbackTriggers != null) __obj.updateDynamic("RollbackTriggers")(RollbackTriggers)
    __obj.asInstanceOf[RollbackConfiguration]
  }
}

