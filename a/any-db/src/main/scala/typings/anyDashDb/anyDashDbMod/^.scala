package typings.anyDashDb.anyDashDbMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("any-db", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createConnection(opts: ConnectOpts): Connection = js.native
  def createConnection(opts: ConnectOpts, callback: js.Function2[/* error */ Error, /* connection */ Connection, Unit]): Connection = js.native
  def createConnection(url: String): Connection = js.native
  def createConnection(url: String, callback: js.Function2[/* error */ Error, /* connection */ Connection, Unit]): Connection = js.native
  def createPool(opts: ConnectOpts, config: PoolConfig): ConnectionPool = js.native
  def createPool(url: String, config: PoolConfig): ConnectionPool = js.native
}

