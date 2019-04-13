package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends DatabaseConnection {
  def commitAsync(): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def rollback(): scala.Unit = js.native
}

