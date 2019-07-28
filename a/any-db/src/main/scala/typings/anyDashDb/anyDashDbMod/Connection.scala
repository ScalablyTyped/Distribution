package typings.anyDashDb.anyDashDbMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Connection extends Queryable {
  /**
    * Close the database connection. If a continuation is provided it
    * will be called after the connection has closed.
    */
  def end(): Unit = js.native
  def end(callback: js.Function1[/* error */ Error, Unit]): Unit = js.native
}

