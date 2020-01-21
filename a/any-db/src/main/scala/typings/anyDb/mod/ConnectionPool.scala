package typings.anyDb.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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

