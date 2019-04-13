package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IndexQuery extends Executable[IndexEntry] {
  def create(): IndexCreationQuery = js.native
  def create(indexName: java.lang.String): IndexCreationQuery = js.native
  def drop(columns: Column[_]*): Executable[scala.Unit] = js.native
  def drop(indexName: java.lang.String): Executable[scala.Unit] = js.native
}

