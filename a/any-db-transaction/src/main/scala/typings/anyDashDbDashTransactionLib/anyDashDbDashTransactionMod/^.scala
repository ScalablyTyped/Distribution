package typings
package anyDashDbDashTransactionLib.anyDashDbDashTransactionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("any-db-transaction", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
    * Start a transaction
    */
  def apply(q: anyDashDbLib.anyDashDbMod.Queryable): Transaction = js.native
  def apply(q: anyDashDbLib.anyDashDbMod.Queryable, beginStatement: java.lang.String): Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    beginStatement: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* transaction */ Transaction, scala.Unit]
  ): Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    callback: js.Function2[/* error */ stdLib.Error, /* transaction */ Transaction, scala.Unit]
  ): Transaction = js.native
  def apply(q: anyDashDbLib.anyDashDbMod.Queryable, options: TransactionOptions): Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    options: TransactionOptions,
    beginStatement: java.lang.String
  ): Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    options: TransactionOptions,
    beginStatement: java.lang.String,
    callback: js.Function2[/* error */ stdLib.Error, /* transaction */ Transaction, scala.Unit]
  ): Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    options: TransactionOptions,
    callback: js.Function2[/* error */ stdLib.Error, /* transaction */ Transaction, scala.Unit]
  ): Transaction = js.native
}

