package typings
package arangodbLib.ArangoDBNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CollectionProperties extends js.Object {
  var indexBuckets: scala.Double
  var isSystem: scala.Boolean
  var isVolatile: scala.Boolean
  var journalSize: scala.Double
  var keyOptions: js.UndefOr[arangodbLib.Anon_AllowUserKeysIncrement] = js.undefined
  var numberOfShards: js.UndefOr[scala.Double] = js.undefined
  var replicationFactor: js.UndefOr[scala.Double] = js.undefined
  var shardKeys: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var waitForSync: scala.Boolean
}

object CollectionProperties {
  @scala.inline
  def apply(
    indexBuckets: scala.Double,
    isSystem: scala.Boolean,
    isVolatile: scala.Boolean,
    journalSize: scala.Double,
    waitForSync: scala.Boolean,
    keyOptions: arangodbLib.Anon_AllowUserKeysIncrement = null,
    numberOfShards: scala.Int | scala.Double = null,
    replicationFactor: scala.Int | scala.Double = null,
    shardKeys: js.Array[java.lang.String] = null
  ): CollectionProperties = {
    val __obj = js.Dynamic.literal(indexBuckets = indexBuckets, isSystem = isSystem, isVolatile = isVolatile, journalSize = journalSize, waitForSync = waitForSync)
    if (keyOptions != null) __obj.updateDynamic("keyOptions")(keyOptions)
    if (numberOfShards != null) __obj.updateDynamic("numberOfShards")(numberOfShards.asInstanceOf[js.Any])
    if (replicationFactor != null) __obj.updateDynamic("replicationFactor")(replicationFactor.asInstanceOf[js.Any])
    if (shardKeys != null) __obj.updateDynamic("shardKeys")(shardKeys)
    __obj.asInstanceOf[CollectionProperties]
  }
}

