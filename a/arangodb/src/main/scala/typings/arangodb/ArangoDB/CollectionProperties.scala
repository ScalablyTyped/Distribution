package typings.arangodb.ArangoDB

import typings.arangodb.Anon_AllowUserKeysIncrement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionProperties extends js.Object {
  var indexBuckets: Double
  var isSystem: Boolean
  var isVolatile: Boolean
  var journalSize: Double
  var keyOptions: js.UndefOr[Anon_AllowUserKeysIncrement] = js.undefined
  var numberOfShards: js.UndefOr[Double] = js.undefined
  var replicationFactor: js.UndefOr[Double] = js.undefined
  var shardKeys: js.UndefOr[js.Array[String]] = js.undefined
  var waitForSync: Boolean
}

object CollectionProperties {
  @scala.inline
  def apply(
    indexBuckets: Double,
    isSystem: Boolean,
    isVolatile: Boolean,
    journalSize: Double,
    waitForSync: Boolean,
    keyOptions: Anon_AllowUserKeysIncrement = null,
    numberOfShards: Int | Double = null,
    replicationFactor: Int | Double = null,
    shardKeys: js.Array[String] = null
  ): CollectionProperties = {
    val __obj = js.Dynamic.literal(indexBuckets = indexBuckets, isSystem = isSystem, isVolatile = isVolatile, journalSize = journalSize, waitForSync = waitForSync)
    if (keyOptions != null) __obj.updateDynamic("keyOptions")(keyOptions)
    if (numberOfShards != null) __obj.updateDynamic("numberOfShards")(numberOfShards.asInstanceOf[js.Any])
    if (replicationFactor != null) __obj.updateDynamic("replicationFactor")(replicationFactor.asInstanceOf[js.Any])
    if (shardKeys != null) __obj.updateDynamic("shardKeys")(shardKeys)
    __obj.asInstanceOf[CollectionProperties]
  }
}

