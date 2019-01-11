package typings
package anyDashDbLib.anyDashDbMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("any-db", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def createConnection(opts: anyDashDbLib.anyDashDbMod.ConnectOpts): anyDashDbLib.anyDashDbMod.Connection = js.native
  def createConnection(
    opts: anyDashDbLib.anyDashDbMod.ConnectOpts,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* connection */ anyDashDbLib.anyDashDbMod.Connection, 
      scala.Unit
    ]
  ): anyDashDbLib.anyDashDbMod.Connection = js.native
  def createConnection(url: java.lang.String): anyDashDbLib.anyDashDbMod.Connection = js.native
  def createConnection(
    url: java.lang.String,
    callback: js.Function2[
      /* error */ nodeLib.Error, 
      /* connection */ anyDashDbLib.anyDashDbMod.Connection, 
      scala.Unit
    ]
  ): anyDashDbLib.anyDashDbMod.Connection = js.native
  def createPool(opts: anyDashDbLib.anyDashDbMod.ConnectOpts, config: anyDashDbLib.anyDashDbMod.PoolConfig): anyDashDbLib.anyDashDbMod.ConnectionPool = js.native
  def createPool(url: java.lang.String, config: anyDashDbLib.anyDashDbMod.PoolConfig): anyDashDbLib.anyDashDbMod.ConnectionPool = js.native
}

