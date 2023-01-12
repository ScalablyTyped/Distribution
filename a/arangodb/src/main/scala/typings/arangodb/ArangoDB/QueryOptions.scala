package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryOptions extends StObject {
  
  var cache: js.UndefOr[Boolean] = js.undefined
  
  var count: js.UndefOr[Boolean] = js.undefined
  
  var failOnWarning: js.UndefOr[Boolean] = js.undefined
  
  var fullCount: js.UndefOr[Boolean] = js.undefined
  
  var intermediateCommitCount: js.UndefOr[Double] = js.undefined
  
  var intermediateCommitSize: js.UndefOr[Double] = js.undefined
  
  var maxNumberOfPlans: js.UndefOr[Double] = js.undefined
  
  // RocksDB
  var maxTransactionsSize: js.UndefOr[Double] = js.undefined
  
  var maxWarningCount: js.UndefOr[Double] = js.undefined
  
  var memoryLimit: js.UndefOr[Double] = js.undefined
  
  var profile: js.UndefOr[Boolean] = js.undefined
  
  // enterprise
  var skipInaccessibleCollections: js.UndefOr[Boolean] = js.undefined
  
  var stream: js.UndefOr[Boolean] = js.undefined
}
object QueryOptions {
  
  inline def apply(): QueryOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[QueryOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: QueryOptions] (val x: Self) extends AnyVal {
    
    inline def setCache(value: Boolean): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
    
    inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
    
    inline def setCount(value: Boolean): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
    
    inline def setCountUndefined: Self = StObject.set(x, "count", js.undefined)
    
    inline def setFailOnWarning(value: Boolean): Self = StObject.set(x, "failOnWarning", value.asInstanceOf[js.Any])
    
    inline def setFailOnWarningUndefined: Self = StObject.set(x, "failOnWarning", js.undefined)
    
    inline def setFullCount(value: Boolean): Self = StObject.set(x, "fullCount", value.asInstanceOf[js.Any])
    
    inline def setFullCountUndefined: Self = StObject.set(x, "fullCount", js.undefined)
    
    inline def setIntermediateCommitCount(value: Double): Self = StObject.set(x, "intermediateCommitCount", value.asInstanceOf[js.Any])
    
    inline def setIntermediateCommitCountUndefined: Self = StObject.set(x, "intermediateCommitCount", js.undefined)
    
    inline def setIntermediateCommitSize(value: Double): Self = StObject.set(x, "intermediateCommitSize", value.asInstanceOf[js.Any])
    
    inline def setIntermediateCommitSizeUndefined: Self = StObject.set(x, "intermediateCommitSize", js.undefined)
    
    inline def setMaxNumberOfPlans(value: Double): Self = StObject.set(x, "maxNumberOfPlans", value.asInstanceOf[js.Any])
    
    inline def setMaxNumberOfPlansUndefined: Self = StObject.set(x, "maxNumberOfPlans", js.undefined)
    
    inline def setMaxTransactionsSize(value: Double): Self = StObject.set(x, "maxTransactionsSize", value.asInstanceOf[js.Any])
    
    inline def setMaxTransactionsSizeUndefined: Self = StObject.set(x, "maxTransactionsSize", js.undefined)
    
    inline def setMaxWarningCount(value: Double): Self = StObject.set(x, "maxWarningCount", value.asInstanceOf[js.Any])
    
    inline def setMaxWarningCountUndefined: Self = StObject.set(x, "maxWarningCount", js.undefined)
    
    inline def setMemoryLimit(value: Double): Self = StObject.set(x, "memoryLimit", value.asInstanceOf[js.Any])
    
    inline def setMemoryLimitUndefined: Self = StObject.set(x, "memoryLimit", js.undefined)
    
    inline def setProfile(value: Boolean): Self = StObject.set(x, "profile", value.asInstanceOf[js.Any])
    
    inline def setProfileUndefined: Self = StObject.set(x, "profile", js.undefined)
    
    inline def setSkipInaccessibleCollections(value: Boolean): Self = StObject.set(x, "skipInaccessibleCollections", value.asInstanceOf[js.Any])
    
    inline def setSkipInaccessibleCollectionsUndefined: Self = StObject.set(x, "skipInaccessibleCollections", js.undefined)
    
    inline def setStream(value: Boolean): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
    
    inline def setStreamUndefined: Self = StObject.set(x, "stream", js.undefined)
  }
}
