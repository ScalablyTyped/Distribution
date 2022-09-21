package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Transaction[ReturnType] extends StObject {
  
  def action(params: js.Object): ReturnType
  
  var collections: TransactionCollections | js.Array[String]
  
  var intermediateCommitCount: js.UndefOr[Double] = js.undefined
  
  var intermediateCommitSize: js.UndefOr[Double] = js.undefined
  
  var lockTimeout: js.UndefOr[Double] = js.undefined
  
  // RocksDB
  var maxTransactionsSize: js.UndefOr[Double] = js.undefined
  
  var params: js.UndefOr[js.Object] = js.undefined
  
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}
object Transaction {
  
  inline def apply[ReturnType](action: js.Object => ReturnType, collections: TransactionCollections | js.Array[String]): Transaction[ReturnType] = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction[ReturnType]]
  }
  
  extension [Self <: Transaction[?], ReturnType](x: Self & Transaction[ReturnType]) {
    
    inline def setAction(value: js.Object => ReturnType): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    inline def setCollections(value: TransactionCollections | js.Array[String]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    inline def setCollectionsVarargs(value: String*): Self = StObject.set(x, "collections", js.Array(value*))
    
    inline def setIntermediateCommitCount(value: Double): Self = StObject.set(x, "intermediateCommitCount", value.asInstanceOf[js.Any])
    
    inline def setIntermediateCommitCountUndefined: Self = StObject.set(x, "intermediateCommitCount", js.undefined)
    
    inline def setIntermediateCommitSize(value: Double): Self = StObject.set(x, "intermediateCommitSize", value.asInstanceOf[js.Any])
    
    inline def setIntermediateCommitSizeUndefined: Self = StObject.set(x, "intermediateCommitSize", js.undefined)
    
    inline def setLockTimeout(value: Double): Self = StObject.set(x, "lockTimeout", value.asInstanceOf[js.Any])
    
    inline def setLockTimeoutUndefined: Self = StObject.set(x, "lockTimeout", js.undefined)
    
    inline def setMaxTransactionsSize(value: Double): Self = StObject.set(x, "maxTransactionsSize", value.asInstanceOf[js.Any])
    
    inline def setMaxTransactionsSizeUndefined: Self = StObject.set(x, "maxTransactionsSize", js.undefined)
    
    inline def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    inline def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    inline def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
