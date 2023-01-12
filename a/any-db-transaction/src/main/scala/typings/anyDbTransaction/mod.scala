package typings.anyDbTransaction

import typings.anyDb.mod.Adapter
import typings.anyDb.mod.Queryable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Start a transaction
    */
  inline def apply(q: Queryable): Transaction = ^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any]).asInstanceOf[Transaction]
  inline def apply(q: Queryable, beginStatement: String): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], beginStatement.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(
    q: Queryable,
    beginStatement: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], beginStatement.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(q: Queryable, callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(q: Queryable, options: Unit, beginStatement: String): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any], beginStatement.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(
    q: Queryable,
    options: Unit,
    beginStatement: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any], beginStatement.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(
    q: Queryable,
    options: Unit,
    beginStatement: Unit,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any], beginStatement.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(
    q: Queryable,
    options: Unit,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(q: Queryable, options: TransactionOptions): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(q: Queryable, options: TransactionOptions, beginStatement: String): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any], beginStatement.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(
    q: Queryable,
    options: TransactionOptions,
    beginStatement: String,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any], beginStatement.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(
    q: Queryable,
    options: TransactionOptions,
    beginStatement: Unit,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any], beginStatement.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  inline def apply(
    q: Queryable,
    options: TransactionOptions,
    callback: js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]
  ): Transaction = (^.asInstanceOf[js.Dynamic].apply(q.asInstanceOf[js.Any], options.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Transaction]
  
  @JSImport("any-db-transaction", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
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
    extends StObject
       with Queryable {
    
    /**
      * Issue a COMMIT (or RELEASE ... in the case of nested transactions) statement to the database.
      * If a continuation is provided it will be called (possibly with an error) after the COMMIT
      * statement completes. The transaction object itself will be unusable after calling commit().
      */
    def commit(): Unit = js.native
    def commit(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
    
    /**
      * The same as Transaction.commit but issues a ROLLBACK. Again, the transaction will be unusable after calling this method.
      */
    def rollback(): Unit = js.native
    def rollback(callback: js.Function1[/* error */ js.Error, Unit]): Unit = js.native
  }
  
  trait TransactionOptions extends StObject {
    
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
    var callback: js.UndefOr[js.Function2[/* error */ js.Error, /* transaction */ Transaction, Unit]] = js.undefined
    
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
    
    inline def apply(): TransactionOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TransactionOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TransactionOptions] (val x: Self) extends AnyVal {
      
      inline def setAdapter(value: Adapter): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
      
      inline def setAdapterUndefined: Self = StObject.set(x, "adapter", js.undefined)
      
      inline def setAutoRollback(value: Boolean): Self = StObject.set(x, "autoRollback", value.asInstanceOf[js.Any])
      
      inline def setAutoRollbackUndefined: Self = StObject.set(x, "autoRollback", js.undefined)
      
      inline def setBegin(value: String): Self = StObject.set(x, "begin", value.asInstanceOf[js.Any])
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setCallback(value: (/* error */ js.Error, /* transaction */ Transaction) => Unit): Self = StObject.set(x, "callback", js.Any.fromFunction2(value))
      
      inline def setCallbackUndefined: Self = StObject.set(x, "callback", js.undefined)
      
      inline def setCommit(value: String): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setRollback(value: String): Self = StObject.set(x, "rollback", value.asInstanceOf[js.Any])
      
      inline def setRollbackUndefined: Self = StObject.set(x, "rollback", js.undefined)
    }
  }
}
