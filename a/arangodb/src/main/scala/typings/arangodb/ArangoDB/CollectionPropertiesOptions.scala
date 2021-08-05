package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CollectionPropertiesOptions extends StObject {
  
  var indexBuckets: js.UndefOr[Double] = js.undefined
  
  var journalSize: js.UndefOr[Double] = js.undefined
  
  var replicationFactor: js.UndefOr[Double] = js.undefined
  
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}
object CollectionPropertiesOptions {
  
  inline def apply(): CollectionPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPropertiesOptions]
  }
  
  extension [Self <: CollectionPropertiesOptions](x: Self) {
    
    inline def setIndexBuckets(value: Double): Self = StObject.set(x, "indexBuckets", value.asInstanceOf[js.Any])
    
    inline def setIndexBucketsUndefined: Self = StObject.set(x, "indexBuckets", js.undefined)
    
    inline def setJournalSize(value: Double): Self = StObject.set(x, "journalSize", value.asInstanceOf[js.Any])
    
    inline def setJournalSizeUndefined: Self = StObject.set(x, "journalSize", js.undefined)
    
    inline def setReplicationFactor(value: Double): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
    
    inline def setReplicationFactorUndefined: Self = StObject.set(x, "replicationFactor", js.undefined)
    
    inline def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    inline def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
