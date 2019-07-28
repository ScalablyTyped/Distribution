package typings.anydbDashSql.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends DatabaseConnection {
  def commitAsync(): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def rollback(): Unit = js.native
}

