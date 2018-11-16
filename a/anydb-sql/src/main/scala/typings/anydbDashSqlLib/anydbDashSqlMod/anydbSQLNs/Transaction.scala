package typings
package anydbDashSqlLib.anydbDashSqlMod.anydbSQLNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends DatabaseConnection {
  def commitAsync(): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def rollback(): scala.Unit = js.native
}

