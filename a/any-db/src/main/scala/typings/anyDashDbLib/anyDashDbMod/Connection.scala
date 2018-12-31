package typings
package anyDashDbLib.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends Queryable {
  /**
    * Close the database connection. If a continuation is provided it
    * will be called after the connection has closed.
    */
  def end(): scala.Unit = js.native
  def end(callback: js.Function1[/* error */ nodeLib.Error, scala.Unit]): scala.Unit = js.native
}

