package typings.agDashGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibEntitiesGridOptionsMod {
  import typings.agDashGrid.distLibEntitiesRowNodeMod.RowNode

  type GetContextMenuItems = js.Function1[/* params */ GetContextMenuItemsParams, js.Array[String | MenuItemDef]]
  type GetDataPath = js.Function1[/* data */ js.Any, js.Array[String]]
  type GetMainMenuItems = js.Function1[/* params */ GetMainMenuItemsParams, js.Array[String | MenuItemDef]]
  type GetNodeChildDetails = js.Function1[/* dataItem */ js.Any, NodeChildDetails]
  type GetRowNodeIdFunc = js.Function1[/* data */ js.Any, String]
  type IsRowMaster = js.Function1[/* dataItem */ js.Any, Boolean]
  type IsRowSelectable = js.Function1[/* node */ RowNode, Boolean]
}
