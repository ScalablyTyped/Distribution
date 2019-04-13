package typings
package awsDashSdkLib.clientsElasticacheMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReshardingStatus extends js.Object {
  /**
    * Represents the progress of an online resharding operation.
    */
  var SlotMigration: js.UndefOr[SlotMigration] = js.undefined
}

object ReshardingStatus {
  @scala.inline
  def apply(SlotMigration: SlotMigration = null): ReshardingStatus = {
    val __obj = js.Dynamic.literal()
    if (SlotMigration != null) __obj.updateDynamic("SlotMigration")(SlotMigration)
    __obj.asInstanceOf[ReshardingStatus]
  }
}

