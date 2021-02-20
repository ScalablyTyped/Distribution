package typings.anyDb

import org.scalablytyped.runtime.Instantiable0
import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Readable
import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("any-db", "createConnection")
  @js.native
  def createConnection(opts: ConnectOpts): Connection = js.native
  @JSImport("any-db", "createConnection")
  @js.native
  def createConnection(opts: ConnectOpts, callback: js.Function2[/* error */ Error, /* connection */ Connection, Unit]): Connection = js.native
  @JSImport("any-db", "createConnection")
  @js.native
  def createConnection(url: String): Connection = js.native
  @JSImport("any-db", "createConnection")
  @js.native
  def createConnection(url: String, callback: js.Function2[/* error */ Error, /* connection */ Connection, Unit]): Connection = js.native
  
  @JSImport("any-db", "createPool")
  @js.native
  def createPool(opts: ConnectOpts, config: PoolConfig): ConnectionPool = js.native
  @JSImport("any-db", "createPool")
  @js.native
  def createPool(url: String, config: PoolConfig): ConnectionPool = js.native
  
  @js.native
  trait Adapter extends StObject {
    
    /**
      * Create a new connection object. In common usage, config will be created by parse-db-url and passed to the adapter by any-db.
      * If a continuation is given, it must be called, either with an error or the established connection.
      */
    def createConnection(opts: ConnectOpts): Connection = js.native
    def createConnection(opts: ConnectOpts, callback: js.Function2[/* error */ Error, /* result */ Connection, Unit]): Connection = js.native
    
    def createQuery(query: Query): Query = js.native
    /**
      * Create a Query that may eventually be executed later on by a Connection. While this function is rarely needed by user code,
      * it makes it possible for ConnectionPool.query and Transaction.query to fulfill the Queryable.query contract
      * by synchronously returning a Query stream
      */
    def createQuery(text: String): Query = js.native
    def createQuery(
      text: String,
      params: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error, /* result */ ResultSet, Unit]
    ): Query = js.native
    def createQuery(text: String, params: js.Array[_]): Query = js.native
    def createQuery(
      text: String,
      params: js.Array[_],
      callback: js.Function2[/* error */ Error, /* result */ ResultSet, Unit]
    ): Query = js.native
    
    var name: String = js.native
  }
  
  @js.native
  trait ConnectOpts extends StObject {
    
    var adapter: String = js.native
  }
  object ConnectOpts {
    
    @scala.inline
    def apply(adapter: String): ConnectOpts = {
      val __obj = js.Dynamic.literal(adapter = adapter.asInstanceOf[js.Any])
      __obj.asInstanceOf[ConnectOpts]
    }
    
    @scala.inline
    implicit class ConnectOptsMutableBuilder[Self <: ConnectOpts] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAdapter(value: String): Self = StObject.set(x, "adapter", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Connection extends Queryable {
    
    /**
      * Close the database connection. If a continuation is provided it
      * will be called after the connection has closed.
      */
    def end(): Unit = js.native
    def end(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
  }
  
  @js.native
  trait ConnectionPool extends Queryable {
    
    /**
      * Remove a connection from the pool. If you use this method you must
      * return the connection back to the pool using ConnectionPool.release
      */
    def acquire(callback: js.Function2[/* error */ Error, /* result */ Connection, Unit]): Unit = js.native
    
    /**
      * Stop giving out new connections, and close all existing database connections as they
      * are returned to the pool.
      */
    def close(): Unit = js.native
    def close(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
    
    /**
      * Return a connection to the pool. This should only be called with connections
      * you've manually acquired. You must not continue to use the connection after releasing it.
      */
    def release(connection: Connection): Unit = js.native
  }
  
  @js.native
  trait ConnectionStatic extends Instantiable0[Connection] {
    
    def createConnection(): Unit = js.native
    
    def createPool(): Unit = js.native
    
    var name: String = js.native
  }
  
  @js.native
  trait Field extends StObject {
    
    var name: String = js.native
  }
  object Field {
    
    @scala.inline
    def apply(name: String): Field = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    @scala.inline
    implicit class FieldMutableBuilder[Self <: Field] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PoolConfig extends StObject {
    
    /**
      * (default 30000) The maximum amount of time a connection can sit idle in the pool before being reaped
      */
    var idleTimeout: js.UndefOr[Double] = js.native
    
    /**
      * max (default 10) The maximum number of connections to keep open in the pool.
      * When this limit is reached further requests for connections will queue waiting
      * for an existing connection to be released back into the pool.
      */
    var max: js.UndefOr[Double] = js.native
    
    /**
      * min (default 0) The minimum number of connections to keep open in the pool.
      */
    var min: js.UndefOr[Double] = js.native
    
    /**
      * Called immediately after a connection is first established. Use this to do one-time setup of new connections.
      * The supplied Connection will not be added to the pool until you pass it to the done continuation.
      */
    var onConnect: js.UndefOr[
        js.Function2[
          /* connection */ Connection, 
          /* ready */ js.Function2[/* error */ Error, /* result */ Connection, Unit], 
          Unit
        ]
      ] = js.native
    
    /**
      *  (default 1000) How frequently the pool should check for connections that are old enough to be reaped.
      */
    var reapInterval: js.UndefOr[Double] = js.native
    
    /**
      * (default true) When this is true, the pool will reap connections that
      * have been idle for more than idleTimeout milliseconds.
      */
    var refreshIdle: js.UndefOr[Boolean] = js.native
    
    /**
      * Called each time a connection is returned to the pool. Use this to restore a connection to
      * it's original state (e.g. rollback transactions, set the database session vars). If reset
      * fails to call the done continuation the connection will be lost in limbo.
      */
    var reset: js.UndefOr[
        js.Function2[/* connection */ Connection, /* done */ js.Function1[/* error */ Error, Unit], Unit]
      ] = js.native
    
    /**
      * (default function (err) { return true }) - Called when an error is encountered
      * by pool.query or emitted by an idle connection. If shouldDestroyConnection(error)
      * is truthy the connection will be destroyed, otherwise it will be reset.
      */
    var shouldDestroyConnection: js.UndefOr[js.Function1[/* error */ Error, Boolean]] = js.native
  }
  object PoolConfig {
    
    @scala.inline
    def apply(): PoolConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PoolConfig]
    }
    
    @scala.inline
    implicit class PoolConfigMutableBuilder[Self <: PoolConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIdleTimeout(value: Double): Self = StObject.set(x, "idleTimeout", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIdleTimeoutUndefined: Self = StObject.set(x, "idleTimeout", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setMin(value: Double): Self = StObject.set(x, "min", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinUndefined: Self = StObject.set(x, "min", js.undefined)
      
      @scala.inline
      def setOnConnect(
        value: (/* connection */ Connection, /* ready */ js.Function2[/* error */ Error, /* result */ Connection, Unit]) => Unit
      ): Self = StObject.set(x, "onConnect", js.Any.fromFunction2(value))
      
      @scala.inline
      def setOnConnectUndefined: Self = StObject.set(x, "onConnect", js.undefined)
      
      @scala.inline
      def setReapInterval(value: Double): Self = StObject.set(x, "reapInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReapIntervalUndefined: Self = StObject.set(x, "reapInterval", js.undefined)
      
      @scala.inline
      def setRefreshIdle(value: Boolean): Self = StObject.set(x, "refreshIdle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRefreshIdleUndefined: Self = StObject.set(x, "refreshIdle", js.undefined)
      
      @scala.inline
      def setReset(value: (/* connection */ Connection, /* done */ js.Function1[/* error */ Error, Unit]) => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction2(value))
      
      @scala.inline
      def setResetUndefined: Self = StObject.set(x, "reset", js.undefined)
      
      @scala.inline
      def setShouldDestroyConnection(value: /* error */ Error => Boolean): Self = StObject.set(x, "shouldDestroyConnection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setShouldDestroyConnectionUndefined: Self = StObject.set(x, "shouldDestroyConnection", js.undefined)
    }
  }
  
  @js.native
  trait Query extends Readable {
    
    /**
      * The callback (if any) that was provided to Queryable.query. Note that
      * Query objects must not use a closed over reference to their callback,
      * as other any-db libraries may rely on modifying the callback property
      * of a Query they did not create.
      */
    def callback(error: Error, results: ResultSet): Unit = js.native
    
    /**
      * The SQL query as a string. If you are using MySQL this will contain
      * interpolated values after the query has been enqueued by a connection.
      */
    var text: String = js.native
    
    /**
      * The array of parameter values.
      */
    var values: js.Array[_] = js.native
  }
  
  @js.native
  trait Queryable extends EventEmitter {
    
    /**
      * The Adapter instance that will be used by this Queryable for creating Query instances and/or connections.
      */
    var adapter: Adapter = js.native
    
    /**
      * Execute a SQL statement using bound parameters (if they are provided) and return a Query object
      * that is a Readable stream of the resulting rows. If a Continuation<ResultSet> is provided the rows
      * returned by the database will be aggregated into a [ResultSet][] which will be passed to the
      * continuation after the query has completed.
      * The second form is not needed for normal use, but must be implemented by adapters to work correctly
      * with ConnectionPool and Transaction. See Adapter.createQuery for more details.
      */
    def query(text: String): Query = js.native
    def query(
      text: String,
      params: js.UndefOr[scala.Nothing],
      callback: js.Function2[/* error */ Error, /* results */ ResultSet, Unit]
    ): Query = js.native
    def query(text: String, params: js.Array[_]): Query = js.native
    def query(
      text: String,
      params: js.Array[_],
      callback: js.Function2[/* error */ Error, /* results */ ResultSet, Unit]
    ): Query = js.native
  }
  
  @js.native
  trait ResultSet extends StObject {
    
    /**
      * Not supported by all drivers.
      */
    var affectedRows: js.UndefOr[Double] = js.native
    
    /**
      * Not supported by all drivers.
      */
    var changedRows: js.UndefOr[Double] = js.native
    
    /**
      * Not supported by all drivers.
      */
    var fieldCount: js.UndefOr[Double] = js.native
    
    /**
      * Result field descriptions
      */
    var fields: js.Array[Field] = js.native
    
    /**
      * Not supported by all drivers.
      */
    var lastInsertId: js.UndefOr[js.Any] = js.native
    
    /**
      * Affected rows. Note e.g. for INSERT queries the rows property is not filled even
      * though rowCount is non-zero.
      */
    var rowCount: Double = js.native
    
    /**
      * Result rows
      */
    var rows: js.Array[_] = js.native
  }
  object ResultSet {
    
    @scala.inline
    def apply(fields: js.Array[Field], rowCount: Double, rows: js.Array[_]): ResultSet = {
      val __obj = js.Dynamic.literal(fields = fields.asInstanceOf[js.Any], rowCount = rowCount.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
      __obj.asInstanceOf[ResultSet]
    }
    
    @scala.inline
    implicit class ResultSetMutableBuilder[Self <: ResultSet] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAffectedRows(value: Double): Self = StObject.set(x, "affectedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAffectedRowsUndefined: Self = StObject.set(x, "affectedRows", js.undefined)
      
      @scala.inline
      def setChangedRows(value: Double): Self = StObject.set(x, "changedRows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChangedRowsUndefined: Self = StObject.set(x, "changedRows", js.undefined)
      
      @scala.inline
      def setFieldCount(value: Double): Self = StObject.set(x, "fieldCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldCountUndefined: Self = StObject.set(x, "fieldCount", js.undefined)
      
      @scala.inline
      def setFields(value: js.Array[Field]): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsVarargs(value: Field*): Self = StObject.set(x, "fields", js.Array(value :_*))
      
      @scala.inline
      def setLastInsertId(value: js.Any): Self = StObject.set(x, "lastInsertId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastInsertIdUndefined: Self = StObject.set(x, "lastInsertId", js.undefined)
      
      @scala.inline
      def setRowCount(value: Double): Self = StObject.set(x, "rowCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRows(value: js.Array[_]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsVarargs(value: js.Any*): Self = StObject.set(x, "rows", js.Array(value :_*))
    }
  }
}
