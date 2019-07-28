package typings.anyDashDbDashTransaction.anyDashDbDashTransactionMod

import typings.anyDashDb.anyDashDbMod.Queryable
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("any-db-transaction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Start a transaction
    */
  def apply(q: Queryable): Transaction = js.native
  def apply(q: Queryable, beginStatement: String): Transaction = js.native
  def apply(
    q: Queryable,
    beginStatement: String,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
  def apply(q: Queryable, callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]): Transaction = js.native
  def apply(q: Queryable, options: TransactionOptions): Transaction = js.native
  def apply(q: Queryable, options: TransactionOptions, beginStatement: String): Transaction = js.native
  def apply(
    q: Queryable,
    options: TransactionOptions,
    beginStatement: String,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
  def apply(
    q: Queryable,
    options: TransactionOptions,
    callback: js.Function2[/* error */ Error, /* transaction */ Transaction, Unit]
  ): Transaction = js.native
}

