package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectionOptions extends js.Object {
  var isSystem: js.UndefOr[scala.Boolean] = js.undefined
  var isVolatile: js.UndefOr[scala.Boolean] = js.undefined
  var journalSize: js.UndefOr[scala.Double] = js.undefined
  var keyOptions: js.UndefOr[arangodbLib.Anon_AllowUserKeys] = js.undefined
  var numberOfShards: js.UndefOr[scala.Double] = js.undefined
  var replicationFactor: js.UndefOr[scala.Double] = js.undefined
  var shardKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var waitForSync: js.UndefOr[scala.Boolean] = js.undefined
}

object CreateCollectionOptions {
  @scala.inline
  def apply(
    isSystem: js.UndefOr[scala.Boolean] = js.undefined,
    isVolatile: js.UndefOr[scala.Boolean] = js.undefined,
    journalSize: scala.Int | scala.Double = null,
    keyOptions: arangodbLib.Anon_AllowUserKeys = null,
    numberOfShards: scala.Int | scala.Double = null,
    replicationFactor: scala.Int | scala.Double = null,
    shardKeys: js.Array[java.lang.String] = null,
    waitForSync: js.UndefOr[scala.Boolean] = js.undefined
  ): CreateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSystem)) __obj.updateDynamic("isSystem")(isSystem)
    if (!js.isUndefined(isVolatile)) __obj.updateDynamic("isVolatile")(isVolatile)
    if (journalSize != null) __obj.updateDynamic("journalSize")(journalSize.asInstanceOf[js.Any])
    if (keyOptions != null) __obj.updateDynamic("keyOptions")(keyOptions)
    if (numberOfShards != null) __obj.updateDynamic("numberOfShards")(numberOfShards.asInstanceOf[js.Any])
    if (replicationFactor != null) __obj.updateDynamic("replicationFactor")(replicationFactor.asInstanceOf[js.Any])
    if (shardKeys != null) __obj.updateDynamic("shardKeys")(shardKeys)
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[CreateCollectionOptions]
  }
}

