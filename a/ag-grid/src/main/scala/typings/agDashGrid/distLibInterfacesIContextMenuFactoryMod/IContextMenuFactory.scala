package typings.agDashGrid.distLibInterfacesIContextMenuFactoryMod

import typings.agDashGrid.distLibEntitiesColumnMod.Column
import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode
import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IContextMenuFactory extends js.Object {
  def hideActiveMenu(): Unit = js.native
  def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: MouseEvent): Unit = js.native
  def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: Touch): Unit = js.native
}

