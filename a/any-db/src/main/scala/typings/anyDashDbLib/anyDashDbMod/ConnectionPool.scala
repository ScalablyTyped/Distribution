package typings
package anyDashDbLib.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionPool extends Queryable {
  /**
    * Remove a connection from the pool. If you use this method you must
    * return the connection back to the pool using ConnectionPool.release
    */
  def acquire(callback: js.Function2[/* error */ nodeLib.Error, /* result */ Connection, scala.Unit]): scala.Unit = js.native
  /**
    * Stop giving out new connections, and close all existing database connections as they
    * are returned to the pool.
    */
  def close(): scala.Unit = js.native
  def close(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
  /**
    * Return a connection to the pool. This should only be called with connections
    * you've manually acquired. You must not continue to use the connection after releasing it.
    */
  def release(connection: Connection): scala.Unit = js.native
}

