package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyDBPool
  extends anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.DatabaseConnection {
  def begin(): anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs.Transaction = js.native
  def close(err: nodeLib.Error): scala.Unit = js.native
  def query(
    text: java.lang.String,
    values: js.Array[_],
    callback: js.Function2[/* err */ nodeLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

