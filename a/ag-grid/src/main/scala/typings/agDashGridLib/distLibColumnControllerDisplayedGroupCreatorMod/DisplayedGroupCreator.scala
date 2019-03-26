package typings
package agDashGridLib.distLibColumnControllerDisplayedGroupCreatorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/columnController/displayedGroupCreator", "DisplayedGroupCreator")
@js.native
class DisplayedGroupCreator () extends js.Object {
  var columnUtils: js.Any = js.native
  var context: js.Any = js.native
  /* private */ def createColumnGroup(originalGroup: js.Any, groupInstanceIdCreator: js.Any, oldColumnsMapped: js.Any): js.Any = js.native
  def createDisplayedGroups(
    sortedVisibleColumns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    balancedColumnTree: js.Array[
      agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
    ],
    groupInstanceIdCreator: agDashGridLib.distLibColumnControllerGroupInstanceIdCreatorMod.GroupInstanceIdCreator
  ): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  def createDisplayedGroups(
    sortedVisibleColumns: js.Array[agDashGridLib.distLibEntitiesColumnMod.Column],
    balancedColumnTree: js.Array[
      agDashGridLib.distLibEntitiesOriginalColumnGroupChildMod.OriginalColumnGroupChild
    ],
    groupInstanceIdCreator: agDashGridLib.distLibColumnControllerGroupInstanceIdCreatorMod.GroupInstanceIdCreator,
    oldDisplayedGroups: js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild]
  ): js.Array[agDashGridLib.distLibEntitiesColumnGroupChildMod.ColumnGroupChild] = js.native
  /* private */ def getOriginalPathForColumn(balancedColumnTree: js.Any, column: js.Any): js.Any = js.native
  /* private */ def mapOldGroupsById(displayedGroups: js.Any): js.Any = js.native
  /* private */ def setupParentsIntoColumns(columnsOrGroups: js.Any, parent: js.Any): js.Any = js.native
}

