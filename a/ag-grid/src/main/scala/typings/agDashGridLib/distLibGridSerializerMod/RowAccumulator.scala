package typings
package agDashGridLib.distLibGridSerializerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RowAccumulator extends js.Object {
  def onColumn(column: agDashGridLib.distLibEntitiesColumnMod.Column, index: scala.Double): scala.Unit = js.native
  def onColumn(
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    index: scala.Double,
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode
  ): scala.Unit = js.native
}

