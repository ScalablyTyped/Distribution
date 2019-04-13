package typings
package anydbDashSqlLib.anydbDashSqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JoinTableNode extends TableNode {
  def on(filter: BinaryNode): TableNode = js.native
  def on(filter: java.lang.String): TableNode = js.native
}

