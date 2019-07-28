package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Behavior extends js.Object {
  /**
    * The criteria that determine if a device is behaving normally in regard to the metric.
    */
  var criteria: js.UndefOr[BehaviorCriteria] = js.undefined
  /**
    * What is measured by the behavior.
    */
  var metric: js.UndefOr[BehaviorMetric] = js.undefined
  /**
    * The name you have given to the behavior.
    */
  var name: BehaviorName
}

object Behavior {
  @scala.inline
  def apply(name: BehaviorName, criteria: BehaviorCriteria = null, metric: BehaviorMetric = null): Behavior = {
    val __obj = js.Dynamic.literal(name = name)
    if (criteria != null) __obj.updateDynamic("criteria")(criteria)
    if (metric != null) __obj.updateDynamic("metric")(metric)
    __obj.asInstanceOf[Behavior]
  }
}

