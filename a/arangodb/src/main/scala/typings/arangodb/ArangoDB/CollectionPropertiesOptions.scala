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
  
  @scala.inline
  def apply(): CollectionPropertiesOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CollectionPropertiesOptions]
  }
  
  @scala.inline
  implicit class CollectionPropertiesOptionsMutableBuilder[Self <: CollectionPropertiesOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndexBuckets(value: Double): Self = StObject.set(x, "indexBuckets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIndexBucketsUndefined: Self = StObject.set(x, "indexBuckets", js.undefined)
    
    @scala.inline
    def setJournalSize(value: Double): Self = StObject.set(x, "journalSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setJournalSizeUndefined: Self = StObject.set(x, "journalSize", js.undefined)
    
    @scala.inline
    def setReplicationFactor(value: Double): Self = StObject.set(x, "replicationFactor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplicationFactorUndefined: Self = StObject.set(x, "replicationFactor", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
