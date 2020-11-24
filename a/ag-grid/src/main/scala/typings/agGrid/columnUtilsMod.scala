package typings.agGrid

import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.columnMod.Column
import typings.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/columnController/columnUtils", JSImport.Namespace)
@js.native
object columnUtilsMod extends js.Object {
  
  @js.native
  class ColumnUtils () extends js.Object {
    
    def calculateColInitialWidth(colDef: js.Any): Double = js.native
    
    def depthFirstAllColumnTreeSearch(tree: js.Array[ColumnGroupChild], callback: js.Function1[/* treeNode */ ColumnGroupChild, Unit]): Unit = js.native
    
    def depthFirstDisplayedColumnTreeSearch(tree: js.Array[ColumnGroupChild], callback: js.Function1[/* treeNode */ ColumnGroupChild, Unit]): Unit = js.native
    
    def depthFirstOriginalTreeSearch(
      tree: js.Array[OriginalColumnGroupChild],
      callback: js.Function1[/* treeNode */ OriginalColumnGroupChild, Unit]
    ): Unit = js.native
    
    def getOriginalPathForColumn(column: Column, originalBalancedTree: js.Array[OriginalColumnGroupChild]): js.Array[OriginalColumnGroup] = js.native
    
    var gridOptionsWrapper: js.Any = js.native
  }
}
