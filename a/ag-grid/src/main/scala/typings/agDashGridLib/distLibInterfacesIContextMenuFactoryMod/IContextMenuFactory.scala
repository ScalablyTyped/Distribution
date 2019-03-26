package typings
package agDashGridLib.distLibInterfacesIContextMenuFactoryMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextMenuFactory extends js.Object {
  def hideActiveMenu(): scala.Unit = js.native
  def showMenu(
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    value: js.Any,
    mouseEvent: stdLib.MouseEvent
  ): scala.Unit = js.native
  def showMenu(
    node: agDashGridLib.distLibEntitiesRowNodeMod.RowNode,
    column: agDashGridLib.distLibEntitiesColumnMod.Column,
    value: js.Any,
    mouseEvent: stdLib.Touch
  ): scala.Unit = js.native
}

