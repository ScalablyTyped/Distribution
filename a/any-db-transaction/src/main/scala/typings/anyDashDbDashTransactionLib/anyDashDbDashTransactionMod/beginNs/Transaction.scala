package typings
package anyDashDbDashTransactionLib.anyDashDbDashTransactionMod.beginNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Transaction objects are are simple wrappers around a Connection that also implement the Queryable API,
  * but guarantee that all queries take place within a single database transaction or not at all. Note that
  * begin also understands how to acquire (and release) a connection from a ConnectionPool as well, so you
  * can simply pass a pool to it: var tx = begin(pool)
  *
  * By default, any queries that error during a transaction will cause an automatic rollback. If a query has
  * no callback, the transaction will also handle (and re-emit) 'error' events for the Query instance.
  * This enables handling errors for an entire transaction in a single place.
  *
  * Transactions may also be nested by passing a Transaction to begin and these nested transactions can
  * safely error and rollback without rolling back their parent transaction
  *
  * Transaction events:
  * 'query', query - emitted immediately after .query is called on a connection via tx.query. The argument is a query object.
  * 'commit:start' - Emitted when .commit() is called.
  * 'commit:complete' - Emitted after the transaction has committed.
  * 'rollback:start' - Emitted when .rollback() is called.
  * 'rollback:complete' - Emitted after the transaction has rolled back.
  * 'close' - Emitted after rollback or commit completes.
  * 'error', err - Emitted under three conditions:
  * There was an error acquiring a connection.
  * Any query performed in this transaction emits an error that would otherwise go unhandled.
  * Any of query, begin, commit, or rollback are called after the connection has already been committed or rolled back.
  * Note that the 'error' event may be emitted multiple times! depending on the callback you are registering, you way want to wrap it using [once][].
  */
@js.native
trait Transaction
  extends anyDashDbLib.anyDashDbMod.Queryable {
  /**
    * Issue a COMMIT (or RELEASE ... in the case of nested transactions) statement to the database.
    * If a continuation is provided it will be called (possibly with an error) after the COMMIT
    * statement completes. The transaction object itself will be unusable after calling commit().
    */
  def commit(): scala.Unit = js.native
  def commit(callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * The same as Transaction.commit but issues a ROLLBACK. Again, the transaction will be unusable after calling this method.
    */
  def rollback(): scala.Unit = js.native
  def rollback(callback: js.Function1[/* error */ stdLib.Error, scala.Unit]): scala.Unit = js.native
}

