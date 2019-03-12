package typings
package anyDashDbLib.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Queryable
  extends nodeLib.eventsMod.EventEmitter {
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
  def query(text: java.lang.String): Query = js.native
  def query(text: java.lang.String, params: js.Array[_]): Query = js.native
  def query(
    text: java.lang.String,
    params: js.Array[_],
    callback: js.Function2[/* error */ stdLib.Error, /* results */ ResultSet, scala.Unit]
  ): Query = js.native
}

