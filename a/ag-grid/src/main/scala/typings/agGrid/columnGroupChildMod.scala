package typings.agGrid

import typings.agGrid.colDefMod.AbstractColDef
import typings.agGrid.columnGroupMod.ColumnGroup
import typings.agGrid.iEventEmitterMod.IEventEmitter
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/entities/columnGroupChild", JSImport.Namespace)
@js.native
object columnGroupChildMod extends js.Object {
  
  @js.native
  trait ColumnGroupChild extends IEventEmitter {
    
    def getActualWidth(): Double = js.native
    
    def getColumnGroupShow(): String = js.native
    
    def getDefinition(): AbstractColDef = js.native
    
    def getLeft(): Double = js.native
    
    def getMinWidth(): Double = js.native
    
    def getOldLeft(): Double = js.native
    
    def getParent(): ColumnGroupChild = js.native
    
    def getUniqueId(): String = js.native
    
    def isEmptyGroup(): Boolean = js.native
    
    def isMoving(): Boolean = js.native
    
    def isResizable(): Boolean = js.native
    
    def setParent(parent: ColumnGroup): Unit = js.native
  }
}
