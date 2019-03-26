package typings
package agDashGridLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object distLibEntitiesGridOptionsMod {
  type GetContextMenuItems = js.Function1[/* params */ GetContextMenuItemsParams, js.Array[java.lang.String | MenuItemDef]]
  type GetDataPath = js.Function1[/* data */ js.Any, js.Array[java.lang.String]]
  type GetMainMenuItems = js.Function1[/* params */ GetMainMenuItemsParams, js.Array[java.lang.String | MenuItemDef]]
  type GetNodeChildDetails = js.Function1[/* dataItem */ js.Any, NodeChildDetails]
  type GetRowNodeIdFunc = js.Function1[/* data */ js.Any, java.lang.String]
  type IsRowMaster = js.Function1[/* dataItem */ js.Any, scala.Boolean]
  type IsRowSelectable = js.Function1[/* node */ agDashGridLib.distLibEntitiesRowNodeMod.RowNode, scala.Boolean]
}
