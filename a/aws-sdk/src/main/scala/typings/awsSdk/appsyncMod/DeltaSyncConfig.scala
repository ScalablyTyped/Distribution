package typings.awsSdk.appsyncMod

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
    baseTableTTL: js.UndefOr[Long] = js.undefined,
    deltaSyncTableName: String = null,
    deltaSyncTableTTL: js.UndefOr[Long] = js.undefined
  ): DeltaSyncConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(baseTableTTL)) __obj.updateDynamic("baseTableTTL")(baseTableTTL.get.asInstanceOf[js.Any])
    if (deltaSyncTableName != null) __obj.updateDynamic("deltaSyncTableName")(deltaSyncTableName.asInstanceOf[js.Any])
    if (!js.isUndefined(deltaSyncTableTTL)) __obj.updateDynamic("deltaSyncTableTTL")(deltaSyncTableTTL.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeltaSyncConfig]
  }
}

