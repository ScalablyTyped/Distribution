package typings.anyDbTransaction.mod

import typings.anyDb.mod.Adapter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TransactionOptions extends js.Object {
  
  /**
    * Adapter name e.g. 'mysql'
    */
  var adapter: js.UndefOr[Adapter] = js.native
  
  /**
    * Rollback automatically on error, default true
    */
  var autoRollback: js.UndefOr[Boolean] = js.native
  
  /**
    * SQL statement for beginning a transaction, default 'BEGIN'
    */
  var begin: js.UndefOr[String] = js.native
  
  /**
    * Callback for transaction
    */
  var callback: js.UndefOr[js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]] = js.native
  
  /**
    * SQL statement for committing a transaction, default 'COMMIT'
    */
  var commit: js.UndefOr[String] = js.native
  
  /**
    * SQL statement for rolling back a transaction, default 'ROLLBACK'
    */
  var rollback: js.UndefOr[String] = js.native
}
object TransactionOptions {
  
  @scala.inline
  def apply(): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TransactionOptions]
  }
  
  @scala.inline
  implicit class TransactionOptionsOps[Self <: TransactionOptions] (val x: Self) extends AnyVal {
    
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
    def setAdapter(value: Adapter): Self = this.set("adapter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAdapter: Self = this.set("adapter", js.undefined)
    
    @scala.inline
    def setAutoRollback(value: Boolean): Self = this.set("autoRollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAutoRollback: Self = this.set("autoRollback", js.undefined)
    
    @scala.inline
    def setBegin(value: String): Self = this.set("begin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBegin: Self = this.set("begin", js.undefined)
    
    @scala.inline
    def setCallback(value: (/* error */ Error, /* transaction */ Transaction) => Unit): Self = this.set("callback", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    
    @scala.inline
    def setCommit(value: String): Self = this.set("commit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommit: Self = this.set("commit", js.undefined)
    
    @scala.inline
    def setRollback(value: String): Self = this.set("rollback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRollback: Self = this.set("rollback", js.undefined)
  }
}
