package typings.arangodb.ArangoDB

import typings.arangodb.anon.AllowUserKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateCollectionOptions extends js.Object {
  var isSystem: js.UndefOr[Boolean] = js.undefined
  var isVolatile: js.UndefOr[Boolean] = js.undefined
  var journalSize: js.UndefOr[Double] = js.undefined
  var keyOptions: js.UndefOr[AllowUserKeys] = js.undefined
  var numberOfShards: js.UndefOr[Double] = js.undefined
  var replicationFactor: js.UndefOr[Double] = js.undefined
  var shardKeys: js.UndefOr[js.Array[String]] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object CreateCollectionOptions {
  @scala.inline
  def apply(
    isSystem: js.UndefOr[Boolean] = js.undefined,
    isVolatile: js.UndefOr[Boolean] = js.undefined,
    journalSize: js.UndefOr[Double] = js.undefined,
    keyOptions: AllowUserKeys = null,
    numberOfShards: js.UndefOr[Double] = js.undefined,
    replicationFactor: js.UndefOr[Double] = js.undefined,
    shardKeys: js.Array[String] = null,
    waitForSync: js.UndefOr[Boolean] = js.undefined
  ): CreateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isSystem)) __obj.updateDynamic("isSystem")(isSystem.get.asInstanceOf[js.Any])
    if (!js.isUndefined(isVolatile)) __obj.updateDynamic("isVolatile")(isVolatile.get.asInstanceOf[js.Any])
    if (!js.isUndefined(journalSize)) __obj.updateDynamic("journalSize")(journalSize.get.asInstanceOf[js.Any])
    if (keyOptions != null) __obj.updateDynamic("keyOptions")(keyOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfShards)) __obj.updateDynamic("numberOfShards")(numberOfShards.get.asInstanceOf[js.Any])
    if (!js.isUndefined(replicationFactor)) __obj.updateDynamic("replicationFactor")(replicationFactor.get.asInstanceOf[js.Any])
    if (shardKeys != null) __obj.updateDynamic("shardKeys")(shardKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCollectionOptions]
  }
}

