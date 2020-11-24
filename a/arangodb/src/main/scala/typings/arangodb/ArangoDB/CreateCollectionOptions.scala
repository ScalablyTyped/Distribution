package typings.arangodb.ArangoDB

import typings.arangodb.anon.AllowUserKeys
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCollectionOptions extends js.Object {
  
  var isSystem: js.UndefOr[Boolean] = js.native
  
  var isVolatile: js.UndefOr[Boolean] = js.native
  
  var journalSize: js.UndefOr[Double] = js.native
  
  var keyOptions: js.UndefOr[AllowUserKeys] = js.native
  
  var numberOfShards: js.UndefOr[Double] = js.native
  
  var replicationFactor: js.UndefOr[Double] = js.native
  
  var shardKeys: js.UndefOr[js.Array[String]] = js.native
  
  var waitForSync: js.UndefOr[Boolean] = js.native
}
object CreateCollectionOptions {
  
  @scala.inline
  def apply(): CreateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionOptions]
  }
  
  @scala.inline
  implicit class CreateCollectionOptionsOps[Self <: CreateCollectionOptions] (val x: Self) extends AnyVal {
    
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
    def setIsSystem(value: Boolean): Self = this.set("isSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsSystem: Self = this.set("isSystem", js.undefined)
    
    @scala.inline
    def setIsVolatile(value: Boolean): Self = this.set("isVolatile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsVolatile: Self = this.set("isVolatile", js.undefined)
    
    @scala.inline
    def setJournalSize(value: Double): Self = this.set("journalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteJournalSize: Self = this.set("journalSize", js.undefined)
    
    @scala.inline
    def setKeyOptions(value: AllowUserKeys): Self = this.set("keyOptions", value.asInstanceOf[js.Any])
    
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
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = this.set("waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForSync: Self = this.set("waitForSync", js.undefined)
  }
}
