package typings.awsDashSdk.clientsIotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MetricsConfiguration extends js.Object {
  /**
    * A Boolean that specifies whether cloud metrics are collected.
    */
  var cloudMetricEnabled: js.UndefOr[Enabled] = js.undefined
  /**
    * The ARN of the role that is used to collect cloud metrics.
    */
  var metricRuleRoleArn: js.UndefOr[RoleArn] = js.undefined
}

object MetricsConfiguration {
  @scala.inline
  def apply(cloudMetricEnabled: js.UndefOr[Boolean] = js.undefined, metricRuleRoleArn: RoleArn = null): MetricsConfiguration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(cloudMetricEnabled)) __obj.updateDynamic("cloudMetricEnabled")(cloudMetricEnabled)
    if (metricRuleRoleArn != null) __obj.updateDynamic("metricRuleRoleArn")(metricRuleRoleArn)
    __obj.asInstanceOf[MetricsConfiguration]
  }
}

