package typings
package anyDashDbLib.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("any-db", JSImport.Namespace)
@js.native
object anyDashDbModMembers extends js.Object {
  def createConnection(opts: ConnectOpts): Connection = js.native
  def createConnection(
    opts: ConnectOpts,
    callback: js.Function2[/* error */ nodeLib.Error, /* connection */ Connection, scala.Unit]
  ): Connection = js.native
  def createConnection(url: java.lang.String): Connection = js.native
  def createConnection(
    url: java.lang.String,
    callback: js.Function2[/* error */ nodeLib.Error, /* connection */ Connection, scala.Unit]
  ): Connection = js.native
  def createPool(opts: ConnectOpts, config: PoolConfig): ConnectionPool = js.native
  def createPool(url: java.lang.String, config: PoolConfig): ConnectionPool = js.native
}

