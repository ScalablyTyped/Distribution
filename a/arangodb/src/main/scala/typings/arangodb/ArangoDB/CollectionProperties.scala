package typings.arangodb.ArangoDB

import typings.arangodb.anon.Increment
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CollectionProperties extends js.Object {
  var indexBuckets: Double = js.native
  var isSystem: Boolean = js.native
  var isVolatile: Boolean = js.native
  var journalSize: Double = js.native
  var keyOptions: js.UndefOr[Increment] = js.native
  var numberOfShards: js.UndefOr[Double] = js.native
  var replicationFactor: js.UndefOr[Double] = js.native
  var shardKeys: js.UndefOr[js.Array[String]] = js.native
  var waitForSync: Boolean = js.native
}

object CollectionProperties {
  @scala.inline
  def apply(
    indexBuckets: Double,
    isSystem: Boolean,
    isVolatile: Boolean,
    journalSize: Double,
    waitForSync: Boolean
  ): CollectionProperties = {
    val __obj = js.Dynamic.literal(indexBuckets = indexBuckets.asInstanceOf[js.Any], isSystem = isSystem.asInstanceOf[js.Any], isVolatile = isVolatile.asInstanceOf[js.Any], journalSize = journalSize.asInstanceOf[js.Any], waitForSync = waitForSync.asInstanceOf[js.Any])
    __obj.asInstanceOf[CollectionProperties]
  }
  @scala.inline
  implicit class CollectionPropertiesOps[Self <: CollectionProperties] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setIndexBuckets(value: Double): Self = this.set("indexBuckets", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsSystem(value: Boolean): Self = this.set("isSystem", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsVolatile(value: Boolean): Self = this.set("isVolatile", value.asInstanceOf[js.Any])
    @scala.inline
    def setJournalSize(value: Double): Self = this.set("journalSize", value.asInstanceOf[js.Any])
    @scala.inline
    def setWaitForSync(value: Boolean): Self = this.set("waitForSync", value.asInstanceOf[js.Any])
    @scala.inline
    def setKeyOptions(value: Increment): Self = this.set("keyOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteKeyOptions: Self = this.set("keyOptions", js.undefined)
    @scala.inline
    def setNumberOfShards(value: Double): Self = this.set("numberOfShards", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfShards: Self = this.set("numberOfShards", js.undefined)
    @scala.inline
    def setReplicationFactor(value: Double): Self = this.set("replicationFactor", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReplicationFactor: Self = this.set("replicationFactor", js.undefined)
    @scala.inline
    def setShardKeysVarargs(value: String*): Self = this.set("shardKeys", js.Array(value :_*))
    @scala.inline
    def setShardKeys(value: js.Array[String]): Self = this.set("shardKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteShardKeys: Self = this.set("shardKeys", js.undefined)
  }
  
}

