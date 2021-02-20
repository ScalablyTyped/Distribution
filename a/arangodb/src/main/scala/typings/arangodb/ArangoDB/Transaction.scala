package typings.arangodb.ArangoDB

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends StObject {
  
  def action(params: js.Object): Unit | String = js.native
  
  var collections: TransactionCollections | js.Array[String] = js.native
  
  var intermediateCommitCount: js.UndefOr[Double] = js.native
  
  var intermediateCommitSize: js.UndefOr[Double] = js.native
  
  var lockTimeout: js.UndefOr[Double] = js.native
  
  // RocksDB
  var maxTransactionsSize: js.UndefOr[Double] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var waitForSync: js.UndefOr[Boolean] = js.native
}
object Transaction {
  
  @scala.inline
  def apply(action: js.Object => Unit | String, collections: TransactionCollections | js.Array[String]): Transaction = {
    val __obj = js.Dynamic.literal(action = js.Any.fromFunction1(action), collections = collections.asInstanceOf[js.Any])
    __obj.asInstanceOf[Transaction]
  }
  
  @scala.inline
  implicit class TransactionMutableBuilder[Self <: Transaction] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAction(value: js.Object => Unit | String): Self = StObject.set(x, "action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollections(value: TransactionCollections | js.Array[String]): Self = StObject.set(x, "collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCollectionsVarargs(value: String*): Self = StObject.set(x, "collections", js.Array(value :_*))
    
    @scala.inline
    def setIntermediateCommitCount(value: Double): Self = StObject.set(x, "intermediateCommitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediateCommitCountUndefined: Self = StObject.set(x, "intermediateCommitCount", js.undefined)
    
    @scala.inline
    def setIntermediateCommitSize(value: Double): Self = StObject.set(x, "intermediateCommitSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediateCommitSizeUndefined: Self = StObject.set(x, "intermediateCommitSize", js.undefined)
    
    @scala.inline
    def setLockTimeout(value: Double): Self = StObject.set(x, "lockTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLockTimeoutUndefined: Self = StObject.set(x, "lockTimeout", js.undefined)
    
    @scala.inline
    def setMaxTransactionsSize(value: Double): Self = StObject.set(x, "maxTransactionsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTransactionsSizeUndefined: Self = StObject.set(x, "maxTransactionsSize", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = StObject.set(x, "waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWaitForSyncUndefined: Self = StObject.set(x, "waitForSync", js.undefined)
  }
}
