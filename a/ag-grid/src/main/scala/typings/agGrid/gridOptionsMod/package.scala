package typings.agGrid

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object gridOptionsMod {
  
  type GetContextMenuItems = js.Function1[
    /* params */ typings.agGrid.gridOptionsMod.GetContextMenuItemsParams, 
    js.Array[java.lang.String | typings.agGrid.gridOptionsMod.MenuItemDef]
  ]
  
  type GetDataPath = js.Function1[/* data */ js.Any, js.Array[java.lang.String]]
  
  type GetMainMenuItems = js.Function1[
    /* params */ typings.agGrid.gridOptionsMod.GetMainMenuItemsParams, 
    js.Array[java.lang.String | typings.agGrid.gridOptionsMod.MenuItemDef]
  ]
  
  type GetNodeChildDetails = js.Function1[/* dataItem */ js.Any, typings.agGrid.gridOptionsMod.NodeChildDetails]
  
  type GetRowNodeIdFunc = js.Function1[/* data */ js.Any, java.lang.String]
  
  type IsRowMaster = js.Function1[/* dataItem */ js.Any, scala.Boolean]
  
  type IsRowSelectable = js.Function1[/* node */ typings.agGrid.rowNodeMod.RowNode, scala.Boolean]
}
