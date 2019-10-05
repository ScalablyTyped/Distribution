package typings.anyDashDb.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("any-db", "createPool")
@js.native
object createPool extends js.Object {
  def apply(opts: ConnectOpts, config: PoolConfig): ConnectionPool = js.native
  def apply(url: String, config: PoolConfig): ConnectionPool = js.native
}

