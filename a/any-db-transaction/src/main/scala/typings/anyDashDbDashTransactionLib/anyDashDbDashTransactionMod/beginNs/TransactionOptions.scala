package typings
package anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransactionOptions extends js.Object {
  /**
    * Adapter name e.g. 'mysql'
    */
  var adapter: js.UndefOr[anyDashDbLib.anyDashDbMod.Adapter] = js.undefined
  /**
    * Rollback automatically on error, default true
    */
  var autoRollback: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * SQL statement for beginning a transaction, default 'BEGIN'
    */
  var begin: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Callback for transaction
    */
  var callback: js.UndefOr[
    js.Function2[/* error */ stdLib.Error, /* transaction */ Transaction, scala.Unit]
  ] = js.undefined
  /**
    * SQL statement for committing a transaction, default 'COMMIT'
    */
  var commit: js.UndefOr[java.lang.String] = js.undefined
  /**
    * SQL statement for rolling back a transaction, default 'ROLLBACK'
    */
  var rollback: js.UndefOr[java.lang.String] = js.undefined
}

object TransactionOptions {
  @scala.inline
  def apply(
    adapter: anyDashDbLib.anyDashDbMod.Adapter = null,
    autoRollback: js.UndefOr[scala.Boolean] = js.undefined,
    begin: java.lang.String = null,
    callback: (/* error */ stdLib.Error, /* transaction */ Transaction) => scala.Unit = null,
    commit: java.lang.String = null,
    rollback: java.lang.String = null
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

