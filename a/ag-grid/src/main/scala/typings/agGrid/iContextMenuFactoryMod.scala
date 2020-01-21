package typings.agGrid

import typings.agGrid.columnMod.Column
import typings.agGrid.rowNodeMod.RowNode
import typings.std.MouseEvent
import typings.std.Touch
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/interfaces/iContextMenuFactory", JSImport.Namespace)
@js.native
object iContextMenuFactoryMod extends js.Object {
  @js.native
  trait IContextMenuFactory extends js.Object {
    def hideActiveMenu(): Unit = js.native
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: MouseEvent): Unit = js.native
    def showMenu(node: RowNode, column: Column, value: js.Any, mouseEvent: Touch): Unit = js.native
  }
  
}

