package typings.arangodb.ArangoDB

import typings.arangodb.anon.AllowUserKeys
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCollectionOptions extends StObject {
  
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
  
  inline def apply(): CreateCollectionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateCollectionOptions]
  }
  
  extension [Self <: CreateCollectionOptions](x: Self) {
    
    inline def setIsSystem(value: Boolean): Self = StObject.set(x, "isSystem", value.asInstanceOf[js.Any])
    
    inline def setIsSystemUndefined: Self = StObject.set(x, "isSystem", js.undefined)
    
    inline def setIsVolatile(value: Boolean): Self = StObject.set(x, "isVolatile", value.asInstanceOf[js.Any])
    
    inline def setIsVolatileUndefined: Self = StObject.set(x, "isVolatile", js.undefined)
    
    inline def setJournalSize(value: Double): Self = StObject.set(x, "journalSize", value.asInstanceOf[js.Any])
    
    inline def setJournalSizeUndefined: Self = StObject.set(x, "journalSize", js.undefined)
    
    inline def setKeyOptions(value: AllowUserKeys): Self = StObject.set(x, "keyOptions", value.asInstanceOf[js.Any])
    
    inline def setKeyOptionsUndefined: Self = StObject.set(x, "keyOptions", js.undefined)
    
    inline def setNumberOfShards(value: Double): Self = StObject.set(x, "numberOfShards", value.asInstanceOf[js.Any])
    
    inline def setNumberOfShardsUndefined: Self = StObject.set(x, "numberOfShards", js.undefined)
    
    inline def setReplicationFactor(value: Double): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
    
    inline def setReplicationFactorUndefined: Self = StObject.set(x, "replicationFactor", js.undefined)
    
    inline def setShardKeys(value: js.Array[String]): Self = StObject.set(x, "shardKeys", value.asInstanceOf[js.Any])
    
    inline def setShardKeysUndefined: Self = StObject.set(x, "shardKeys", js.undefined)
    
    inline def setShardKeysVarargs(value: String*): Self = StObject.set(x, "shardKeys", js.Array(value*))
    
    inline def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    inline def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
