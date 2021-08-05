package typings.agGrid

import typings.agGrid.columnGroupChildMod.ColumnGroupChild
import typings.agGrid.columnMod.Column
import typings.agGrid.groupInstanceIdCreatorMod.GroupInstanceIdCreator
import typings.agGrid.originalColumnGroupChildMod.OriginalColumnGroupChild
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object displayedGroupCreatorMod {
  
  @JSImport("ag-grid/dist/lib/columnController/displayedGroupCreator", "DisplayedGroupCreator")
  @js.native
  class DisplayedGroupCreator () extends StObject {
    
    /* private */ var columnUtils: js.Any = js.native
    
    /* private */ var context: js.Any = js.native
    
    /* private */ def createColumnGroup(originalGroup: js.Any, groupInstanceIdCreator: js.Any, oldColumnsMapped: js.Any): js.Any = js.native
    
    def createDisplayedGroups(
      sortedVisibleColumns: js.Array[Column],
      balancedColumnTree: js.Array[OriginalColumnGroupChild],
      groupInstanceIdCreator: GroupInstanceIdCreator
    ): js.Array[ColumnGroupChild] = js.native
    def createDisplayedGroups(
      sortedVisibleColumns: js.Array[Column],
      balancedColumnTree: js.Array[OriginalColumnGroupChild],
      groupInstanceIdCreator: GroupInstanceIdCreator,
      oldDisplayedGroups: js.Array[ColumnGroupChild]
    ): js.Array[ColumnGroupChild] = js.native
    
    /* private */ def getOriginalPathForColumn(balancedColumnTree: js.Any, column: js.Any): js.Any = js.native
    
    /* private */ def mapOldGroupsById(displayedGroups: js.Any): js.Any = js.native
    
    /* private */ def setupParentsIntoColumns(columnsOrGroups: js.Any, parent: js.Any): js.Any = js.native
  }
}
