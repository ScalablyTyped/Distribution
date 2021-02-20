package typings.arangodb.ArangoDB

import typings.arangodb.anon.Increment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CollectionProperties extends StObject {
  
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
  implicit class CollectionPropertiesMutableBuilder[Self <: CollectionProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexBuckets(value: Double): Self = StObject.set(x, "indexBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsVolatile(value: Boolean): Self = StObject.set(x, "isVolatile", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJournalSize(value: Double): Self = StObject.set(x, "journalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyOptions(value: Increment): Self = StObject.set(x, "keyOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyOptionsUndefined: Self = StObject.set(x, "keyOptions", js.undefined)
    
    @scala.inline
    def setNumberOfShards(value: Double): Self = StObject.set(x, "numberOfShards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberOfShardsUndefined: Self = StObject.set(x, "numberOfShards", js.undefined)
    
    @scala.inline
    def setReplicationFactor(value: Double): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationFactorUndefined: Self = StObject.set(x, "replicationFactor", js.undefined)
    
    @scala.inline
    def setShardKeys(value: js.Array[String]): Self = StObject.set(x, "shardKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShardKeysUndefined: Self = StObject.set(x, "shardKeys", js.undefined)
    
    @scala.inline
    def setShardKeysVarargs(value: String*): Self = StObject.set(x, "shardKeys", js.Array(value :_*))
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
  }
}
