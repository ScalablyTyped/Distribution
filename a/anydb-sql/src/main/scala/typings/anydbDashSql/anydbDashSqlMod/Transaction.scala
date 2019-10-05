package typings.anydbDashSql.anydbDashSqlMod

import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Transaction extends DatabaseConnection {
  def commitAsync(): ^[Unit] = js.native
  def rollback(): Unit = js.native
}

