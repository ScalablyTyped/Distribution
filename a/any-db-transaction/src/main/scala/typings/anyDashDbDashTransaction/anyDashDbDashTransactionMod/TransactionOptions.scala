package typings.anyDashDbDashTransaction.anyDashDbDashTransactionMod

import typings.anyDashDb.anyDashDbMod.Adapter
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  /**
    * Adapter name e.g. 'mysql'
    */
  var adapter: js.UndefOr[Adapter] = js.undefined
  /**
    * Rollback automatically on error, default true
    */
  var autoRollback: js.UndefOr[Boolean] = js.undefined
  /**
    * SQL statement for beginning a transaction, default 'BEGIN'
    */
  var begin: js.UndefOr[String] = js.undefined
  /**
    * Callback for transaction
    */
  var callback: js.UndefOr[js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]] = js.undefined
  /**
    * SQL statement for committing a transaction, default 'COMMIT'
    */
  var commit: js.UndefOr[String] = js.undefined
  /**
    * SQL statement for rolling back a transaction, default 'ROLLBACK'
    */
  var rollback: js.UndefOr[String] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(
    adapter: Adapter = null,
    autoRollback: js.UndefOr[Boolean] = js.undefined,
    begin: String = null,
    callback: (/* error */ Error, /* transaction */ Transaction) => Unit = null,
    commit: String = null,
    rollback: String = null
  ): TransactionOptions = {
    val __obj = js.Dynamic.literal()
    if (adapter != null) __obj.updateDynamic("adapter")(adapter)
    if (!js.isUndefined(autoRollback)) __obj.updateDynamic("autoRollback")(autoRollback)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (callback != null) __obj.updateDynamic("callback")(js.Any.fromFunction2(callback))
    if (commit != null) __obj.updateDynamic("commit")(commit)
    if (rollback != null) __obj.updateDynamic("rollback")(rollback)
    __obj.asInstanceOf[TransactionOptions]
  }
}

