package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnyDBPool extends DatabaseConnection {
  def begin(): Transaction = js.native
  def close(err: stdLib.Error): scala.Unit = js.native
  def query(
    text: java.lang.String,
    values: js.Array[_],
    callback: js.Function2[/* err */ stdLib.Error, /* result */ js.Any, scala.Unit]
  ): scala.Unit = js.native
}

