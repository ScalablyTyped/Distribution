package typings.awsDashSdk.clientsAppsyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeltaSyncConfig extends js.Object {
  /**
    * The number of minutes an Item is stored in the datasource.
    */
  var baseTableTTL: js.UndefOr[Long] = js.native
  /**
    * The Delta Sync table name.
    */
  var deltaSyncTableName: js.UndefOr[String] = js.native
  /**
    * The number of minutes a Delta Sync log entry is stored in the Delta Sync table.
    */
  var deltaSyncTableTTL: js.UndefOr[Long] = js.native
}

object DeltaSyncConfig {
  @scala.inline
  def apply(
    baseTableTTL: Int | Double = null,
    deltaSyncTableName: String = null,
    deltaSyncTableTTL: Int | Double = null
  ): DeltaSyncConfig = {
    val __obj = js.Dynamic.literal()
    if (baseTableTTL != null) __obj.updateDynamic("baseTableTTL")(baseTableTTL.asInstanceOf[js.Any])
    if (deltaSyncTableName != null) __obj.updateDynamic("deltaSyncTableName")(deltaSyncTableName.asInstanceOf[js.Any])
    if (deltaSyncTableTTL != null) __obj.updateDynamic("deltaSyncTableTTL")(deltaSyncTableTTL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaSyncConfig]
  }
}

