package typings.awsDashSdk.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SlotMigration extends js.Object {
  /**
    * The percentage of the slot migration that is complete.
    */
  var ProgressPercentage: js.UndefOr[Double] = js.undefined
}

object SlotMigration {
  @scala.inline
  def apply(ProgressPercentage: Int | scala.Double = null): SlotMigration = {
    val __obj = js.Dynamic.literal()
    if (ProgressPercentage != null) __obj.updateDynamic("ProgressPercentage")(ProgressPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[SlotMigration]
  }
}

