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
  def apply(q: anyDashDbLib.anyDashDbMod.Queryable): anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction = js.native
  def apply(q: anyDashDbLib.anyDashDbMod.Queryable, beginStatement: java.lang.String): anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    beginStatement: java.lang.String,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* transaction */ anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction, 
      scala.Unit
    ]
  ): anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* transaction */ anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction, 
      scala.Unit
    ]
  ): anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    options: anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.TransactionOptions
  ): anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    options: anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.TransactionOptions,
    beginStatement: java.lang.String
  ): anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    options: anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.TransactionOptions,
    beginStatement: java.lang.String,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* transaction */ anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction, 
      scala.Unit
    ]
  ): anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction = js.native
  def apply(
    q: anyDashDbLib.anyDashDbMod.Queryable,
    options: anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.TransactionOptions,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* transaction */ anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction, 
      scala.Unit
    ]
  ): anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs.Transaction = js.native
}

