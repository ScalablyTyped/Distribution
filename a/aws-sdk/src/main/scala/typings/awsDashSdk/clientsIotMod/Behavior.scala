package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Behavior extends js.Object {
  /**
    * The criteria that determine if a device is behaving normally in regard to the metric.
    */
  var criteria: js.UndefOr[BehaviorCriteria] = js.native
  /**
    * What is measured by the behavior.
    */
  var metric: js.UndefOr[BehaviorMetric] = js.native
  /**
    * The name you have given to the behavior.
    */
  var name: BehaviorName = js.native
}

object Behavior {
  @scala.inline
  def apply(name: BehaviorName, criteria: BehaviorCriteria = null, metric: BehaviorMetric = null): Behavior = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (criteria != null) __obj.updateDynamic("criteria")(criteria.asInstanceOf[js.Any])
    if (metric != null) __obj.updateDynamic("metric")(metric.asInstanceOf[js.Any])
    __obj.asInstanceOf[Behavior]
  }
}

