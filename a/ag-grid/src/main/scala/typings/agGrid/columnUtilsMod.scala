package typings.agGrid

import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.columnMod.Column
import typings.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import typings.agGrid.originalColumnGroupMod.OriginalColumnGroup
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnUtilsMod {
  
  @JSImport("ag-grid/dist/lib/columnController/columnUtils", "ColumnUtils")
  @js.native
  class ColumnUtils () extends StObject {
    
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
