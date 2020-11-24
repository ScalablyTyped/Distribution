package typings.arangodb.ArangoDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Transaction extends js.Object {
  
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
  implicit class TransactionOps[Self <: Transaction] (val x: Self) extends AnyVal {
    
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
    def setAction(value: js.Object => Unit | String): Self = this.set("action", js.Any.fromFunction1(value))
    
    @scala.inline
    def setCollectionsVarargs(value: String*): Self = this.set("collections", js.Array(value :_*))
    
    @scala.inline
    def setCollections(value: TransactionCollections | js.Array[String]): Self = this.set("collections", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIntermediateCommitCount(value: Double): Self = this.set("intermediateCommitCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntermediateCommitCount: Self = this.set("intermediateCommitCount", js.undefined)
    
    @scala.inline
    def setIntermediateCommitSize(value: Double): Self = this.set("intermediateCommitSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIntermediateCommitSize: Self = this.set("intermediateCommitSize", js.undefined)
    
    @scala.inline
    def setLockTimeout(value: Double): Self = this.set("lockTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLockTimeout: Self = this.set("lockTimeout", js.undefined)
    
    @scala.inline
    def setMaxTransactionsSize(value: Double): Self = this.set("maxTransactionsSize", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxTransactionsSize: Self = this.set("maxTransactionsSize", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
    
    @scala.inline
    def setWaitForSync(value: Boolean): Self = this.set("waitForSync", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWaitForSync: Self = this.set("waitForSync", js.undefined)
  }
}
