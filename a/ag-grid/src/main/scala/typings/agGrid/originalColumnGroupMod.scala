package typings.agGrid

import typings.agGrid.colDefMod.ColGroupDef
import typings.agGrid.columnMod.Column
import typings.agGrid.iEventEmitterMod.IEventEmitter
import typings.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object originalColumnGroupMod {
  
  @JSImport("ag-grid/dist/lib/entities/originalColumnGroup", "OriginalColumnGroup")
  @js.native
  class OriginalColumnGroup protected ()
    extends StObject
       with OriginalColumnGroupChild
       with IEventEmitter {
    def this(colGroupDef: ColGroupDef, groupId: String, padding: Boolean, level: Double) = this()
    
    /* private */ def addLeafColumns(leafColumns: js.Any): js.Any = js.native
    
    var children: js.Any = js.native
    
    var colGroupDef: js.Any = js.native
    
    var columnApi: js.Any = js.native
    
    var expandable: js.Any = js.native
    
    var expanded: js.Any = js.native
    
    def getChildren(): js.Array[OriginalColumnGroupChild] = js.native
    
    def getColGroupDef(): ColGroupDef = js.native
    
    /* CompleteClass */
    override def getColumnGroupShow(): String = js.native
    
    def getGroupId(): String = js.native
    
    /* CompleteClass */
    override def getId(): String = js.native
    
    def getLeafColumns(): js.Array[Column] = js.native
    
    def getLevel(): Double = js.native
    
    var gridApi: js.Any = js.native
    
    var groupId: js.Any = js.native
    
    def isExpandable(): Boolean = js.native
    
    def isExpanded(): Boolean = js.native
    
    def isPadding(): Boolean = js.native
    
    /* CompleteClass */
    override def isVisible(): Boolean = js.native
    
    var level: js.Any = js.native
    
    var localEventService: js.Any = js.native
    
    /* private */ def onColumnVisibilityChanged(): js.Any = js.native
    
    var padding: js.Any = js.native
    
    def setChildren(children: js.Array[OriginalColumnGroupChild]): Unit = js.native
    
    def setExpandable(): Unit = js.native
    
    def setExpanded(expanded: Boolean): Unit = js.native
    
    def setupExpandable(): Unit = js.native
  }
  /* static members */
  object OriginalColumnGroup {
    
    @JSImport("ag-grid/dist/lib/entities/originalColumnGroup", "OriginalColumnGroup")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("ag-grid/dist/lib/entities/originalColumnGroup", "OriginalColumnGroup.EVENT_EXPANDABLE_CHANGED")
    @js.native
    def EVENT_EXPANDABLE_CHANGED: String = js.native
    @scala.inline
    def EVENT_EXPANDABLE_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_EXPANDABLE_CHANGED")(x.asInstanceOf[js.Any])
    
    @JSImport("ag-grid/dist/lib/entities/originalColumnGroup", "OriginalColumnGroup.EVENT_EXPANDED_CHANGED")
    @js.native
    def EVENT_EXPANDED_CHANGED: String = js.native
    @scala.inline
    def EVENT_EXPANDED_CHANGED_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("EVENT_EXPANDED_CHANGED")(x.asInstanceOf[js.Any])
  }
}
