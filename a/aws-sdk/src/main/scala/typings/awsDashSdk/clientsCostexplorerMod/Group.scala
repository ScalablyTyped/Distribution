package typings.awsDashSdk.clientsCostexplorerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Group extends js.Object {
  /**
    * The keys that are included in this group.
    */
  var Keys: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Keys] = js.undefined
  /**
    * The metrics that are included in this group.
    */
  var Metrics: js.UndefOr[typings.awsDashSdk.clientsCostexplorerMod.Metrics] = js.undefined
}

object Group {
  @scala.inline
  def apply(Keys: Keys = null, Metrics: Metrics = null): Group = {
    val __obj = js.Dynamic.literal()
    if (Keys != null) __obj.updateDynamic("Keys")(Keys)
    if (Metrics != null) __obj.updateDynamic("Metrics")(Metrics)
    __obj.asInstanceOf[Group]
  }
}

